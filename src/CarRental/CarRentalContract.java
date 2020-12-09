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
    Customer c; 
    Vehicle v; 
    
    CarRentalContract(Customer custo , Vehicle vim)
    {
        this.c = custo;
        this.v = vim;
    }
    
    
    static int carObjects = 0; 
    { 
        carObjects += 1; 
    }
    public String toString(){
        
        return c.name+" : "+v.toString();
    }
    
}
