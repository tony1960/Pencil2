/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pencil2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tonys
 */
public class PromotionTest {
    
    public PromotionTest() {
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
    public void testInitialStableDays() {
        System.out.println ("testInitialStableDays");
        int days = 0;
        Promotion instance  = new Promotion();
        int expectedResult = 29;
        instance.InitialStableDays(29);
        int result = instance.stableDays;
        
        assertEquals (expectedResult, result);

       
    }
    
}