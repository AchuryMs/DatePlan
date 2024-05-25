package co.edu.unbosque.dateplan.algoritmos.primero;

import java.util.LinkedList;
import java.util.Queue;

public class ActividadesQueue {
    private Queue<String> queue;

    public ActividadesQueue() {
        this.queue = new LinkedList<>();
    }

    public void agregarActividad(String actividad) {
        queue.add(actividad);
    }

    public String obtenerSiguienteActividad() {
        if (!queue.isEmpty()) {
            return queue.poll();
        } else {
            return "No hay actividades pendientes";
        }
    }
}
