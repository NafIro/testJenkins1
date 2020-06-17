/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nafi
 */
public class CalculJenkinsTest {
    
    public CalculJenkinsTest() {
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

    /**
     * Test of addition method, of class CalculJenkins.
     */
    @Test
    public void testAddition() {
        System.out.println("addition");
        double a = 2.0;
        double b = 2.0;
        CalculJenkins instance = new CalculJenkins();
        double expResult = 4.0;
        double result = instance.addition(a, b);
        assertEquals(expResult, result, 0.0);
       
        
    }

    /**
     * Test of soustraction method, of class CalculJenkins.
     */
    @Test
    public void testSoustraction() {
        System.out.println("soustraction");
        double a = 4.0;
        double b = 1.0;
        CalculJenkins instance = new CalculJenkins();
        double expResult = 3.0;
        double result = instance.soustraction(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
          /**
     * Test of addition method, of class CalculJenkins.
     */
    @Test
    public void testAddition2() {
        System.out.println("addition");
        double a = 22.0;
        double b = 22.0;
        CalculJenkins instance = new CalculJenkins();
        double expResult = 44.0;
        double result = instance.addition(a, b);
        assertEquals(expResult, result, 0.0);
       
        
    }

    /**
     * Test of soustraction method, of class CalculJenkins.
     */
    @Test
    public void testSoustraction2() {
        System.out.println("soustraction");
        double a = 52.0;
        double b = 30.0;
        CalculJenkins instance = new CalculJenkins();
        double expResult = 22.0;
        double result = instance.soustraction(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
