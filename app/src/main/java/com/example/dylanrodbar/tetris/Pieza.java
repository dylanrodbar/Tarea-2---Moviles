package com.example.dylanrodbar.tetris;

/**
 * Created by dylanrodbar on 5/3/2018.
 */

public abstract class Pieza {

    protected Bloque bloque1;
    protected Bloque bloque2;
    protected Bloque bloque3;
    protected Bloque bloque4;
    protected int tipo; /*El tipo será la posición en la que puede estar la pieza*/

    public Pieza(){}
    public abstract void actualizarBloqueBajada();
    public abstract void actualizarBloqueCambioTipoDerecha();
    public abstract void actualizarBloqueCambioTipoIzquierda();
}
