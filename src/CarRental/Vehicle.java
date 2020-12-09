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
public class Vehicle {
     String color = "Blue";
    
    String getColor(String mycolor){
        
        return mycolor;
    }
    public String toString(){
        
        return "This Vehicle is "+getColor(color);
    }
   
    
}
