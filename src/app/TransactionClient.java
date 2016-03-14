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
public class TransactionClient {
    private java.util.ArrayList<Transaction> transactions=new java.util.ArrayList<Transaction>();

public void loadTransactions()throws java.io.FileNotFoundException, java.io.IOException{
if(transactions.size()>=1)
        transactions.clear();
    
    java.io.BufferedReader readItem=new java.io.BufferedReader(new java.io.FileReader("Product.csv"));
    
    String line=readItem.readLine();
    //@SuppressWarnings("UnusedAssignment")
    java.util.StringTokenizer nextItem=null;
    while(line!=null){
        nextItem=new java.util.StringTokenizer(line, ",");
                
        while(nextItem.hasMoreTokens()){
            String ttype=null;
            ttype=nextItem.nextToken();
            
            int productID=Integer.parseInt(nextItem.nextToken());
            int customerID=Integer.parseInt(nextItem.nextToken());
            int quantity=Integer.parseInt(nextItem.nextToken());
            String date=nextItem.nextToken();
            double price=Double.parseDouble(nextItem.nextToken());
            String orderType=nextItem.nextToken();
            if(ttype.equalsIgnoreCase("cashtransaction")){
                transactions.add(new CashTransaction(productID,customerID,quantity,date,price,orderType));
            }
            else if(ttype.equalsIgnoreCase("credittransaction")){
                transactions.add(new CreditTransaction(productID,customerID,quantity,date,price,orderType));
            }
            else if(ttype.equalsIgnoreCase("debittransaction")){
                transactions.add(new DebitTransaction(productID,customerID,quantity,date,price,orderType));
            }
            else if(ttype.equalsIgnoreCase("checktransaction")){
                transactions.add(new CheckTransaction(productID,customerID,quantity,date,price,orderType));
            }
            else{
                int giftCardUPC=Integer.parseInt(nextItem.nextToken());
                transactions.add(new GiftCardTransaction(productID,customerID,quantity,date,price,orderType,giftCardUPC));
            }
        line=readItem.readLine();
        }
    }   
    readItem.close();
}
public java.util.ArrayList<Transaction> getList(){
    return transactions;
    }
}