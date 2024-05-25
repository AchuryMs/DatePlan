package co.edu.unbosque.dateplan.modelo;

import java.util.HashMap;
import java.util.Map;

public class Agenda {
    // ...

    public int cantidadTotalActividades() {
        return listaActividades.tamaño();
    }

    public String actividadMasComun() {
        Map<String, Integer> conteoActividades = new HashMap<>();
        int maximoConteo = 0;
        String actividadMasComun = "";

        // Calcular el conteo de cada actividad
        for (String actividad : listaActividades) {
            conteoActividades.put(actividad, conteoActividades.getOrDefault(actividad, 0) + 1);
        }

        // Encontrar la actividad con el mayor conteo
        for (Map.Entry<String, Integer> entry : conteoActividades.entrySet()) {
            if (entry.getValue() > maximoConteo) {
                maximoConteo = entry.getValue();
                actividadMasComun = entry.getKey();
            }
        }

        return actividadMasComun;
    }

    public Map<String, Integer> conteoActividades() {
        Map<String, Integer> conteoActividades = new HashMap<>();

        // Calcular el conteo de cada actividad
        for (String actividad : listaActividades) {
            conteoActividades.put(actividad, conteoActividades.getOrDefault(actividad, 0) + 1);
        }

        return conteoActividades;
    }
}
