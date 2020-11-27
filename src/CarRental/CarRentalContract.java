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
public class CarRentalContract {
   Customer customername;
    Vehicle vehicledescrition;
    
    String tostring(){
     return "This vehicle is the car "+ customername+ "description"+ vehicledescrition;
    } 
}
