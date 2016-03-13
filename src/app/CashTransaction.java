/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 * Creates Cash Customer Object (inherits from Customer Object)
 * @author Nolan
 */
public class CashTransaction extends Customer {
    
    private static double CASH_DISCOUNT=.05;

    public CashTransaction(){}
    
    public CashTransaction(int customerID, String customerName, String address, String type){
        super(customerID)
        this.customerID=customerID;
        this.customerName=customerName;
        this.address=address;
        this.type=type;
    }
    public static double getCASH_DISCOUNT() {
        return CASH_DISCOUNT;
    }
    public static void setCASH_DISCOUNT(double aCASH_DISCOUNT) {
        CASH_DISCOUNT = aCASH_DISCOUNT;
    }
    
}
