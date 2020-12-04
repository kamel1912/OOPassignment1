/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarRental;

/**
 *
 * @author EMMANUEL
 */
public class Truck extends Vehicle{
     boolean hastrailer=false;
     
     
    Truck(String color,boolean istrailer){
         this.color=color;
        
        this.hastrailer=istrailer;
       
    }
    String tostring(){
        
         return "This Vehicle is "+getcolor()+", has Trailer: "+hastrailer;
    }
    
    
    
}
