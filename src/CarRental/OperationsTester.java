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
       Vehicle bencar = new Car("Green",true);
        Vehicle petetruck = new Truck("Orange",true);
        
        
        System.out.println(bencar.toString());
        System.out.println(petetruck.toString());
        
        
        GarageTester gt = new GarageTester();
        System.out.println("Garage Tester: "+gt.getExample());
        
        Customer a = new Customer("kmael","Goma");
        Customer b = new Customer("zirack","France");
        
        Vehicle ford = new Car("Purple",true);
        
        //CarRentalContract cc1 = new CarRentalContract(nc1,bencar);
        CarRentalContract cc2 = new CarRentalContract(b,ford);
        
        CarRental cr = new CarRental();
        cr.addContract(cc2);
        //cr.addContract(cc2);
        
//        for (int i=1; i<=CarRental.rentObjects; i++){
//            System.out.println(cr.displayContracts());
//        }

        System.out.println("My Contracts:");
        System.out.println(cr.displayContracts());
        
    
    }
    
}
