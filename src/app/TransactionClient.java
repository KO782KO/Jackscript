/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Kevin+Jack
 */
public class TransactionClient {
    private java.util.ArrayList<Transaction> transactions=new java.util.ArrayList<Transaction>();

public void loadTransactions()throws java.io.FileNotFoundException, java.io.IOException{
if(transactions.size()>=1)
        transactions.clear();
    
    java.io.BufferedReader readItem=new java.io.BufferedReader(new java.io.FileReader("Product.csv"));
    
    String line=readItem.readLine();
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
    public Transaction generateTransactionType(int type,int itemID,int customrerID,int quantity,String date,double price,String orderType){
        //Cash,Credit,Debit,Check,Gift Card
        switch(type){
            case(0):
                return new CashTransaction(itemID,customrerID,quantity,date,price,orderType);
            case(1):
                 return new CreditTransaction(itemID,customrerID,quantity,date,price,orderType);
            case(2):
                return new DebitTransaction(itemID,customrerID,quantity,date,price,orderType);
            case(3):
                return new CheckTransaction(itemID,customrerID,quantity,date,price,orderType);
            case(4):
                return new GiftCardTransaction(itemID,customrerID,quantity,date,price,orderType,1);//need to write code for gift card UPC
        }
        return null;
    }
        public double getOrderPrice(Transaction t){
            for(Item i:MainThread.oItems.a){
                if(i.getItemId()==t.getItemID()){
                    return i.getSellingPrice()*t.getQuantity();
                }
            }
            System.out.print("Invalid Parameters");
            return 0;
            
        }
        public String orderSummary(){
         
         int end=(transactions.size())-1;
         Transaction reviewedOrder=transactions.get(end);
         String orderSummary="\nCustomerID: "+reviewedOrder.getCustomerID()+
                 "\nItemID: "+reviewedOrder.getItemID()+"\nQuantity Ordered: "+reviewedOrder.getQuantity()+"\nPrice: "+reviewedOrder.getPrice()+
                 "\nOrder Type:"+reviewedOrder.getOrderType();
         
         return orderSummary;
     }
}
