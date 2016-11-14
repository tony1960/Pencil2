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

    // reemove
    @Test
    public void testPriceReductiomLowEnd() {
        System.out.println("priceReduction");
        Float initPrice = 10.0F;
        instance.InitialPrice(initPrice);
        int days = 31;
        instance.InitialStableDays(days);
        Boolean result = instance.priceReduction(6.00F);

        assertFalse("Promotion", result);
    }

    @Test
    public void testPriceReductionHigh() {
        System.out.println("priceReduction");
        Float initPrice = 10.0F;
        instance.InitialPrice(initPrice);
        int days = 31;
        instance.InitialStableDays(days);
        Boolean result = instance.priceReduction(9.6F);

        assertFalse("Promotion", result);
    }

    @Test
    public void testPriceReductionLowEnd() {
        System.out.println("priceReduction");
        Float initPrice = 10.0F;
        instance.InitialPrice(initPrice);
        int days = 31;
        instance.InitialStableDays(days);
        Boolean result = instance.priceReduction(7.0F);

        assertTrue("Promotion", result);
    }

    @Test
    public void testPriceReductionHighEnd() {
        System.out.println("priceReduction");
        Float initPrice = 10.0F;
        instance.InitialPrice(initPrice);
        int days = 31;
        instance.InitialStableDays(days);
        Boolean result = instance.priceReduction(9.5F);

        assertTrue("Promotion", result);
    }

    /// Test 30 days stable test
    @Test
    public void testPriceReductionFewerDays() {
        System.out.println("priceReduction");
        Float initPrice = 10.0F;
        instance.InitialPrice(initPrice);
        int days = 29;
        instance.InitialStableDays(days);
        Boolean result = instance.priceReduction(9.00F);

        assertFalse("Promotion", result);
    }

    // reemove
    @Test
    public void testPriceReductiomLowEndFewerDays() {
        System.out.println("priceReduction");
        Float initPrice = 10.0F;
        instance.InitialPrice(initPrice);
        int days = 29;
        instance.InitialStableDays(days);
        Boolean result = instance.priceReduction(9.00F);

        assertFalse("Promotion", result);
    }

    @Test
    public void testPriceReductionHighFewerDays() {
        System.out.println("priceReduction");
        Float initPrice = 10.0F;
        instance.InitialPrice(initPrice);
        int days = 29;
        instance.InitialStableDays(days);
        Boolean result = instance.priceReduction(9.6F);

        assertFalse("Promotion", result);
    }

    @Test
    public void testPriceReductionLowEndFewerDays() {
        System.out.println("priceReduction");
        Float initPrice = 10.0F;
        instance.InitialPrice(initPrice);
        int days = 29;
        instance.InitialStableDays(days);
        Boolean result = instance.priceReduction(7.0F);

        assertFalse("Promotion", result);
    }

    @Test
    public void testPriceReductionHighEndFewerDay() {
        System.out.println("priceReduction");
        Float initPrice = 10.0F;
        instance.InitialPrice(initPrice);
        int days = 29;
        instance.InitialStableDays(days);
        Boolean result = instance.priceReduction(9.5F);

        assertFalse("Promotion", result);
    }

    // Test if a promotioin is Valid
    //
    @Test
    public void testpromotionValid() {
        System.out.println("priceReduction");
        int days = 29;
        instance.InitialStableDays(days);
        Boolean result = instance.promotionValid();
        assertTrue("Promotion", result);

    }
    
    @Test
    public void testpromotionValidMoreDays() {
        System.out.println("priceReduction");
        int days = 31;
        instance.InitialStableDays(days);
        Boolean result = instance.promotionValid();
        assertFalse ("Promotion", result);

    }

}
