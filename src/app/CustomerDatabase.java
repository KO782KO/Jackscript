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

/**
 *
 * @author Nolan
 */
public class CustomerDatabase {

    private ArrayList<Customer> customers=new ArrayList<Customer>();

    //reads customer information from file, instantiates customer & populates customer's variables
    public void loadCustomer() throws FileNotFoundException, IOException{
        try{
            //invokes buffered reader to read file
            BufferedReader read=new BufferedReader(new FileReader("Customer.csv"));
            
            String line=read.readLine();
            @SuppressWarnings("UnusedAssignment")
            StringTokenizer nextItem=null;     
            Customer cust=new Customer();
            customers.add(cust);
            //EOF loop to read file and calculate variables
            while(line!=null){
                
                nextItem=new StringTokenizer(line, ",");
                
                while(nextItem.hasMoreTokens()){
                //assigns file data to variables to be displayed and used
                //in calculations
                int customerNumber=Integer.parseInt(nextItem.nextToken());
                String firstName=nextItem.nextToken();
                String lastName=nextItem.nextToken();
                int phoneNum=Integer.parseInt(nextItem.nextToken());
                String email=(nextItem.nextToken());
                customers.add(new Customer(customerNumber,firstName,lastName,phoneNum,email));
                //primes pump for next line
                line = read.readLine();
                
                }
                //Collections.sort(CustomerDatabase.customer);
            }
            read.close();//closes buffered reader
            
    }catch(FileNotFoundException fnfe){
        System.out.printf("Sorry, the file appears to be missing.  Please contact IT.");
    }catch(IOException ioe){
        System.out.printf("An error has occurred.  Please contact IT.");
    }catch(NumberFormatException e){
        System.out.printf("Number Format Exception: please contact IT.");
    }catch(Exception e){
        System.out.printf("Something weird happened, please contact IT.");
    }
    finally{}

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
    public void addNewCustomer(int ID){
            
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
    
    //determines if cash or credit customer
   public boolean creditCustomer(int customerID){
        boolean credit=false;
        if(customers.get(customerID) instanceof CreditCustomer){
            credit=true;
        }
        return credit;
    }
    
    //approves transaction based on final price and credit limit (if credit customer)
    public boolean approveTransaction(int customerLocation, double creditLimit, double finalPrice){
        boolean approved=false;
        if((customers.get(customerLocation) instanceof CashCustomer)||((customers.get(customerLocation) instanceof CreditCustomer) && (creditLimit>=finalPrice))){
            approved=true;
        }
        
        return approved;
    }   
}
