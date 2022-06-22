/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import BUS.KhachHangBUS;
import BUS.NhanVienBUS;
import DTO.KhachHang;
import java.awt.HeadlessException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class SuaKhachHang extends javax.swing.JFrame {

    /**
     * Creates new form SuaKhachHang
     */
    String user;
    int maKHSave = -1;
    public SuaKhachHang(String a) throws HeadlessException {
        initComponents();
        setLocationRelativeTo(null);
        this.user = a;
        loadKhachHangAll();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Find = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        txtHoten = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDiachi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        datePickerNgSinh = new com.github.lgooddatepicker.components.DatePicker();
        jLabel11 = new javax.swing.JLabel();
        cbbGioiTinh = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cbbLoaiKH = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        datePickerNgDK = new com.github.lgooddatepicker.components.DatePicker();
        jLabel14 = new javax.swing.JLabel();
        txtTichluy = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtGhichu = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sửa khách hàng");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(249, 255, 254));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/tag/Khách hàng.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/tag/Đăng xuất.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setText("Nhập vào");
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));

        cbb_search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã KH", "Họ tên", "SĐT", "Loại KH" }));
        cbb_search.setBackground(new java.awt.Color(249, 255, 254));
        cbb_search.setFocusable(false);
        cbb_search.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbb_search.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setText("Tìm kiếm theo");
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSearch.setBackground(new java.awt.Color(249, 255, 254));
        txtSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSearch.setCaretColor(new java.awt.Color(0, 0, 0));
        txtSearch.setForeground(new java.awt.Color(0, 0, 0));

        Back.setBackground(new java.awt.Color(249, 255, 254));
        Back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(196, 100, 96));
        Back.setText("Quay lại");
        Back.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.setFocusPainted(false);
        Back.setFocusable(false);
        Back.setRequestFocusEnabled(false);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã KH", "Tên KH", "Ngày sinh", "SĐT", "Địa chỉ", "Giới tính", "Loại KH", "Ngày đăng kí", "Tích lũy", "Ghi chú"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
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

        Find.setBackground(new java.awt.Color(196, 100, 96));
        Find.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Find.setForeground(new java.awt.Color(255, 255, 255));
        Find.setText("Tìm");
        Find.setBorder(null);
        Find.setBorderPainted(false);
        Find.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Find.setFocusPainted(false);
        Find.setRequestFocusEnabled(false);
        Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindActionPerformed(evt);
            }
        });

        Save.setBackground(new java.awt.Color(196, 100, 96));
        Save.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Save.setForeground(new java.awt.Color(255, 255, 255));
        Save.setText("Lưu");
        Save.setBorder(null);
        Save.setBorderPainted(false);
        Save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Save.setFocusPainted(false);
        Save.setRequestFocusEnabled(false);
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        txtHoten.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtHoten.setBackground(new java.awt.Color(249, 255, 254));
        txtHoten.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtHoten.setCaretColor(new java.awt.Color(0, 0, 0));
        txtHoten.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setText("Họ tên");
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));

        txtDiachi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDiachi.setBackground(new java.awt.Color(249, 255, 254));
        txtDiachi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtDiachi.setCaretColor(new java.awt.Color(0, 0, 0));
        txtDiachi.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setText("Địa chỉ");
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));

        txtSDT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSDT.setBackground(new java.awt.Color(249, 255, 254));
        txtSDT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSDT.setCaretColor(new java.awt.Color(0, 0, 0));
        txtSDT.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setText("SĐT");
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));

        jLabel11.setText("Ngày sinh");
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));

        cbbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nữ", "Nam", "Khác" }));
        cbbGioiTinh.setBackground(new java.awt.Color(249, 255, 254));
        cbbGioiTinh.setFocusable(false);
        cbbGioiTinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbbGioiTinh.setForeground(new java.awt.Color(0, 0, 0));

        jLabel12.setText("Giới tính");
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));

        cbbLoaiKH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Moi", "Than thiet", "VIP" }));
        cbbLoaiKH.setBackground(new java.awt.Color(249, 255, 254));
        cbbLoaiKH.setEnabled(false);
        cbbLoaiKH.setFocusable(false);
        cbbLoaiKH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbbLoaiKH.setForeground(new java.awt.Color(0, 0, 0));

        jLabel13.setText("Loại KH");
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));

        datePickerNgDK.setEnabled(false);

        jLabel14.setText("Ngày đăng kí");
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));

        txtTichluy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTichluy.setBackground(new java.awt.Color(249, 255, 254));
        txtTichluy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTichluy.setCaretColor(new java.awt.Color(0, 0, 0));
        txtTichluy.setEnabled(false);
        txtTichluy.setForeground(new java.awt.Color(0, 0, 0));

        jLabel15.setText("Tích lũy");
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));

        txtGhichu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtGhichu.setBackground(new java.awt.Color(249, 255, 254));
        txtGhichu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtGhichu.setCaretColor(new java.awt.Color(0, 0, 0));
        txtGhichu.setForeground(new java.awt.Color(0, 0, 0));

        jLabel16.setText("Ghi chú");
        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));

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
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbb_search, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Find, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16)
                            .addComponent(txtGhichu, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(cbbLoaiKH, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(datePickerNgDK, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(txtTichluy, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(cbbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(datePickerNgSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(97, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)))
                        .addGap(32, 32, 32))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(4, 4, 4)
                        .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(4, 4, 4)
                        .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(3, 3, 3)
                        .addComponent(cbbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datePickerNgSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel13)
                        .addGap(3, 3, 3)
                        .addComponent(cbbLoaiKH, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(6, 6, 6)
                        .addComponent(datePickerNgDK, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addGap(4, 4, 4)
                        .addComponent(txtTichluy, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addGap(4, 4, 4)
                .addComponent(txtGhichu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbb_search, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Find, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 740));

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
            loadKhachHangAll();
        } else {
            FindKhachHang();
        }
    }//GEN-LAST:event_FindActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        hide();
        TraCuuKhachHang.main(user);
    }//GEN-LAST:event_BackActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int rowSelected = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date ngsinh, ngdk;
        try {
            ngsinh = sourceFormat.parse((String) model.getValueAt(rowSelected, 2));
            ngdk = sourceFormat.parse((String) model.getValueAt(rowSelected, 7));
            ZoneId defaultZoneId = ZoneId.systemDefault();
            Instant instantNgSinh = ngsinh.toInstant();
            Instant instantNgDK = ngdk.toInstant();
            LocalDate localDateNgSinh = instantNgSinh.atZone(defaultZoneId).toLocalDate();
            LocalDate localDateNgDK = instantNgDK.atZone(defaultZoneId).toLocalDate();

            txtHoten.setText((String) model.getValueAt(rowSelected, 1));
            txtDiachi.setText((String) model.getValueAt(rowSelected, 4));
            txtGhichu.setText((String) model.getValueAt(rowSelected, 9));
            txtSDT.setText((String) model.getValueAt(rowSelected, 3));
            datePickerNgSinh.setDate(localDateNgSinh);
            cbbGioiTinh.setSelectedItem((String) model.getValueAt(rowSelected, 5));
            cbbLoaiKH.setSelectedItem(model.getValueAt(rowSelected, 6).toString());
            datePickerNgDK.setDate(localDateNgDK);
            txtTichluy.setText(String.valueOf(model.getValueAt(rowSelected, 8)));
            String ma = model.getValueAt(rowSelected, 0).toString();
            int maKH = Integer.parseInt(ma);
            maKHSave = maKH;
        } catch (ParseException ex) {
            Logger.getLogger(SuaNhanVien_QL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
    
    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        if (maKHSave == -1) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn khách hàng để cập nhật!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String hoten = txtHoten.getText();
        String diaChi = txtDiachi.getText();
        String sdt = txtSDT.getText();
        String tichluy = txtTichluy.getText();
        String ngsinh = String.format("%1$td/%1$tm/%1$tY", datePickerNgSinh.getDate());
        String ngdk = String.format("%1$td/%1$tm/%1$tY", datePickerNgDK.getDate());
        String gioitinh = (String) cbbGioiTinh.getSelectedItem();
        String loaikh = (String) cbbLoaiKH.getSelectedItem();
        String ghichu = txtGhichu.getText();
        if (hoten.equals("") || diaChi.equals("") || sdt.equals("") || ngsinh.equals("null/null/null") || gioitinh.equals("") ) {
            JOptionPane.showMessageDialog(this, "Thông tin không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!isNumeric(sdt)) {
            JOptionPane.showMessageDialog(this, "Hãy nhập vào 1 số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (isNumeric(hoten)) {
            JOptionPane.showMessageDialog(this, "Họ tên không được là số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int reply = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn cập nhật?", "Xác nhận",JOptionPane.YES_NO_OPTION );
        if (reply == JOptionPane.NO_OPTION || reply == JOptionPane.CLOSED_OPTION) {
            return;
        }
        try {
            int tichluyKH = Integer.parseInt(tichluy);
            DateTimeFormatter fIn = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
            LocalDate ldNgS = LocalDate.parse( ngsinh , fIn );
            LocalDate ldNgDK = LocalDate.parse( ngdk , fIn );
            KhachHang kh = new KhachHang(maKHSave, tichluyKH, hoten, gioitinh, diaChi, sdt, loaikh, ghichu, ldNgS, ldNgDK);
            KhachHangBUS bus = new KhachHangBUS();
            
            if (bus.updateKH(kh)) {
                JOptionPane.showMessageDialog(this, "Đã cập nhật thành công!");
                clearKH();
                loadKhachHangAll();
            } else {
                JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi, vui lòng thử lại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SaveActionPerformed

    public void FindKhachHang() {
        DefaultTableModel SearchTable = (DefaultTableModel) jTable1.getModel();
        String option = (String) cbb_search.getSelectedItem();
        String search = txtSearch.getText();
        SearchTable.setRowCount(0);

        if (option.equals("Mã KH") || option.equals("SĐT")) {
            if (!isNumeric(txtSearch.getText())) {
                JOptionPane.showMessageDialog(this, "Hãy nhập vào 1 số", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        ArrayList<KhachHang> arr = new ArrayList<KhachHang>();
        arr = KhachHangBUS.timKhachHang(option, search);
        KhachHang kh = new KhachHang();
        for (int i = 0; i < arr.size(); i++) {
            kh = arr.get(i);
            int maKH = kh.getMaKH();
            String hoten = kh.getHoTen();
            String diaChi = kh.getDiaChi();
            String loaiKH = kh.getLoaiKH();
            String sdt = kh.getSDT();
            String ngsinh = kh.toString(kh.getNgSinh());
            String gioitinh = kh.getGioiTinh();
            String ghichu = kh.getGhiChu();
            String ngdk = kh.toString(kh.getNgDK());
            int tichluy = kh.getTichLuy();
            Object[] row = {maKH, hoten, ngsinh, sdt, diaChi, gioitinh, loaiKH, ngdk, tichluy, ghichu};
            SearchTable.addRow(row);
        }
        if (arr.size() <= 0) {
            JOptionPane.showMessageDialog(this, "Thông tin tìm kiếm không tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void loadKhachHangAll() {
        String[] header = {"Mã KH", "Họ tên", "Ngày sinh", "SĐT", "Địa chỉ", "Giới tính", "Loại KH", "Ngày đăng kí", "Tích lũy", "Ghi chú"};
        DefaultTableModel dtm = new DefaultTableModel(header, 0);
        ArrayList<KhachHang> arr = new ArrayList<KhachHang>();
        arr = KhachHangBUS.getKhachHangAll();
        KhachHang kh = new KhachHang();
        for (int i = 0; i < arr.size(); i++) {
            kh = arr.get(i);
            int maKH = kh.getMaKH();
            String hoten = kh.getHoTen();
            String diaChi = kh.getDiaChi();
            String loaiKH = kh.getLoaiKH();
            String sdt = kh.getSDT();
            String ngsinh = kh.toString(kh.getNgSinh());
            String gioitinh = kh.getGioiTinh();
            String ghichu = kh.getGhiChu();
            String ngdk = kh.toString(kh.getNgDK());
            int tichluy = kh.getTichLuy();
            Object[] row = {maKH, hoten, ngsinh, sdt, diaChi, gioitinh, loaiKH, ngdk, tichluy, ghichu};
            dtm.addRow(row);
        }
        jTable1.setModel(dtm);
    }
    
    public void clearKH() {
        txtHoten.setText("");
        txtSDT.setText("");
        txtDiachi.setText("");
        txtTichluy.setText("");
        datePickerNgSinh.setDate(null);
        datePickerNgDK.setDate(null);
        txtGhichu.setText("");
        cbbGioiTinh.setSelectedItem(null);
        cbbLoaiKH.setSelectedItem(null);
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
            java.util.logging.Logger.getLogger(SuaKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuaKhachHang(args).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Find;
    private javax.swing.JButton Save;
    private javax.swing.JComboBox<String> cbbGioiTinh;
    private javax.swing.JComboBox<String> cbbLoaiKH;
    private javax.swing.JComboBox<String> cbb_search;
    private com.github.lgooddatepicker.components.DatePicker datePickerNgDK;
    private com.github.lgooddatepicker.components.DatePicker datePickerNgSinh;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtGhichu;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTichluy;
    // End of variables declaration//GEN-END:variables
}
