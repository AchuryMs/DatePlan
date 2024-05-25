package co.edu.unbosque.dateplan.algoritmos.lista;

import java.util.Arrays;

public class Lista<T> {
    private Object[] elementos;
    private int tamaño;
    private static final int CAPACIDAD_INICIAL = 10;

    public Lista() {
        this.elementos = new Object[CAPACIDAD_INICIAL];
        this.tamaño = 0;
    }

    public void agregar(T elemento) {
        if (tamaño == elementos.length) {
            aumentarCapacidad();
        }
        elementos[tamaño++] = elemento;
    }

    public T obtener(int indice) {
        if (indice < 0 || indice >= tamaño) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return (T) elementos[indice];
    }

    public int tamaño() {
        return tamaño;
    }

    private void aumentarCapacidad() {
        int nuevaCapacidad = elementos.length * 2;
        elementos = Arrays.copyOf(elementos, nuevaCapacidad);
    }
}
