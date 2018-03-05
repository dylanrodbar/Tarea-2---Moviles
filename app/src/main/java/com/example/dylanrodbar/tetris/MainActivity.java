package com.example.dylanrodbar.tetris;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    private GestureDetectorCompat gestureDetector;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.textV);
        gestureDetector = new GestureDetectorCompat(this, this);
        gestureDetector.setOnDoubleTapListener(this);

    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        float v1 = e.getRawX();
        float v2 = e.getRawY();

        if(v1 > 500){
            text.setText("tap right");
        }
        else{
            text.setText("tap left");
        }

        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        text.setText("onDoubleTap");
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        text.setText("onDoubleTapEvent");
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        text.setText("onDown");
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        text.setText("onShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        text.setText("onSingleTapUp");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        float angle = (float) Math.toDegrees(Math.atan2(e1.getY() - e2.getY(), e2.getX() - e1.getX()));

        if (angle > -45 && angle <= 45) {
            text.setText("Scroll right");
            return true;
        }

        if (angle >= 135 && angle < 180 || angle < -135 && angle > -180) {
            text.setText("Scroll left");
            return true;
        }

        if (angle < -45 && angle >= -135) {
            text.setText("Scroll down");
            return true;
        }

        if (angle > 45 && angle <= 135) {
            text.setText("Scroll up");
            return true;
        }

        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        text.setText("onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        text.setText("onFling");
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
