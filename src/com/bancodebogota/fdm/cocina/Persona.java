/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.cocina;

/**
 *
 * @author corre_000
 */
public abstract class Persona {

    private String nombre;

    private int numeroIdentificacion;

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public Persona(){
    
    }
    
    @Override
    public String toString() {
      
     return "Nombre:"+this.nombre+"  Numero de Identificacion:"+this.numeroIdentificacion;  
    }

}
