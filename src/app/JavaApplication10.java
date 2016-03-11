/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nolan
 */
public class JavaApplication10 {
        public static AMenu code=new AMenu();
        public static Items oItems=new Items();
        public static CustomerDatabase db=new CustomerDatabase();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        try {
            //loads customer
            db.loadCustomer();

            //prepares items
            oItems.initItems();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaApplication10.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JavaApplication10.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            code.setVisible(true);
        }
        
        

        
        
        
    }
    public JavaApplication10 getApp(){
        return this;
    }
}
