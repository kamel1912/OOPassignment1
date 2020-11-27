/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarRental;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EMMANUEL
 */
public class VehicalTest {
    Vehicle cart=new Vehicle("red");
    Car  red1 = new Car("red",false);
     Truck green1= new Truck("green",false);
    public VehicalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
public void testtostring(){
    cart.color="red";
   assertEquals("This Vehicle is red",cart.tostring());
   
   }

@Test
	public void testCar() {
		assertEquals("This vehicle is red, has WinterTires: false", red1.tostring());
		
	}
        
@Test
	public void testTruck() {
		assertEquals("This vehicle is green, has Trailer: false", green1.tostring());
		
	}
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
