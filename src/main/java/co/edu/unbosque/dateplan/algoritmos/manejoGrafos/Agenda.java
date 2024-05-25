package co.edu.unbosque.dateplan.algoritmos.manejoGrafos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.HashMap;
import java.util.Map;

public class Agenda {
    private List<String> listaActividades;
    private Stack<String> pilaActividades;
    private Set<String> conjuntoActividades;
    private Map<String, String> mapaActividades;

    public Agenda() {
        listaActividades = new ArrayList<>();
        pilaActividades = new Stack<>();
        conjuntoActividades = new HashSet<>();
        mapaActividades = new HashMap<>();
    }

    public void agregarActividad(String actividad) {
        listaActividades.add(actividad);
        pilaActividades.push(actividad);
        conjuntoActividades.add(actividad);
        mapaActividades.put(actividad, "Descripción de " + actividad);
    }

    public String obtenerSiguienteActividadLista() {
        if (!listaActividades.isEmpty()) {
            return listaActividades.remove(0);
        } else {
            return "No hay actividades pendientes en la lista";
        }
    }

    public String obtenerSiguienteActividadPila() {
        if (!pilaActividades.isEmpty()) {
            return pilaActividades.pop();
        } else {
            return "No hay actividades pendientes en la pila";
        }
    }

    public Set<String> getConjuntoActividades() {
        return conjuntoActividades;
    }

    public Map<String, String> getMapaActividades() {
        return mapaActividades;
    }
}
