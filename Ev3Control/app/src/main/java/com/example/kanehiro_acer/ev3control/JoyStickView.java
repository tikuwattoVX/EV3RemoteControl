package com.example.kanehiro_acer.ev3control;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by masakisakamoto on 2015/07/11.
 */
public class JoyStickView extends View implements View.OnTouchListener {

    public JoyStickView(Context context) {
        super(context);
    }

    public JoyStickView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 描画処理
     * @param canvas
     */
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.parseColor("#FFFDE7"));
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#eeeeee"));
        canvas.drawCircle(150,150,150, paint);

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        //X軸の取得
        float pointX = event.getX();

        //Y軸の取得
        float pointY = event.getY();

        //取得した内容をログに表示
        Log.d("TouchEvent", "X:" + pointX + ",Y:" + pointY);

        return true;
    }
}
