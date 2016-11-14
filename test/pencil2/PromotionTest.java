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

    Promotion instance;
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
        instance = new Promotion();        
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testInitialStableDays() {
        System.out.println("testInitialStableDays");
        int days = 0;
        int expectedResult = 29;
        instance.InitialStableDays(29);
        int result = instance.stableDays;

        assertEquals(expectedResult, result);
    }

    @Test
    public void testInitialPrice() {
        System.out.println("testPrice");
        Float price = 0.0F;
        Float expectedResult = 10.0F;
        instance.InitialPrice(10.0F);
        Float result = instance.price;

        assertEquals(expectedResult, result, 0.01);
    }

    @Test
    public void testPriceReduction() {
        System.out.println("priceReduction");
        Float initPrice = 10.0F;
        instance.InitialPrice(initPrice);
        int days = 31;
        instance.InitialStableDays(days);
        Boolean result = instance.priceReduction(9.00F);
        
        assertTrue("Promotion", result);
    }
    
    
    @Test
    public void testPriceReductionFewerDays() {
        System.out.println("priceReduction");
        Float initPrice = 10.0F;
        instance.InitialPrice(initPrice);
        int days = 19;
        instance.InitialStableDays(days);
        Boolean result = instance.priceReduction(9.00F);
        
        assertFalse("Promotion", result);
    }
    
    
    
    

    
}
