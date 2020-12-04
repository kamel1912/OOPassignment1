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
public class Car extends Vehicle{
    boolean tires=false;
   
  String tostring(){
     return "This vehicle is "+getcolor()+", has WinterTires: "+tires;
}
}
