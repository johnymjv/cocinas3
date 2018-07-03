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
public abstract class Ingrediente {
    
    private int id;

    private String nombre;
    
    private int peso;

    
    private String tipo;

    private int cantidad;

    

    public int getCantidad() {
        return cantidad;
    }

    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    private String unidadDeMedida;

    public String getTipo() {
        return tipo;
    }

    public Ingrediente(String nombre,String tipo, int cantidad, String unidadDeMedida, int peso,int id) {
        this.id=id;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.unidadDeMedida = unidadDeMedida;
        this.peso = peso;
        this.nombre=nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public Ingrediente(int peso) {
        this.peso = peso;

    }

    public abstract boolean consultarSiHayExistencias(int cantidad);

    @Override
    public String toString() {
        return "Nombre:"+this.nombre+ " Peso:" + this.peso + " Cantidad Existente:" + this.cantidad + " Unidad:" + this.unidadDeMedida + " Tipo:" + this.tipo;
    }

}
