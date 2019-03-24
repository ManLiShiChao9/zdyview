package bwie.com.zidingview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView image;
    private Blx waveView;
    private FrameLayout.LayoutParams lp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         Button viewById = findViewById(R.id.but_tz);
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

        //        image = (ImageView) findViewById(R.id.image);
//        waveView = (WaveView) findViewById(R.id.waveView);
         waveView = findViewById(R.id.waveview);
        lp = new FrameLayout.LayoutParams(-2,-2);

        lp.gravity=Gravity.CENTER;




        waveView.setAnimations(new Blx.Animations() {
            @Override
            public void getY(float y) {
                lp.setMargins(20,20,20, (int) (y+2));

//                image.setLayoutParams(lp);
            }
        });


    }
}
