/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.awt.HeadlessException;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

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
    private final double tax=0.065;
    private String orderType;//eg. in store, online, etc.

public Transaction(int itemID,int customerID,int quantity,String date,double price,String orderType){
    this.itemID=itemID;
    this.customerID=customerID;
    this.quantity=quantity;
    this.date=date;
    //this.tax=tax;
    this.price=price;
    this.orderType=orderType;
    }


public int getItemID(){
    return this.itemID;
}
public int getCustomerID(){
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
public double getTax(double tax){
    return this.tax;
}
public void setPrice(double price){
    this.price=price;
}
public void setOrderType(String otype){
    this.orderType=otype;
}
//used only when the transaction is created: writes new transaction log to file 
public void logTransaction(){

         try{
                String selection="Transactions_Log.csv";
                java.io.File file=new java.io.File(selection);
                if(selection!=null){              //boolean true makes it append to end of file
                    BufferedWriter fileWriter=new BufferedWriter(new FileWriter(file,true));
                    
                        fileWriter.newLine();
                        fileWriter.write(this.getClass().getName()+","+toString());
 //closes buffered writer
            fileWriter.close();
            JOptionPane.showMessageDialog(null, "Export successful");
            }
            else
            {
            JOptionPane.showMessageDialog(null, "Program shit the bed");
            }
         
         }catch(FileNotFoundException io){
             JOptionPane.showMessageDialog(null, "An error has occurred.  Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
             
         }catch(IOException ioe){
             JOptionPane.showMessageDialog(null, "An error has occurred.  Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
             
         }catch(HeadlessException e){
             JOptionPane.showMessageDialog(null, "An error has occurred.  Please please try again.", "Error", JOptionPane.ERROR_MESSAGE);
             
         }finally
         {
         }
}

    @Override
    public String toString(){
        return this.itemID+","+this.customerID+","+this.quantity+this.date+this.price+","+this.orderType;
    }
}
