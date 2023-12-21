/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package managment;

import com.mysql.jdbc.PreparedStatement;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author TUF
 */
public class SaleAlter extends javax.swing.JFrame {

    /**
     * Creates new form SaleAlter
     */
    public SaleAlter() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("Khmer OS Freehand", Font.BOLD, 16));
        display();
        ProductComboBox();
        
        // Set the event listener for the btnSelect button
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        }); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_product = new javax.swing.JLabel();
        label_date = new javax.swing.JLabel();
        txtProduct = new javax.swing.JComboBox<>();
        label_date1 = new javax.swing.JLabel();
        txtCurrency = new javax.swing.JComboBox<>();
        txtProductE = new javax.swing.JComboBox<>();
        txtPrice = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnSubmit = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSelect = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        label_product.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        label_product.setForeground(new java.awt.Color(102, 102, 102));
        label_product.setText("ផលិតផល");

        label_date.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        label_date.setForeground(new java.awt.Color(102, 102, 102));
        label_date.setText("ចាប់ពីថ្ងៃ");

        txtProduct.setBackground(new java.awt.Color(255, 255, 255));
        txtProduct.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        txtProduct.setForeground(new java.awt.Color(102, 102, 102));
        txtProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        txtProduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label_date1.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        label_date1.setForeground(new java.awt.Color(102, 102, 102));
        label_date1.setText("ដល់ថ្ងៃ");

        txtCurrency.setBackground(new java.awt.Color(255, 255, 255));
        txtCurrency.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        txtCurrency.setForeground(new java.awt.Color(102, 102, 102));
        txtCurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "ដុល្លារ 4000$", "ដុល្លារ 4100$", "ដុល្លារ 4200$" }));
        txtCurrency.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtProductE.setBackground(new java.awt.Color(255, 255, 255));
        txtProductE.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        txtProductE.setForeground(new java.awt.Color(102, 102, 102));
        txtProductE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPrice.setBackground(new java.awt.Color(255, 255, 255));
        txtPrice.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(102, 102, 102));
        txtPrice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        txtQty.setBackground(new java.awt.Color(255, 255, 255));
        txtQty.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        txtQty.setForeground(new java.awt.Color(102, 102, 102));
        txtQty.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        txtTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal.setFont(new java.awt.Font("Khmer OS Freehand", 1, 18)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(102, 102, 102));
        txtTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel7.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("តម្លៃសរុប");

        jLabel9.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("ផលិតផល");

        jLabel10.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("រូបិយប័ណ្ណ");

        jLabel11.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("ចំនួន");

        jLabel12.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("តម្លៃ");

        table.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        table.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        table.setForeground(new java.awt.Color(102, 102, 102));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "ផលិតផល", "ចំនួន", "តម្លៃ", "តម្លៃសរុប", "ថ្ងៃលក់"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(45);
        table.setShowGrid(true);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(15);
            table.getColumnModel().getColumn(1).setPreferredWidth(130);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(2).setPreferredWidth(20);
        }

        btnSubmit.setBackground(new java.awt.Color(0, 153, 255));
        btnSubmit.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("បញ្ជូន");
        btnSubmit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(102, 255, 102));
        btnUpdate.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(51, 51, 51));
        btnUpdate.setText("កំណែ");
        btnUpdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("លុប");
        btnDelete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSelect.setBackground(new java.awt.Color(255, 255, 255));
        btnSelect.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        btnSelect.setForeground(new java.awt.Color(102, 102, 102));
        btnSelect.setText("ជ្រើសរើស");
        btnSelect.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        txtId.setBackground(new java.awt.Color(236, 236, 236));
        txtId.setForeground(new java.awt.Color(255, 255, 255));
        txtId.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnCalculate.setBackground(new java.awt.Color(255, 255, 204));
        btnCalculate.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        btnCalculate.setForeground(new java.awt.Color(79, 79, 79));
        btnCalculate.setText("គណនា");
        btnCalculate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label_product, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_date, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_date1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProduct, 0, 216, Short.MAX_VALUE)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(txtQty)
                            .addComponent(txtPrice))
                        .addGap(1, 1, 1))
                    .addComponent(txtCurrency, 0, 234, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtProductE, javax.swing.GroupLayout.Alignment.TRAILING, 0, 233, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_date, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(label_date1)
                                .addGap(63, 63, 63)
                                .addComponent(label_product, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtProductE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrice)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(16, 16, 16))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Object[] row = new Object[6];
        model.setRowCount(0);
        Connection con = null;
        
        try {
            DecimalFormat decimalFormat = new DecimalFormat("#0");
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/manegment?autoReconnect=true&useSSL=false","root","");
            
            String product = txtProduct.getSelectedItem().toString();
            SimpleDateFormat fdate = new SimpleDateFormat("yyyy-MM-dd");
            String fromDate = "";
            String toDate = "";

            if (dateFrom.getDate() == null && dateTo.getDate() == null) {
            fromDate = "2023-01-01";
            toDate = "9000-01-01";
            }else if(dateTo.getDate() == null){
                fromDate = fdate.format(dateFrom.getDate());
                toDate = fdate.format(dateFrom.getDate());
            }else{
                fromDate = fdate.format(dateFrom.getDate());
                toDate = fdate.format(dateTo.getDate());
            }
            
            
            //Execute
            String product_query = "";
            if(txtProduct.getSelectedItem() == "-"){
                product_query = "SELECT * FROM sales WHERE sale_date BETWEEN DATE_FORMAT(?, '%Y-%m-%d') AND DATE_FORMAT(?, '%Y-%m-%d')";
            }
            else{
                product_query = "SELECT * FROM sales WHERE sale_date BETWEEN DATE_FORMAT(?, '%Y-%m-%d') AND DATE_FORMAT(?, '%Y-%m-%d') AND product_name = ?"; 
            }
            String sql = product_query;
            PreparedStatement statement = (PreparedStatement) con.prepareStatement(sql);

            if(txtProduct.getSelectedItem() == "-"){
                statement.setString(1, fromDate);
                statement.setString(2, toDate);
            }
            else{
                statement.setString(1, fromDate);
                statement.setString(2, toDate);
                statement.setString(3, product);
            }

            ResultSet rs = statement.executeQuery();
            while(rs.next()) {
                row[0] = rs.getObject("id_sale"); 
                row[1] = rs.getObject("product_name");
                row[2] = rs.getObject("qty"); 
                row[3] = decimalFormat.format(rs.getDouble("price")) + " ៛";
                row[4] = decimalFormat.format(rs.getDouble("total")) + " ៛";
                row[5] = rs.getObject("sale_date"); 
                model.addRow(row);
            }
       
        
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table.getModel(); 
        int selectedRowIndex = table.getSelectedRow();
        
        if(selectedRowIndex == -1){
            JOptionPane.showMessageDialog(this, "Error");
            
        }else{
            
            String col0 = model.getValueAt(selectedRowIndex, 0).toString();
            String col1 = model.getValueAt(selectedRowIndex, 1).toString();
            String col2 = model.getValueAt(selectedRowIndex, 2).toString();
            String col3 = model.getValueAt(selectedRowIndex, 3).toString(); 
            String col4 = model.getValueAt(selectedRowIndex, 4).toString();
            
            txtId.setText(col0);
            txtProductE.setSelectedItem(col1);
            txtQty.setText(col2);
            txtPrice.setText(col3);
            txtTotal.setText(col4);
        }                          

    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // TODO add your handling code here:
        if(txtQty.getText().equals(""))
        {
//            JOptionPane.showMessageDialog(this, "សូមបញ្ចូល ចំនួនផលិតផល ជាមុនសិន");
            Error er = new Error();
            er.setVisible(true);
            
        }else if(txtPrice.getText().equals("")){
            Error1 er = new Error1();
            er.setVisible(true);
        }else{
            String pname = txtProduct.getSelectedItem().toString();
            int qty = Integer.parseInt(txtQty.getText());
            int price = Integer.parseInt(txtPrice.getText());
            int money = 0;
            if(txtCurrency.getSelectedItem() == "ដុល្លារ 4000$"){
                money = (price * qty) * 4000; 
            }else if (txtCurrency.getSelectedItem() == "ដុល្លារ 4100$"){
                money = (price * qty) * 4100; 
            }else if (txtCurrency.getSelectedItem() == "ដុល្លារ 4200$"){
                money = (price * qty) * 4200; 
            }else if (txtCurrency.getSelectedItem() == "រៀល"){
                money = (price * qty) * 0;
            }else{
                money = price * qty;
            }
            
            txtTotal.setText(Double.toString(money));
        }
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        Connection con = null;
        DecimalFormat decimalFormat = new DecimalFormat("#0");
        String id = txtId.getText();
        String name = txtProductE.getSelectedItem().toString();
        String price = txtPrice.getText();
        String qty = txtQty.getText();
        String total = txtTotal.getText();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/manegment?autoReconnect=true&useSSL=false","root","");
            
            String sql = "UPDATE sales SET product_name = ?, qty = ?, price = ?, total = ? WHERE id_sale = ?";
            PreparedStatement statement = (PreparedStatement) con.prepareStatement(sql);
            statement.setString(5, id);
            statement.setString(1, name);
            statement.setString(2, qty);
            statement.setString(3, price);
            statement.setString(4, total);
            
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Success");
            } else {
                JOptionPane.showMessageDialog(this, "Error");
            }
            
            String qry = "SELECT * FROM sales WHERE DATE(sale_date) = DATE(NOW())";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(qry);
            
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row = new Object[6];
            model.setRowCount(0);
            
            while(rs.next()) {
                    row[0] = rs.getObject("id_sale"); 
                    row[1] = rs.getObject("product_name");
                    row[2] = rs.getObject("qty"); 
                    row[3] = decimalFormat.format(rs.getDouble("price"));
                    row[4] = decimalFormat.format(rs.getDouble("total")) + " ៛"; 
                    row[5] = rs.getObject("sale_date"); 

                    model.addRow(row);
            }
            
                  
            }catch(ClassNotFoundException ex){
                ex.getMessage();
            }catch (SQLException ex){
                ex.getMessage();
            }catch(Exception ex){
                ex.getMessage();
            }
            
            txtProductE.setSelectedItem("-");
            txtQty.setText("");
            txtPrice.setText("");
            txtTotal.setText("");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        Connection con = null;
        String id = txtId.getText();
        String name = txtProductE.getSelectedItem().toString();
        String price = txtPrice.getText();
        String qty = txtQty.getText();
        String total = txtTotal.getText();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/manegment?autoReconnect=true&useSSL=false","root","");
            
            String sql = "DELETE FROM sales WHERE id_sale = ?";
            PreparedStatement statement = (PreparedStatement) con.prepareStatement(sql);
            statement.setString(1, id);
            int affectedRows = statement.executeUpdate();

            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(this, "Deleted Successed");
            } else {
                JOptionPane.showMessageDialog(this, "Error");
            }
            
            
            String qry = "SELECT * FROM sales WHERE DATE(sale_date) = DATE(NOW())";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(qry);
            
            
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            Object[] row = new Object[6];
            
            while(rs.next()) {
                row[0] = rs.getObject("id_sale"); 
                row[1] = rs.getObject("product_name");
                row[2] = rs.getObject("qty"); 
                row[3] = rs.getObject("price"); 
                row[4] = rs.getObject("total"); 
                row[5] = rs.getObject("sale_date"); 

                model.addRow(row);
            }
            
            
            
                  
            }catch(ClassNotFoundException ex){
                ex.getMessage();
            }catch (SQLException ex){
                ex.getMessage();
            }catch(Exception ex){
                ex.getMessage();
            }
            
            txtProductE.setSelectedItem("-");
            txtQty.setText("");
            txtPrice.setText("");
            txtTotal.setText("");
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    
    
    public void Display(){
        Connection con = null;
    
                try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/manegment?autoReconnect=true&useSSL=false","root","");
            
            String qry = "SELECT * FROM sales";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(qry);
            
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row = new Object[6];
            
            while(rs.next()) {
                row[0] = rs.getObject("id_sale"); 
                row[1] = rs.getObject("product_name");
                row[2] = rs.getObject("qty"); 
                row[3] = rs.getObject("price"); 
                row[4] = rs.getObject("total"); 
                row[5] = rs.getObject("sale_date"); 

                model.addRow(row);
            }
            
            
            }catch(ClassNotFoundException ex){
                ex.getMessage();
            }catch (SQLException ex){
                ex.getMessage();
            }catch(Exception ex){
                ex.getMessage();
            }
    }
    public void display() {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/manegment?autoReconnect=true&useSSL=false", "root", "");

            String qry = "SELECT * FROM sales WHERE DATE(sale_date) = DATE(NOW())";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(qry);

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row = new Object[6];

            DecimalFormat decimalFormat = new DecimalFormat("#0");

            while (rs.next()) {
                row[0] = rs.getObject("id_sale");
                row[1] = rs.getObject("product_name");
                row[2] = rs.getObject("qty");
                row[3] = decimalFormat.format(rs.getDouble("price"));
                row[4] = decimalFormat.format(rs.getDouble("total")) + " ៛";
                row[5] = rs.getObject("sale_date");

                model.addRow(row);
            }

        } catch (ClassNotFoundException ex) {
            ex.getMessage();
        } catch (SQLException ex) {
            ex.getMessage();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
    public void ProductComboBox(){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/manegment?autoReconnect=true&useSSL=false","root","");
            
            String query = "SELECT * FROM product";
            PreparedStatement statement1 = (PreparedStatement) con.prepareStatement(query);
            ResultSet rs = statement1.executeQuery();
            while(rs.next()) {
                String productName = rs.getString("product_name");
                txtProduct.addItem(productName);
                txtProductE.addItem(productName);
            }
            
            
            }catch(ClassNotFoundException ex){
                ex.getMessage();
            }catch (SQLException ex){
                ex.getMessage();
            }catch(Exception ex){
                ex.getMessage();
            }
    }
    
    
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
            java.util.logging.Logger.getLogger(SaleAlter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaleAlter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaleAlter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaleAlter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaleAlter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_date;
    private javax.swing.JLabel label_date1;
    private javax.swing.JLabel label_product;
    private javax.swing.JTable table;
    private javax.swing.JComboBox<String> txtCurrency;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JComboBox<String> txtProduct;
    private javax.swing.JComboBox<String> txtProductE;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}