package com.example.dylanrodbar.tetris;

import android.widget.Toast;

/**
 * Created by dylanrodbar on 9/3/2018.
 */

public class HiloJuego implements Runnable{
    TetrisJuego juego;
    Thread t;
    public HiloJuego(TetrisJuego juego) throws InterruptedException {
        //t = new Thread(this, "1");
        //t.start();
        this.juego = juego;

    }

    public void run() {
                //if(!juego.validarChoquePiezas()) {
                juego.bajarPieza();
                juego.hacerTexto();
                //}

                //Thread.sleep(500);

        }
    }

