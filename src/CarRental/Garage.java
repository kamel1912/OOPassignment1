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
public class Garage {
    String vehicle="parked";
    Garage(String vehicle){
        this.vehicle=vehicle;
    }
    String setVehicle(){
       return vehicle;
    }
   public String tostring(){
     return "This vehicle is "+setVehicle();
    }
    
   
}
