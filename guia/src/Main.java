import algoritmos.MetodosCola;
import algoritmos.MetodosColaPrioridad;
import api.ColaPrioridadTDA;
import api.ColaTDA;
import api.PilaColaParesTDA;
import impl.ColaEstatica1;
import impl.ColaPrioridadDinamica1;
import impl.PilaColaParesDinamica;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        PilaColaParesTDA simu = new PilaColaParesDinamica();

        simu.inicializar();

        for (int i = 0; i < 10; i++){
            System.out.println(i);
            simu.guardar(i);
        }

        simu.guardar(99);

        for (int i = 0; i < 20;i = i+2){
            simu.guardar(i);
        }

        System.out.print("guardar: ");
        simu.imprimir();

        for (int i = 0; i < 7; i++){
            simu.sacar();
        }
        System.out.print("sacar: ");
        simu.imprimir();

        System.out.print("mostrar: ");
        System.out.println(simu.mostrar());
        
        System.out.print("esta vacia: ");
        System.out.println(simu.vacia());
    }
}

/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
 */