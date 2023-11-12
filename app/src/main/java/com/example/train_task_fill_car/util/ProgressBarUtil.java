package com.example.train_task_fill_car.util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class ProgressBarUtil extends View {
    private int progress;
    private Paint fillPaint;
    private Paint darkPaint;
    private float cornerRadius = 20.0f;

    public ProgressBarUtil(Context context, AttributeSet attrs) {
        super(context, attrs);

        fillPaint = new Paint();
        fillPaint.setColor(Color.BLUE);
        fillPaint.setStyle(Paint.Style.FILL);

        darkPaint = new Paint();
        darkPaint.setColor(Color.DKGRAY); // Цвет фона
        darkPaint.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float progressBarWidth = (progress / 100f) * width;

        // Рисуем прямоугольник с закругленными углами для темной части (фона)
        RectF darkRect = new RectF(0, 0, width, height);
        canvas.drawRoundRect(darkRect, cornerRadius, cornerRadius, darkPaint);

        // Рисуем прямоугольник с закругленными углами для заполненной части
        RectF fillRect = new RectF(0, 0, progressBarWidth, height);
        canvas.drawRoundRect(fillRect, cornerRadius, cornerRadius, fillPaint);
    }

    public void setProgress(int progress) {
        this.progress = progress;
        invalidate();
    }
}
