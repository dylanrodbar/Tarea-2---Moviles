package com.example.dylanrodbar.tetris;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    private GestureDetectorCompat gestureDetector;

    public static final String EXTRA_MESSAGE = "com.example.dylanrodbar.tetris.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gestureDetector = new GestureDetectorCompat(this, this);
        gestureDetector.setOnDoubleTapListener(this);

    }

    public void buttonMenu1Clicked(View view){
        Intent intent = new Intent(this, TetrisJuego.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        startActivity(intent);
    }

    public void buttonMenu2Clicked(View view){
        Intent intent = new Intent(this, Puntajes.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        startActivity(intent);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        float v1 = e.getRawX();
        float v2 = e.getRawY();

        if(v1 > 500){

        }
        else{

        }

        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {


    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        float angle = (float) Math.toDegrees(Math.atan2(e1.getY() - e2.getY(), e2.getX() - e1.getX()));

        //Scroll right
        if (angle > -45 && angle <= 45) {
            return true;
        }

        //Scroll left
        if (angle >= 135 && angle < 180 || angle < -135 && angle > -180) {
            return true;
        }

        //Scroll down
        if (angle < -45 && angle >= -135) {
            return true;
        }

        //Scroll up
        if (angle > 45 && angle <= 135) {
            return true;
        }

        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {


    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
