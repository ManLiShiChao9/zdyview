package bwie.com.zidingview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/*Time:2019/3/19
 *Author:lishihcao
 *Description:
 */public class Bl extends View {

    private Paint paint;
    private int left;
    private int top;
    private int right;
    private int bottom;



    public Bl(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(8 );
        paint.setStyle(Paint.Style.STROKE);
        Rect rect = new Rect(100,100,300,300);
        canvas.drawRect(rect,paint);

    }
}
