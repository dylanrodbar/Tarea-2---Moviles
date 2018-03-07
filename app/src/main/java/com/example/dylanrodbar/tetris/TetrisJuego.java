package com.example.dylanrodbar.tetris;

import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.GridLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class TetrisJuego extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tetris_juego);
        annadirElementosGridLayout();

    }

    public void annadirElementosGridLayout() {

        GridLayout gridLa = findViewById(R.id.gridLayoutTetris);


        for(int i = 0; i < 24; i++) {
            for(int j = 0; j < 12; j++) {
                ImageView imageV = new ImageView(this);
                //imageV.setLayoutParams(params);

                GridLayout.LayoutParams params = new GridLayout.LayoutParams();
                params.height = 60;
                params.width = 60;
                params.rowSpec = GridLayout.spec(i);
                params.columnSpec = GridLayout.spec(j);
                imageV.setLayoutParams(params);
                imageV.setImageResource(R.drawable.b);
                if(i == 0 || i == 23 ||j == 0 || j == 11){
                    imageV.setImageResource(R.drawable.b);
                }
                else {
                    imageV.setImageResource(R.drawable.n);
                }


                gridLa.addView(imageV);


            }

        }

        //TableRow r = (TableRow) table.getChildAt(2);
        //ImageView i = (ImageView) r.getChildAt(2);
        //i.setImageResource(R.drawable.b);



    }
}
