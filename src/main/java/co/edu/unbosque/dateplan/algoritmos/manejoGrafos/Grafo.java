package co.edu.unbosque.dateplan.algoritmos.manejoGrafos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grafo {
    private Map<String, List<String>> grafo;

    public Grafo() {
        this.grafo = new HashMap<>();
    }

    public void agregarVertice(String vertice) {
        grafo.put(vertice, new ArrayList<>());
    }

    public void agregarArista(String origen, String destino) {
        grafo.get(origen).add(destino);
        // Para grafos no dirigidos, descomenta la siguiente línea:
        // grafo.get(destino).add(origen);
    }

    // Otros métodos para manipular el grafo
}
