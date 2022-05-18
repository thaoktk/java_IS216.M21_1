/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import BUS.NhanVienBUS;
import BUS.SanPhamBUS;
import DTO.SanPham;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class SuaSanPham_QL extends javax.swing.JFrame {

    /**
     * Creates new form SuaSanPham_QL
     */
    String user;
    File file = null;
    int maSPSave;
    public SuaSanPham_QL(String a) throws HeadlessException {
        initComponents();
        setLocationRelativeTo(null);
        this.user = a;
        loadSanPhamAll();
        loaiLoaiSP();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbb_search = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        Back = new javax.swing.JButton();
        Find = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtTenSP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMausac = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbbMaLSP = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSlsan = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtGhichu = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        openFile = new javax.swing.JButton();
        txtAnh = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sửa sản phẩm");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(249, 255, 254));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/tag/Sản phẩm.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/tag/Đăng xuất.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nhập vào");

        cbb_search.setBackground(new java.awt.Color(249, 255, 254));
        cbb_search.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbb_search.setForeground(new java.awt.Color(0, 0, 0));
        cbb_search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã SP", "Tên SP", "Màu sắc", "Tên loại SP" }));
        cbb_search.setFocusable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tìm kiếm theo");

        txtSearch.setBackground(new java.awt.Color(249, 255, 254));
        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(0, 0, 0));
        txtSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSearch.setCaretColor(new java.awt.Color(0, 0, 0));

        Back.setText("Quay lại");
        Back.setBackground(new java.awt.Color(249, 255, 254));
        Back.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.setFocusPainted(false);
        Back.setFocusable(false);
        Back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(196, 100, 96));
        Back.setRequestFocusEnabled(false);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Find.setText("Tìm");
        Find.setBackground(new java.awt.Color(196, 100, 96));
        Find.setBorder(null);
        Find.setBorderPainted(false);
        Find.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Find.setFocusPainted(false);
        Find.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Find.setForeground(new java.awt.Color(255, 255, 255));
        Find.setRequestFocusEnabled(false);
        Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindActionPerformed(evt);
            }
        });

        Save.setText("Lưu");
        Save.setBackground(new java.awt.Color(196, 100, 96));
        Save.setBorder(null);
        Save.setBorderPainted(false);
        Save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Save.setFocusPainted(false);
        Save.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Save.setForeground(new java.awt.Color(255, 255, 255));
        Save.setRequestFocusEnabled(false);
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Mã phiếu nhập", "Tên sản phẩm", "Giá", "Loại SP", "Màu sắc", "SL sẵn", "Ghi chú"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setBackground(new java.awt.Color(180, 222, 197));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setSelectionBackground(new java.awt.Color(196, 100, 96));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowGrid(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        txtTenSP.setBackground(new java.awt.Color(249, 255, 254));
        txtTenSP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTenSP.setForeground(new java.awt.Color(0, 0, 0));
        txtTenSP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTenSP.setCaretColor(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tên sản phẩm");

        txtMausac.setBackground(new java.awt.Color(249, 255, 254));
        txtMausac.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMausac.setForeground(new java.awt.Color(0, 0, 0));
        txtMausac.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtMausac.setCaretColor(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Màu sắc");

        cbbMaLSP.setBackground(new java.awt.Color(249, 255, 254));
        cbbMaLSP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbbMaLSP.setForeground(new java.awt.Color(0, 0, 0));
        cbbMaLSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tulip", "Hồng", "Cẩm chướng", "Cúc" }));
        cbbMaLSP.setFocusable(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Tên loại SP");

        txtGia.setBackground(new java.awt.Color(249, 255, 254));
        txtGia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtGia.setForeground(new java.awt.Color(0, 0, 0));
        txtGia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtGia.setCaretColor(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Giá");

        txtSlsan.setBackground(new java.awt.Color(249, 255, 254));
        txtSlsan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSlsan.setForeground(new java.awt.Color(0, 0, 0));
        txtSlsan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSlsan.setCaretColor(new java.awt.Color(0, 0, 0));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Số lượng sẵn");

        txtGhichu.setBackground(new java.awt.Color(249, 255, 254));
        txtGhichu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtGhichu.setForeground(new java.awt.Color(0, 0, 0));
        txtGhichu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtGhichu.setCaretColor(new java.awt.Color(0, 0, 0));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Ghi chú");

        openFile.setBackground(new java.awt.Color(249, 255, 254));
        openFile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        openFile.setForeground(new java.awt.Color(0, 0, 0));
        openFile.setText("Chọn");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });

        txtAnh.setBackground(new java.awt.Color(249, 255, 254));
        txtAnh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAnh.setForeground(new java.awt.Color(0, 0, 0));
        txtAnh.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAnh.setCaretColor(new java.awt.Color(0, 0, 0));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Ảnh");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(136, 136, 136)
                                .addComponent(jLabel13))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtSlsan, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtGhichu, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(openFile)))
                        .addGap(0, 172, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cbb_search, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Find, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8)
                                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(cbbMaLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(txtMausac, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jScrollPane1))
                        .addGap(20, 20, 20))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(6, 6, 6)
                        .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(4, 4, 4)
                        .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbMaLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMausac, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel12))
                    .addComponent(jLabel13))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSlsan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtGhichu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(txtAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(openFile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSearch)
                            .addComponent(cbb_search, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Find, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 700));

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
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        hide();
        WelcomeScreen.main(null);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindActionPerformed
        // TODO add your handling code here:
        String search = txtSearch.getText();
        if (search.equals("")) {
            loadSanPhamAll();
        } else {
            FindSanPham();
        }
    }//GEN-LAST:event_FindActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int rowSelected = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        txtTenSP.setText((String) model.getValueAt(rowSelected, 1));
        txtGia.setText(model.getValueAt(rowSelected, 2).toString());
        cbbMaLSP.setSelectedItem(model.getValueAt(rowSelected, 3));
        txtMausac.setText((String) model.getValueAt(rowSelected, 4));
        txtSlsan.setText(model.getValueAt(rowSelected, 5).toString());
        txtGhichu.setText(model.getValueAt(rowSelected, 6).toString());
        txtAnh.setText("");
        String ma = model.getValueAt(rowSelected, 0).toString();
        int maSP = Integer.parseInt(ma);
        maSPSave = maSP;
    }//GEN-LAST:event_jTable1MouseClicked

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        try {
            fc.setCurrentDirectory(new File(getClass().getResource("/CuaHangHoa/").toURI()));
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
        }
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","gif","png");
        fc.addChoosableFileFilter(filter);
        fc.setDialogTitle("Chọn ảnh");
        int result = fc.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            file = fc.getSelectedFile();
            try {
                if (ImageIO.read(file) != null)
                {
                    txtAnh.setText(file.getPath());
                }
                else
                {
                    file = null;
                    JOptionPane.showMessageDialog(this,"Không phải ảnh","Lỗi",JOptionPane.ERROR_MESSAGE);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_openFileActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        hide();
        TraCuuSanPham_QL.main(user);
    }//GEN-LAST:event_BackActionPerformed

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
    
    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        String tenSP = txtTenSP.getText();
        String ghichu = txtGhichu.getText();
        String mausac = txtMausac.getText();
        String slsan = txtSlsan.getText();
        String gia = txtGia.getText();
        String tenloaiSP = cbbMaLSP.getSelectedItem().toString();
        if (tenSP.equals("") || slsan.equals("") || gia.equals("")) {
            JOptionPane.showMessageDialog(this, "Thông tin không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!isNumeric(txtSlsan.getText()) || !isNumeric(txtGia.getText())) {
            JOptionPane.showMessageDialog(this, "Hãy nhập vào 1 số", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int reply = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn cập nhật?", "Xác nhận",JOptionPane.YES_NO_OPTION );
        if (reply == JOptionPane.NO_OPTION || reply == JOptionPane.CLOSED_OPTION) {
            return;
        }
        try {
            SanPhamBUS bus = new SanPhamBUS();
            int slSanSP = Integer.parseInt(slsan);
            long giaSP = Long.parseLong(gia);
            String anh = null; 
            if (file != null) {
                anh = file.getPath();
            } else {
                anh = bus.getAnhSP(maSPSave);
            }
            int maloaiSP = bus.getMaLSP(tenloaiSP);
            SanPham dt = new SanPham(maSPSave, maloaiSP, slSanSP, tenSP, mausac, ghichu, anh, giaSP);

            if (bus.updateSP(dt)) {
                JOptionPane.showMessageDialog(this, "Đã cập nhật thành công!");
                clearSP();
                loadSanPhamAll();
            } else {
                JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi, vui lòng thử lại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SaveActionPerformed

    public void clearSP() {
        txtTenSP.setText("");
        txtGhichu.setText("");
        txtMausac.setText("");
        txtSlsan.setText("");
        txtGia.setText("");
        cbbMaLSP.setSelectedItem(null);
        txtAnh.setText("");
    }
    
    public void FindSanPham() {
        DefaultTableModel SearchTable = (DefaultTableModel) jTable1.getModel();
        String option = (String) cbb_search.getSelectedItem();
        String search = txtSearch.getText();
        SearchTable.setRowCount(0);

        if (option.equals("Mã SP") || option.equals("Mã loại SP")) {
            if (!isNumeric(txtSearch.getText())) {
                JOptionPane.showMessageDialog(this, "Hãy nhập vào 1 số", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        ArrayList<SanPham> arr = new ArrayList<SanPham>();
        arr = SanPhamBUS.timSanPham(option, search);
        SanPham dt = new SanPham();
        for (int i = 0; i < arr.size(); i++) {
            dt = arr.get(i);
            int maSP = dt.getMaSP();
            String tenSP = dt.getTenSP();
            long gia = dt.getGiaSP();
            int maloaiSP = dt.getMaLoaiSP();
            String tenloaiSP = SanPhamBUS.getTenLSP(maloaiSP);
            String mausac = dt.getMauSac();
            int slsan = dt.getSlsan();
            String ghichu = dt.getGhiChu();
            Object[] row = {maSP, tenSP, gia, tenloaiSP, mausac, slsan, ghichu};
            SearchTable.addRow(row);
        }
        if (arr.size() <= 0) {
            JOptionPane.showMessageDialog(this, "Thông tin tìm kiếm không tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void loadSanPhamAll() {
        String[] header = {"Mã SP", "Tên sản phẩm", "Giá", "Tên loại SP", "Màu sắc", "SL sẵn", "Ghi chú"};
        DefaultTableModel dtm = new DefaultTableModel(header, 0);
        ArrayList<SanPham> arr = new ArrayList<SanPham>();
        arr = SanPhamBUS.getSanPhamAll();
        SanPham dt = new SanPham();
        for (int i = 0; i < arr.size(); i++) {
            dt = arr.get(i);
            int maSP = dt.getMaSP();
            String tenSP = dt.getTenSP();
            long gia = dt.getGiaSP();
            int maloaiSP = dt.getMaLoaiSP();
            String tenloaiSP = SanPhamBUS.getTenLSP(maloaiSP);
            String mausac = dt.getMauSac();
            int slsan = dt.getSlsan();
            String ghichu = dt.getGhiChu();
            Object[] row = {maSP, tenSP, gia, tenloaiSP, mausac, slsan, ghichu};
            dtm.addRow(row);
        }
        jTable1.setModel(dtm);
    }
    
    public void loaiLoaiSP() {
        ArrayList<String> arr = new ArrayList<String>();
        arr = SanPhamBUS.getTenLSP();
        cbbMaLSP.setModel(new DefaultComboBoxModel(arr.toArray()));
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
            java.util.logging.Logger.getLogger(SuaSanPham_QL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaSanPham_QL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaSanPham_QL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaSanPham_QL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuaSanPham_QL(args).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Find;
    private javax.swing.JButton Save;
    private javax.swing.JComboBox<String> cbbMaLSP;
    private javax.swing.JComboBox<String> cbb_search;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton openFile;
    private javax.swing.JTextField txtAnh;
    private javax.swing.JTextField txtGhichu;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMausac;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSlsan;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables
}
