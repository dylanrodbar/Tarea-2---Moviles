package com.example.dylanrodbar.tetris;

import android.graphics.Color;
import android.media.Image;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
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


import java.util.Timer;
import java.util.TimerTask;

public class TetrisJuego extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener{

    private Thread hilo;
    private GestureDetectorCompat gestureDetector;
    GridLayout gridLa;
    TableLayout tableLa;
    private final int largoMatriz = 22;
    private final int anchoMatriz = 10;
    private boolean perdido;
    private Espacio matrizBloques[][];
    private Pieza piezaActual;
    private Timer myTimer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tetris_juego);
        gestureDetector = new GestureDetectorCompat(this, this);
        gestureDetector.setOnDoubleTapListener(this);
        annadirElementosGridLayout();
        this.perdido = false;
        this.matrizBloques = new Espacio[largoMatriz][anchoMatriz];
        this.piezaActual = new PiezaJ();
        this.piezaActual.asignarValoresBloques();
        //this.piezaActual.cambiarTipoBloque();
        inicializarMatrizJuego();


        Runnable r = new Runnable() {
            @Override
            public void run() {
                Thread tr = Thread.currentThread();
                while(true) {

                    if(!validarChoquePiezas()){
                       //inicializarMatrizJuego();
                       bajarPieza();

                    }
                    else {
                        piezaActual = new PiezaI();
                        piezaActual.asignarValoresBloques();
                    }

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            dibujarMatrizLogica();
                            try {
                                Thread.sleep(10);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    });


                }

            }
        };



        Thread t = new Thread(r, "T1");
        t.start();
        //bajarPieza();
        //bajarPieza();
        //bajarPieza();
        //bajarPieza();
        //bajarPieza();
        //bajarPieza();
        //bajarPieza();

        //myTimer = new Timer();
        //mt = new MyTimerTask();
        //myTimer.schedule(mt, 1000);

        //try {
        //    hilo = new Thread(new HiloJuego(this));
        //    hilo.start();
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}


    }

    public void inicializarMatrizJuego(){
        for(int i = 0; i<largoMatriz; i++){
            for(int j = 0; j < anchoMatriz; j++) {
                matrizBloques[i][j] = new Espacio();
            }
        }

    }

    public void hacerTexto(){
        Toast toast = Toast.makeText(this, "hola", Toast.LENGTH_SHORT);
        toast.show();
    }



    public void desasignarMatrizLogica(){

        int rB1 = piezaActual.getXBloque1();
        int cB1 = piezaActual.getYBloque1();

        int rB2 = piezaActual.getXBloque2();
        int cB2 = piezaActual.getYBloque2();

        int rB3 = piezaActual.getXBloque3();
        int cB3 = piezaActual.getYBloque3();

        int rB4 = piezaActual.getXBloque4();
        int cB4 = piezaActual.getYBloque4();

        matrizBloques[rB1][cB1].desasignarBloqueAEspacio();
        matrizBloques[rB2][cB2].desasignarBloqueAEspacio();
        matrizBloques[rB3][cB3].desasignarBloqueAEspacio();
        matrizBloques[rB4][cB4].desasignarBloqueAEspacio();

    }

    public void asignarMatrizLogica() {

        int rB1 = piezaActual.getXBloque1();
        int cB1 = piezaActual.getYBloque1();

        int rB2 = piezaActual.getXBloque2();
        int cB2 = piezaActual.getYBloque2();

        int rB3 = piezaActual.getXBloque3();
        int cB3 = piezaActual.getYBloque3();

        int rB4 = piezaActual.getXBloque4();
        int cB4 = piezaActual.getYBloque4();

        matrizBloques[rB1][cB1].asignarBloqueAEspacio(piezaActual.getBloque1(), 1);
        matrizBloques[rB2][cB2].asignarBloqueAEspacio(piezaActual.getBloque2(), 1);
        matrizBloques[rB3][cB3].asignarBloqueAEspacio(piezaActual.getBloque3(),1);
        matrizBloques[rB4][cB4].asignarBloqueAEspacio(piezaActual.getBloque4(), 1);

    }

    public void asignarMatrizLogicaPiezaAcomodada(){
        int rB1 = piezaActual.getXBloque1();
        int cB1 = piezaActual.getYBloque1();

        int rB2 = piezaActual.getXBloque2();
        int cB2 = piezaActual.getYBloque2();

        int rB3 = piezaActual.getXBloque3();
        int cB3 = piezaActual.getYBloque3();

        int rB4 = piezaActual.getXBloque4();
        int cB4 = piezaActual.getYBloque4();

        matrizBloques[rB1][cB1].asignarBloqueAEspacio(piezaActual.getBloque1(), 2);
        matrizBloques[rB2][cB2].asignarBloqueAEspacio(piezaActual.getBloque2(), 2);
        matrizBloques[rB3][cB3].asignarBloqueAEspacio(piezaActual.getBloque3(),2);
        matrizBloques[rB4][cB4].asignarBloqueAEspacio(piezaActual.getBloque4(), 2);
    }

    public void dibujarMatrizLogica(){
        for(int i = 0; i < largoMatriz; i++){
            for(int j = 0; j < anchoMatriz; j++){
                if(matrizBloques[i][j].getOcupado()) {
                    TableRow r = (TableRow) tableLa.getChildAt(i+1);
                    ImageView im = (ImageView) r.getChildAt(j+1);
                    im.setImageResource(R.drawable.b);
                }
                else{
                    TableRow r = (TableRow) tableLa.getChildAt(i+1);
                    ImageView im = (ImageView) r.getChildAt(j+1);
                    im.setImageResource(R.drawable.n);
                }
            }
        }

    }

    public void annadirElementosGridLayout() {

        //gridLa = findViewById(R.id.gridLayoutTetris);
        tableLa = findViewById(R.id.tableLayoutTetris);

        for(int i = 0; i < 24; i++) {
            TableRow tRow = new TableRow(this);
            for(int j = 0; j < 12; j++) {
                ImageView imageV = new ImageView(this);
                //imageV.setLayoutParams(params);

                TableRow.LayoutParams params = new TableRow.LayoutParams();
                //GridLayout.LayoutParams params = new GridLayout.LayoutParams();
                params.height = 60;
                params.width = 60;
                //params.rowSpec = GridLayout.spec(i);
                //params.columnSpec = GridLayout.spec(j);
                imageV.setLayoutParams(params);
                //imageV.setImageResource(R.drawable.b);
                if(i == 0 || i == 23 ||j == 0 || j == 11){
                    imageV.setImageResource(R.drawable.b);
                }
                else {
                    imageV.setImageResource(R.drawable.n);
                }

                tRow.addView(imageV);
                //gridLa.addView(imageV);


            }
            tableLa.addView(tRow);

        }

        //TableRow r = (TableRow) table.getChildAt(2);
        //ImageView i = (ImageView) r.getChildAt(2);
        //i.setImageResource(R.drawable.b);



    }

    public boolean validarChoquePiezas(){
        int rB1 = piezaActual.getXBloque1();
        int cB1 = piezaActual.getYBloque1();

        int rB2 = piezaActual.getXBloque2();
        int cB2 = piezaActual.getYBloque2();

        int rB3 = piezaActual.getXBloque3();
        int cB3 = piezaActual.getYBloque3();

        int rB4 = piezaActual.getXBloque4();
        int cB4 = piezaActual.getYBloque4();

        if(rB1 == 21 || rB2 == 21 || rB3 == 21 || rB4 == 21) return true;

        else if(matrizBloques[rB1+1][cB1].getOcupado()) {
            if(matrizBloques[rB1+1][cB1].getTipo() == 2) return true;
        }

        else if(matrizBloques[rB2+1][cB2].getOcupado()) {
            if(matrizBloques[rB2+1][cB1].getTipo() == 2) return true;
        }

        else if(matrizBloques[rB3+1][cB3].getOcupado()) {
            if(matrizBloques[rB3+1][cB3].getTipo() == 2) return true;
        }

        else if(matrizBloques[rB4+1][cB4].getOcupado()) {
            if(matrizBloques[rB4+1][cB4].getTipo() == 2) return true;
        }

        return false;

    }
    public void bajarPieza(){
        desasignarMatrizLogica();
        //dibujarMatrizLogica();
        piezaActual.actualizarBloqueBajada();
        this.piezaActual.cambiarTipoBloque();
        asignarMatrizLogica();
        //dibujarMatrizLogica();

    }



    //En esta función se generará una nueva pieza actual en el juego
    public void generarPieza() {
        piezaActual = new PiezaO();
        piezaActual.asignarValoresBloques();
    }

    //En esta función se asignará un bloque a un espacio, para esto se dan los ejes x,y
    public void asignarEspacio(int x, int y, Bloque bloque) {

    }

    public Pieza getPiezaActual(){

        return piezaActual;
    }



    //En esta función se evaluará si hay una línea en el juego, de manera que se pueda aumentar el puntaje
    public boolean hayLinea() {
        return true;
    }

    //En esta función se bajarán las piezas encima de una línea que desaparece en el juego
    public void bajarPiezasDespuesDeLineas() {

    }

    //En esta función se actualizarán las piezas, de manera que bajen poco a poco
    public void actualizarPiezaActualBajada() {
        piezaActual.actualizarBloqueBajada();
    }

    //En esta función se actualizarán las piezas, de manera que se haga el cambio de posición hacia la derecha
    public void actualizarPiezaActualCambioTipoDerecha() {
        piezaActual.actualizarBloqueCambioTipoDerecha();
    }

    //En esta función se actualizarán las piezas, de manera que se haga el cambio de posición hacia la izquierda
    public void actualizarPiezaActualCambioTipoIzquierda() {
        actualizarPiezaActualCambioTipoIzquierda();
    }

    //En esta función se evaluará si hay una colisión en el juego
    public boolean hayColision() {
        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        float v1 = e.getRawX();
        float v2 = e.getRawY();

        if(v1 > 500){
            desasignarMatrizLogica();
            //dibujarMatrizLogica();
            this.piezaActual.actualizarBloqueCambioTipoDerecha();
            this.piezaActual.cambiarTipoBloque();
            asignarMatrizLogica();
            dibujarMatrizLogica();


        }
        else{
            desasignarMatrizLogica();
            //dibujarMatrizLogica();
            this.piezaActual.actualizarBloqueCambioTipoIzquierda();
            this.piezaActual.cambiarTipoBloque();
            asignarMatrizLogica();

            dibujarMatrizLogica();

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
            desasignarMatrizLogica();
            dibujarMatrizLogica();
            this.piezaActual.actualizarBloqueDerecha1(9);
            this.piezaActual.cambiarTipoBloque();
            asignarMatrizLogica();
            dibujarMatrizLogica();
            return true;
        }

        //Scroll left
        if (angle >= 135 && angle < 180 || angle < -135 && angle > -180) {
            desasignarMatrizLogica();
            dibujarMatrizLogica();
            this.piezaActual.actualizarBloqueIzquierda(0);
            this.piezaActual.cambiarTipoBloque();
            asignarMatrizLogica();
            dibujarMatrizLogica();
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
