package com.attrabit.languageapp.canvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WritingView extends View {
    Paint paint;
    int x1,y1,x2,y2;
    MyPoint lastPoint;
    ArrayList<Line> lines = new ArrayList<>();
    public WritingView(Context context) {
        super(context);
        init();
    }

    public WritingView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    public void init(){
        paint = new Paint();
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(20f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // all things will be drawn here.
        for (Line line: lines){
            canvas.drawLine(line.start.x, line.start.y,line.end.x, line.end.y, paint);
            System.out.println(line);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        System.out.println("================================================");


        if (event.getAction() == MotionEvent.ACTION_DOWN){
            x1 = (int) event.getX(); // x coordinate
            y1 = (int) event.getY(); // y coordinate
            lastPoint = new MyPoint(x1, y1);
            System.out.println("=============================================las==="+lastPoint);

        }else if (event.getAction() == MotionEvent.ACTION_MOVE){
            x2 = (int) event.getX(); // x coordinate
            y2 = (int) event.getY(); // y coordinate
            MyPoint newPoint = new MyPoint(x2, y2);
            lines.add(new Line(lastPoint, newPoint));
            lastPoint = newPoint;
            invalidate();
            System.out.println(lastPoint+"================================================m"+newPoint);

        }else {
            System.out.println("====================<>>><<<<<>>>>>============================");
        }
        return super.onTouchEvent(event);
    }
}
