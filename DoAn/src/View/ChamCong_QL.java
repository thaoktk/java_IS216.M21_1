/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import BUS.ChamCongBUS;
import BUS.NhanVienBUS;
import Connection.ConnectionUtils;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class ChamCong_QL extends javax.swing.JFrame {

    /**
     * Creates new form ChamCong_QL
     */
    String user;
    boolean checkButtonCheckInOn, checkButtonCheckOutOn;
    public ChamCong_QL(String a)throws HeadlessException {
        initComponents();
        setLocationRelativeTo(null);
        this.user = a;
        checkButton();
        setOnOffButton();
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
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        QLNVBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        QLSPBtn = new javax.swing.JButton();
        QLKHBtn = new javax.swing.JButton();
        QLDTBtn = new javax.swing.JButton();
        QLKMBtn = new javax.swing.JButton();
        QLNHBtn = new javax.swing.JButton();
        QLHDBtn = new javax.swing.JButton();
        QLDSBtn = new javax.swing.JButton();
        ChamCongBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        checkOut = new javax.swing.JButton();
        checkIn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TraCuu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chấm công của quản lý");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(231, 238, 237));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/tag/logo nhỏ.png"))); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(85, 122, 100));
        jSeparator1.setForeground(new java.awt.Color(85, 122, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/tag/Quản lý.png"))); // NOI18N

        QLNVBtn.setBackground(new java.awt.Color(231, 238, 237));
        QLNVBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QLNVBtn.setForeground(new java.awt.Color(196, 100, 96));
        QLNVBtn.setText("Nhân viên");
        QLNVBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        QLNVBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLNVBtn.setFocusPainted(false);
        QLNVBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLNVBtnActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(231, 238, 237));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(196, 100, 96));
        jButton2.setText("Chung");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setRequestFocusEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        QLSPBtn.setBackground(new java.awt.Color(231, 238, 237));
        QLSPBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QLSPBtn.setForeground(new java.awt.Color(196, 100, 96));
        QLSPBtn.setText("Sản phẩm");
        QLSPBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        QLSPBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLSPBtn.setFocusPainted(false);
        QLSPBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLSPBtnActionPerformed(evt);
            }
        });

        QLKHBtn.setBackground(new java.awt.Color(231, 238, 237));
        QLKHBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QLKHBtn.setForeground(new java.awt.Color(196, 100, 96));
        QLKHBtn.setText("Khách hàng");
        QLKHBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        QLKHBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLKHBtn.setFocusPainted(false);
        QLKHBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLKHBtnActionPerformed(evt);
            }
        });

        QLDTBtn.setBackground(new java.awt.Color(231, 238, 237));
        QLDTBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QLDTBtn.setForeground(new java.awt.Color(196, 100, 96));
        QLDTBtn.setText("Đối tác");
        QLDTBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        QLDTBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLDTBtn.setFocusPainted(false);
        QLDTBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLDTBtnActionPerformed(evt);
            }
        });

        QLKMBtn.setBackground(new java.awt.Color(231, 238, 237));
        QLKMBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QLKMBtn.setForeground(new java.awt.Color(196, 100, 96));
        QLKMBtn.setText("Khuyến mãi");
        QLKMBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        QLKMBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLKMBtn.setFocusPainted(false);
        QLKMBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLKMBtnActionPerformed(evt);
            }
        });

        QLNHBtn.setBackground(new java.awt.Color(231, 238, 237));
        QLNHBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QLNHBtn.setForeground(new java.awt.Color(196, 100, 96));
        QLNHBtn.setText("Nhập hàng");
        QLNHBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        QLNHBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLNHBtn.setFocusPainted(false);
        QLNHBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLNHBtnActionPerformed(evt);
            }
        });

        QLHDBtn.setBackground(new java.awt.Color(231, 238, 237));
        QLHDBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QLHDBtn.setForeground(new java.awt.Color(196, 100, 96));
        QLHDBtn.setText("Hóa đơn");
        QLHDBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        QLHDBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLHDBtn.setFocusPainted(false);
        QLHDBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLHDBtnActionPerformed(evt);
            }
        });

        QLDSBtn.setBackground(new java.awt.Color(231, 238, 237));
        QLDSBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QLDSBtn.setForeground(new java.awt.Color(196, 100, 96));
        QLDSBtn.setText("Doanh thu");
        QLDSBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        QLDSBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLDSBtn.setFocusPainted(false);
        QLDSBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLDSBtnActionPerformed(evt);
            }
        });

        ChamCongBtn.setBackground(new java.awt.Color(196, 100, 96));
        ChamCongBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ChamCongBtn.setForeground(new java.awt.Color(255, 255, 255));
        ChamCongBtn.setText("Chấm công");
        ChamCongBtn.setBorder(null);
        ChamCongBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ChamCongBtn.setFocusPainted(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(QLNVBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(QLSPBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(QLKHBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(QLDTBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(QLKMBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(QLNHBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(QLHDBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(QLDSBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChamCongBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ChamCongBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QLNVBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QLSPBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QLKHBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(QLDTBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QLKMBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(QLNHBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QLHDBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(QLDSBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 690));

        jPanel2.setBackground(new java.awt.Color(249, 255, 254));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/tag/Chấm công.png"))); // NOI18N

        checkOut.setBackground(new java.awt.Color(231, 238, 237));
        checkOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkOut.setForeground(new java.awt.Color(196, 100, 96));
        checkOut.setText("Check Out");
        checkOut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        checkOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkOut.setEnabled(false);
        checkOut.setFocusPainted(false);
        checkOut.setRequestFocusEnabled(false);
        checkOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutActionPerformed(evt);
            }
        });

        checkIn.setBackground(new java.awt.Color(231, 238, 237));
        checkIn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkIn.setForeground(new java.awt.Color(196, 100, 96));
        checkIn.setText("Check In");
        checkIn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        checkIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkIn.setFocusPainted(false);
        checkIn.setRequestFocusEnabled(false);
        checkIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/tag/Đăng xuất.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        TraCuu.setBackground(new java.awt.Color(196, 100, 96));
        TraCuu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TraCuu.setForeground(new java.awt.Color(255, 255, 255));
        TraCuu.setText("Tổng quan");
        TraCuu.setBorder(null);
        TraCuu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TraCuu.setFocusPainted(false);
        TraCuu.setRequestFocusEnabled(false);
        TraCuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TraCuuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(324, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkOut, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(285, 285, 285))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(324, Short.MAX_VALUE)
                    .addComponent(checkIn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(285, 285, 285)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(260, 260, 260)
                .addComponent(checkOut, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(TraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(250, 250, 250)
                    .addComponent(checkIn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(394, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 760, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int checkChucVu() {
        NhanVienBUS bus = new NhanVienBUS();
        String chucVu = bus.getChucVu(user);
        if (chucVu.equals("Quản lý")) {
            return 1;
        } else if (chucVu.equals("Thu ngân")) {
            return 2;
        } else if (chucVu.equals("Bán hàng")) {
            return 3;
        } else {
            return 4;
        }
    }
    
    private void QLNVBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLNVBtnActionPerformed
        // TODO add your handling code here:
        hide();
        if (checkChucVu() == 1) {
            TraCuuNhanVien_QL.main(user);
        } else {
            NhanVien_KhongTruyCap_NV.main(user);
        }
    }//GEN-LAST:event_QLNVBtnActionPerformed

    private void QLSPBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLSPBtnActionPerformed
        // TODO add your handling code here:
        hide();
        switch (checkChucVu()) {
            case 1:
            case 4:
                TraCuuSanPham_QL.main(user);
                break;
            case 2:
            case 3:
                TraCuuSanPham_NV.main(user);
                break;
            default:
                SanPham_KhongTruyCap_NV.main(user);
                break;
        }
    }//GEN-LAST:event_QLSPBtnActionPerformed

    private void QLKHBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLKHBtnActionPerformed
        // TODO add your handling code here:
        hide();
        switch (checkChucVu()) {
            case 1:
            case 2:
            TraCuuKhachHang.main(user);
            break;
            case 3:
            TraCuuKhachHang_NV.main(user);
            break;
            default:
            KhachHang_KhongTruyCap_NV.main(user);
            break;
        }
    }//GEN-LAST:event_QLKHBtnActionPerformed

    private void QLDTBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLDTBtnActionPerformed
        // TODO add your handling code here:
        hide();
        if (checkChucVu() == 1) {
            TraCuuDoiTac_QL.main(user);
        } else {
            DoiTac_KhongTruyCap_NV.main(user);
        }
    }//GEN-LAST:event_QLDTBtnActionPerformed

    private void QLKMBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLKMBtnActionPerformed
        // TODO add your handling code here:
        hide();
        switch (checkChucVu()) {
            case 1:
            TraCuuKhuyenMai_QL.main(user);
            break;
            case 2:
            TraCuuKhuyenMai_NV.main(user);
            break;
            default:
            KhuyenMai_KhongTruyCap_NV.main(user);
            break;
        }
    }//GEN-LAST:event_QLKMBtnActionPerformed

    private void QLNHBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLNHBtnActionPerformed
        // TODO add your handling code here:
        hide();
        switch (checkChucVu()) {
            case 1:
            case 4:
            TraCuuNhapHang.main(user);
            break;
            default:
            NhapHang_KhongTruyCap_NV.main(user);
            break;
        }
    }//GEN-LAST:event_QLNHBtnActionPerformed

    private void QLHDBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLHDBtnActionPerformed
        // TODO add your handling code here:
        hide();
        switch (checkChucVu()) {
            case 1:
            case 2:
            TraCuuHoaDon.main(user);
            break;
            case 3:
            TraCuuHoaDon_NV.main(user);
            break;
            default:
            HoaDon_KhongTruyCap_NV.main(user);
            break;
        }
    }//GEN-LAST:event_QLHDBtnActionPerformed

    private void QLDSBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLDSBtnActionPerformed
        // TODO add your handling code here:
        hide();
        if (checkChucVu() == 1) {
            BaoCaoDoanhThu_QL.main(user);
        } else {
            DoanhThu_KhongTruyCap_NV.main(user);
        }
    }//GEN-LAST:event_QLDSBtnActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        hide();
        WelcomeScreen.main(null);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        hide();
        Chung.main(user);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TraCuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TraCuuActionPerformed
        // TODO add your handling code here:
        hide();
        TraCuuChamCong_QL.main(user);
    }//GEN-LAST:event_TraCuuActionPerformed

    private void checkInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInActionPerformed
        // TODO add your handling code here:
        try {
            if (ChamCongBUS.insertCC(user)) {
                JOptionPane.showMessageDialog(this, "Check In thành công");
                checkButtonCheckInOn = false;
                checkButtonCheckOutOn = true;
                setOnOffButton();
                return;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChamCong_NV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_checkInActionPerformed

    private void checkOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutActionPerformed
        // TODO add your handling code here:
        try {
            if (ChamCongBUS.updateCC(user)) {
                JOptionPane.showMessageDialog(this, "Check Out thành công");
                checkButtonCheckOutOn = false;
                setOnOffButton();
                return;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChamCong_NV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_checkOutActionPerformed

    public void setOnOffButton () {
        if (checkButtonCheckInOn) {
            checkIn.setEnabled(true);
        } else {
            checkIn.setEnabled(false);
        } 
        
        if (checkButtonCheckOutOn) {
            checkOut.setEnabled(true);
        } else {
            checkOut.setEnabled(false);
        } 
    }
    
    public void checkButton() {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime cIn = LocalDateTime.now();
        String ngayCheckIn = cIn.format(dateFormat);
        
        String checkNgCheckIn = null;
        String checkNgCheckOut = null;
        if (ChamCongBUS.getCheckIn(user) != null) {
            checkNgCheckIn = ChamCongBUS.getCheckIn(user);
            if (checkNgCheckIn.equals(ngayCheckIn)) {
                checkButtonCheckInOn = false;
                checkButtonCheckOutOn = true;
            } else {
                checkButtonCheckInOn = true;
            }
        }
        
        if (ChamCongBUS.getCheckOut(user) != null) {
            checkNgCheckOut = ChamCongBUS.getCheckOut(user);
            if (checkNgCheckOut.equals(ngayCheckIn)) {
                checkButtonCheckOutOn = false;
            }
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args) {
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
            java.util.logging.Logger.getLogger(ChamCong_QL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChamCong_QL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChamCong_QL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChamCong_QL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChamCong_QL(args).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChamCongBtn;
    private javax.swing.JButton QLDSBtn;
    private javax.swing.JButton QLDTBtn;
    private javax.swing.JButton QLHDBtn;
    private javax.swing.JButton QLKHBtn;
    private javax.swing.JButton QLKMBtn;
    private javax.swing.JButton QLNHBtn;
    private javax.swing.JButton QLNVBtn;
    private javax.swing.JButton QLSPBtn;
    private javax.swing.JButton TraCuu;
    private javax.swing.JButton checkIn;
    private javax.swing.JButton checkOut;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
