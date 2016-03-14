/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Kevin
 */
public  class Transaction {
    private int itemID;
    private int customerID;
    private int quantity;
    private String date;
    private double price;
    private String orderType;//eg. in store, online, etc.

public Transaction(int itemID,int customerID,int quantity,String date,double price,String orderType){
    this.itemID=itemID;
    this.customerID=customerID;
    this.quantity=quantity;
    this.date=date;
    this.price=price;
    this.orderType=orderType;
    }
public void logTransaction(){
    
}
public int getItemID(){
    return this.itemID;
}
public int getcustomerID(){
    return this.customerID;
}
public int getQuantity(){
    return this.quantity;
}
public String getDate(){
    return this.date;
}
public double getPrice(){
    return this.price;
}
public String getOrderType(){
    return this.orderType;
}
public void setPrice(double price){
    this.price=price;
}
public void setOrderType(String otype){
    this.orderType=otype;
}
}
