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
public class Plato {
    private final static int NUMERO_INGREDIENTES=100;   
    private ItemPlato [] componentes;
    private int idPlato;
    private int costo;
    private String nombre; 

    public int getTotalIngredientes() {
        return totalIngredientes;
    }
    
    private int totalIngredientes;
    
    public Plato(String nombre){
     this.componentes=new ItemPlato[NUMERO_INGREDIENTES];
    this.nombre=nombre.toLowerCase();
        totalIngredientes=0;
    }
    

    public Plato(int idPlato,int costo,String nombre) {
       this.componentes=new ItemPlato[NUMERO_INGREDIENTES];
    this.nombre=nombre.toLowerCase();
    this.costo=costo;
    totalIngredientes=0;
    }

    public void setComponentes(ItemPlato[] componentes) {
        this.componentes = componentes;
    }

    public void setIdPlato(int idPlato) {
        this.idPlato = idPlato;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public void agregarIngrediente(ItemPlato componente){
    this.componentes[totalIngredientes]=componente;
    ++totalIngredientes;
    }

    public ItemPlato[] getComponentes() {
        return componentes;
    }

    public int getIdPlato() {
        return idPlato;
    }

    public int getCosto() {
        return costo;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public String getReceta() {
        return receta;
    }
    private String receta; 
    
    @Override
    public String toString() {
        
        StringBuilder definicion=new StringBuilder();
        definicion.append("\n\nPLATO:::::Nombre:").append(this.nombre).append(" Costo:").append(this.costo).append(" Id:").append(this.idPlato).append("\n");
        for(int i=0;i<totalIngredientes;i++)
            definicion.append(componentes[i].toString()).append("\n");
        
        return definicion.toString();
    }
}
