package com.example.dylanrodbar.tetris;

/**
 * Created by dylanrodbar on 5/3/2018.
 */

public class Espacio {
    private boolean ocupado;
    private Bloque bloque;

    public Espacio() {}

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

    public void asignarBloqueAEspacio(Bloque bloque) {
        this.bloque = bloque;
        setOcupado();
    }

    public void desasignarBloqueAEspacio() {
        this.bloque = null;
        setOcupado();
    }
}
