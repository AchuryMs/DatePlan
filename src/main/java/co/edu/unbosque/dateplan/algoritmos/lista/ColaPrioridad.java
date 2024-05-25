package co.edu.unbosque.dateplan.algoritmos.lista;

public class ColaPrioridad<T> {
    private Lista<Elemento<T>> elementos;

    public ColaPrioridad() {
        this.elementos = new Lista<>();
    }

    public void agregar(T elemento, int prioridad) {
        Elemento<T> nuevoElemento = new Elemento<>(elemento, prioridad);
        int i;
        for (i = 0; i < elementos.tamaño(); i++) {
            if (prioridad > elementos.obtener(i).prioridad) {
                break;
            }
        }
        elementos.agregarEn(i, nuevoElemento);
    }

    public T obtenerSiguiente() {
        if (estáVacia()) {
            throw new IllegalStateException("La cola de prioridad está vacía");
        }
        return elementos.obtener(0).elemento;
    }

    public boolean estáVacia() {
        return elementos.tamaño() == 0;
    }

    private static class Elemento<T> {
        T elemento;
        int prioridad;

        public Elemento(T elemento, int prioridad) {
            this.elemento = elemento;
            this.prioridad = prioridad;
        }
    }
}
