/*Reads file into object class
 Uses Arraylist instance var to add inventory and read into object
*/
package app;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;



public class Items {
    // define the array list header. Note that it is an instance variable
    public static ArrayList<Item> a= new ArrayList<Item>();
    public static ArrayList<Order> order=new ArrayList<Order>();

//Item object variables for the inventory 
public void initItems() throws FileNotFoundException, IOException{
    if(a.size()>=1)
        a.clear();
    
    BufferedReader readItem=new BufferedReader(new FileReader("Product.csv"));
    
    String line=readItem.readLine();
    @SuppressWarnings("UnusedAssignment")
    StringTokenizer nextItem=null;
    
    Item index=new Item();
    a.add(index);
    while(line!=null){
        nextItem=new StringTokenizer(line, ",");
                
        while(nextItem.hasMoreTokens()){
            int productID=Integer.parseInt(nextItem.nextToken());
            String productName=nextItem.nextToken();
            double salePrice=Double.parseDouble(nextItem.nextToken());
            int quantity=Integer.parseInt(nextItem.nextToken());
            int itemsSold=Integer.parseInt(nextItem.nextToken());
            Item product=new Item(productID, productName, salePrice, quantity, itemsSold);
            a.add(product);
        
        
        line=readItem.readLine();
        }
    }
    
    readItem.close();
}
    /*Iterator loading=a.iterator();
    

}
public Items getItems(){
    return this;
}
/*public void initInventory() throws FileNotFoundException, IOException{
    
    
    BufferedReader readInventory=new BufferedReader(new FileReader("Inventory.csv"));
    
    String line=readInventory.readLine();
    
    StringTokenizer nextItem;
    
    while(line!=null){
        nextItem=new StringTokenizer(line, ",");
        
        while(nextItem.hasMoreTokens()){
            int productID=Integer.parseInt(nextItem.nextToken());
            int quantity=Integer.parseInt(nextItem.nextToken());
            
            Inventory inventory=new Inventory(productID, quantity);
            inStock.add(inventory);
        
        line=readInventory.readLine();
    
        }
    }
    readInventory.close();

}*/
    //checks items for specified id
    public boolean checkItems(int id){
        for(Item i:a){
            if(i.getItemId()==id){
                return true;
            }
        }
        return false;
    }
//adds an item to the array and then writes it to the file
    public void addItem(int id, String name, double price, int quantity, int itemsSold){
        Item temp=new Item(id,name,price,quantity,itemsSold);
        a.add(temp);
        addItemToFile(temp);
    }
    //Updates product.csv, used when adding a new inventory item to the file.
    @SuppressWarnings("null")
    private void addItemToFile(Item i){
         try{
                String selection="Product.csv";
                java.io.File file=new java.io.File(selection);
                if(selection!=null){              //boolean true makes it append to end of file
                    BufferedWriter fileWriter=new BufferedWriter(new FileWriter(file,true));
                    

                    
                    String item =i.getItemId()+","+i.getItemName()+","+i.getSellingPrice()+","+i.getQuantity();
                        fileWriter.newLine();
                        fileWriter.write(item);
                    
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
//searches inventory
/*
public int inventoryMatch(int productID){
    Iterator iterate=inStock.iterator();
    int quantity=0;
    
     while(iterate.hasNext()){
                Object temp;
                temp=iterate.next();
                int itemId=((Inventory)temp).getItemID();
                if(itemId==productID){
                    
                        quantity=((Inventory)temp).getQuantityInStock();
                        
                    }
     }
    
    return quantity;
}*/
//sells item, updates inventory, and creates new order

public void sellAnItem(boolean shippingCharged,Transaction t,Item i){
    int customerID=t.getCustomerID();
    int itemID=t.getItemID();
    int qoh=i.getQuantity();
    String type="in-store order";
    int postSaleUnits=qoh-t.getQuantity();
    i.setQuantity(postSaleUnits);
    if(shippingCharged){
            type="online order";
        }
        
    
<<<<<<< HEAD
    if(quantityOrdered>0&&itemID>0&&quantityOrdered>0){
            
        Order newOrder=new Order(customerID, itemID, quantityOrdered, finalPrice, type);
        order.add(newOrder);
    }    
    

=======
    if(t.getQuantity()>0&&itemID>0&&t.getQuantity()>0){
       MainThread.transactions.getList().add(t);
       t.logTransaction();
       MainThread.oItems.getItems().updateQuantity(i.getItemId());
    }
>>>>>>> refs/remotes/origin/dev
}

    //gets price of order before additional fees
    public double getOrderPrice(Customer customer, Item item, int units){

            double finalCost;
            double pricePerItem=item.getSellingPrice();
            double preCost=units*pricePerItem;
            if(customer instanceof CreditCustomer){
                CreditCustomer cust=(CreditCustomer) customer;
                
                finalCost=preCost+(preCost*cust.getCREDIT_MARKUP());
            }
            else if(customer instanceof CashCustomer){
                CashCustomer custCash=(CashCustomer) customer;
                finalCost=preCost-(preCost*CashCustomer.getCASH_DISCOUNT());
                
            }
            else{
                finalCost=preCost;
            }

        return finalCost;
    }
                    
//adds shipping
    
    public boolean addShipping(int position){
        boolean addShipping=false;
        if(position==2){
            addShipping=true;
        }
        return addShipping;
    }
    public boolean addGiftCard(int position){
        if(position==5){
            return true;
        }
        return false;
    }
   //displays a report of current inventory 
     public void itemReport(FileChooser fc) throws IOException{
         try{
                String selection=fc.fileName();
                if(selection!=null){

                    BufferedWriter fileWriter=new BufferedWriter(new FileWriter(selection+".csv"));
        

                    String header=("ItemId,Item Name,SellingPrice,Pieces in Store,\n");
                    fileWriter.append(header);
                    for (int i=0; i<a.size()-1; i++) {
                        Item temp=a.get(i);
                        fileWriter.append(System.getProperty("line.separator"));
                        fileWriter.append(temp.toString());
                    }
                    
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
<<<<<<< HEAD
<<<<<<< HEAD
          
     public String orderSummary(){
         
         int end=(order.size())-1;
         Order reviewedOrder=order.get(end);
=======
     public String orderSummary(){
         
         int end=(MainThread.transactions.getList().size())-1;
         Transaction reviewedOrder=MainThread.transactions.getList().get(end);
>>>>>>> refs/remotes/origin/dev
=======
     public void updateQuantity(int itemID) {
         Item item=null;
         for(Item i:MainThread.oItems.getItems().a){
             if(i.getItemId()==itemID){
                 item=i;
             }
         }
         
    try {
        // input the file content to the String "input"
       /* BufferedReader file = new BufferedReader(new FileReader("Procuct.csv"));
        String line=null;String input = "";

        while ((line = file.readLine()) != null) input += line + '\n';

        file.close();

        System.out.println(input); // check that it's inputted right

        // this if structure determines whether or not to replace "0" or "1"
            input = input.replace(input, newData);
*/      String newData=null;
       for(Item i:MainThread.oItems.getItems().a){
           newData+=i.toString()+"\n";
       }
       
        // check if the new input is right
       // System.out.println("----------------------------------"  + '\n' + input);
        try{
        // write the new String with the replaced line OVER the same file
   //     java.io.BufferedWriter fileOut = new java.io.BufferedWriter(new java.io.FileWriter("Product.csv"));
          java.io.FileOutputStream fileOut=new java.io.FileOutputStream("Product.csv");
        fileOut.write(newData.replace("null", "").getBytes());
        fileOut.close();
        }catch(IOException e){
            System.out.println("Error Writing file");
        }catch(Exception e){
            System.out.println("Agh");
        }
    } catch (Exception e) {
        System.out.println("Problem reading file.");
    }
}
     public String orderSummary(Transaction reviewedOrder){
>>>>>>> refs/remotes/origin/dev
         String orderSummary="\nCustomerID: "+reviewedOrder.getCustomerID()+
                 "\nItemID: "+reviewedOrder.getItemID()+"\nQuantity Ordered: "+reviewedOrder.getQuantity()+"\nPrice: "+reviewedOrder.getPrice()+
                 "\nOrder Type:"+reviewedOrder.getOrderType();
         
         return orderSummary;
<<<<<<< HEAD
     }   
=======
     }
>>>>>>> refs/remotes/origin/dev

    void addItem(int parseInt, String text, double parseDouble, int parseInt0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 