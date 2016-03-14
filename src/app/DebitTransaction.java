/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 * Creates Credit Customer Object (inherits from Customer Object)
 * @author Nolan
 */
public class DebitTransaction extends Transaction{   
    
    private final double DEBIT_MARKUP=.02;
    
    public DebitTransaction(int itemID,int customrerID,int quantity,String date,double price,String orderType){
        super(itemID,customrerID,quantity,date,price,orderType);
        super.setPrice(price+(price*DEBIT_MARKUP));
    }
    
    public double getDEBIT_MARKUP() {
        return DEBIT_MARKUP;
    }
}
