import algoritmos.MetodosCola;
import algoritmos.MetodosColaPrioridad;
import api.ColaPrioridadTDA;
import api.ColaTDA;
import impl.ColaEstatica1;
import impl.ColaPrioridadDinamica1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        MetodosColaPrioridad mColaP = new MetodosColaPrioridad();
        ColaPrioridadTDA cola1 = new ColaPrioridadDinamica1();
        ColaPrioridadTDA cola2 = new ColaPrioridadDinamica1();

        cola1.inicializarCola();
        cola2.inicializarCola();

//        cola1.acolar(5, 2);
        cola1.acolar(9, 1);
        cola1.acolar(6, 2);
        cola1.acolar(3, 3);

        cola2.acolar(9, 1);
        cola2.acolar(6, 2);
        cola2.acolar(3, 3);

        System.out.println("------");

        System.out.println(mColaP.sonIguales(cola1, cola2));


    }
}

/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
 */