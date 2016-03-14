/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 * Creates Cash Customer Object (inherits from Customer Object)
 * @author Nolan
 */
public class GiftCardTransaction extends Transaction {
    private int GiftCardUPC;
    
    public GiftCardTransaction(int itemID,int customrerID,int quantity,String date,double price,String orderType,int GiftCardUPC){
        super(itemID,customrerID,quantity,date,price,orderType);
        this.GiftCardUPC=GiftCardUPC;
    }
    
}
