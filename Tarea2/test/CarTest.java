/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import domain.Car;
import file.CarFile;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Melissa Ramírez R
 */
public class CarTest {
    
    public CarTest() {
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

    
    // @Test
     public void carTest (){
     
     Car car = new Car("Toyota", 1234, 1234, true, 1);
         System.out.println(car.toString());
     
     }
    
    
   // @Test
     public void addCarTest() throws IOException {
     File file = new File("./car.dat");
     CarFile carFile = new CarFile(file);
     
     Car car1 = new Car("Masda", 2001, 234098, true, 0);
     Car car2 = new Car("Toyota", 2001, 234098, true, 1);
     Car car3 = new Car("Masda", 2001, 234098, true, 2);
    
     
     carFile.addEndRecord(car1);
     carFile.addEndRecord(car2);
     carFile.addEndRecord(car3);
          
     }
     
   // @Test
     public void updateCarTest() throws IOException {
     File file = new File("./car.dat");
     CarFile carFile = new CarFile(file);
     
     boolean success = carFile.updateCar(1, "nombre", "Toyota");
     
     }
     
    @Test
     public void serialCarTest() throws IOException {
     File file = new File("./car.dat");
     CarFile carFile = new CarFile(file);
     
     Car car4 = new Car("Ceran", 2001, 234098, true, carFile.serial());
     carFile.addEndRecord(car4);
     ArrayList <Car> myArrayList = carFile.getCarList();
     System.out.println(myArrayList);
     
     }

     //@Test
     public void deleteCarTest() throws IOException {
     File file = new File("./car.dat");
     CarFile carFile = new CarFile(file);
     
     carFile.deleteRecord(1);
     
     
     }
     
    
    @Test
     public void  readStudent() throws IOException{
         
         File file = new File ("./car.dat");
         CarFile carFile = new CarFile(file);
         
         String carTemp = carFile.readOneCar(0);
         
       System.out.println(carTemp.toString());
     }
     
    // @Test
     public void showFileCarTest() throws IOException {
     File file = new File("./car.dat");
     CarFile carFile = new CarFile(file);
     
     
         
        
     }
}
