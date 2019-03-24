package bwie.com.zidingview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button viewById = findViewById(R.id.button3);
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main3Activity.this,Main4Activity.class));
            }
        });
        final Sousuo sousuos = findViewById(R.id.sousuos);
        sousuos.setBackClickLisenter(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main3Activity.this, "点击了back", Toast.LENGTH_SHORT).show();
            }
        });
        sousuos.setSsClickLisenter(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editname = sousuos.getEditname();
                Toast.makeText(Main3Activity.this,""+editname,Toast.LENGTH_SHORT).show();
            }
        });
    }



}
