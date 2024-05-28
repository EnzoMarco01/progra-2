package impl;

import api.ConjuntoTDA;

public class ConjuntoTA implements ConjuntoTDA{

    int[] a;
    int cant;

    public void inicializarConjunto() {
        
        a = new int[100];
        cant = 0;
        
    }


    public boolean conjuntoVacio() {

        return cant == 0;

    }


    public void agregar(int x) {
        
        if(!this.pertenece(x)){
            a[cant] = x;
            cant ++;
        }

    }

    public int elegir() {
        return a[cant - 1];
    }


    public void sacar() {
        int i = 0;

        while (i < cant){
            a[i] = a[cant - 1];
            cant--;
        }
    }


    public boolean pertenece(int x) {
        int i = 0;
        while (i < cant && a[i] != x){
            i++;
        }
        return i < cant;
    }


}
