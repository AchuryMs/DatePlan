package co.edu.unbosque.dateplan.algoritmos.lista;

public class ArbolBinarioBusqueda<T extends Comparable<T>> {
    private Nodo<T> raiz;

    public void insertar(T valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo<T> insertarRecursivo(Nodo<T> nodo, T valor) {
        if (nodo == null) {
            return new Nodo<>(valor);
        }

        if (valor.compareTo(nodo.valor) < 0) {
            nodo.izquierdo = insertarRecursivo(nodo.izquierdo, valor);
        } else if (valor.compareTo(nodo.valor) > 0) {
            nodo.derecho = insertarRecursivo(nodo.derecho, valor);
        }

        return nodo;
    }

    private static class Nodo<T> {
        T valor;
        Nodo<T> izquierdo, derecho;

        public Nodo(T valor) {
            this.valor = valor;
            izquierdo = derecho = null;
        }
    }

}
