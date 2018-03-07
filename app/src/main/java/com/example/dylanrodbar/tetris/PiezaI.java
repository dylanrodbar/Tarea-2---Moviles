package com.example.dylanrodbar.tetris;

/**
 * Created by dylanrodbar on 5/3/2018.
 */

public class PiezaI extends Pieza {


    @Override
    public void cambiarTipoBloque() {

    }

    @Override
    public void asignarValoresBloques() {

    }

    @Override
    public void actualizarBloqueBajada() {
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                tipoPiezas[i].getPosiciones()[j].setY(1);
            }
        }

    }

    @Override
    public void actualizarBloqueDerecha() {

    }

    @Override
    public void actualizarBloqueIzquierda() {

    }

    @Override
    public void actualizarBloqueCambioTipoDerecha() {
        tipo++;
        if(tipo == 4) tipo = 0;
    }

    @Override
    public void actualizarBloqueCambioTipoIzquierda() {
        tipo--;
        if(tipo == -1) tipo = 3;
    }
}
