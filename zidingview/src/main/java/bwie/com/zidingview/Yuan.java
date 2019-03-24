package bwie.com.zidingview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/*Time:2019/3/19
 *Author:lishihcao
 *Description:
 */public class Yuan extends View {

    private Paint paint;

    public Yuan(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //画笔
        paint = new Paint();
        //设置画笔的颜色
        paint.setColor(Color.BLUE);
        //实心圆
        paint.setStyle(Paint.Style.FILL);
        //设置圆笔粗细
        paint.setStrokeWidth(8);

        canvas.drawCircle(getWidth()/2,getHeight()/2,100,paint);
    }
}
