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
public class ItemPlato {

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    private Ingrediente ingrediente;
    private int cantidad;

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    @Override
    public String toString() {
        return "COMPONENTEDEPLATO:::"+this.ingrediente.toString()+"   Cantidad Requerida para prepararla:"+this.cantidad+" "+this.ingrediente.getUnidadDeMedida();
    }
}
