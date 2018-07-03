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
public class Inventario {

    private final static int NUMERO_INGREDIENTES = 100;

    public int getNumeroIngredientes() {
        return numeroIngredientes;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }
    
    private int numeroIngredientes;
    private Ingrediente ingredientes[];

    public Inventario() {
        numeroIngredientes=0;
        ingredientes = new Ingrediente[NUMERO_INGREDIENTES];
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        
        this.ingredientes[numeroIngredientes]=ingrediente;

       ++numeroIngredientes;

    }
    
    public boolean hayIngredienteEnInventario(Ingrediente ingrediente,int cantidad){
    
        for (int i = 0; i < numeroIngredientes; i++) {
            
            if(ingredientes[i].getId()==ingrediente.getId())
                return ingrediente.consultarSiHayExistencias(cantidad);
            
        }
        
        return false;
    
    }

}
