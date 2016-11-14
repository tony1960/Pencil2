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
    
    Float   price        =   0.0F;
    Float   reducedPrice =   0.0F;
    int     stableDays   =   0;
    

/**
 * InitialStableDays. Sets the number of days at a Stable price.
 * 
 * @param   days    Stable days.
 */    
   public void  InitialStableDays(int stableDays){
       this.stableDays = stableDays;
   }
    
    

    
    
}
