package com.example.dylanrodbar.tetris;

/**
 * Created by dylanrodbar on 5/3/2018.
 */

public class PiezaZ extends Pieza {


    PiezaZ(){
        super();
        bloque1 = new Bloque("Morado");
        bloque2 = new Bloque("Morado");
        bloque3 = new Bloque("Morado");
        bloque4 = new Bloque("Morado");
    }
    @Override
    public void asignarValoresBloques() {
        tipoPiezas[0].annadirPosiciones(1, 4, 0);
        tipoPiezas[0].annadirPosiciones(1, 5, 1);
        tipoPiezas[0].annadirPosiciones(2, 5, 2);
        tipoPiezas[0].annadirPosiciones(2, 6, 3);

        tipoPiezas[1].annadirPosiciones(1, 5, 0);
        tipoPiezas[1].annadirPosiciones(2, 5, 1);
        tipoPiezas[1].annadirPosiciones(2, 4, 2);
        tipoPiezas[1].annadirPosiciones(3, 4, 3);

        tipoPiezas[2].annadirPosiciones(2, 6, 0);
        tipoPiezas[2].annadirPosiciones(2, 5, 1);
        tipoPiezas[2].annadirPosiciones(1, 5, 2);
        tipoPiezas[2].annadirPosiciones(1, 4, 3);

        tipoPiezas[3].annadirPosiciones(3, 4, 0);
        tipoPiezas[3].annadirPosiciones(2, 4, 1);
        tipoPiezas[3].annadirPosiciones(2, 5, 2);
        tipoPiezas[3].annadirPosiciones(1, 5, 3);
    }


}
