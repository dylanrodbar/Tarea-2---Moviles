package com.example.dylanrodbar.tetris;

/**
 * Created by dylanrodbar on 5/3/2018.
 */

public class PiezaL extends Pieza {

    PiezaL(){
        super();
        bloque1 = new Bloque("Verde");
        bloque2 = new Bloque("Verde");
        bloque3 = new Bloque("Verde");
        bloque4 = new Bloque("Verde");
    }
    @Override
    public void asignarValoresBloques() {
        tipoPiezas[0].annadirPosiciones(0, 4, 0);
        tipoPiezas[0].annadirPosiciones(1, 4, 1);
        tipoPiezas[0].annadirPosiciones(2, 4, 2);
        tipoPiezas[0].annadirPosiciones(2, 5, 3);

        tipoPiezas[1].annadirPosiciones(0, 6, 0);
        tipoPiezas[1].annadirPosiciones(0, 5, 1);
        tipoPiezas[1].annadirPosiciones(0, 4, 2);
        tipoPiezas[1].annadirPosiciones(1, 4, 3);

        tipoPiezas[2].annadirPosiciones(2, 5, 0);
        tipoPiezas[2].annadirPosiciones(1, 5, 1);
        tipoPiezas[2].annadirPosiciones(0, 5, 2);
        tipoPiezas[2].annadirPosiciones(0, 4, 3);

        tipoPiezas[3].annadirPosiciones(1, 3, 0);
        tipoPiezas[3].annadirPosiciones(1, 4, 1);
        tipoPiezas[3].annadirPosiciones(1, 5, 2);
        tipoPiezas[3].annadirPosiciones(0, 5, 3);
    }


}
