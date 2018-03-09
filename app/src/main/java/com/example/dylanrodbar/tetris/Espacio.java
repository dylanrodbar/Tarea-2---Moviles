package com.example.dylanrodbar.tetris;

/**
 * Created by dylanrodbar on 5/3/2018.
 */

public class Espacio {
    private boolean ocupado;
    private Bloque bloque;
    private int tipo; //Si es pieza actual o pieza acomodada

    public Espacio() {
        this.ocupado = false;
    }

    public void setOcupado() {
        ocupado = !ocupado;
    }

    public void setBloque(Bloque bloque) {
        this.bloque = bloque;
    }

    public boolean getOcupado() {
        return ocupado;
    }

    public Bloque getBloque() {
        return bloque;
    }

    public int getTipo(){
        return tipo;
    }

    public void asignarBloqueAEspacio(Bloque bloque, int tipo) {
        this.bloque = bloque;
        this.tipo = tipo;
        setOcupado();
    }

    public void desasignarBloqueAEspacio() {
        this.bloque = null;
        this.tipo = 0;
        setOcupado();
    }
}
