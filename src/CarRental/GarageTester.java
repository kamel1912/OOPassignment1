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
public class GarageTester {
      String getExample(){
       Truck truck= new Truck("black",false);
       Garage garage=new Garage("parked");
       return "this car is"+truck.toString()+garage.toString();
        
    }
      
     
      
     
     
     
}
