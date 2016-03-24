/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nolan
 */
public class MainThread {
        public static AMenu code=new AMenu();
        public static Items oItems=new Items();
        public static CustomerDatabase db=new CustomerDatabase();
        public static TransactionClient transactions=new TransactionClient();
        public static InventoryList list=new InventoryList();
        private static boolean checkFiles(){
            boolean tf=false;
            java.io.File Customerfile=new java.io.File("Customer.csv");
		if(!Customerfile.exists()){
			 try{
                                java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.FileWriter("Customer.csv",true)); 
                                bw.flush();
                                bw.close();
                                tf=true;
                        }catch(java.io.IOException e){
                            System.out.println("IO Exception");
                        }}
                
                java.io.File Productfile=new java.io.File("Product.csv");
		if(!Productfile.exists()){
			 try{
                                java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.FileWriter("Product.csv",true));
                                bw.flush();
                                bw.close();
                                tf=true;
                        }catch(java.io.IOException e){
                            System.out.println("IO Exception");
                        }}
        return tf;
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            
            //loads customer
            db.initCustomers();
            //prepares transaction database
            transactions.loadTransactions();
            transactions.printTransactions();
            //prepares items
            oItems.initItems();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainThread.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(checkFiles()){
                JOptionPane.showMessageDialog(null, "Required files were not found and have been generated.", "Files Created", JOptionPane.INFORMATION_MESSAGE);
            }
            code.setVisible(true);
        }
        
        
        
    }
    public MainThread getApp(){
        return this;
    }
}
