/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Nolan
 */
public class CustomerDatabase {

    private ArrayList<Customer> customers=new ArrayList<Customer>();
    
public void initCustomers() throws FileNotFoundException, IOException{
    if(customers.size()>=1)
        customers.clear();
    
    BufferedReader readItem=new BufferedReader(new FileReader("Customer.csv"));
    
    String line=readItem.readLine();
    @SuppressWarnings("UnusedAssignment")
    StringTokenizer nextItem=null;
    
    while(line!=null){
        nextItem=new StringTokenizer(line, ",");
                
        while(nextItem.hasMoreTokens()){
                int customerNumber=Integer.parseInt(nextItem.nextToken());
                String firstName=nextItem.nextToken();
                String lastName=nextItem.nextToken();
                long phoneNum=Long.valueOf(nextItem.nextToken());
                String email=(nextItem.nextToken());
            Customer product=new Customer(customerNumber, firstName, lastName, phoneNum,email);
            customers.add(product);        
        
        line=readItem.readLine();
        }
    }   
    readItem.close();
}
    
    public int customerEntry(){

            Scanner input=new Scanner(System.in);
            System.out.printf("\nPlease enter a customer number: \n");
            String entry=input.nextLine();
            String str2=entry.trim();
            int result=Integer.parseInt(str2);
        
        return result;
    }
    public boolean checkCust(int CustomerID){
        for(Customer custard:customers){
        if(custard.getCustomerID()==CustomerID){
            return false;
        }
    }
        return true;
    }
    public void addNewCustomer(int ID,String fName,String lName,long pnum,String email){
        customers.add(new Customer(ID,fName,lName,pnum,email));
        updateCustomers();
            
    }
    public ArrayList<Customer> getCustomers(){
        return customers;
    }
    
    public void list(){
        Customer p;

        for(int i=0; i<customers.size(); i++){
            p=customers.get(i);
        }
    }
    
    //searches for customer's index on customer arraylist
    public int searchCustomer(int searchedCustomer){
        int result=-1;
        Iterator iterate=customers.iterator();
            while(iterate.hasNext()){
                Object temp;
                temp=iterate.next();
                int sCustomerID=((Customer)temp).getCustomerID();
                if(sCustomerID==searchedCustomer){
                    
                        result=customers.indexOf(temp);
                    }
            
        }
        
        return result;
    }
         public void updateCustomers() {
         
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
       for(Customer c:MainThread.db.getCustomers()){
           newData+=c.toString()+"\n";
       }
       
        // check if the new input is right
       // System.out.println("----------------------------------"  + '\n' + input);
        try{
        // write the new String with the replaced line OVER the same file
   //     java.io.BufferedWriter fileOut = new java.io.BufferedWriter(new java.io.FileWriter("Product.csv"));
          java.io.FileOutputStream fileOut=new java.io.FileOutputStream("Customer.csv");
        fileOut.write(newData.replace("null", "").getBytes());
        fileOut.close();
        }catch(IOException e){
            System.out.println("Error Writing file");
            return;
        }catch(Exception e){
            System.out.println("Agh");
            return;
        }
    } catch (Exception e) {
        System.out.println("Problem reading file.");
        return;
    }
JOptionPane.showMessageDialog(null, "Customer Added.");
}
    //determines if cash or credit customer
   public boolean creditCustomer(int customerID, Customer CreditTransaction){
        boolean credit=false;
        if(customers.get(customerID) == CreditTransaction){
            credit=true;
        }
        return credit;
    }
    
    //approves transaction based on final price and credit limit (if credit customer)
    public boolean approveTransaction(int customerLocation, double creditLimit, double finalPrice, Customer CreditTransaction, Customer CashTransaction){
        boolean approved=false;
        if((customers.get(customerLocation) != CashTransaction)&&((customers.get(customerLocation) != CreditTransaction) || (creditLimit<finalPrice))){
        approved=true;
        }
        
        return approved;
    }   
}
