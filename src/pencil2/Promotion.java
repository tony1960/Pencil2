/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pencil2;

/**
 *
 * @author tonys
 */
public class Promotion {

    Float price = 0.0F;
    Float reducedPrice = 0.0F;
    int stableDays = 0;

    /**
     * InitialStableDays. Sets the number of days at a Stable price.
     *
     * @param days Stable days.
     */
    public void InitialStableDays(int stableDays) {
        this.stableDays = stableDays;
    }

    /**
     * InitialPrice. Sets the Price for start of test.
     *
     * @param   price   Price value.
     */
    public void InitialPrice(Float price) {
        this.price = price;
    }

    
    /**
     * priceRedution . Reduces price to reducedPrice price.
     *
     * @param   price   Price value.
     * @return  true    - if reducted price is with range 
     * @return false    - if reducted price is out of range.
     */
    public Boolean priceReduction(Float reducedPrice) {

        if (stableDays < 30) {
            return false;
        }

        Float low;
        Float high;

        low = price * .70F;
        high = price * .95F;

        if (reducedPrice.compareTo(low) < 0) {
            return false;
        }
        if (reducedPrice.compareTo(high) > 0) {
            return false;
        }
        
        this.stableDays = 0;
        this.reducedPrice = reducedPrice;

        return true;
    }

    
    public Boolean promotionValid(){
     
        if ((stableDays > 30) && (reducedPrice.compareTo(0.0F) > 0))      {
            return false;
        }        
        return  true;
    }
    
    
    public void  furtherPriceReduction (Float reduction ){
    
        Float low;
        Float high;

        low = price * .70F;
        high = price * .95F;

        if ((reducedPrice.compareTo(low) < 0)  || (reducedPrice.compareTo(high) > 0)) {
            stableDays  = 0;
            reducedPrice = 0.0F;           
        }
        
        reducedPrice = reduction;
       
    }
    
    public void costIncrease (Float price){
        if (reducedPrice.compareTo(price) < price  ){
            this.price = price;
            reducedPrice = 0.0F;
            stableDays = 0 ;
        }
    }
}
