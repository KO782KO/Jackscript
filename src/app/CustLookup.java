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
public class CustLookup extends javax.swing.JFrame {
    private java.util.List<javax.swing.JButton> list=new java.util.ArrayList<javax.swing.JButton>();
    javax.swing.JButton but;
    
    /**
     * Creates new form CustLookup
     */
    public CustLookup() {
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
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = jPanel4 = new javax.swing.JPanel();
        //jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4,javax.swing.BoxLayout.Y_AXIS)); // 15 rows, 1 column

        jPanel4.setSize(new java.awt.Dimension(360,100));
        // Code of sub-components - not shown here
        java.util.List<javax.swing.JButton> list=new java.util.ArrayList<javax.swing.JButton>();
        jPanel4.setLayout(null);
        int h=0;
        for(Item i:MainThread.oItems.a){
            javax.swing.JButton button=new javax.swing.JButton(i.getItemName()+" -- $"+i.getSellingPrice());
            button.setSize(new java.awt.Dimension(250,60));
            button.setLocation(0,h);
            button.setFont(new java.awt.Font("Cambria",1,20));
            button.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    buttonActionPerformed(evt);
                }
            });
            h+=button.getHeight();
            jPanel4.setPreferredSize(new java.awt.Dimension(300,h));
        }
        for(int i=0;i<list.size();i++){
            jPanel4.add(list.get(i));
        }
        // Layout setup code - not shown here

        // Code adding the component to the parent container - not shown here);
    jButton1 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
    jLabel1.setText("Customer Lookup");

    jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            jTextField1KeyPressed(evt);
        }
    });

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel2.setText("Phone Number:");
    jLabel2.setToolTipText("");

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 341, Short.MAX_VALUE)
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 2000, Short.MAX_VALUE)
    );

    jScrollPane1.setViewportView(jPanel4);

    jButton1.setText("Search");
    jButton1.setToolTipText("");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(113, 113, 113)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jButton1)))
            .addContainerGap(30, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addGap(49, 49, 49)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2)
                .addComponent(jButton1))
            .addGap(18, 18, 18)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(20, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
           if(jTextField1.getText().length()<10){

        }
        else{
            jTextField1.setText(jTextField1.getText().substring(0,jTextField1.getText().length()-1));
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanel4.removeAll();
        for(Customer cust:MainThread.db.getCustomers()){
            if(cust.getPhoneNumber()==Long.parseLong(jTextField1.getText())){
                but=new javax.swing.JButton(cust.getFirstName()+" "+cust.getLastName()+" ("+cust.getCustomerID()+")");
                but.setSize(new java.awt.Dimension(360,100));
                but.setLocation(0,0);
                but.setFont(new java.awt.Font("Cambria",1,20));
                but.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                butActionPerformed(evt);
                    }
                });
                jPanel4.add(but);
                jPanel4.repaint();
                jPanel4.revalidate();
                
                System.out.println(but.getText().substring(but.getText().length()-3,but.getText().length()-1));
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void butActionPerformed(java.awt.event.ActionEvent evt){
        MainThread.pos.jTextField2.setEnabled(true);
        try{
            MainThread.pos.jTextField2.setText(String.valueOf(MainThread.pos.jTextField2.getText()+" "+Integer.parseInt(but.getText().substring(but.getText().length()-3,but.getText().length()-1))));
            MainThread.pos.customerID=Integer.parseInt(but.getText().substring(but.getText().length()-3,but.getText().length()-1));
        }catch(java.lang.Exception e){
            MainThread.pos.jTextField2.setText(String.valueOf(MainThread.pos.jTextField2.getText()+" "+Integer.parseInt(but.getText().substring(but.getText().length()-2,but.getText().length()-1))));
            MainThread.pos.customerID=Integer.parseInt(but.getText().substring(but.getText().length()-2,but.getText().length()-1));
        }
        MainThread.pos.jTextField2.setEnabled(false);
        dispose();
    }
    private void buttonActionPerformed(java.awt.event.ActionEvent evt){
    }
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
            java.util.logging.Logger.getLogger(CustLookup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustLookup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustLookup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustLookup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustLookup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
