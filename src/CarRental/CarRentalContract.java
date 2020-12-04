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
public class CarRentalContract extends Car {
   Customer Customer=new Customer();
   boolean tires;
   
   
   CarRentalContract (boolean tires) {
       this.tires=tires;
      
      
   }
    public String tostring(){
     return "This vehicle is the car "+ Customer.name+":"+ toString() ;
    } 
}
