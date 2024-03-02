/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package codematch;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nonpr
 */
public class MainFrame extends javax.swing.JFrame {
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void clearText(){
        product_name_textField.setText("");
        price_textField.setText("");
        quantity_textField.setText("");
    }
    
    private boolean isEmpty(){
        if(shop_name_textField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Shop Name is required!", "Warning",2);
            return true;
        }
        if(product_name_textField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Product Name is required!", "Warning", 2);
            return true;
        }
        if((price_textField.getText().equals("")) ){
            JOptionPane.showMessageDialog(this, "Product Price is required!", "Warning", 2);
            return true;
        }
        if(Double.parseDouble(price_textField.getText()) <= 0){
            JOptionPane.showMessageDialog(this, "Plase, increase the product price", "Warning", 2);
            return true;
        }
        if((quantity_textField.getText().equals("")) ){
            JOptionPane.showMessageDialog(this, "Product Quantity is required!", "Warning", 2);
            return true;
        }
        if(Integer.parseInt(quantity_textField.getText()) <= 0){
            JOptionPane.showMessageDialog(this, "Plase, increase the product quantity", "Warning", 2);
            return true;
        }
        
        return false;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        first_label = new javax.swing.JLabel();
        third_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        coupon_table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        product_table = new javax.swing.JTable();
        product_name_textField = new javax.swing.JTextField();
        price_textField = new javax.swing.JTextField();
        quantity_textField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        second_label = new javax.swing.JLabel();
        first_label1 = new javax.swing.JLabel();
        shop_name_textField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CodeMatch");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        first_label.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        first_label.setText("Product Name");

        third_label.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        third_label.setText("Quantity");

        coupon_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Discount", "Type", "Category", "Min Discount", "Max Discount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        coupon_table.getTableHeader().setReorderingAllowed(false);
        coupon_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coupon_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(coupon_table);
        if (coupon_table.getColumnModel().getColumnCount() > 0) {
            coupon_table.getColumnModel().getColumn(0).setResizable(false);
            coupon_table.getColumnModel().getColumn(1).setResizable(false);
            coupon_table.getColumnModel().getColumn(2).setResizable(false);
            coupon_table.getColumnModel().getColumn(3).setResizable(false);
            coupon_table.getColumnModel().getColumn(4).setResizable(false);
        }

        product_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Shop name", "Product Name", "Price", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        product_table.getTableHeader().setReorderingAllowed(false);
        product_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product_tableMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product_tableMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                product_tableMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(product_table);
        if (product_table.getColumnModel().getColumnCount() > 0) {
            product_table.getColumnModel().getColumn(0).setResizable(false);
            product_table.getColumnModel().getColumn(1).setResizable(false);
            product_table.getColumnModel().getColumn(2).setResizable(false);
            product_table.getColumnModel().getColumn(3).setResizable(false);
            product_table.getColumnModel().getColumn(4).setResizable(false);
        }

        product_name_textField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        product_name_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_name_textFieldActionPerformed(evt);
            }
        });

        price_textField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        price_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_textFieldActionPerformed(evt);
            }
        });
        price_textField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                price_textFieldKeyTyped(evt);
            }
        });

        quantity_textField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        quantity_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantity_textFieldActionPerformed(evt);
            }
        });
        quantity_textField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantity_textFieldKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton1.setText("SWITCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        delete_btn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        delete_btn.setText("DELETE");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton4.setText("MATCH");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        second_label.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        second_label.setText("Price");

        first_label1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        first_label1.setText("Shop name");

        shop_name_textField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        shop_name_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shop_name_textFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(first_label)
                            .addComponent(first_label1)
                            .addComponent(shop_name_textField, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(second_label)
                            .addComponent(third_label)
                            .addComponent(quantity_textField)
                            .addComponent(product_name_textField)
                            .addComponent(price_textField))))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(first_label1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(shop_name_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(first_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(product_name_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(second_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(price_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(third_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantity_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CouponFrame couponPage = new CouponFrame();
        DefaultTableModel CouPage_product = (DefaultTableModel)couponPage.product_table.getModel();
        DefaultTableModel MainModel_product = (DefaultTableModel)product_table.getModel();
        
        DefaultTableModel CouPage_Cou = (DefaultTableModel)couponPage.coupon_table.getModel();
        DefaultTableModel MainModel_Cou = (DefaultTableModel)coupon_table.getModel();
        
        sentToNewClassTable(MainModel_product,CouPage_product);
        sentToNewClassTable(MainModel_Cou,CouPage_Cou);
        
        
        couponPage.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    protected static void sentToNewClassTable(DefaultTableModel curModel,DefaultTableModel newModel){
        int col = curModel.getColumnCount();
        int row = curModel.getRowCount();
        
        if(row > 0){
            for(int i =0;i<row;i++){
                Object[] data = new Object[col];
                for(int j = 0;j<col;j++){
                    data[j] = curModel.getValueAt(i, j);
                }
                newModel.addRow(data);
            }
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        if(!isEmpty()){
            String shopName = shop_name_textField.getText();
            String productName = product_name_textField.getText();
            
            double price = Double.parseDouble(price_textField.getText());
            int quantity = Integer.parseInt(quantity_textField.getText());
            String total = String.format("%.2f",(price * (double)quantity));

            String data[] = {shopName,productName,price_textField.getText(),quantity_textField.getText(),total};
            DefaultTableModel tblItemsModel = (DefaultTableModel)product_table.getModel();
            tblItemsModel.addRow(data);

            clearText();
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)product_table.getModel();
        DefaultTableModel tblCouModel = (DefaultTableModel)coupon_table.getModel();
        if(product_table.getRowCount()==0 && coupon_table.getRowCount()==0){
            JOptionPane.showMessageDialog(this, "Table is empty", "Warning", 2);
        }
        else if(product_table.getSelectedRowCount()<=0 && coupon_table.getSelectedRowCount()<=0){
            JOptionPane.showMessageDialog(this, "Please select row to delete", "Warning", 2);
        }
        else{
       
            if(product_table.getSelectedRow() != 1 || product_table.getSelectedRow() > 0){
                int cnt_items = product_table.getSelectedRow();
                while (cnt_items != -1){
                    int modelCnt = product_table.convertRowIndexToModel(cnt_items);
                    tblModel.removeRow(modelCnt);
                    cnt_items = product_table.getSelectedRow();
                    
                }
            }
            if (coupon_table.getSelectedRow() != 1 || coupon_table.getSelectedRow() > 0){
                int cnt_cou = coupon_table.getSelectedRow();
                while (cnt_cou != -1){
                    int modelCnt = coupon_table.convertRowIndexToModel(cnt_cou);
                    tblCouModel.removeRow(modelCnt);
                    cnt_cou = coupon_table.getSelectedRow();
                }
            }
        }
            
        
    }//GEN-LAST:event_delete_btnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        MatchFrame matchPage = new MatchFrame();
        DefaultTableModel matchPage_product = (DefaultTableModel)matchPage.product_table.getModel();
        DefaultTableModel MainModel_product = (DefaultTableModel)product_table.getModel();
        
        DefaultTableModel matchPage_Cou = (DefaultTableModel)matchPage.coupon_table.getModel();
        DefaultTableModel MainModel_Cou = (DefaultTableModel)coupon_table.getModel();
        
        
        int row = MainModel_product.getRowCount();
        ArrayList<String> shopsName = findShopName(MainModel_product);
        
        if(row > 0){
            for(int i = 0;i<shopsName.size();i++){
                double total = 0;
                for(int j = 0;j<row;j++){
                    String name = MainModel_product.getValueAt(j, 0).toString();
                    if(shopsName.get(i).equals(name)){
                        total += Double.parseDouble((String) MainModel_product.getValueAt(j, 4));
                    }
                }
                String[] data = {shopsName.get(i),"0","",String.format( "%.2f", total )};
                matchPage_product.addRow(data);
            }
        }
        
        sentToNewClassTable(MainModel_Cou,matchPage_Cou);
        
        if(product_table.getRowCount()==0 && coupon_table.getRowCount()==0){
            JOptionPane.showMessageDialog(this, "Table is empty", "Warning", 2);
        }
        else if(product_table.getRowCount()==0){
            JOptionPane.showMessageDialog(this, "Product table is empty", "Warning", 2);
        }
        else if(coupon_table.getRowCount()==0){
            JOptionPane.showMessageDialog(this, "Coupon table is empty", "Warning", 2);
        }
        else{
            matchPage.setVisible(true);
        }
        
        

    }//GEN-LAST:event_jButton4ActionPerformed

    protected static ArrayList<String> findShopName(DefaultTableModel table){
        ArrayList<String> shopsName = new ArrayList<String>();
        int row = table.getRowCount();
        if(row > 0){
            for(int i =0;i<row;i++){
                String name = table.getValueAt(i, 0).toString();
                if(!shopsName.contains(name))
                    shopsName.add(name);
            }
        }
        return shopsName;
    }
    
    private void product_name_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_name_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product_name_textFieldActionPerformed

    private void price_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_textFieldActionPerformed

    private void quantity_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantity_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantity_textFieldActionPerformed

    private void quantity_textFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantity_textFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || c == '.'){
            
        }
        else{
            evt.consume();
        }
    }//GEN-LAST:event_quantity_textFieldKeyTyped

    private void price_textFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_price_textFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || c == '.'){
            
        }
        else{
            evt.consume();
        }
    }//GEN-LAST:event_price_textFieldKeyTyped

    private void product_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_tableMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() > 1)
            product_table.clearSelection();
        
        
    }//GEN-LAST:event_product_tableMouseClicked

    private void product_tableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_tableMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_product_tableMouseExited

    private void product_tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_tableMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_product_tableMouseReleased

    private void coupon_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coupon_tableMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() > 1)
            product_table.clearSelection();
    }//GEN-LAST:event_coupon_tableMouseClicked

    private void shop_name_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shop_name_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shop_name_textFieldActionPerformed

    
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable coupon_table;
    private javax.swing.JButton delete_btn;
    private javax.swing.JLabel first_label;
    private javax.swing.JLabel first_label1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField price_textField;
    private javax.swing.JTextField product_name_textField;
    public javax.swing.JTable product_table;
    private javax.swing.JTextField quantity_textField;
    private javax.swing.JLabel second_label;
    private javax.swing.JTextField shop_name_textField;
    private javax.swing.JLabel third_label;
    // End of variables declaration//GEN-END:variables
}
