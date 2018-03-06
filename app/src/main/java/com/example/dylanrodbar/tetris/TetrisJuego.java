package com.example.dylanrodbar.tetris;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.GridLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
        TableLayout table = (TableLayout) findViewById(R.id.tableLayoutTetris);
        TableRow tRow;


        int width = table.getWidth();
        int height = table.getHeight();

        for(int i = 0; i < 22; i++) {
            tRow= new TableRow(this);
            tRow.setLayoutParams(new TableRow.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
            for(int j = 0; j < 10; j++) {


                ImageView imageV = new ImageView(this);
                TextView textV = new TextView(this);
                imageV.setLayoutParams(new TableRow.LayoutParams(110,
                        67));
                if(i == 0 || i == 21 ||j == 0 || j == 9){
                    imageV.setImageResource(R.drawable.b);
                }
                else {
                    imageV.setImageResource(R.drawable.n);
                }

                //imageV.setMaxWidth(width / 10);
                textV.setText("hhh");
                textV.setWidth(10);
                textV.setHeight(10);
                tRow.addView(imageV);

            }
            table.addView(tRow);
            //break;

        }

        TableRow r = (TableRow) table.getChildAt(2);
        ImageView i = (ImageView) r.getChildAt(2);
        i.setImageResource(R.drawable.b);

        Toast toast1 =
                Toast.makeText(getApplicationContext(),
                        "Toast por defecto", Toast.LENGTH_SHORT);

        toast1.show();

    }
}
