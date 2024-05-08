package impl;

import api.ColaPrioridadTDA;

public class ColaPrioridadDinamica1 implements ColaPrioridadTDA {
    NodoPrioridad mayorPrioridad;

    public void inicializarCola(){
        mayorPrioridad = null;
    }

    public void acolar(int x, int prioridad) {
        NodoPrioridad nuevo = new NodoPrioridad();
        nuevo.info = x;
        nuevo.prioridad = prioridad;

        if(mayorPrioridad == null || prioridad > mayorPrioridad.prioridad) {
            nuevo.sig = mayorPrioridad;
            mayorPrioridad = nuevo;
        } else{
            NodoPrioridad aux = mayorPrioridad;

            while(aux.sig != null && aux.sig.prioridad >= prioridad){
                aux = aux.sig;
            }

            nuevo.sig = aux.sig;
            aux.sig = nuevo;
        }
    }

    public void desacolar() {
        mayorPrioridad = mayorPrioridad.sig;
    }

    public int primero() {
        return mayorPrioridad.info;
    }

    public int prioridad() {
        return mayorPrioridad.prioridad;
    }

    public boolean colaVacia() {
        return mayorPrioridad == null;
    }


}