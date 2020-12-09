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
     boolean hasTrailer = false;
    
    Truck(String TruckColor,boolean hasTrail){
        this.color = TruckColor;
        hasTrailer = hasTrail;
    }
    
    public String toString(){
        
        return "The Vehicle is:"+getColor(color)+" has Trailer: "+hasTrailer;
    }
    
    
    
}
