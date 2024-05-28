package api;

public interface ConjuntoTDA {

    void inicializarConjunto();

    boolean conjuntoVacio();

    void agregar(int x);

    int elegir();

    void sacar();

    boolean pertenece(int x);

}
