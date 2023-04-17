package com.attrabit.languageapp.canvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class MyCanvas extends View {
    private Rect rect;
    private Paint paint;
    private static final int SQUARE_SIZE = 100;
    public MyCanvas(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        rect = new Rect(0,50,100,150);
//
//        paint = new Paint();
//        paint.setColor(Color.GREEN);
//        paint.setStrokeWidth(5);
//        paint.setStyle(Paint.Style.STROKE);
//
//        canvas.drawRect(rect,paint);
//        canvas.drawCircle(100,100,100, paint);

        Rect rect1 = new Rect();
        rect1.left = 10;
        rect1.top = 10;
        rect1.right = rect1.left + SQUARE_SIZE;
        rect1.bottom = rect1.top + SQUARE_SIZE;

        Rect rect2 = new Rect( );
        rect2.left = 100;
        rect2.top = 10;
        rect2.right = rect2.left + SQUARE_SIZE;
        rect2.bottom = rect2.top + SQUARE_SIZE;

        Paint paint1 = new Paint();
        paint1.setColor(Color.GREEN);
        Paint paint2 = new Paint();
        paint2.setColor(Color.BLACK);
        canvas.drawRect(rect1, paint1);
        canvas.drawRect(rect2, paint2);
    }
}
