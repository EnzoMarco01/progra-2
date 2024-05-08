package impl;

import api.ColaPrioridadTDA;

public class ColaPrioridadEstatica1 implements ColaPrioridadTDA {
    /* esta cola usa la estrategia 1: el primero siempre en el índice 0 */
    // atributes
    int[] array;
    int[] prioridades;
    int i;
    // methods
    public void inicializarCola() {
        array = new int[100];
        prioridades = new int[100];
    }
    public void acolar(int x, int prioridad) {
        int index = 0;
        while (prioridad<=prioridades[index] || index==i) {
            index++;
        }
        index++;
        for (int y=i ; y>index; y--) {
            array[y] = array[y-1];
            prioridades[y] = prioridades[y-1];
        }
        array[index] = x;
        prioridades[index] = prioridad;
    }
    public void desacolar() {
        for (int index=0 ; index<i ; i++) {
            array[index] = array[index+1];
            prioridades[index] = prioridades[index+1];
        }
        i--;
    }
    public int primero() {
        return (array[0]);
    }
    public int prioridad() {
        return (prioridades[0]);
    }
    public boolean colaVacia() {
        return (i==0);
    }
}