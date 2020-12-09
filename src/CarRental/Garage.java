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
    Vehicle n = new Car("yellow",true);
    Vehicle t = new Truck("orange",true);


    public String setVehicle(Vehicle parked){
       return parked.toString();
                
    }
    public String toString(){  
       return "Description of the parked vehicle "+t.toString()+n.toString();  
    }
   
}
