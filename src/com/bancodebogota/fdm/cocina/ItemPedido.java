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
public class ItemPedido {

    private Plato plato;
    private int porcentagePago;
    private int cantidad;
    private int costo;
    
    
    public ItemPedido(Plato plato,int porcentagePago,int cantidad){
     this.plato=plato;   
     this.porcentagePago=porcentagePago;
     this.cantidad=cantidad;
        
        
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public void setPorcentagePago(int porcentagePago) {
        this.porcentagePago = porcentagePago;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Plato getPlato() {
        return plato;
    }

    public int getPorcentagePago() {
        return porcentagePago;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getCosto() {
        return costo;
    }
    
     @Override
    public String toString() {
        return "ITEM PEDIDO:::Plato:"+this.plato.getNombre()+" Cantidad:"+getCantidad();
    }

}
