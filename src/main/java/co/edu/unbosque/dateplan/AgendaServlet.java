package co.edu.unbosque.dateplan;

import co.edu.unbosque.dateplan.algoritmos.manejoGrafos.Agenda;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/AgendaServlet")
public class AgendaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Agenda agenda;

    public void init() throws ServletException {
        agenda = new Agenda();
        // Inicialización de la agenda y otras estructuras de datos
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");

        if (accion.equals("agregar")) {
            String actividad = request.getParameter("actividad");
            agenda.agregarActividad(actividad);
        } else if (accion.equals("obtenerLista")) {
            String actividadLista = agenda.obtenerSiguienteActividadLista();
            request.setAttribute("actividadLista", actividadLista);
        } else if (accion.equals("obtenerPila")) {
            String actividadPila = agenda.obtenerSiguienteActividadPila();
            request.setAttribute("actividadPila", actividadPila);
        }
        // Operaciones con otras estructuras de datos y el grafo

        request.getRequestDispatcher("agenda.jsp").forward(request, response);
    }
}
