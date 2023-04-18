package com.attrabit.languageapp.canvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

import androidx.annotation.Nullable;

public class DrawingA extends View {
    public DrawingA(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Rect rect = new Rect();



        // Set the stroke thickness to 3 pixels

        // Draw the letter A
//        rect.drawLine(50, 100, 150, 100);   // horizontal top line
//        g2d.drawLine(50, 100, 75, 20);     // left diagonal line
//        g2d.drawLine(75, 20, 100, 60);     // left slanted line
//        g2d.drawLine(100, 60, 125, 20);    // right slanted line
//        g2d.drawLine(125, 20, 150, 100);   // right diagonal line
//        g2d.drawLine(75, 60, 125, 60);
    }
}
