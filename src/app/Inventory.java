/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Nolan
 */
public class Inventory implements Comparable<Inventory> {
    
    private int itemID;
    private int quantityInStock;
    private int quantitySold;
    public Inventory(){};
    
    public Inventory(int itemID, int quantityInStock, int quantitySold){
        //TODO: ids should be alphanumerical
        this.itemID=itemID;
        this.quantityInStock=quantityInStock;
        this.quantitySold=quantitySold;
    }
    
    

    /**
     * @return the itemID
     */
    public int getItemID() {
        return itemID;
    }

    /**
     * @param itemID the itemID to set
     */
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    /**
     * @return the quantityInStock
     */
    public int getQuantityInStock() {
        return quantityInStock;
    }
    /**
     * @param quantityInStock the quantityInStock to set
     */
    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
    public void setHistory(int quantityInStock){
        
    }
    @Override
    public int compareTo(Inventory inventory) {
        if (this.itemID < inventory.itemID) {
            return -1;
        } else if (this.itemID > inventory.itemID) {
            return 1;
        } else {
            return 0;
        }
    }
    
}
