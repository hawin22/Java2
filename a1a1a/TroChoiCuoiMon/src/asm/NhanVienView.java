/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package asm;

import clock.ClockThread;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class NhanVienView extends javax.swing.JFrame {

    /**
     * Creates new form ThongTinNhanVienView
     */
//    ArrayList<NhanVien> list = new ArrayList<>();
    DefaultTableModel dTM;
    QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
    private int i = -1;
    ArrayList<NhanVien> list = quanLyNhanVien.getListNhanVien();
    private String fileName = "asm.txt";

    public NhanVienView() {
        initComponents();
        setLocationRelativeTo(null);

    }

    void loadData(ArrayList<NhanVien> list) {
        dTM = (DefaultTableModel) tblNhanVien.getModel();
        dTM.setRowCount(0);
        for (NhanVien nhanVien : list) {
            dTM.addRow(new Object[]{
                nhanVien.getMaNhanVien(),
                nhanVien.getHoVaTen(),
                nhanVien.getTuoi(),
                nhanVien.getEmail(),
                nhanVien.getLuong()
            });
        }
    }

    public void clearForm() {
        txtHoTen.setText("");
        txtEmail.setText("");
        txtLuong.setText("");
        txtMaNhanVien.setText("");
        txtTuoi.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPasswordField1 = new javax.swing.JPasswordField();
        lblMaNhanVien = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        lblTuoi = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        lblQuanLyNhanVien = new javax.swing.JLabel();
        txtTuoi = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblLuong = new javax.swing.JLabel();
        txtLuong = new javax.swing.JTextField();
        btnDau = new javax.swing.JButton();
        btnCuoi = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblTime = new javax.swing.JLabel();
        lblRecord = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblMaNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMaNhanVien.setText("Mã nhân viên");
        lblMaNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblHoTen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHoTen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoTen.setText("Họ và tên");
        lblHoTen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTuoi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTuoi.setText("Tuổi");
        lblTuoi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail.setText("Email");
        lblEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblQuanLyNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQuanLyNhanVien.setText("Quản lý nhân viên");

        lblLuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLuong.setText("Lương");
        lblLuong.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnDau.setText("|<");
        btnDau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDauMouseClicked(evt);
            }
        });

        btnCuoi.setText(">|");
        btnCuoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCuoiMouseClicked(evt);
            }
        });

        btnPrev.setText("<<");
        btnPrev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrevMouseClicked(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNextMouseClicked(evt);
            }
        });

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã", "Họ tên", "Tuổi", "Email", "Lương"
            }
        ));
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblNhanVien);

        btnNew.setText("New");
        btnNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewMouseClicked(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFind.setText("Find");
        btnFind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFindMouseClicked(evt);
            }
        });

        btnOpen.setText("Open");
        btnOpen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOpenMouseClicked(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete)
                    .addComponent(btnOpen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnNew)
                .addGap(12, 12, 12)
                .addComponent(btnSave)
                .addGap(12, 12, 12)
                .addComponent(btnDelete)
                .addGap(12, 12, 12)
                .addComponent(btnFind)
                .addGap(12, 12, 12)
                .addComponent(btnOpen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        lblTime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 0, 51));
        lblTime.setText("00:00 AM");

        lblRecord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRecord.setForeground(new java.awt.Color(255, 0, 0));
        lblRecord.setText("Record:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDau, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblMaNhanVien)
                                .addComponent(lblHoTen)
                                .addComponent(lblTuoi)
                                .addComponent(lblEmail)
                                .addComponent(lblLuong)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblQuanLyNhanVien))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblTime)
                                        .addGap(16, 16, 16))))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDau)
                        .addComponent(btnPrev))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblQuanLyNhanVien)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTime)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMaNhanVien))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHoTen))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTuoi))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmail))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLuong)))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCuoi)
                            .addComponent(btnNext)
                            .addComponent(lblRecord))))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseClicked
        // TODO add your handling code here:
        clearForm();
        loadData(list);
    }//GEN-LAST:event_btnNewMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        // TODO add your handling code here:
        int i = tblNhanVien.getSelectedRow();
        String maNV = txtMaNhanVien.getText();
        String tenNV = txtHoTen.getText();
        String tuoi = txtTuoi.getText();
        String email = txtEmail.getText();
        String luong = txtLuong.getText();
        Integer tuoiNV = Integer.parseInt(tuoi);
        double luongNV;
        if (!luong.isEmpty()) {
            luongNV = Double.parseDouble(luong);
        } else {
            luongNV = 0;
        }

        Boolean checkmail = quanLyNhanVien.checkEmail(email);

        if (maNV.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Xin nhập mã");
        } else if (tuoiNV < 16 || tuoiNV > 55) {
            JOptionPane.showMessageDialog(this, "Tuổi ko phù hợp");
        } else if (luongNV < 5000000) {
            JOptionPane.showMessageDialog(this, "lương ko đúng");
        } else if (!checkmail) {
            JOptionPane.showMessageDialog(this, "Sai định dạng email!");
        } else {

            NhanVien nhanVien = new NhanVien(maNV, tenNV, tuoi, email, luongNV);

            // Kiểm tra mã trùng
            Boolean check = quanLyNhanVien.checkma(nhanVien);
            if (check) {
                // Tìm kiếm nhân viên trong danh sách
                int index = -1;
                for (int j = 0; j < quanLyNhanVien.getListNhanVien().size(); j++) {
                    NhanVien existingNhanVien = quanLyNhanVien.getListNhanVien().get(j);
                    if (existingNhanVien.getMaNhanVien().equals(maNV)) {
                        index = j;
                        break;
                    }
                }

                // Kiểm tra các thuộc tính khác có thay đổi hay không
                if (index != -1) {
                    NhanVien existingNhanVien = quanLyNhanVien.getListNhanVien().get(index);

                    if (!nhanVien.equals(existingNhanVien)) {
                        // Có ít nhất một thuộc tính khác thay đổi, cho phép cập nhật
                        Boolean checkCapNhat = quanLyNhanVien.capNhatSave(index, nhanVien);
                        if (checkCapNhat) {
                            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
                            loadData(quanLyNhanVien.getListNhanVien());

                        } else {
                            JOptionPane.showMessageDialog(this, "Mã trùng, không thực hiện cập nhật.");

                        }
                    }
                }
            } else {
                // Mã không trùng, thêm nhân viên mới vào danh sách
                Boolean checkAdd = quanLyNhanVien.addNhanVien(nhanVien);
                if (checkAdd) {
                    JOptionPane.showMessageDialog(this, "Thêm nhân viên mới thành công");
                    loadData(quanLyNhanVien.getListNhanVien());

                }

            }
        }

        lblRecord.setText("Record: " + 1 + "/" + quanLyNhanVien.getListNhanVien().size());

    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // TODO add your handling code here:
        String maNV = txtMaNhanVien.getText();
        if (maNV.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Xin nhập mã nhân viên");

        } else {
            ArrayList<NhanVien> sauKhiXoa = quanLyNhanVien.delete(maNV);
            if (sauKhiXoa.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không có người này trong danh sách");

            } else {
                JOptionPane.showMessageDialog(this, "Xoá thành công");
                loadData(sauKhiXoa);

            }
        }

    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnFindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFindMouseClicked
        // TODO add your handling code here:
        String maCanTim = txtMaNhanVien.getText();
        ArrayList<NhanVien> result = quanLyNhanVien.search(maCanTim);
        if (maCanTim.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Xin nhập mã");
        } else if (result.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không thấy nhân viên");

        } else {
            loadData(result);
            String maNV = (String) tblNhanVien.getValueAt(0, 0);
            txtMaNhanVien.setText(maNV);
            String hoTen = (String) tblNhanVien.getValueAt(0, 1);
            txtHoTen.setText(hoTen);
            String tuoi = (String) tblNhanVien.getValueAt(0, 2);
            txtTuoi.setText(tuoi);
            String email = (String) tblNhanVien.getValueAt(0, 3);
            txtEmail.setText(email);
            Double luong = (Double) tblNhanVien.getValueAt(0, 4);
            String luongNV = String.valueOf(luong);
            txtLuong.setText(luongNV);

        }
    }//GEN-LAST:event_btnFindMouseClicked

    private void btnOpenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpenMouseClicked
        list.clear();
        JOptionPane.showMessageDialog(this, quanLyNhanVien.docFile(fileName));
        loadData(list);
        String maNV = (String) tblNhanVien.getValueAt(0, 0);
        txtMaNhanVien.setText(maNV);
        String hoTen = (String) tblNhanVien.getValueAt(0, 1);
        txtHoTen.setText(hoTen);
        String tuoi = (String) tblNhanVien.getValueAt(0, 2);
        txtTuoi.setText(tuoi);
        String email = (String) tblNhanVien.getValueAt(0, 3);
        txtEmail.setText(email);
        Double luong = (Double) tblNhanVien.getValueAt(0, 4);
        String luongNV = String.valueOf(luong);
        txtLuong.setText(luongNV);
    }//GEN-LAST:event_btnOpenMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        JOptionPane.showMessageDialog(this, quanLyNhanVien.ghiFile(fileName));
        System.exit(0);

    }//GEN-LAST:event_btnExitMouseClicked

    private void btnDauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDauMouseClicked
        // TODO add your handling code here:

        if (list.size() != 0) {

            tblNhanVien.setRowSelectionInterval(0, 0);
            txtMaNhanVien.setText(list.get(0).getMaNhanVien());
            txtHoTen.setText(list.get(0).getHoVaTen());
            txtEmail.setText(list.get(0).getEmail());
            txtTuoi.setText(String.valueOf(list.get(0).getTuoi()));
            txtLuong.setText(String.valueOf(list.get(0).getLuong()));
            lblRecord.setText("Record: " + 1 + "/" + quanLyNhanVien.getListNhanVien().size());
        }
    }//GEN-LAST:event_btnDauMouseClicked

    private void btnPrevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseClicked
        // TODO add your handling code here:
        int i = tblNhanVien.getSelectedRow();
        if (i > 0) {
            i--;
            tblNhanVien.setRowSelectionInterval(i, i);

            txtMaNhanVien.setText(list.get(i).getMaNhanVien());
            txtHoTen.setText(list.get(i).getHoVaTen());
            txtEmail.setText(list.get(i).getEmail());
            txtTuoi.setText(String.valueOf(list.get(i).getTuoi()));
            txtLuong.setText(String.valueOf(list.get(i).getLuong()));
            lblRecord.setText("Record: " + (i + 1) + "/" + quanLyNhanVien.getListNhanVien().size());
        }

    }//GEN-LAST:event_btnPrevMouseClicked

    private void btnNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseClicked
        // TODO add your handling code here:
        int i = tblNhanVien.getSelectedRow();
        if (i < tblNhanVien.getRowCount() - 1) {
            i++;
            tblNhanVien.setRowSelectionInterval(i, i);

            txtMaNhanVien.setText(list.get(i).getMaNhanVien());
            txtHoTen.setText(list.get(i).getHoVaTen());
            txtEmail.setText(list.get(i).getEmail());
            txtTuoi.setText(String.valueOf(list.get(i).getTuoi()));
            txtLuong.setText(String.valueOf(list.get(i).getLuong()));
            lblRecord.setText("Record: " + (i + 1) + "/" + quanLyNhanVien.getListNhanVien().size());
        }

    }//GEN-LAST:event_btnNextMouseClicked

    private void btnCuoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCuoiMouseClicked
        // TODO add your handling code here:
        int i = tblNhanVien.getRowCount() - 1;
        txtMaNhanVien.setText(list.get(i).getMaNhanVien());
        txtHoTen.setText(list.get(i).getHoVaTen());
        txtEmail.setText(list.get(i).getEmail());
        txtTuoi.setText(String.valueOf(list.get(i).getTuoi()));
        txtLuong.setText(String.valueOf(list.get(i).getLuong()));
        lblRecord.setText("Record: " + (i + 1) + "/" + quanLyNhanVien.getListNhanVien().size());
    }//GEN-LAST:event_btnCuoiMouseClicked

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        // TODO add your handling code here:
        int i = tblNhanVien.getSelectedRow();
        txtMaNhanVien.setText(list.get(i).getMaNhanVien());
        txtHoTen.setText(list.get(i).getHoVaTen());
        txtEmail.setText(list.get(i).getEmail());
        txtTuoi.setText(String.valueOf(list.get(i).getTuoi()));
        txtLuong.setText(String.valueOf(list.get(i).getLuong()));
        lblRecord.setText("Record: " + (i + 1) + "/" + quanLyNhanVien.getListNhanVien().size());
    }//GEN-LAST:event_tblNhanVienMouseClicked


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ClockThread clockThread = new ClockThread(lblTime);
        Thread t1 = new Thread(clockThread);
        t1.start();

    }//GEN-LAST:event_formWindowOpened

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(NhanVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhanVienView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCuoi;
    private javax.swing.JButton btnDau;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblLuong;
    private javax.swing.JLabel lblMaNhanVien;
    private javax.swing.JLabel lblQuanLyNhanVien;
    private javax.swing.JLabel lblRecord;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTuoi;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables
}
