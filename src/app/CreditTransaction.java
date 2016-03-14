/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 * Creates Credit Customer Object (inherits from Customer Object)
 * @author Nolan
 */
public class CreditTransaction extends Transaction{   
    
    private final double CREDIT_MARKUP=.02;
    
    public CreditTransaction(int itemID,int customerID,int quantity,String date,double price,String orderType){
        super(itemID,customerID,quantity,date,price,orderType);
        super.setPrice(price+(price*CREDIT_MARKUP));
    }
    
    public double getCREDIT_MARKUP() {
        return CREDIT_MARKUP;
    }
}
