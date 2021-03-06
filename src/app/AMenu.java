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
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;

public class AMenu extends javax.swing.JFrame {   
    @Override
    public void setDefaultCloseOperation(int operation) {
        super.setDefaultCloseOperation(EXIT_ON_CLOSE); //To change body of generated methods, choose Tools | Templates.
    }
 // Creates Main Menu Form
    public AMenu() {
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

        jPanel1 = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d1 = (Graphics2D) g.create();
                RenderingHints hints1 = new RenderingHints(
                    RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                RenderingHints render1 = new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_SPEED);
                hints1.add(render1);
                g2d1.setRenderingHints(hints1);
                Polygon p1 = new Polygon();
                p1.addPoint(0, 0);
                p1.addPoint(0, 200);

                p1.addPoint(this.getWidth() + 50, 200);
                p1.addPoint(this.getWidth() + 50, 0);
                java.awt.GradientPaint gp1 = new java.awt.GradientPaint(0.0f, 200.0f, new java.awt.Color(20, 60, 100),
                    0.0f, 0.0f, new java.awt.Color(100, 200, 200, 255), true);

                g2d1.setColor(new java.awt.Color(20, 60, 100));
                g2d1.fill(getBounds());
                g2d1.setPaint(gp1);
                g2d1.fill(p1);
                //Image img=	image.getImage("/resources/GameIcon2.jpg");
            }};
            Title = new javax.swing.JLabel();
            InventoryReport = new javax.swing.JButton();
            CreateOrder = new javax.swing.JButton();
            Exit = new javax.swing.JButton();
            ManageInventory = new javax.swing.JButton();
            ManageCustomers = new javax.swing.JButton();
            jButton1 = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setBackground(new java.awt.Color(153, 255, 0));

            jPanel1.setBackground(new java.awt.Color(255, 255, 255));
            jPanel1.setName("Point of Sale System"); // NOI18N

            Title.setFont(new java.awt.Font("Courier New", 1, 80)); // NOI18N
            Title.setForeground(new java.awt.Color(200, 30, 60));
            Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            Title.setText("Jackscript");
            Title.setAlignmentX(0.5F);

            InventoryReport.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
            InventoryReport.setText("Inventory Report");
            InventoryReport.setToolTipText("Create Excel compatible inventory report.");
            InventoryReport.setFocusPainted(false);
            InventoryReport.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    InventoryReportActionPerformed(evt);
                }
            });

            CreateOrder.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
            CreateOrder.setText("Create Order");
            CreateOrder.setToolTipText("Create orders and interface the customer and item list.");
            CreateOrder.setFocusPainted(false);
            CreateOrder.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    CreateOrderActionPerformed(evt);
                }
            });

            Exit.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
            Exit.setText("Exit");
            Exit.setFocusPainted(false);
            Exit.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    ExitActionPerformed(evt);
                }
            });

            ManageInventory.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
            ManageInventory.setText("Manage Inventory");
            ManageInventory.setToolTipText("Add Inventory items and edit stored product data.");
            ManageInventory.setFocusPainted(false);
            ManageInventory.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    ManageInventoryActionPerformed(evt);
                }
            });

            ManageCustomers.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
            ManageCustomers.setText("Manage Customers");
            ManageCustomers.setToolTipText("Add Customers and edit stored customer data.");
            ManageCustomers.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            ManageCustomers.setFocusPainted(false);
            ManageCustomers.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    ManageCustomersActionPerformed(evt);
                }
            });

            jButton1.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
            jButton1.setText("Point of Sale");
            jButton1.setToolTipText("Open the main Point of Sle GUI");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1Layout.createSequentialGroup()
                    .add(168, 168, 168)
                    .add(Title)
                    .addContainerGap(168, Short.MAX_VALUE))
                .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                    .add(57, 291, Short.MAX_VALUE)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(ManageCustomers, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                        .add(InventoryReport, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                        .add(Exit, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                        .add(CreateOrder, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                        .add(ManageInventory, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                        .add(jButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(295, 295, 295))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .add(Title)
                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 49, Short.MAX_VALUE)
                    .add(ManageCustomers, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(40, 40, 40)
                    .add(ManageInventory, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(40, 40, 40)
                    .add(InventoryReport, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(40, 40, 40)
                    .add(CreateOrder, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(40, 40, 40)
                    .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(39, 39, 39)
                    .add(Exit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );

            Title.getAccessibleContext().setAccessibleDescription("Main Menu");

            org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void CreateOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateOrderActionPerformed
        //initializes order form interface
        CreateAnOrder order;
        try{
                //creates order interface
                order=new CreateAnOrder();
                //makes order interface visible
                order.setVisible(true);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            } catch (IOException ex) {
                Logger.getLogger(AMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        finally{
            System.out.println("javaapplication10.AMenu.jButton1ActionPerformed()");  
        }
        
    }//GEN-LAST:event_CreateOrderActionPerformed
//Creates exportable Inventory Report
    private void InventoryReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventoryReportActionPerformed
        try {
            // Calls Item Report Method
            FileChooser filechooser=new FileChooser();
        } catch (Exception ex) {
            Logger.getLogger(AMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_InventoryReportActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // Exits System
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void ManageInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageInventoryActionPerformed
        InventoryMenu im=new InventoryMenu();
        im.setVisible(true);
    }//GEN-LAST:event_ManageInventoryActionPerformed

    private void ManageCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageCustomersActionPerformed
        CustomerMenu cmenu =new CustomerMenu();
        cmenu.setVisible(true);
    }//GEN-LAST:event_ManageCustomersActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        POS pos=new POS();
        pos.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @SuppressWarnings("override")
            public void run() {
                new AMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateOrder;
    private javax.swing.JButton Exit;
    private javax.swing.JButton InventoryReport;
    private javax.swing.JButton ManageCustomers;
    private javax.swing.JButton ManageInventory;
    private javax.swing.JLabel Title;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
