/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Nolan
 */
public class Order {
    private int customerID;
    private int itemID;
    private int quantity;
    private double totalPrice;
    private double tax;
    private String type;

    public Order(){
    }
    
    public Order(int customerID, int itemID, int quantity, double totalPrice,double tax, String type){
        this.customerID=customerID;
        this.itemID=itemID;
        this.quantity=quantity;
        this.totalPrice=totalPrice;
        this.tax=tax;
        this.type=type;
    }
    
    /**
     * @return the customerID
     */
    public int getCustomerID() {
        return customerID;
    }
    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     * @return the itemID
     */
    public int getItemID() {
        return itemID;
    }

    /**
     * @param itemID the itemID to set
     */
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    /**
     * @return the quantity
     */
    public int getQuant() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the totalPrice
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice the totalPrice to set
     */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
}
