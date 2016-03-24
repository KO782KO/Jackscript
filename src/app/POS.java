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
public class POS extends javax.swing.JFrame {

    /**
     * Creates new form PointOfSale1
     */
    public POS() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SubmitButton1 = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        AmtLabel = new javax.swing.JLabel();
        AmtField = new javax.swing.JTextField();
        ProductDetails = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(java.awt.Graphics g){
                java.awt.Graphics2D g2d1=(java.awt.Graphics2D)g.create();
                java.awt.RenderingHints hints1 = new java.awt.RenderingHints(
                    java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
                java.awt.RenderingHints render1 =new java.awt.RenderingHints(java.awt.RenderingHints.KEY_RENDERING,java.awt.RenderingHints.VALUE_RENDER_QUALITY);
                hints1.add(render1);
                g2d1.setRenderingHints(hints1);
                g2d1.setColor(new java.awt.Color(240,240,240,150));
                g2d1.fillRect(0,0, ProductDetails.getWidth(), ProductDetails.getHeight());

            }};
            ProductDetails.setOpaque(false);
            ProductDetails.setBackground(new java.awt.Color(100,100,100,100));
            ProductDetailsTitle = new javax.swing.JLabel();
            SelProduct_ComboBox = new javax.swing.JComboBox();
            ProductNameField = new javax.swing.JTextField();
            QuantityField = new javax.swing.JTextField();
            PricePerUnitField = new javax.swing.JTextField();
            OrderType_ComboBox = new javax.swing.JComboBox();
            SelProductLabel = new javax.swing.JLabel();
            ProductNameLabel = new javax.swing.JLabel();
            QuantityInStockLabel = new javax.swing.JLabel();
            PricePerUnitLabel = new javax.swing.JLabel();
            OrderTypeLabel = new javax.swing.JLabel();
            jComboBox1 = new javax.swing.JComboBox();
            jLabel3 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jLabel1.setText("Transaction Menu");

