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
public class Cocina {
    
   private final static int NUMERO_PLATOS = 100;
   private final static int NUMERO_PEDIDOS = 100;

    private int idCocina;
    private String especialidad;
    private String direccion;
    private String telefono;
    private Chef chef;    
    private Inventario inventario;
    private Plato[] platosMenuDelaCocina;
    private Pedido[] pedidos;
    
    private int numeroPlatos;
    private int numeroPedidos;

    public int getIdCocina() {
        return idCocina;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public Cocina(int idCocina, String especialidad, String direccion, String telefono) {
        this.idCocina = idCocina;
        this.especialidad = especialidad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.inventario=new Inventario();
        this.platosMenuDelaCocina=new Plato[NUMERO_PLATOS];
        this.pedidos=new Pedido[NUMERO_PEDIDOS];
        this.numeroPlatos=0;
        this.numeroPedidos=0;

    }

    @Override
    public String toString() {
        return "COCINA:::IdCocina:" + this.idCocina + " Especialidad:" + this.especialidad + " Direccion:" + this.direccion + " Telefono:" + this.telefono+"CHEF:"+chef.toString();
    }
    
    public void agregarIngredienteAInventario(Ingrediente ingrediente){
    
    this.inventario.agregarIngrediente(ingrediente);
    System.out.println("INGREDIENTEAGREGADOALINVENTARIO::: "+ingrediente.toString());
    
    }
    
    public void AgregarPlatoAlMenu(Plato plato){
    
        this.platosMenuDelaCocina[numeroPlatos]=plato;
       ++numeroPlatos;
      System.out.println("PLATOAGREGADOALMENU::: NombrePlato:"+plato.getNombre()); 
    }
    
    
    
    public void HacerPedido(Pedido pedido){
        
        if(pedido.getNumeroItems()>0){
        
            boolean encontroPlato,encontroIngrediente;
            encontroPlato=false;
            encontroIngrediente=false;
        for(int i=0;i<pedido.getNumeroItems();i++){
    
              ItemPedido itemPedido=pedido.getItems()[i];
               encontroPlato=false;
              for(int y=0;y<numeroPlatos;y++){
              Plato plato=platosMenuDelaCocina[y];
                        
                  if(itemPedido.getPlato().getNombre()==plato.getNombre())
                  {
                      int costo=itemPedido.getCantidad()*plato.getCosto();
                      itemPedido.setCosto(costo);
                      for(int x=0;x<plato.getTotalIngredientes();x++){
                      
                      ItemPlato itemPlato=plato.getComponentes()[x];                                            
                       encontroIngrediente=false;
                           for(int f=0;f<inventario.getNumeroIngredientes();f++){
                           
                               Ingrediente ingrediente=inventario.getIngredientes()[f];
                                 
                               if(ingrediente.getId()==itemPlato.getIngrediente().getId()){
                                  int cantidadRequerida=itemPedido.getCantidad()*itemPlato.getCantidad();
                                 if(cantidadRequerida <ingrediente.getCantidad()){
                                   encontroIngrediente=true;
                                   break;
                                 }else{
                                  encontroIngrediente=false;
                                   System.out.println("PEDIDO NO REALIZADO:::No existe existencias de ingrediente "+ingrediente.getNombre()+" en el inventario de la cocina ### Necesarios:"+cantidadRequerida+" "+ingrediente.getUnidadDeMedida()+" Existencias:"+ingrediente.getCantidad()+" "+ingrediente.getUnidadDeMedida());
                                  break;
                                 }
                                     
                               }
                               
                           
                           }       
                           if(!encontroIngrediente){                           
                                
                               break;
                           }
                      
                      }                                            
                  encontroPlato=true;                  
                  }                                              
              }                      
              
              if(!encontroPlato){                 
                  System.out.println("PEDIDO NO REALIZADO:::No existe plato "+itemPedido.getPlato().getNombre()+" en la carta de la cocina");
                  break;
              }
            if(encontroPlato&&encontroIngrediente){
                pedido.generarElTotal();
             System.out.println("PEDIDO REALIZADO CON EXITO::: a nombre de "+pedido.getCliente().getNombre()+" con un costo de: "+pedido.getTotal());
            this.pedidos[numeroPedidos]=pedido;
             ++numeroPedidos;
            }
              
        
        }                                    
        
        
        
        }else{
        System.out.println("PEDIDO NO REALIZADO:::No hay platos en el pedido");
        
        }
            
        
    
       
    }

}
