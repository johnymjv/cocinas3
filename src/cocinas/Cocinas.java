/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocinas;
import com.bancodebogota.fdm.cocina.Chef;
import com.bancodebogota.fdm.cocina.Cocina;
import com.bancodebogota.fdm.cocina.IngredienteSolido;
import com.bancodebogota.fdm.cocina.IngredienteLiquido;
import com.bancodebogota.fdm.cocina.ItemPedido;
import com.bancodebogota.fdm.cocina.ItemPlato;
import com.bancodebogota.fdm.cocina.Pedido;
import com.bancodebogota.fdm.cocina.Plato;
/**
 *
 * @author corre_000
 */
public class Cocinas {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Cocina cocina  = new Cocina(0, "Cocina China", "Cra 46 a No 87-20","2556579" );
      Chef chef=new Chef();
      chef.setNombre("Marcos");
      chef.setNumeroIdentificacion(265333333);
      System.out.println("CHEF:###"+chef.toString());
      cocina.setChef(chef);
      System.out.println(cocina.toString());
      IngredienteSolido ingrediente = new IngredienteSolido("Arina","",3600,"kilos", 100,1);
      System.out.println(ingrediente.toString());
      IngredienteSolido ingrediente2 = new IngredienteSolido("Arroz","",20,"libras",50 ,2); 
      System.out.println(ingrediente2.toString());
      IngredienteSolido ingrediente3 = new IngredienteSolido("Papa","",50,"libras",10 ,3); 
      System.out.println(ingrediente3.toString());
      IngredienteLiquido ingrediente4 = new IngredienteLiquido("Leche","",50,"litros",10 ,4); 
      System.out.println(ingrediente4.toString());
      IngredienteLiquido ingrediente5 = new IngredienteLiquido("Jugo de Limon","",550,"litros",10 ,5); 
      System.out.println(ingrediente5.toString());
      IngredienteLiquido ingrediente6 = new IngredienteLiquido("Jugo de Naranja","",5,"litros",10 ,5); 
      System.out.println(ingrediente6.toString());
      
      cocina.agregarIngredienteAInventario(ingrediente);
      cocina.agregarIngredienteAInventario(ingrediente2);
      cocina.agregarIngredienteAInventario(ingrediente3);
      cocina.agregarIngredienteAInventario(ingrediente4);
      cocina.agregarIngredienteAInventario(ingrediente5);
      cocina.agregarIngredienteAInventario(ingrediente6);
      
      Plato plato1=new Plato(1,3500,"Paella");
      ItemPlato item=new ItemPlato();      
      item.setIngrediente(ingrediente);
      item.setCantidad(1500);
      System.out.println(item.toString());
      plato1.agregarIngrediente(item);
      ItemPlato item2=new ItemPlato();      
      item2.setIngrediente(ingrediente5);
      item2.setCantidad(200);
      System.out.println(item2.toString());
      plato1.agregarIngrediente(item2);      
      System.out.println(plato1);
      
      cocina.AgregarPlatoAlMenu(plato1);
      
       Plato plato3=new Plato(1,3500,"Arroz con pollo");
      ItemPlato item3=new ItemPlato();      
      item3.setIngrediente(ingrediente2);
      item3.setCantidad(1500);
      System.out.println(item3.toString());
      plato3.agregarIngrediente(item3);
      ItemPlato item4=new ItemPlato();      
      item4.setIngrediente(ingrediente5);
      item4.setCantidad(200);
      System.out.println(item4.toString());
      plato3.agregarIngrediente(item4);      
      System.out.println(plato3);
      
       cocina.AgregarPlatoAlMenu(plato3);
      
      
      ////////////////////PEDIDO 1///////////////////////////////
                    
      java.util.Date fechaActual = new java.util.Date();
      
       Pedido pedido=new Pedido(fechaActual.toString(),1,"Pedrito Fernandez",6352411);       
       ItemPedido itemPedido1=new ItemPedido(plato1,20,2);
       System.out.println(itemPedido1);       
       pedido.agregarItem(itemPedido1);       
       System.out.println(pedido);     
       
       cocina.HacerPedido(pedido);
       
       
       ////////////////PEDIDO2//////////////////////////////////
       fechaActual = new java.util.Date();
       
       Plato plato2=new Plato("Hamburguesa");
       
       Pedido pedido2=new Pedido(fechaActual.toString(),1,"Anderson Mesa",986533);       
       ItemPedido itemPedido2=new ItemPedido(plato2,20,1);
      
       pedido2.agregarItem(itemPedido2);
      
      System.out.println(pedido2); 
      
       cocina.HacerPedido(pedido2);
       
       
       //////////////////PEDIDO3//////////////////////////////////////
       
       fechaActual = new java.util.Date();
      
      Pedido pedido3=new Pedido(fechaActual.toString(),1,"Tatiana Salamanca",14825365);       
       ItemPedido itemPedido3=new ItemPedido(plato3,20,2);
      
      
      
      System.out.println(pedido3); 
      
       cocina.HacerPedido(pedido3);
       
       /////////////////////PEDIDO4/////////////////////////////
       
        fechaActual = new java.util.Date();
      
      Pedido pedido4=new Pedido(fechaActual.toString(),1,"Tatiana Salamanca",98631887);       
       ItemPedido itemPedido4=new ItemPedido(plato3,20,2);
      
       pedido4.agregarItem(itemPedido4);
      
      System.out.println(pedido4); 
      
       cocina.HacerPedido(pedido4);
       
      
      
    }
    
}
