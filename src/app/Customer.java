/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Nolan
 */
public class Customer implements Comparable<Customer> {
    private int customerID;
    private String firstName;
    private String lastName;
    private long phoneNum;
    private String email;
    
    public Customer(){
        
    };
    public Customer(int customerID, String fName, String lName, long phoneNum, String email){
        this.customerID=customerID;
        this.firstName=fName;
        this.lastName=lName;
        this.phoneNum=phoneNum;
        this.email=email;
    }
    /**
     * @return the customerID
     */
    public int getCustomerID() {
        return customerID;
    }
    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the Phone Number
     */
    public long getPhoneNumber() {
        return this.phoneNum;
    }
    public String getStringPhoneNumber(){
        String pnum=Long.toString(this.phoneNum);
        return pnum.substring(0, 3)+"-"+pnum.substring(3,6)+"-"+pnum.substring(6,pnum.length());
        
    }
    /**
     * @param phoneNum the the Phone Number to set
     */
    public void setPhoneNumber(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @param email the Email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString(){
        return Integer.toString(this.customerID)+","+this.firstName+","+this.lastName+","+Long.toString(this.phoneNum)+","+this.email;
    }
    /**
     * @param customer
     * @return numbers
     */
    @Override
        public int compareTo(Customer customer) {
        if (this.customerID < customer.customerID) {
            return -1;
        } else if (this.customerID > customer.customerID) {
            return 1;
        } else {
            return 0;
        }
    }

}
