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
public class OperationsTester {
    
    public static void main (String [] args){
        Truck truck= new Truck("black",false);
       Garage garage=new Garage("parked");
        
        CarRentalContract contracttest=new CarRentalContract(true);
        
        
        System.out.println(truck.toString()+garage.toString());
        System.out.println(contracttest.toString());
    }
    
}
