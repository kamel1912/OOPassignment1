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
     boolean istrailer=false;
    Truck(String color,boolean istrailer){
         super(color);
        
        this.istrailer=istrailer;
       
    }
    String tostring(){
        return "This vehicle is "+getcolor()+", has Trailer: "+istrailer;
    }
}
