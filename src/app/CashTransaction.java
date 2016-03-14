/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 * Creates Cash Customer Object (inherits from Customer Object)
 * @author Nolan
 */
public class CashTransaction extends Transaction {
    
    private static double CASH_DISCOUNT=.05;
    
    public CashTransaction(int itemID,int customrerID,int quantity,String date,double price,String orderType){
        super(itemID,customrerID,quantity,date,price,orderType);
        super.setPrice(price-(price*CASH_DISCOUNT));
    }
    public static double getCASH_DISCOUNT() {
        return CASH_DISCOUNT;
    }
    public static void setCASH_DISCOUNT(double aCASH_DISCOUNT) {
        CASH_DISCOUNT = aCASH_DISCOUNT;
    }
}
