package co.edu.unbosque.dateplan.algoritmos.lista;

public class Pila<T> {
    private Lista<T> elementos;

    public Pila() {
        this.elementos = new Lista<>();
    }

    public void apilar(T elemento) {
        elementos.agregar(elemento);
    }

    public T desapilar() {
        if (elementos.tamaño() == 0) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.obtener(elementos.tamaño() - 1);
    }

    public int tamaño() {
        return elementos.tamaño();
    }

    public boolean estáVacia() {
        return elementos.tamaño() == 0;
    }
}
