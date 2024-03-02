/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package codematch;


import static codematch.algorithm.matchCoupon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;  


/**
 *
 * @author nonpr
 */
public class MatchFrame extends javax.swing.JFrame {
    /**
     * Creates new form MainFrame
     */
    
    MatchFrame() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        coupon_table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        category_comboBox = new javax.swing.JComboBox<>();
        fourth_label = new javax.swing.JLabel();
        first_label = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        product_table = new javax.swing.JTable();
        shipping_price_textField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        matchButton = new javax.swing.JButton();
        first_label1 = new javax.swing.JLabel();
        shop_name_textField = new javax.swing.JTextField();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CodeMatch");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        category_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mall", "Normal", "Khum_shipping", "Khum_discount" }));
        category_comboBox.setSelectedIndex(-1);
        category_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category_comboBoxActionPerformed(evt);
            }
        });

        fourth_label.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        fourth_label.setText("Category");

        first_label.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        first_label.setText("Shipping price");

        product_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Shop name", "Shipping price", "Category", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        }

        shipping_price_textField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        shipping_price_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shipping_price_textFieldActionPerformed(evt);
            }
        });
        shipping_price_textField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                shipping_price_textFieldKeyTyped(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        matchButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        matchButton.setText("MATCH");
        matchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchButtonActionPerformed(evt);
            }
        });

        first_label1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        first_label1.setText("Shop name");

        shop_name_textField.setEditable(false);
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
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fourth_label)
                    .addComponent(first_label)
                    .addComponent(first_label1)
                    .addComponent(shop_name_textField, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(shipping_price_textField)
                    .addComponent(category_comboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(matchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(first_label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(shop_name_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(first_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(shipping_price_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fourth_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(category_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
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

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tbl = (DefaultTableModel)product_table.getModel();
        
        if(product_table.getSelectedRowCount() == 1){
            if(shipping_price_textField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Shipping price is required!", "Warning", 2);
            }
            if(category_comboBox.getSelectedIndex() == -1){
                JOptionPane.showMessageDialog(this, "Category is required!", "Warning", 2);
            }
            else{
                double shipping_price = Double.parseDouble(shipping_price_textField.getText());
                String category = category_comboBox.getSelectedItem().toString();
                tbl.setValueAt(shipping_price, product_table.getSelectedRow(), 1);
                tbl.setValueAt(category, product_table.getSelectedRow(), 2);
            }
            
            
        }
        
    }//GEN-LAST:event_updateButtonActionPerformed
    private String[][] add2DString(DefaultTableModel tbl, int row,int col){
        String items[][] = new String[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            items[i][j] = tbl.getValueAt(i, j).toString();
            }
        }
        return items;
    }
    private void sentToReport(HashMap<String, Integer> data){
        ReportFrame report = new ReportFrame();
        DefaultTableModel tbl_product = (DefaultTableModel)product_table.getModel();
        DefaultTableModel tbl_cou = (DefaultTableModel)coupon_table.getModel();
        
        DefaultTableModel tbl_report = (DefaultTableModel)report.report_table.getModel();
        int row_pro_cur = tbl_product.getRowCount();
//        int col_new = tbl_report.getColumnCount();
        int col_cou_cur = tbl_cou.getColumnCount();
        for(String name:data.keySet()){
            for(int i=0;i<row_pro_cur;i++){
                if(name.equals(tbl_product.getValueAt(i, 0).toString())){
                    ArrayList<String> temp = new ArrayList<String>();
                    temp.add(name);
                    for(int j=0;j<col_cou_cur;j++){
                        temp.add(tbl_cou.getValueAt(data.get(name), j).toString());
                    }
                    tbl_report.addRow(temp.toArray());
                }
            }
        }
        report.show();
        
}
    private void matchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchButtonActionPerformed
        // TODO add your handling code here:
            
        DefaultTableModel tbl_pro = (DefaultTableModel)product_table.getModel();
        DefaultTableModel tbl_cou = (DefaultTableModel)coupon_table.getModel();
        
        int row_pro = tbl_pro.getRowCount();
        int col_pro = tbl_pro.getColumnCount();
        int row_cou = tbl_cou.getRowCount();
        int col_cou = tbl_cou.getColumnCount();

        String[][] items = add2DString(tbl_pro,row_pro,col_pro);
        Arrays.sort(items, (a, b) -> Double.compare(Double.parseDouble(b[3]), Double.parseDouble(a[3])));
        Item[] shops = new Item[row_pro];
        for(int i=0;i<items.length;i++){
            String name = items[i][0];
            double shipping = Double.parseDouble(items[i][1]);
            String category = items[i][2];
            double total = Double.parseDouble(items[i][3]);
            
            shops[i] = new Item(name,total,shipping,category);
        }
        
        String[][] coupons_temp = add2DString(tbl_cou,row_cou,col_cou);
        Coupon[] coupons = new Coupon[row_cou];
        for(int i =0;i<coupons_temp.length;i++){
            double discount = Double.parseDouble(coupons_temp[i][0]);
            String type = coupons_temp[i][1];
            String category = coupons_temp[i][2];
            int min_dis = Integer.parseInt(coupons_temp[i][3]);
            double max_dis = Double.parseDouble(coupons_temp[i][4]);
            
            if (null != category)switch (category) {
                case "Free_Shipping" -> {
                    coupons[i] = new Free_shipping();
                    coupons[i].set_min_price(min_dis);
                    coupons[i].set_category_coupon(category);
                    coupons[i].set_type_coupon(type);
                    
                
                }
                case "Percentage" -> {
                    coupons[i] = new Percentage_discount((int)discount);
                    coupons[i].set_min_price(min_dis);
                    coupons[i].set_max_discount(max_dis);
                    coupons[i].set_type_coupon(category);
                    coupons[i].set_type_coupon(type);
                    
                    
                }
                case "Absolute" -> {
                    coupons[i] = new Absolute_discount(discount);
                    coupons[i].set_min_price(min_dis);
                    coupons[i].set_type_coupon(category);
                    coupons[i].set_type_coupon(type);
                }
                default -> {
                }
            }
        }
        HashMap<String, Integer> data = matchCoupon(shops,coupons);
        for (String i : data.keySet()) {
                System.out.println("key: " + i + " value: " + data.get(i));
            }
        sentToReport(data);
        
//        System.out.println(Arrays.toString(cou_index.toArray()));
    }//GEN-LAST:event_matchButtonActionPerformed

    private void shipping_price_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shipping_price_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shipping_price_textFieldActionPerformed

    private void shipping_price_textFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_shipping_price_textFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || c == '.'){
            
        }
        else{
            evt.consume();
        }
    }//GEN-LAST:event_shipping_price_textFieldKeyTyped

    private void product_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_tableMouseClicked
        // TODO add your handling code here:
        shop_name_textField.setEnabled(false);
        DefaultTableModel tbl = (DefaultTableModel)product_table.getModel();
        String name = tbl.getValueAt(product_table.getSelectedRow(), 0).toString();
        String shipping_price = tbl.getValueAt(product_table.getSelectedRow(), 1).toString();
        String category = tbl.getValueAt(product_table.getSelectedRow(), 2).toString();
        
        shop_name_textField.setText(name);
        shipping_price_textField.setText(shipping_price);
        switch(category){
            case("Mall")-> category_comboBox.setSelectedIndex(0);
            case("Normal")-> category_comboBox.setSelectedIndex(1);
            case("Khum_shipping")-> category_comboBox.setSelectedIndex(2);
            case("Khum_discount")-> category_comboBox.setSelectedIndex(3);
        }
        
    }//GEN-LAST:event_product_tableMouseClicked

    private void product_tableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_tableMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_product_tableMouseExited

    private void product_tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_tableMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_product_tableMouseReleased

    private void coupon_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coupon_tableMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_coupon_tableMouseClicked

    private void shop_name_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shop_name_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shop_name_textFieldActionPerformed

    private void category_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category_comboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_category_comboBoxActionPerformed

    
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
            java.util.logging.Logger.getLogger(MatchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatchFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> category_comboBox;
    public javax.swing.JTable coupon_table;
    private javax.swing.JLabel first_label;
    private javax.swing.JLabel first_label1;
    private javax.swing.JLabel fourth_label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton matchButton;
    public javax.swing.JTable product_table;
    private javax.swing.JTextField shipping_price_textField;
    private javax.swing.JTextField shop_name_textField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}



