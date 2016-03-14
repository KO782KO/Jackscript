/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 * Creates Cash Customer Object (inherits from Customer Object)
 * @author Nolan
 */
public class CashCustomer extends Customer {
    
    private static double CASH_DISCOUNT=.05;

    public CashCustomer(){}
    
    public CashCustomer(int customerID, String customerName, String address, String type){
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