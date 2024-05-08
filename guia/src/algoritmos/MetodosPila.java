package algoritmos;

import api.PilaTDA;
import impl.PilaDinamica;
import impl.PilaEstatica;



public class MetodosPila {
    public static PilaTDA pasarPilaInverso(PilaTDA pilaOriginal){

        PilaTDA pilaNueva = new PilaEstatica();
        pilaNueva.inicializarPila();

        while (!pilaOriginal.pilaVacia()){

            pilaNueva.apilar(pilaOriginal.tope());
            System.out.print(pilaOriginal.tope());

            pilaOriginal.desapilar();
        }
        System.out.println(' ');

        return pilaNueva;
    }

    public static PilaTDA copiarPila (PilaTDA pilaOriginal){

        PilaTDA pilaNueva = new PilaEstatica();
        pilaNueva.inicializarPila();
        PilaTDA pilaAux = pasarPilaInverso(pilaOriginal);
        System.out.println(' ');

        while (!pilaAux.pilaVacia()){
            pilaNueva.apilar(pilaAux.tope());
            pilaOriginal.apilar(pilaAux.tope());

            System.out.print(pilaAux.tope());

            pilaAux.desapilar();
        }
        System.out.println();

        return pilaNueva;
    }

    public static int contarPila (PilaTDA pilaOriginal){
        int contador = 0;

        while (!pilaOriginal.pilaVacia()){
            contador++;
            pilaOriginal.desapilar();
        }

        return contador;
    }

    public static int sumarPila (PilaTDA pilaOriginal){
        int suma = 0;

        while (!pilaOriginal.pilaVacia()){
            suma += pilaOriginal.tope();
            pilaOriginal.desapilar();
        }

        return suma;
    }

    public static int promedioPila (PilaTDA pilaOriginal){

        PilaTDA pilaNueva = copiarPila(pilaOriginal);

        return sumarPila(pilaOriginal) / contarPila(pilaNueva);
    }

}

//        MetodosPila ej2 = new MetodosPila();
//        PilaTDA pila = new PilaEstatica();

//        pila.InicializarPila();
//        pila.Apilar(1);
//        pila.Apilar(2);
//        pila.Apilar(3);

//        ej2.copiarPila(ej2.pasarPilaInverso(pila));
//        System.out.println(ej2.sumarPila(pila));
//        System.out.println(ej2.contarPila(pila));
//        System.out.println(ej2.promedioPila(pila));