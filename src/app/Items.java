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
  //  public static ArrayList<Order> order=new ArrayList<Order>();

//Item object variables for the inventory 
public void initItems() throws FileNotFoundException, IOException{
    if(a.size()>=1)
        a.clear();
    
    BufferedReader readItem=new BufferedReader(new FileReader("Product.csv"));
    
    String line=readItem.readLine();
    @SuppressWarnings("UnusedAssignment")
    StringTokenizer nextItem=null;
    while(line!=null){
        nextItem=new StringTokenizer(line, ",");
                
        while(nextItem.hasMoreTokens()){
            int productID=Integer.parseInt(nextItem.nextToken());
            String productName=nextItem.nextToken();
            double salePrice=Double.parseDouble(nextItem.nextToken());
            int quantity=Integer.parseInt(nextItem.nextToken());
            Item product=new Item(productID, productName, salePrice, quantity);
            a.add(product);        
        
        line=readItem.readLine();
        }
    }   
    readItem.close();
}
public Items getItems(){
    return this;
}
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
    public void addItem(int id, String name, double price, int quantity){
        Item temp=new Item(id,name,price,quantity);
        a.add(temp);
        addItemToFile(temp);
    }
    //Updates product.csv, used when adding a new inventory item to the file.
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
    
    if(t.getQuantity()>0&&itemID>0&&t.getQuantity()>0){
       MainThread.transactions.getList().add(t);
       t.logTransaction();
       MainThread.oItems.getItems().updateQuantity(i.getItemId());
    }
}

    public double getOrderPrice(Transaction transaction, Item item, int units){

            double finalCost;
            double pricePerItem=item.getSellingPrice();
            double preCost=units*pricePerItem;
            if(transaction instanceof CreditTransaction){
                CreditTransaction cust=(CreditTransaction) transaction;
                
                finalCost=preCost+(preCost*cust.getCREDIT_MARKUP());
            }
            else if(transaction instanceof CashTransaction){
                CashTransaction custCash=(CashTransaction) transaction;
                finalCost=preCost-(preCost*CashTransaction.getCASH_DISCOUNT());
                
            }
            else{
                finalCost=0;
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
        

                    String header=("ItemId,Item Name,Pieces in Store,SellingPrice,\n");
                    fileWriter.append(header);
                    for (int i=0; i<a.size(); i++) {
                        Item temp=a.get(i);
                        fileWriter.append(temp.toString());
                    fileWriter.append(System.getProperty("line.separator"));

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
     public void updateQuantity(int itemID) {
         Item item=null;
         for(Item i:MainThread.oItems.getItems().a){
             if(i.getItemId()==itemID){
                 item=i;
             }
         }
         String newData= item.toString();
    try {
        // input the file content to the String "input"
        BufferedReader file = new BufferedReader(new FileReader("Procuct.csv"));
        String line;String input = "";

        while ((line = file.readLine()) != null) input += line + '\n';

        //file.close();

        System.out.println(input); // check that it's inputted right

        // this if structure determines whether or not to replace "0" or "1"
            input = input.replace(input, newData); 

        // check if the new input is right
        System.out.println("----------------------------------"  + '\n' + input);

        // write the new String with the replaced line OVER the same file
        java.io.BufferedWriter fileOut = new java.io.BufferedWriter(new java.io.FileWriter("Product.csv"));
        fileOut.write(input);
        fileOut.close();

    } catch (Exception e) {
        System.out.println("Problem reading file.");
    }
}
     public String orderSummary(Transaction reviewedOrder){
         String orderSummary="\nCustomerID: "+reviewedOrder.getCustomerID()+
                 "\nItemID: "+reviewedOrder.getItemID()+"\nQuantity Ordered: "+reviewedOrder.getQuantity()+"\nPrice: "+reviewedOrder.getPrice()+
                 "\nOrder Type:"+reviewedOrder.getOrderType();
         
         return orderSummary;
     }

    double get(Customer customer, Item tempItem, int quantityRequested) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}   
