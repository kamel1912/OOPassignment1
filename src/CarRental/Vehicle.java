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
     String color;
    Vehicle(String color){
        this.color=color;
    }

    String getcolor(){
        
        return color;
    }
    String tostring(){
        return "This Vehicle is "+getcolor();
    } 
}
