package bwie.com.zidingview;

import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main4Activity extends AppCompatActivity {

    private ImageView imageView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        imageView = findViewById(R.id.img);
        button = findViewById(R.id.but);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueAnimator valueAnimator = ValueAnimator.ofInt(100,500);
                valueAnimator.setDuration(5000);
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        int animated = (Integer) animation.getAnimatedValue();
                        imageView.layout(animated,animated,animated+ imageView.getWidth(),animated+ imageView.getHeight());
                    }
                });
                valueAnimator.start();
            }
        });


    }
}
