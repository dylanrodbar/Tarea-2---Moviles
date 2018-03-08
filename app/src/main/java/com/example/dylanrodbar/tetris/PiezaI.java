package com.example.dylanrodbar.tetris;

/**
 * Created by dylanrodbar on 5/3/2018.
 */

public class PiezaI extends Pieza {



    PiezaI(){
        super();
        bloque1 = new Bloque("Amarillo");
        bloque2 = new Bloque("Amarillo");
        bloque3 = new Bloque("Amarillo");
        bloque4 = new Bloque("Amarillo");
    }
    @Override
    public void asignarValoresBloques() {
        tipoPiezas[0].annadirPosiciones(1, 5, 0);
        tipoPiezas[0].annadirPosiciones(2, 5, 1);
        tipoPiezas[0].annadirPosiciones(3, 5, 2);
        tipoPiezas[0].annadirPosiciones(4, 5, 3);

        tipoPiezas[1].annadirPosiciones(2, 7, 0);
        tipoPiezas[1].annadirPosiciones(2, 6, 1);
        tipoPiezas[1].annadirPosiciones(2, 5, 2);
        tipoPiezas[1].annadirPosiciones(2, 4, 3);

        tipoPiezas[2].annadirPosiciones(4, 5, 0);
        tipoPiezas[2].annadirPosiciones(3, 5, 1);
        tipoPiezas[2].annadirPosiciones(2, 5, 2);
        tipoPiezas[2].annadirPosiciones(1, 5, 3);

        tipoPiezas[3].annadirPosiciones(2, 3, 0);
        tipoPiezas[3].annadirPosiciones(2, 4, 1);
        tipoPiezas[3].annadirPosiciones(2, 5, 2);
        tipoPiezas[3].annadirPosiciones(2, 6, 3);
    }




}
