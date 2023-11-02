/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.Seller;

import view.Seller.MaganeClient;
import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.jdbc.PreparedStatementWrapper;
import com.mysql.cj.protocol.Resultset;
import com.sun.jdi.connect.spi.Connection;
import static dao.DAO.connection;
import dao.FieldDAO;
import java.beans.Statement;
import java.sql.DriverManager;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Field;
import service.FieldService;

/**
 *
 * @author Admin
 */
public class ManageField extends javax.swing.JFrame {

    /**
     * Creates new form SellerHomeFrm
     */
    private FieldService fieldService;
    DefaultTableModel tableModel;
    public ManageField() {
        initComponents();
        DisplayField();
    }
    private void DisplayField() {
        setResizable(false);
        fieldService  = new FieldService();
        tableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
           
        };
        tableModel.setRowCount(0);
        tableModel.setColumnIdentifiers(new Object[] {
            "ID", "Tên Sân", "Loại Sân", "Giá Thuê", "Trạng Thái"
        });
        FiledTable.setModel(tableModel);
        List<Field> listField = fieldService.getAllFields();
        for(Field field : listField) {
            tableModel.addRow(new Object[]{
                field.getId(), field.getName(), field.getType(), field.getPrice(), field.getDes()
            });
        }
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        idField = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        deletel = new javax.swing.JButton();
        nameTb = new javax.swing.JTextField();
        idTb = new javax.swing.JTextField();
        typeTb = new javax.swing.JTextField();
        PriceTb = new javax.swing.JTextField();
        statusCb = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        FiledTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Quản lý sân bóng");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Danh sách sân bóng");

        idField.setText("ID");

        type.setText("Loại sân");

        jLabel12.setText("Tên sân");

        status.setText("Trạng thái");

        price.setText("Giá thuê");

        save.setBackground(new java.awt.Color(0, 255, 204));
        save.setText("Lưu");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(0, 255, 204));
        edit.setText("Sửa");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(0, 255, 204));
        reset.setText("Reset");
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        deletel.setBackground(new java.awt.Color(0, 255, 204));
        deletel.setText("Xoá");
        deletel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletelActionPerformed(evt);
            }
        });

        statusCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sân đã được thuê", "Sân chưa được thuê" }));
        statusCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusCbActionPerformed(evt);
            }
        });

        FiledTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FiledTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên sân", "Loại sân", "Giá thuê", "Trạng thái"
            }
        ));
        FiledTable.setRowHeight(25);
        FiledTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FiledTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(FiledTable);

        jButton1.setBackground(new java.awt.Color(0, 255, 204));
        jButton1.setText("Back");
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
                .addGap(314, 314, 314)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(save)
                        .addGap(50, 50, 50)
                        .addComponent(edit)
                        .addGap(50, 50, 50)
                        .addComponent(reset))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idTb, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(idField)))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(nameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(type)
                            .addComponent(typeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(price)
                            .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(status)
                    .addComponent(statusCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletel))
                .addContainerGap(168, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(32, 32, 32))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(status)
                                .addGap(5, 5, 5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(type)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(typeTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idField)
                            .addComponent(jLabel12))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(price)
                        .addGap(5, 5, 5)
                        .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit)
                    .addComponent(save)
                    .addComponent(reset)
                    .addComponent(deletel))
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        Field field = new Field();
        field.setName(nameTb.getText());
        field.setId(Integer.parseInt(idTb.getText()));
        field.setType(typeTb.getText());
        field.setPrice(Float.parseFloat(PriceTb.getText()));
        field.setDes(statusCb.getSelectedItem().toString());
  
        FieldDAO fd = new FieldDAO();
        if(nameTb.getText().isEmpty() || idTb.getText().isEmpty() || typeTb.getText().isEmpty() || PriceTb.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chọn sân để sửa!");
        }
        
        else if(fd.EditField(field)) {
            JOptionPane.showMessageDialog(this, "Sân đã được sửa thông tin");
            this.setVisible(false);
            new ManageField().setVisible(true);
            //sthis.setVisible(false);
            Reset();
        }
        else{
            JOptionPane.showMessageDialog(this, "False");
        }
    }//GEN-LAST:event_editActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        Field field = new Field();
        field.setName(nameTb.getText());
        field.setId(Integer.parseInt(idTb.getText()));
        field.setType(typeTb.getText());
        field.setPrice(Float.parseFloat(PriceTb.getText()));
        field.setDes(statusCb.getSelectedItem().toString());
        
        FieldDAO fd = new FieldDAO();
        if(nameTb.getText().isEmpty() || idTb.getText().isEmpty() || typeTb.getText().isEmpty() || PriceTb.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống dữ liệu!");
        }
        
        else if(fd.saveField(field)) {
            JOptionPane.showMessageDialog(this, "Sân đã được lưu vào CSDL!");
            this.setVisible(false);
            new ManageField().setVisible(true);
            //this.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(this, "False");
        }

    }//GEN-LAST:event_saveActionPerformed

    private void statusCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusCbActionPerformed

    private void deletelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletelActionPerformed
        // TODO add your handling code here:
        Field field = new Field();
        field.setId(Integer.parseInt(idTb.getText()));
  
        FieldDAO fd = new FieldDAO();
        if(idTb.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chọn sân để xoá!");
        }
        
        else if(fd.DeleteField(field)) {
            JOptionPane.showMessageDialog(this, "Sân đã xoá khỏi CSDL!");
            this.setVisible(false);
            new ManageField().setVisible(true);
            //sthis.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(this, "False");
        }
    }//GEN-LAST:event_deletelActionPerformed

    private void FiledTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FiledTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)FiledTable.getModel();
        int MyIndex = FiledTable.getSelectedRow();
        idTb.setText(model.getValueAt(MyIndex, 0).toString());
        nameTb.setText(model.getValueAt(MyIndex, 1).toString());
        typeTb.setText(model.getValueAt(MyIndex, 2).toString());
        PriceTb.setText(model.getValueAt(MyIndex, 3).toString());
        statusCb.setSelectedItem(model.getValueAt(MyIndex, 4).toString());
    }//GEN-LAST:event_FiledTableMouseClicked

    private void Reset() {
        idTb.setText("");
        nameTb.setText("");
        typeTb.setText("");
        PriceTb.setText("");
        statusCb.setSelectedIndex(0);
    }
    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        // TODO add your handling code here:
        Reset();
    }//GEN-LAST:event_resetMouseClicked

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new SellerHomeFrm().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ManageField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ManageField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ManageField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ManageField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ManageField().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FiledTable;
    private javax.swing.JTextField PriceTb;
    private javax.swing.JButton deletel;
    private javax.swing.JButton edit;
    private javax.swing.JLabel idField;
    private javax.swing.JTextField idTb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTb;
    private javax.swing.JLabel price;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    private javax.swing.JLabel status;
    private javax.swing.JComboBox<String> statusCb;
    private javax.swing.JLabel type;
    private javax.swing.JTextField typeTb;
    // End of variables declaration//GEN-END:variables
}
