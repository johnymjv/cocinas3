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
public class Pedido {
    private final static int NUMERO_ITEMS=100; 
    private String fecha;
    private int noPedido;
    private Cliente cliente;
    private ItemPedido[] items;
    private int total;
    private int numeroItems;
    

    public Pedido(String fecha,int numeroPedido,String aNombreDe,int numeroIdentificacion) {
        this.fecha = fecha;
        this.noPedido = numeroPedido;
        this.total = 0;
        this.cliente=new Cliente();
        this.cliente.setNombre(aNombreDe);
        this.cliente.setNumeroIdentificacion(numeroIdentificacion);
        
        this.items=new ItemPedido[NUMERO_ITEMS];
        numeroItems=0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public boolean agregarItem(ItemPedido item) {

        this.items[numeroItems]=item;
        ++numeroItems;
        return true;
    }

    public void generarElTotal() {
        this.total=0;
        for(int i=0;i<numeroItems;i++)
           this.total+=items[i].getCosto();

    }
    
    @Override
    public String toString() {
        this.generarElTotal();
        StringBuilder definicion=new StringBuilder();
        definicion.append("\nPEDIDO:::::").append(this.cliente.toString()).append(" Costo Total:").append(this.total).append(" Fecha:").append(this.fecha).append(" Id:").append(this.noPedido).append("\n");
        for(int i=0;i<numeroItems;i++)
            definicion.append(items[i].toString()).append("\n");
        
        return definicion.toString();
       
    }

    public String getFecha() {
        return fecha;
    }

    public int getNoPedido() {
        return noPedido;
    }

   
    public ItemPedido[] getItems() {
        return items;
    }

    public int getTotal() {
        return total;
    }

    public int getNumeroItems() {
        return numeroItems;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setNoPedido(int noPedido) {
        this.noPedido = noPedido;
    }

    

    public void setItems(ItemPedido[] items) {
        this.items = items;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setNumeroItems(int numeroItems) {
        this.numeroItems = numeroItems;
    }

}
