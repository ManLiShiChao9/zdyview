package bwie.com.zidingview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

/*Time:2019/3/20
 *Author:lishihcao
 *Description:
 */public class Sousuo extends LinearLayout {
    private Button back;
    private EditText editText;
    private Button ss;
    public Sousuo(Context context) {
        super(context);
    }

    public Sousuo(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.suosou_item,this,true);
        back = findViewById(R.id.th);
        editText = findViewById(R.id.edit);
        ss = findViewById(R.id.suosuo);
    }

    public Sousuo(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setBackClickLisenter(OnClickListener backClickLisenter){
        back.setOnClickListener(backClickLisenter);
    }

    public void setSsClickLisenter(OnClickListener backClickLisenter){
        ss.setOnClickListener(backClickLisenter);
    }

    public String getEditname(){
        String s = editText.getText().toString();
        return s;
    }
}
