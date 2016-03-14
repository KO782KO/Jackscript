/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 * Creates Credit Customer Object (inherits from Customer Object)
 * @author Nolan
 */
public class CreditTranaction extends Transaction{   
    
    private final double CREDIT_MARKUP=.02;
    
    public CreditTranaction(int itemID,int customrerID,int quantity,String date,double price,String orderType){
        super(itemID,customrerID,quantity,date,price,orderType);
        super.setPrice(price+(price*CREDIT_MARKUP));
    }
    
    public double getCREDIT_MARKUP() {
        return CREDIT_MARKUP;
    }
}
