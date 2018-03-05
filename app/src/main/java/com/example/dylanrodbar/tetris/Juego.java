package com.example.dylanrodbar.tetris;

/**
 * Created by dylanrodbar on 5/3/2018.
 */

public class Juego {

    private final int largoMatriz = 30;
    private final int anchoMatriz = 30;
    private boolean perdido;
    private Bloque matrizBloques[][];
    private Pieza piezaActual;

    Juego(){
        this.perdido = false;
        this.matrizBloques = new Bloque[largoMatriz][anchoMatriz];
    }

    //En esta función se manejará toda la lógica del juego
    public void jugar() {

    }

    //En esta función se generará una nueva pieza actual en el juego
    public Pieza generarPieza() {
        return null;
    }

    //En esta función se asignará un bloque a un espacio, para esto se dan los ejes x,y
    public void asignarEspacio(int x, int y, Bloque bloque) {

    }

    //En esta función se evaluará si hay una línea en el juego, de manera que se pueda aumentar el puntaje
    public boolean hayLinea() {
        return true;
    }

    //En esta función se bajarán las piezas encima de una línea que desaparece en el juego
    public void bajarPiezasDespuesDeLines() {

    }

    //En esta función se actualizarán las piezas, de manera que bajen poco a poco
    public void actualizarPiezaActualBajada() {

    }

    //En esta función se actualizarán las piezas, de manera que se haga el cambio de posición hacia la derecha
    public void actualizarPiezaActualCambioTipoDerecha() {

    }

    //En esta función se actualizarán las piezas, de manera que se haga el cambio de posición hacia la izquierda
    public void actualizarPiezaActualCambioTipoIzquierda() {

    }

    //En esta función se evaluará si hay una colisión en el juego
    public boolean hayColision() {
        return true;
    }




}
