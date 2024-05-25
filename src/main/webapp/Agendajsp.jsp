<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Agenda de Actividades</title>
</head>
<body>
<h1>Agenda de Actividades</h1>

<!-- Agregar secciones existentes de la interfaz y formularios -->

<h2>Búsqueda en Lista:</h2>
<p>Actividad buscada: <%= request.getParameter("actividadBuscadaLista") %></p>
<p>¿Encontrada?: <%= request.getAttribute("encontradaLista") %></p>

<form action="AgendaServlet" method="get">
  <input type="hidden" name="accion" value="buscarLista">
  <input type="text" name="actividadBuscada" placeholder="Actividad a buscar">
  <button type="submit">Buscar en Lista</button>
</form>

<h2>Búsqueda en Conjunto:</h2>
<p>Actividad buscada: <%= request.getParameter("actividadBuscadaConjunto") %></p>
<p>¿Encontrada?: <%= request.getAttribute("encontradaConjunto") %></p>

<form action="AgendaServlet" method="get">
  <input type="hidden" name="accion" value="buscarConjunto">
  <input type="text" name="actividadBuscada" placeholder="Actividad a buscar">
  <button type="submit">Buscar en Conjunto</button>
</form>

<h2>Búsqueda en Árbol:</h2>
<p>Actividad buscada: <%= request.getParameter("actividadBuscadaArbol") %></p>
<p>¿Encontrada?: <%= request.getAttribute("encontradaArbol") %></p>

<form action="AgendaServlet" method="get">
  <input type="hidden" name="accion" value="buscarArbol">
  <input type="text" name="actividadBuscada" placeholder="Actividad a buscar">
  <button type="submit">Buscar en Árbol</button>
</form>
</body>
</html>

