/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist;

import java.util.ArrayList;
import java.util.List;
/**
 * Clase que representa el servicio para gestionar tareas.
 * Permite crear, mostrar, marcar, eliminar y obtener tareas.
 */
public class ServicioTarea {
//lista que almacena todas las tareas creadas 
    private List<Tarea> listaTareas = new ArrayList();
 /**
     * Crea una tarea y la agrega a la lista.
     * 
     * @param tarea Objeto Tarea a agregar.
     * @return La tarea creada.
     */
    public Tarea crear(Tarea tarea) {
        listaTareas.add(tarea);
        return tarea;
    }

   
    /**
     * Crea una tarea a partir de una descripción y la agrega a la lista.
     * 
     * @param descripcion Texto que describe la tarea.
     * @return La tarea creada.
     */
    public Tarea crear(String descripcion) {
        Tarea tarea = new Tarea(descripcion);
        listaTareas.add(tarea);
        return tarea;
    }

    /**
     * Marca una tarea como completada si su descripción coincide (ignora mayúsculas).
     * 
     * @param tarea La tarea a marcar como completada.
     */
    public void marcar(Tarea tarea) {
        for (Tarea _tarea : listaTareas) {
            if (_tarea.getDescripcion().equalsIgnoreCase(tarea.getDescripcion())) {
                _tarea.setEstado("completado");
                System.out.println("Descripción: " + _tarea.getDescripcion());
                System.out.println("Estado: " + _tarea.getEstado());
                System.out.println("Fecha: " + _tarea.getFecha());
            }
        }
    }

    /**
     * Marca como completada la tarea según su índice en la lista.
     * 
     * @param indice Índice de la tarea en la lista.
     */
    public void marcarCompl(int indice) {
        if (indice >= 0 && indice < listaTareas.size()) {
            listaTareas.get(indice).setEstado("completado");
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    /**
     * Devuelve la lista completa de tareas.
     * 
     * @return Lista de tareas.
     */
    public List<Tarea> obtenerTareas() {
        return listaTareas;
    }

    /**
     * Verifica si una tarea con determinada descripción ya fue completada.
     * 
     * @param descripcion Descripción de la tarea a buscar.
     * @return true si la tarea está completada, false en caso contrario.
     */
    public boolean esTareaCompletada(String descripcion) {
        for (Tarea _tarea : listaTareas) {
            if (_tarea.getDescripcion().equalsIgnoreCase(descripcion)) {
                return _tarea.getEstado().equalsIgnoreCase("completado");
            }
        }
        return false;
    }

    /**
     * Muestra en consola todas las tareas con su descripción, estado y fecha.
     */
    public void mostrarTareas() {
        for (Tarea tarea : listaTareas) {
            System.out.println("Descripción: " + tarea.getDescripcion());
            System.out.println("Estado: " + tarea.getEstado());
            System.out.println("Fecha: " + tarea.getFecha());
        }
    }

    /**
     * Elimina una tarea que coincida por descripción.
     * 
     * @param tarea La tarea a eliminar.
     * @return true si se eliminó correctamente (siempre retorna true).
     */
    public boolean eliminarTarea(Tarea tarea) {
        List<Tarea> _listaTareas = new ArrayList<>();
        for (Tarea _tarea : listaTareas) {
            if (!_tarea.getDescripcion().equalsIgnoreCase(tarea.getDescripcion())) {
                _listaTareas.add(_tarea);
            }
        }
        listaTareas = _listaTareas;
        return true;
    }

    /**
     * Lista todas las tareas mostrando su índice y descripción.
     */
    public void listartareas() {
        for (int i = 0; i < listaTareas.size(); i++) {
            System.out.println((i + 1) + ". " + listaTareas.get(i).getDescripcion());
        }
    }

    /**
     * Obtiene una tarea según su número (1-based index).
     * 
     * @param i Número de tarea (empezando en 1).
     * @return Objeto Tarea correspondiente.
     */
    public Tarea obtener(int i) {
        return listaTareas.get(i - 1);
    }

    /**
     * Elimina una tarea de la lista según su índice.
     * 
     * @param indice Índice de la tarea a eliminar (0-based).
     */
    public void eliminarTarea(int indice) {
        List<Tarea> _listaTareas = new ArrayList<>();
        for (int i = 0; i < listaTareas.size(); i++) {
            if (indice != i) {
                _listaTareas.add(listaTareas.get(i));
            }
        }
        listaTareas = _listaTareas;
    }
}