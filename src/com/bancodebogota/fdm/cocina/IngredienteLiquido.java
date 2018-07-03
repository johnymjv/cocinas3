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
public class IngredienteLiquido extends Ingrediente {

    @Override
    public boolean consultarSiHayExistencias(int cantidad) {
     return this.getCantidad()>cantidad;  
    }

    public IngredienteLiquido(String nombre,String tipo, int cantidad, String unidadDeMedida, int peso,int id) {

        super(nombre,tipo, cantidad, unidadDeMedida, peso,id);
    }

    @Override
    public String toString() {
     return  "INGREDIENTE LIQUIDO:::"+ super.toString();  
    }
}
