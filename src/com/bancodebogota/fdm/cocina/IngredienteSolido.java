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
public class IngredienteSolido extends Ingrediente {

    @Override
    public boolean consultarSiHayExistencias(int cantidad) {
      //To change body of generated methods, choose Tools | Templates.
      return this.getCantidad()>cantidad;  
    }

    public IngredienteSolido(String nombre,String tipo, int cantidad, String unidadDeMedida, int peso,int id) {

        super(nombre,tipo, cantidad, unidadDeMedida, peso,id);
    }
    
    @Override
    public String toString() {
     return  "INGREDIENTE SOLIDO:::"+ super.toString();  
    }
    
}
