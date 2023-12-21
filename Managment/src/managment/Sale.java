/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package managment;

import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author TUF
 */
public class Sale extends javax.swing.JFrame {

    /**
     * Creates new form Sale
     */
    public Sale() {
        initComponents();
        display();
        ProductComboBox();
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("Khmer OS Freehand", Font.BOLD, 16));
        

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnCal = new javax.swing.JButton();
        txtProduct = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();
        txtMoneyType = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnDollar = new javax.swing.JButton();
        btnPrint1 = new javax.swing.JButton();
        btnPrint2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtProduct1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N

        table.setAutoCreateRowSorter(true);
        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        table.setForeground(new java.awt.Color(102, 102, 102));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " ប្រភេទ", "ផលិតផល", "ចំនួន", "តម្លៃ", "តម្លៃសរុប", "ថ្ងៃលក់"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(102, 102, 102));
        table.setIntercellSpacing(new java.awt.Dimension(5, 5));
        table.setRowHeight(40);
        table.setSelectionBackground(new java.awt.Color(136, 104, 68));
        table.setSelectionForeground(new java.awt.Color(255, 255, 255));
        table.setShowGrid(true);
        table.getTableHeader().setResizingAllowed(false);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(1).setPreferredWidth(100);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(2).setPreferredWidth(30);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
            table.getColumnModel().getColumn(5).setResizable(false);
        }

        btnCal.setBackground(new java.awt.Color(255, 255, 204));
        btnCal.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        btnCal.setForeground(new java.awt.Color(102, 102, 102));
        btnCal.setText("គណនា");
        btnCal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalActionPerformed(evt);
            }
        });

        txtProduct.setBackground(new java.awt.Color(255, 255, 255));
        txtProduct.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        txtProduct.setForeground(new java.awt.Color(102, 102, 102));
        txtProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        txtProduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("រូបិយប័ណ្ណ");

        jLabel3.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("ផលិតផល");

        txtQty.setBackground(new java.awt.Color(255, 255, 255));
        txtQty.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        txtQty.setForeground(new java.awt.Color(102, 102, 102));
        txtQty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("ចំនួន");

        txtPrice.setBackground(new java.awt.Color(255, 255, 255));
        txtPrice.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(102, 102, 102));
        txtPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal.setFont(new java.awt.Font("Khmer OS Freehand", 1, 18)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(102, 102, 102));
        txtTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel5.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("តម្លៃសរុប");

        btnPrint.setBackground(new java.awt.Color(0, 153, 255));
        btnPrint.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setText("បញ្ជូន");
        btnPrint.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        txtMoneyType.setBackground(new java.awt.Color(255, 255, 255));
        txtMoneyType.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        txtMoneyType.setForeground(new java.awt.Color(102, 102, 102));
        txtMoneyType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "ដុល្លារ 4000$", "ដុល្លារ 4100$", "ដុល្លារ 4200$" }));
        txtMoneyType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtMoneyType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMoneyTypeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("តម្លៃ");

        btnDollar.setBackground(new java.awt.Color(153, 255, 102));
        btnDollar.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        btnDollar.setForeground(new java.awt.Color(51, 51, 51));
        btnDollar.setText("មើលជា ដុល្លារ");
        btnDollar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnDollar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDollarActionPerformed(evt);
            }
        });

        btnPrint1.setBackground(new java.awt.Color(255, 51, 51));
        btnPrint1.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        btnPrint1.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint1.setText("លុប");
        btnPrint1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnPrint1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrint1ActionPerformed(evt);
            }
        });

        btnPrint2.setBackground(new java.awt.Color(255, 255, 102));
        btnPrint2.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        btnPrint2.setForeground(new java.awt.Color(51, 51, 51));
        btnPrint2.setText("Print");
        btnPrint2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnPrint2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrint2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText(" ប្រភេទ");

        txtProduct1.setBackground(new java.awt.Color(255, 255, 255));
        txtProduct1.setFont(new java.awt.Font("Khmer OS Freehand", 1, 16)); // NOI18N
        txtProduct1.setForeground(new java.awt.Color(102, 102, 102));
        txtProduct1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        txtProduct1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtProduct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProduct1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtQty))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMoneyType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrice))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDollar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTotal)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnCal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProduct1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtProduct, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMoneyType, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(btnCal, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDollar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnPrint1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrint2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtProductActionPerformed

    private void txtMoneyTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMoneyTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMoneyTypeActionPerformed

    
    
    
    
    
    
    
    
    
    
    //Code Below
    
    private void btnCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalActionPerformed
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
            if(txtMoneyType.getSelectedItem() == "ដុល្លារ 4000$"){
                money = (price * qty) * 4000; 
            }else if (txtMoneyType.getSelectedItem() == "ដុល្លារ 4100$"){
                money = (price * qty) * 4100; 
            }else if (txtMoneyType.getSelectedItem() == "ដុល្លារ 4200$"){
                money = (price * qty) * 4200; 
            }else if (txtMoneyType.getSelectedItem() == "រៀល"){
                money = (price * qty) * 0;
            }else{
                money = price * qty;
            }
            
            String total = Integer.toString(money);
            txtTotal.setText(total +" ៛");
        }
    }//GEN-LAST:event_btnCalActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        if(txtTotal.getText().equals(""))
        {
            Error2 er = new Error2();
            er.setVisible(true);
        }else{
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/manegment?autoReconnect=true&useSSL=false","root","");
            
            
            String pname = txtProduct.getSelectedItem().toString();
            int qty = Integer.parseInt(txtQty.getText());
            int price = Integer.parseInt(txtPrice.getText());
            int money = 0;
            if(txtMoneyType.getSelectedItem() == "ដុល្លារ 4000$"){
                money = (price * qty) * 4000; 
            }else if(txtMoneyType.getSelectedItem() == "ដុល្លារ 4100$"){
                money = (price * qty) * 4100; 
            }else if(txtMoneyType.getSelectedItem() == "ដុល្លារ 4200$"){
                money = (price * qty) * 4200; 
            }else if(txtMoneyType.getSelectedItem() == "រៀល"){
                money = (price * qty) * 0;
            }else{
                money = price * qty;
            }
            
            
            
            
            
            String sql = "INSERT INTO sales (product_name, qty, price, total, sale_date) VALUES (?, ?, ?, ?, now())";
            // Create a PreparedStatement object
            PreparedStatement statement = (PreparedStatement) con.prepareStatement(sql);

            // Set the values for the parameters
            statement.setString(1, pname);
            statement.setInt(2, qty);
            statement.setInt(3, price);
            statement.setInt(4, money);
            

            // Execute the insert statement
            statement.executeUpdate();
            
            
            
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            Object[] row = new Object[6];
            
            String query = "SELECT * FROM sales WHERE DATE(sale_date) = DATE(NOW()) AND CONCAT(DATE_FORMAT(sale_date, '%H:%i'), ':00') <= TIME_FORMAT(NOW(), '%H:%i:%s');";
            PreparedStatement statement1 = (PreparedStatement) con.prepareStatement(query);
            ResultSet rs = statement1.executeQuery();
            
            DecimalFormat decimalFormat = new DecimalFormat("#0");
            while(rs.next()) {
                row[0] = rs.getObject("id_sale"); 
                row[1] = rs.getObject("product_name");
                row[2] = rs.getObject("qty"); 
                row[3] = decimalFormat.format(rs.getDouble("price")) + " ៛";
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
        
            txtQty.setText("");
            txtPrice.setText("");
            txtTotal.setText("");
            btnDollar.setText("មើលជា ដុល្លារ");
            txtMoneyType.setSelectedItem("-");
      }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnDollarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDollarActionPerformed
        // TODO add your handling code here:
        if(txtMoneyType.getSelectedItem().equals("-")){
            Error3 er = new Error3();
            er.setVisible(true);
        }else{
            String t = txtTotal.getText();
            // Remove non-numeric characters from the input string
            String cleanedTotal = t.replaceAll("[^\\d.]", "");
            Double total = Double.parseDouble(cleanedTotal);
            double money = 0;

            if (txtMoneyType.getSelectedItem() == "ដុល្លារ 4000$") {
                money = total / 4000;
            } else if (txtMoneyType.getSelectedItem() == "ដុល្លារ 4100$") {
                money = total / 4100;
            } else if (txtMoneyType.getSelectedItem() == "ដុល្លារ 4200$") {
                money = total / 4200;
            } else {
                // Handle the case when no money type is selected
            }

            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            String finalTotal = decimalFormat.format(money);
            btnDollar.setText("$ " + finalTotal);
            txtMoneyType.setSelectedItem("-");
        }
    }//GEN-LAST:event_btnDollarActionPerformed

    private void btnPrint1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrint1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrint1ActionPerformed

    private void btnPrint2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrint2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrint2ActionPerformed

    private void txtProduct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProduct1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProduct1ActionPerformed
    
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
                row[3] = decimalFormat.format(rs.getDouble("price")) + " ៛";
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
            }
            
            
            }catch(ClassNotFoundException ex){
                ex.getMessage();
            }catch (SQLException ex){
                ex.getMessage();
            }catch(Exception ex){
                ex.getMessage();
            }
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
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCal;
    private javax.swing.JButton btnDollar;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnPrint1;
    private javax.swing.JButton btnPrint2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Panel panel1;
    private javax.swing.JTable table;
    private javax.swing.JComboBox<String> txtMoneyType;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JComboBox<String> txtProduct;
    private javax.swing.JComboBox<String> txtProduct1;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
