/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist;

import java.time.LocalDate;

/**
 *
 * @author jesus
 */
//DEFINNICION DE LA CLASE 
public class Tarea {
    //atributo privado àra guardar la descripcion  de la tarea 
     private String descripcion;
     //atributo privado para guaradar la fecha en que se creo 
    private LocalDate fecha;
    //atributo privado para guardar el estdo en que se creo como: pendiente/ completado 
    private String estado;
//constructor de la clase que la (descripcion) como parametro
    public Tarea(String descripcion) {
        //Asigna la descripcion recibida el atributo correpondiente 
        this.descripcion = descripcion;
        //Asigna la fecha actual al atributo fecha
        this.fecha = LocalDate.now();
        ///Asigna el estado inicial de la tarea como:pendiente 
        this.estado = "pendiente";
    }
//metodo  getter que devuelve la descripciojn de la tarea  
    public String getDescripcion() {
        return descripcion;
    }
//Metodo setter que permite modificar la fecha de la tarea 
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
//metodo getter que devueñve la fecha de creacion de la tarea 
    public LocalDate getFecha() {
        return fecha;
    }
//metodp setter que permite modificar la fecha  de la tarea 
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
//metodo getter que devuelve el estado actual de la tarea  
    public String getEstado() {
        return estado;
    }
//metodo setter que permite modificar el estdo de la tarea 
    public void setEstado(String estado) {
        this.estado = estado;
    }
 
} 
