/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jesus
 */
public class ServicioTarea {

    private List<Tarea> listaTareas = new ArrayList();

    public Tarea crear(Tarea tarea) {
        listaTareas.add(tarea);
        return tarea;
    }

    public Tarea crear(String descripcion) {
        Tarea tarea = new Tarea(descripcion);
        listaTareas.add(tarea);
        return tarea;
    }

    public void marcar(Tarea tarea) {

        for (Tarea _tarea : listaTareas) {
            if (tarea.getDescripcion().equalsIgnoreCase(tarea.getDescripcion())) {
                _tarea.setEstado("completado");
                System.out.println("Descripcion" + tarea.getDescripcion());
                System.out.println("Estado" + tarea.getEstado());
                System.out.println("Fecha" + tarea.getFecha());
            }
        }
    }

    public void marcarCompl(int indice) {
          if (indice >= 0 && indice < listaTareas.size()) {
            listaTareas.get(indice).setEstado("completado"); // CORREGIDO: usar setEstado, no getEstado
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    public List<Tarea> obtenerTareas() {
        return listaTareas;
    }

    public boolean esTareaCompletada(String descripcion) {
        for (Tarea _tarea : listaTareas) {
            if (_tarea.getDescripcion().equalsIgnoreCase(descripcion)) {
                return _tarea.getEstado().equalsIgnoreCase("completado");
            }
        }
        return false;

    }

    public void mostrarTareas() {
        for (Tarea tarea : listaTareas) {
            System.out.println("Descripcion" + tarea.getDescripcion());
            System.out.println("Estado" + tarea.getEstado());
            System.out.println("Fecha" + tarea.getFecha());
        }
    }

    public boolean eliminarTarea(Tarea tarea) {
        List<Tarea> _listaTareas = new ArrayList<Tarea>();
        for (Tarea _tarea : listaTareas) {
            if (!_tarea.getDescripcion().equalsIgnoreCase(tarea.getDescripcion())) {
                _listaTareas.add(_tarea);
            }

        }
        listaTareas = _listaTareas;
        return true;

    }

    public void listartareas() {
        for (int i = 0; i < listaTareas.size(); i++) {
            System.out.println((i + 1) + listaTareas.get(i).getDescripcion());
        }
    }

    public Tarea obtener(int i) {
        return listaTareas.get(i - 1);

    }

    public void eliminarTarea(int indice) {
        List<Tarea> _listaTareas = new ArrayList();
        for (int i = 0; i < listaTareas.size(); i++) {
            if (indice != i) {
                _listaTareas.add(listaTareas.get(i));

            }

        }
        listaTareas = _listaTareas;
    }
}
