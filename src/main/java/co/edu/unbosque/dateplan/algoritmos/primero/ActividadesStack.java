package co.edu.unbosque.dateplan.algoritmos.primero;

import java.util.Stack;

public class ActividadesStack {
    private Stack<String> stack;

    public ActividadesStack() {
        this.stack = new Stack<>();
    }

    public void agregarActividad(String actividad) {
        stack.push(actividad);
    }

    public String obtenerSiguienteActividad() {
        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            return "No hay actividades pendientes";
        }
    }
}