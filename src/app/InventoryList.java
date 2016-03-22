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
public class InventoryList extends javax.swing.JFrame {

    /**
     * Creates new form InventoryList
     */
    public InventoryList() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        try{
            MainThread.oItems.initItems();
        }catch(java.io.FileNotFoundException e){
            System.out.println("agh");
        }catch(java.io.IOException e){

        }
        jTable1 = new javax.swing.JTable(MainThread.oItems.a.size(),3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jLabel1.setText("Inventory Database");

        int ct=MainThread.oItems.a.size();
        jTable1.setCellSelectionEnabled(false);
        jTable1.setFont(new java.awt.Font("Monotype Corsiva",4,40));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            MainThread.oItems.toStringArray(),
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        //	tab.setBackground(new Color(100,100,220,190));
        //tab.setUI();
        //Fill the table
        int count=0;
        for(int r=ct-1;r>=0;r--){

            for(int c=0;c<=4;c++){
                switch(c){
                    case 0:
                    jTable1.setValueAt(Integer.toString(MainThread.oItems.a.get(r).getItemId()),count,c);
                    case 1:
                    jTable1.setValueAt(MainThread.oItems.a.get(r).getItemName(),count,c);
                    jTable1.getCellEditor(r,c).cancelCellEditing();
                    case 2:
                    jTable1.setValueAt(Double.toString(MainThread.oItems.a.get(r).getSellingPrice()),count,c);
                    case 3:
                    jTable1.setValueAt(Integer.toString(MainThread.oItems.a.get(r).getQuantity()), count, c);
                    count++;	}

            }
        }

        javax.swing.table.JTableHeader tabhead=new javax.swing.table.JTableHeader(){
            @Override
            protected void paintComponent(java.awt.Graphics gr){
                super.paintComponent(gr);
                //background-------------------
                java.awt.Graphics2D g2d1=(java.awt.Graphics2D)gr.create();
                java.awt.RenderingHints hints1 = new java.awt.RenderingHints(
                    java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
                java.awt.RenderingHints render1 =new java.awt.RenderingHints(java.awt.RenderingHints.KEY_RENDERING,java.awt.RenderingHints.VALUE_RENDER_QUALITY);
                hints1.add(render1);
                g2d1.setRenderingHints(hints1);
                java.awt.Polygon p = new java.awt.Polygon();
                p.addPoint(0,0);
                p.addPoint(0,100);
                p.addPoint(100,0);
                java.awt.GradientPaint gp = new java.awt.GradientPaint(0.0f, 0.0f,new java.awt.Color(20,60,120),
                    100.0f, 100.0f,new java.awt.Color(0,130,200), true);
                g2d1.setPaint(gp);
                g2d1.fill(p);
            }
        };
        tabhead=jTable1.getTableHeader();
        //tab.getTableHeader().getUI().paint(tabhead.getGraphics(), tab);
        //tabhead.setUI(tab.getTableHeader().getUI());
        //tabhead.setUI(null);
        //tabhead.setOpaque(false);
        jTable1.setTableHeader(tabhead);
        jTable1.repaint();
        tabhead.repaint();
        tabhead.getColumnModel().getColumn(0).setHeaderValue("Item ID");
        tabhead.getColumnModel().getColumn(1).setHeaderValue("Item Name");
        tabhead.getColumnModel().getColumn(2).setHeaderValue("Selling Price");
        tabhead.getColumnModel().getColumn(2).setHeaderValue("Quantity");
        tabhead.setFont(new java.awt.Font("OCR A STD",1,20));
        //tabhead.setBackground(new Color(120,120,230,160));
        //tabhead.setFont(new Font("Monotype Corsiva",4,40));
        //TableColumnModel tabcolmod= (TableColumnModel) new JTableHeader();//tabcolmod.getColumn(0).setHeaderValue("Username");
        //tabcolmod.getColumn(0).setHeaderValue("Username");

        jTable1.setCellEditor(null);
        jTable1.setCellSelectionEnabled(false);
        jTable1.setFont(new java.awt.Font("OCR A STD",4,16));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(209, 209, 209))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(InventoryList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
