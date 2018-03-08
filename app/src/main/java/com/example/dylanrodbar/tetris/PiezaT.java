package com.example.dylanrodbar.tetris;

/**
 * Created by dylanrodbar on 5/3/2018.
 */

public class PiezaT extends Pieza {

    PiezaT(){
        super();
        bloque1 = new Bloque("Rosado");
        bloque2 = new Bloque("Rosado");
        bloque3 = new Bloque("Rosado");
        bloque4 = new Bloque("Rosado");
    }
    @Override
    public void asignarValoresBloques() {
        tipoPiezas[0].annadirPosiciones(1, 4, 0);
        tipoPiezas[0].annadirPosiciones(1, 5, 1);
        tipoPiezas[0].annadirPosiciones(1, 6, 2);
        tipoPiezas[0].annadirPosiciones(2, 5, 3);

        tipoPiezas[1].annadirPosiciones(1, 5, 0);
        tipoPiezas[1].annadirPosiciones(2, 5, 1);
        tipoPiezas[1].annadirPosiciones(3, 5, 2);
        tipoPiezas[1].annadirPosiciones(2, 4, 3);

        tipoPiezas[2].annadirPosiciones(2, 6, 0);
        tipoPiezas[2].annadirPosiciones(2, 5, 1);
        tipoPiezas[2].annadirPosiciones(2, 4, 2);
        tipoPiezas[2].annadirPosiciones(1, 4, 3);

        tipoPiezas[3].annadirPosiciones(3, 5, 0);
        tipoPiezas[3].annadirPosiciones(2, 5, 1);
        tipoPiezas[3].annadirPosiciones(1, 5, 2);
        tipoPiezas[3].annadirPosiciones(2, 6, 3);
    }


}
