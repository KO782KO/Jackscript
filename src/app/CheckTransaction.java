/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 * Creates Cash Customer Object (inherits from Customer Object)
 * @author Nolan
 */
public class CheckTransaction extends Transaction {
    
    
    public CheckTransaction(int itemID,int customrerID,int quantity,String date,double price,String orderType){
        super(itemID,customrerID,quantity,date,price,orderType);
        this.getClass().getName();
    }
    
}
