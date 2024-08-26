package asm;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainJframeAsm extends javax.swing.JFrame {

    List<Employee> listEmployees = new ArrayList<>();
    int viTri;

    private void clear() {
        txtMaNhanVien.setText("");
        txtHoVaTen.setText("");
        txtTuoi.setText("");
        txtEmail.setText("");
        txtLuong.setText("");
    }

    private void fillToTable() {
        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        model.setRowCount(0);
        for (Employee employee : listEmployees) {
            model.addRow(new Object[]{employee.getMaNhanVien(), employee.getHoVaTen(), employee.getTuoi(), employee.getEmail(), employee.getLuong()});
        }
    }

    private void intiData() {
        listEmployees.clear();
        listEmployees.add(new Employee("ma1", "a", 18, "a", 12));
        listEmployees.add(new Employee("ma2", "a", 18, "a", 12));
        listEmployees.add(new Employee("ma3", "a", 18, "a", 12));
        listEmployees.add(new Employee("ma4", "a", 18, "a", 12));
        listEmployees.add(new Employee("ma5", "a", 18, "a", 12));
        listEmployees.add(new Employee("ma6", "a", 18, "a", 12));
        
        
    }

    private void showdetail(int index) {

        txtMaNhanVien.setText(listEmployees.get(index).getMaNhanVien());
        txtHoVaTen.setText(listEmployees.get(index).getHoVaTen());
        txtTuoi.setText(Integer.toString(listEmployees.get(index).getTuoi()));
        txtEmail.setText(listEmployees.get(index).getEmail());
        txtLuong.setText(Integer.toString(listEmployees.get(index).getLuong()));

        tblEmployee.setRowSelectionInterval(viTri, viTri);

    }

    private void add() {
        Employee em = new Employee();
        if (txtMaNhanVien.getText().trim().equals("")
                || txtHoVaTen.getText().trim().equals("")
                || txtTuoi.getText().trim().equals("")
                || txtEmail.getText().trim().equals("")
                || txtLuong.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "không được để trống các trường");
            return;

        }
        for (int i = 0; i < listEmployees.size(); i++) {
            if (txtMaNhanVien.getText().equals(listEmployees.get(i).getMaNhanVien())) {
              
                JOptionPane.showMessageDialog(this, "trùng mã ");
                return;

            }

        }
        

        try {
            em.setTuoi(Integer.parseInt(txtTuoi.getText()));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "tuoi phai la một số");
            return;
        }

        if (Integer.parseInt(txtTuoi.getText()) < 16 || Integer.parseInt(txtTuoi.getText()) > 55) {
            JOptionPane.showMessageDialog(this, "tuổi phải lớn hơn 16 và nhở hơn 55");
            return;
        }

        try {
            em.setLuong(Integer.parseInt(txtLuong.getText()));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "lương phải là một số");
            return;
        }

        if (Integer.parseInt(txtLuong.getText()) < 5000000) {
            JOptionPane.showMessageDialog(this, "lương phải lớn hơn 5 triệu");
            return;
        }

        em.setMaNhanVien(txtMaNhanVien.getText());
        em.setHoVaTen(txtHoVaTen.getText());
        em.setEmail(txtEmail.getText());
        listEmployees.add(em);
        fillToTable();
        JOptionPane.showMessageDialog(this, "đã thêm thành công");

    }

    private void remove() {
        int index = tblEmployee.getSelectedRow();
        if (index > 0) {
            listEmployees.remove(index);
            fillToTable();
            JOptionPane.showMessageDialog(this, "đã xóa");
            clear();
        } else {
            JOptionPane.showMessageDialog(this, "vui long chon nv");
        }
    }

    private void update() {
        int index = tblEmployee.getSelectedRow();
        if (index > 0) {
            Employee em = listEmployees.get(index);
            if (txtMaNhanVien.getText().trim().equals("")
                    || txtHoVaTen.getText().trim().equals("")
                    || txtTuoi.getText().trim().equals("")
                    || txtEmail.getText().trim().equals("")
                    || txtLuong.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "không được để trống các trường");
                return;

            }

            try {
                em.setTuoi(Integer.parseInt(txtTuoi.getText()));

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "tuoi phai la một số");
                return;
            }

            if (Integer.parseInt(txtTuoi.getText()) < 16 || Integer.parseInt(txtTuoi.getText()) > 55) {
                JOptionPane.showMessageDialog(this, "tuổi phải lớn hơn 16 và nhở hơn 55");
                return;
            }

            try {
                em.setLuong(Integer.parseInt(txtLuong.getText()));

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "lương phải là một số");
                return;
            }

            if (Integer.parseInt(txtLuong.getText()) < 5000000) {
                JOptionPane.showMessageDialog(this, "lương phải lớn hơn 5 triệu");
                return;
            }

            em.setMaNhanVien(txtMaNhanVien.getText());
            em.setHoVaTen(txtHoVaTen.getText());
            em.setEmail(txtEmail.getText());
        }
        fillToTable();
        JOptionPane.showMessageDialog(this, "sửa thành công");
        clear();
    }

    private void findEmployee() {
        int index = -1;
        for (int i = 0; i < listEmployees.size(); i++) {
            if (txtMaNhanVien.getText().equals(listEmployees.get(i).getMaNhanVien())) {
                index = i;
                JOptionPane.showMessageDialog(this, "employee ở vị trí thứ" + (i + 1));
                break;

            }

        }
        if (index >= 0) {
            txtMaNhanVien.setText(listEmployees.get(index).getMaNhanVien());
            txtHoVaTen.setText(listEmployees.get(index).getHoVaTen());
            txtTuoi.setText(Integer.toString(listEmployees.get(index).getTuoi()));
            txtEmail.setText(listEmployees.get(index).getEmail());
            txtLuong.setText(Integer.toString(listEmployees.get(index).getLuong()));
        } else {
            JOptionPane.showMessageDialog(this, "không tìm thấy employee nào");
        }

    }

    private void left() {
        try {
            if (viTri > 0) {
                viTri--;
                showdetail(viTri);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gặp lỗi rồi bạn ơi!!!" + e);
        }

    }

    private void right() {
        try {
            if (viTri < listEmployees.size() - 1) {
                viTri++;
                showdetail(viTri);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gặp lỗi rồi bạn ơi!!!" + e);
        }
    }

    private void last() {
        try {
            viTri = listEmployees.size() - 1;
            showdetail(viTri);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gặp lỗi rồi bạn ơi!!!" + e);
        }

    }

    private void fist() {
        try {
            viTri = 0;
            showdetail(viTri);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gặp lỗi rồi bạn ơi!!!" + e);
        }
    }

    public MainJframeAsm() {
        initComponents();
      
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        txtHoVaTen = new javax.swing.JTextField();
        txtTuoi = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtLuong = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        jLabel2.setText("MÃ NHÂN VIÊN");

        jLabel3.setText("LƯƠNG");

        jLabel4.setText("HỌ VÀ TÊN");

        jLabel5.setText("TUỔI");

        jLabel6.setText("EMAIL");

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnOpen.setText("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEdit)
                    .addComponent(btnOpen)
                    .addComponent(btnFind)
                    .addComponent(btnDelete)
                    .addComponent(btnSave)
                    .addComponent(btnNew))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(23, 23, 23)
                .addComponent(btnFind)
                .addGap(18, 18, 18)
                .addComponent(btnOpen)
                .addGap(18, 18, 18)
                .addComponent(btnEdit)
                .addContainerGap())
        );

        jButton7.setText("|<");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("<<");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText(">>");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText(">|");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ", "HỌ VÀ TÊN", "TUỔI", "EMAIL", "LƯƠNG"
            }
        ));
        tblEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployee);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                    .addComponent(txtMaNhanVien)
                                    .addComponent(txtHoVaTen)
                                    .addComponent(txtTuoi)
                                    .addComponent(txtEmail)
                                    .addComponent(txtLuong))
                                .addGap(38, 38, 38)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnNewActionPerformed

    private void tblEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeeMouseClicked
        // TODO add your handling code here:

        try {
            int row = tblEmployee.getSelectedRow();
            if (row >= 0) {
                viTri = row;
                showdetail(viTri);
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_tblEmployeeMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        add();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        findEmployee();
    }//GEN-LAST:event_btnFindActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        left();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        fist();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        last();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        right();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        remove();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        // TODO add your handling code here:
     
        intiData();
        fillToTable();
        if (listEmployees.isEmpty()) {
            clear();
        }
    }//GEN-LAST:event_btnOpenActionPerformed

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJframeAsm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJframeAsm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJframeAsm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJframeAsm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJframeAsm().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoVaTen;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables
}
