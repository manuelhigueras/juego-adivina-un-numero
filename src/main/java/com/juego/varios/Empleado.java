/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juego.varios;

public class Empleado {
   
    //METODO DE NEGOCIO

    //Atributos
    private String nombre;
    private boolean activo;
    private int codigoDepartamento;

    //Constructor y sobrecarga de constructor
    
    public Empleado(String nombre, boolean activo, int codigoDepartamento) {
        this.nombre = nombre;
        this.activo = true;
        this.codigoDepartamento = codigoDepartamento;
    }

    public Empleado() {
        this.nombre = "";
        this.activo = false;
        this.codigoDepartamento = 0;
    }

    //Getters y Setters
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(int codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

}
