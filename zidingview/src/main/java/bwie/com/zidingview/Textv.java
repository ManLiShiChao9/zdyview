package bwie.com.zidingview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/*Time:2019/3/20
 *Author:lishihcao
 *Description:
 */public class Textv extends View {
    private static final String TAG = "MyView";
    private final int height;
    private final int width;
    private final String name;
    private final int sex;
    private final boolean student;

    public Textv(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.tttt);
        height = array.getInt(R.styleable.tttt_mHeight, 0);
        width = array.getInt(R.styleable.tttt_mWidth, 0);
        name = array.getString(R.styleable.tttt_mName);
        sex = array.getInt(R.styleable.tttt_sex, 0);
        student = array.getBoolean(R.styleable.tttt_student, true);
        array.recycle();
        Log.i(TAG, "height: "+height);
        Log.i(TAG, "width: "+width);
        Log.i(TAG, "name: "+name);
        Log.i(TAG, "sex: "+sex);
        Log.i(TAG, "student: "+student);


    }
}