            SubmitButton1.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
            SubmitButton1.setText("Total");
            SubmitButton1.setToolTipText("");
            SubmitButton1.setFocusPainted(false);
            SubmitButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    SubmitButton1ActionPerformed(evt);
                }
            });

            BackButton.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
            BackButton.setText("Back to Menu");
            BackButton.setFocusPainted(false);
            BackButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    BackButtonActionPerformed(evt);
                }
            });

            AmtLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            AmtLabel.setText("Amount of product");

            AmtField.setText("          ");
            AmtField.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    AmtFieldActionPerformed(evt);
                }
            });

            ProductDetails.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

            ProductDetailsTitle.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
            ProductDetailsTitle.setText("Product Details:");

            SelProduct_ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
            SelProduct_ComboBox.setToolTipText("Select");
            SelProduct_ComboBox.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    SelProduct_ComboBoxActionPerformed(evt);
                }
            });

            ProductNameField.setEditable(false);

            QuantityField.setEditable(false);
            QuantityField.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    QuantityFieldActionPerformed(evt);
                }
            });

            PricePerUnitField.setEditable(false);

            OrderType_ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "In-Store", "Online ($4 S&H)" }));
            OrderType_ComboBox.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    OrderType_ComboBoxActionPerformed(evt);
                }
            });

            SelProductLabel.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
            SelProductLabel.setText("Select a product:");

            ProductNameLabel.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
            ProductNameLabel.setText("Product Name:");

            QuantityInStockLabel.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
            QuantityInStockLabel.setText("Quantity in stock:");

            PricePerUnitLabel.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
            PricePerUnitLabel.setText("Price per unit:");

            OrderTypeLabel.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
            OrderTypeLabel.setText("Order Type:");

            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cash", "Credit", "Debit", "Check", "Gift Card" }));
            jComboBox1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox1ActionPerformed(evt);
                }
            });

            jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
            jLabel3.setText("Payment Type:");

            javax.swing.GroupLayout ProductDetailsLayout = new javax.swing.GroupLayout(ProductDetails);
            ProductDetails.setLayout(ProductDetailsLayout);
            ProductDetailsLayout.setHorizontalGroup(
                ProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ProductDetailsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(ProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(ProductDetailsLayout.createSequentialGroup()
                            .addComponent(SelProductLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SelProduct_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ProductDetailsLayout.createSequentialGroup()
                            .addComponent(PricePerUnitLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PricePerUnitField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ProductDetailsLayout.createSequentialGroup()
                            .addComponent(QuantityInStockLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(QuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ProductDetailsLayout.createSequentialGroup()
                            .addComponent(ProductDetailsTitle)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ProductDetailsLayout.createSequentialGroup()
                            .addComponent(ProductNameLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ProductNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ProductDetailsLayout.createSequentialGroup()
                            .addGroup(ProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(OrderTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(ProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(OrderType_ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addContainerGap())
            );
            ProductDetailsLayout.setVerticalGroup(
                ProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ProductDetailsLayout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(ProductDetailsTitle)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(ProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SelProduct_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SelProductLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(ProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ProductNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ProductNameLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(ProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(QuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(QuantityInStockLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(ProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PricePerUnitField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PricePerUnitLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(ProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(OrderType_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(OrderTypeLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(ProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBox1)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
            );

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 519, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(421, 421, 421)
                                .addComponent(SubmitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(155, 155, 155)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AmtField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AmtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ProductDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(5, 5, 5)))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 387, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(AmtLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AmtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ProductDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(SubmitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap()))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void SubmitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButton1ActionPerformed
        // selects customer & item to submit order
        /*  Customer customer=MainThread.db.getCustomers().get(SelCustomer_ComboBox.getSelectedIndex());
        Item tempItem=Items.a.get(SelProduct_ComboBox.getSelectedIndex());
        int paymentType=jComboBox1.getSelectedIndex();

        IdkField.setVisible(false);
        String entry=(AmtField.getText()).trim();
        int quantityRequested=-1;
        int quantity=tempItem.getQuantity();
        try{
            quantityRequested=Integer.parseInt(entry);

        }catch(InputMismatchException ime){
            ime.toString();
            IdkField.setVisible(true);
            IdkField.setText("Please enter a whole number...i.e. 5");
            AmtField.replaceSelection("");

        }catch(NumberFormatException nfe){
            nfe.toString();
            IdkField.setVisible(true);
            IdkField.setText("Please enter a whole number...like 5");
            AmtField.replaceSelection("");
        }
        catch(Exception e){
            e.toString();
            IdkField.setVisible(true);
            IdkField.setText("Please enter a whole number...i.e. 5");
            AmtField.replaceSelection("");
        }finally{}

        //If quantity requested exceeds quantity, rejects order
        if(quantityRequested>quantity){
            IdkField.setVisible(true);
            IdkField.setText("Sorry, the quantity ordered exceeds our inventory");
            AmtField.replaceSelection("");

            //if quantity requested is within inventory amount
        }else if((quantityRequested<=quantity)&&(quantityRequested!=-1)){
            IdkField.setVisible(false);
            java.text.DateFormat df = new java.text.SimpleDateFormat("dd/MM/yy HH:mm:ss");
            java.util.Calendar date=java.util.Calendar.getInstance();
            String DATE =df.format(date.getTime());

            Transaction tempTransaction=MainThread.transactions.generateTransactionType(paymentType,tempItem.getItemId(),customer.getCustomerID(),quantityRequested, DATE, 0, OrderType_ComboBox.getItemAt(OrderType_ComboBox.getSelectedIndex()).toString());
            //gets price
            double price;
            price = MainThread.oItems.getOrderPrice(tempTransaction, tempItem, quantityRequested);

            //sets final price of item ordered
            double finalPrice=price;
            //adds shipping to price
            Boolean shippingCharged;
            shippingCharged = MainThread.oItems.addShipping(OrderType_ComboBox.getSelectedIndex());
            SnHField.setText("$0.00");
            //calcualates shipping charge
            if(shippingCharged){
                int shipping = 4;
                finalPrice=price+shipping;
                SnHField.setText("$4.00");
                SnHField.setVisible(true);
            }
            tempTransaction.setPrice(finalPrice);
            PriceField.setVisible(true);
            PriceField.setText("$"+price);
            TotalCostField.setVisible(true);
            TotalCostField.setText("$"+finalPrice);
            //creating boolean for giftcard transaction
            Boolean giftcardPay;
            // giftcardPay = MainThread.oitems.addgiftCard()
            //makes sale of item and sends to inventory file
            MainThread.oItems.sellAnItem(shippingCharged,tempTransaction,tempItem);
            //summarizes order
            ScrollPaneTextArea.setText(MainThread.oItems.orderSummary(tempTransaction));
            int qoh=Integer.parseInt(QuantityField.getText());
            int updated=qoh-quantityRequested;
            QuantityField.setText(""+updated);

        }else{
            IdkField.setVisible(true);
            IdkField.setText("Please enter a whole number, such as 5");
        }
        */
    }//GEN-LAST:event_SubmitButton1ActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // exit
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void AmtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmtFieldActionPerformed

    }//GEN-LAST:event_AmtFieldActionPerformed

    private void SelProduct_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelProduct_ComboBoxActionPerformed
        // TODO add your handling code here:
        // Collections.sort(Items.a);
        Item item=MainThread.oItems.a.get(SelProduct_ComboBox.getSelectedIndex());

        // IdkField.setVisible(false);
        ProductNameField.setText(item.getItemName());
        QuantityField.setText(""+item.getQuantity());
        PricePerUnitField.setText("$"+item.getSellingPrice());
        ProductNameField.setVisible(true);
        ProductNameField.setVisible(true);
        PricePerUnitField.setVisible(true);
    }//GEN-LAST:event_SelProduct_ComboBoxActionPerformed

    private void QuantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityFieldActionPerformed

    private void OrderType_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderType_ComboBoxActionPerformed
        // TODO add your handling code here:
        // IdkField.setVisible(false);
        //gets item information
        int orderType=OrderType_ComboBox.getSelectedIndex();
        boolean shippingCharged=MainThread.oItems.addShipping(orderType);
        double shippingFee=4.00;
        String shipping="$"+shippingFee+"0";
        if(shippingCharged){
            // SnHField.setText(shipping);

        }else{
            //SnHField.setText("$0.00");
        }
    }//GEN-LAST:event_OrderType_ComboBoxActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        //IdkField.setVisible(false);
        //gets payment method
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmtField;
    private javax.swing.JLabel AmtLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel OrderTypeLabel;
    private javax.swing.JComboBox OrderType_ComboBox;
    private javax.swing.JTextField PricePerUnitField;
    private javax.swing.JLabel PricePerUnitLabel;
    private javax.swing.JPanel ProductDetails;
    private javax.swing.JLabel ProductDetailsTitle;
    private javax.swing.JTextField ProductNameField;
    private javax.swing.JLabel ProductNameLabel;
    private javax.swing.JTextField QuantityField;
    private javax.swing.JLabel QuantityInStockLabel;
    private javax.swing.JLabel SelProductLabel;
    private javax.swing.JComboBox SelProduct_ComboBox;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JButton SubmitButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
