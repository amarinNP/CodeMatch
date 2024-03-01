/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package codematch;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author nonpr
 */
public class CouponFrame extends javax.swing.JFrame {
    /**
     * Creates new form MainFrame
     */
    public CouponFrame() {
        initComponents();
        
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void clearText(){
        discount_textField.setText("");
        min_textField.setText("");
        max_textField.setText("");
        category_comboBox.setSelectedIndex(-1);
    }
    
    private boolean isEmpty(){
            if(category_comboBox.getSelectedIndex() == -1){
                JOptionPane.showMessageDialog(this, "Please, select the category", "Warning", 2);
                return true;
            }
            
            if((discount_textField.getText().equals("")) ){
                JOptionPane.showMessageDialog(this, "Discount is required!", "Warning", 2);
                return true;
            }
            if(Integer.parseInt(discount_textField.getText()) <= 0){
                JOptionPane.showMessageDialog(this, "Please, increase the product quantity", "Warning", 2);
                return true;
            }
            if((min_textField.getText().equals("")) ){
                JOptionPane.showMessageDialog(this, "Min is required!", "Warning", 2);
                return true;
            }
            
            if((max_textField.getText().equals("")) ){
                JOptionPane.showMessageDialog(this, "Max is required!", "Warning", 2);
                return true;
            }
            
            
            if(!normal_jRadioButton.isSelected() && !mall_jRadioButton.isSelected() && !k_shipping_jRadioButton.isSelected()){
                JOptionPane.showMessageDialog(this, "Please, select the type", "Warning", 2);
                return true;
            }
        
        return false;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        shopType = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        first_label = new javax.swing.JLabel();
        third_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        coupon_table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        product_table = new javax.swing.JTable();
        discount_textField = new javax.swing.JTextField();
        min_textField = new javax.swing.JTextField();
        max_textField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        second_label = new javax.swing.JLabel();
        fourth_label = new javax.swing.JLabel();
        category_comboBox = new javax.swing.JComboBox<>();
        normal_jRadioButton = new javax.swing.JRadioButton();
        mall_jRadioButton = new javax.swing.JRadioButton();
        k_shipping_jRadioButton = new javax.swing.JRadioButton();
        k_discount_jRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CodeMatch");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        first_label.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        first_label.setText("Discount");

        third_label.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        third_label.setText("Max Discount");

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

        discount_textField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        discount_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discount_textFieldActionPerformed(evt);
            }
        });

        min_textField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        min_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                min_textFieldActionPerformed(evt);
            }
        });
        min_textField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                min_textFieldKeyTyped(evt);
            }
        });

        max_textField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        max_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                max_textFieldActionPerformed(evt);
            }
        });
        max_textField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                max_textFieldKeyTyped(evt);
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
        second_label.setText("Min Discount");

        fourth_label.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        fourth_label.setText("Category");

        category_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Free_Shipping", "Absolute", "Percentage" }));
        category_comboBox.setSelectedIndex(-1);
        category_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category_comboBoxActionPerformed(evt);
            }
        });

        shopType.add(normal_jRadioButton);
        normal_jRadioButton.setText("Normal");
        normal_jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normal_jRadioButtonActionPerformed(evt);
            }
        });

        shopType.add(mall_jRadioButton);
        mall_jRadioButton.setText("Mall");
        mall_jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mall_jRadioButtonActionPerformed(evt);
            }
        });

        shopType.add(k_shipping_jRadioButton);
        k_shipping_jRadioButton.setText("K_Shipping");
        k_shipping_jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k_shipping_jRadioButtonActionPerformed(evt);
            }
        });

        shopType.add(k_discount_jRadioButton);
        k_discount_jRadioButton.setText("K_Discount");
        k_discount_jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k_discount_jRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fourth_label)
                            .addComponent(first_label)
                            .addComponent(second_label)
                            .addComponent(third_label)
                            .addComponent(max_textField)
                            .addComponent(category_comboBox, 0, 381, Short.MAX_VALUE)
                            .addComponent(discount_textField)
                            .addComponent(min_textField)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(normal_jRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mall_jRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(k_shipping_jRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(k_discount_jRadioButton))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(first_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(discount_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(second_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(min_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(third_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(max_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fourth_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(category_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(normal_jRadioButton)
                            .addComponent(mall_jRadioButton)
                            .addComponent(k_shipping_jRadioButton)
                            .addComponent(k_discount_jRadioButton))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
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
        MainFrame mainPage = new MainFrame();
        
        DefaultTableModel CouPage_product = (DefaultTableModel)product_table.getModel();
        DefaultTableModel MainModel_product = (DefaultTableModel)mainPage.product_table.getModel();
        
        DefaultTableModel CouPage_Cou = (DefaultTableModel)coupon_table.getModel();
        DefaultTableModel MainModel_Cou = (DefaultTableModel)mainPage.coupon_table.getModel();
        
        MainFrame.sentToNewClassTable(CouPage_product,MainModel_product);
        MainFrame.sentToNewClassTable(CouPage_Cou,MainModel_Cou);
        
        
        mainPage.show();
        dispose();
        
            
            
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        boolean pass = false;
        switch (category_comboBox.getSelectedIndex()) {
            case 0 -> {
                discount_textField.setText("37");
                min_textField.setEnabled(true);
                max_textField.setText("37");
            }
            case 1 -> {    
                discount_textField.setEnabled(true);
                min_textField.setEnabled(true);
                max_textField.setText(discount_textField.getText());
                if((Integer.parseInt(min_textField.getText()) < 0) || (Integer.parseInt(min_textField.getText()) > Integer.parseInt(max_textField.getText()))){
                    JOptionPane.showMessageDialog(this, "Min is incorrect!", "Warning", 2);
                    pass = true;
                }
            }
            case 2 -> {
                discount_textField.setEnabled(true);
                min_textField.setEnabled(true);
                max_textField.setEnabled(true);
                if((Integer.parseInt(max_textField.getText()) < 0) || (Integer.parseInt(max_textField.getText()) < Integer.parseInt(min_textField.getText()))){
                    JOptionPane.showMessageDialog(this, "Max is incorrect!", "Warning", 2);
                    pass = true;
                }
                else if((Integer.parseInt(min_textField.getText()) < 0) || (Integer.parseInt(min_textField.getText()) > Integer.parseInt(max_textField.getText()))){
                    JOptionPane.showMessageDialog(this, "Min is incorrect!", "Warning", 2);
                    pass = true;
                }
            }
            default -> {
            }
        }
        
        if(!isEmpty() && !pass){
            
            String category = category_comboBox.getSelectedItem().toString();
            String type = "";
            if (normal_jRadioButton.isSelected()){
                type = "Normal";
            }
            else if (mall_jRadioButton.isSelected()){
                type = "Mall";
            }
            else if (k_shipping_jRadioButton.isSelected()){
                type = "Khum_shipping";
            }
            else if (k_discount_jRadioButton.isSelected()){
                type = "Khum_discount";
            }
            
            DefaultTableModel tblCousModel = (DefaultTableModel)coupon_table.getModel();
            String data[] = {discount_textField.getText(),type,category,min_textField.getText(),max_textField.getText()};
            tblCousModel.addRow(data);
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
                    String total = tblModel.getValueAt(cnt_items,4).toString();
                    System.out.println(total);
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
        DefaultTableModel couModel_product = (DefaultTableModel)product_table.getModel();
        
        DefaultTableModel matchPage_Cou = (DefaultTableModel)matchPage.coupon_table.getModel();
        DefaultTableModel couModel_Cou = (DefaultTableModel)coupon_table.getModel();
        
        
        int row = couModel_product.getRowCount();
        ArrayList<String> shopsName = MainFrame.findShopName(couModel_product);
        
        if(row > 0){
            for(int i = 0;i<shopsName.size();i++){
                double total = 0;
                for(int j = 0;j<row;j++){
                    String name = couModel_product.getValueAt(j, 0).toString();
                    if(shopsName.get(i).equals(name)){
                        total += Double.parseDouble((String) couModel_product.getValueAt(j, 4));
                    }
                }
                String[] data = {shopsName.get(i),"0","",String.format( "%.2f", total )};
                matchPage_product.addRow(data);
            }
        }
        MainFrame.sentToNewClassTable(couModel_Cou,matchPage_Cou);

        if(matchPage.getObj()){
            matchPage.setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void discount_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discount_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discount_textFieldActionPerformed

    private void min_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_min_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_min_textFieldActionPerformed

    private void max_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_max_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_max_textFieldActionPerformed

    private void category_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category_comboBoxActionPerformed
        // TODO add your handling code here:
        switch (category_comboBox.getSelectedIndex()) {
            case 0 -> {
                discount_textField.setEnabled(false);
                min_textField.setEnabled(true);
                max_textField.setEnabled(false);
            }
            case 1 -> {
                discount_textField.setEnabled(true);
                min_textField.setEnabled(true);
                max_textField.setEnabled(false);
            }
            case 2 -> {
                discount_textField.setEnabled(true);
                min_textField.setEnabled(true);
                max_textField.setEnabled(true);
            }
            default -> {
            }
        }
    }//GEN-LAST:event_category_comboBoxActionPerformed

    private void max_textFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_max_textFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || c == '.'){
            
        }
        else{
            evt.consume();
        }
    }//GEN-LAST:event_max_textFieldKeyTyped

    private void min_textFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_min_textFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || c == '.'){
            
        }
        else{
            evt.consume();
        }
    }//GEN-LAST:event_min_textFieldKeyTyped

    private void normal_jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normal_jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_normal_jRadioButtonActionPerformed

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

    private void mall_jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mall_jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mall_jRadioButtonActionPerformed

    private void k_shipping_jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k_shipping_jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k_shipping_jRadioButtonActionPerformed

    private void k_discount_jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k_discount_jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k_discount_jRadioButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(CouponFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CouponFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CouponFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CouponFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CouponFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> category_comboBox;
    public javax.swing.JTable coupon_table;
    private javax.swing.JButton delete_btn;
    private javax.swing.JTextField discount_textField;
    private javax.swing.JLabel first_label;
    private javax.swing.JLabel fourth_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton k_discount_jRadioButton;
    private javax.swing.JRadioButton k_shipping_jRadioButton;
    private javax.swing.JRadioButton mall_jRadioButton;
    private javax.swing.JTextField max_textField;
    private javax.swing.JTextField min_textField;
    private javax.swing.JRadioButton normal_jRadioButton;
    public javax.swing.JTable product_table;
    private javax.swing.JLabel second_label;
    private javax.swing.ButtonGroup shopType;
    private javax.swing.JLabel third_label;
    // End of variables declaration//GEN-END:variables
}
