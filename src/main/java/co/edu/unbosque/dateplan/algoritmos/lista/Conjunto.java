package co.edu.unbosque.dateplan.algoritmos.lista;

public class Conjunto<T> {
    private Lista<T> elementos;

    public Conjunto() {
        this.elementos = new Lista<>();
    }

    public void agregar(T elemento) {
        if (!contiene(elemento)) {
            elementos.agregar(elemento);
        }
    }

    public boolean contiene(T elemento) {
        for (int i = 0; i < elementos.tamaño(); i++) {
            if (elementos.obtener(i).equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public int tamaño() {
        return elementos.tamaño();
    }
}
