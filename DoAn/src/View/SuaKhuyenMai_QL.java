/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import BUS.KhuyenMaiBUS;
import BUS.NhanVienBUS;
import DTO.KhuyenMai;
import java.awt.HeadlessException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class SuaKhuyenMai_QL extends javax.swing.JFrame {

    /**
     * Creates new form SuaKhuyenMai_QL
     */
    String user;
    int maKMSave;
    public SuaKhuyenMai_QL(String a) throws HeadlessException {
        initComponents();
        setLocationRelativeTo(null);
        this.user = a;
        loadKhuyenMaiAll();
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
        txtPhanTram = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTenKM = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dateTimePickerNgBD = new com.github.lgooddatepicker.components.DateTimePicker();
        dateTimePickerNgKT = new com.github.lgooddatepicker.components.DateTimePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sửa khuyến mãi");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(249, 255, 254));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/tag/Khuyến mãi.png"))); // NOI18N

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

        cbb_search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã KM", "Tên KM", "Phần trăm" }));
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
                "Mã KM", "Tên KM", "Phần trăm", "Ngày bắt đầu", "Ngày kết thúc"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class
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

        txtPhanTram.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPhanTram.setBackground(new java.awt.Color(249, 255, 254));
        txtPhanTram.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPhanTram.setCaretColor(new java.awt.Color(0, 0, 0));
        txtPhanTram.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setText("Phần trăm");
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));

        txtTenKM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTenKM.setBackground(new java.awt.Color(249, 255, 254));
        txtTenKM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTenKM.setCaretColor(new java.awt.Color(0, 0, 0));
        txtTenKM.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setText("Tên KM");
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setText("Ngày kết thúc");
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setText("Ngày bắt đầu");
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));

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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbb_search, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(26, 26, 26)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(Find, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(txtTenKM, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(803, 803, 803))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(33, 33, 33))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1027, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(dateTimePickerNgBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(157, 157, 157)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(txtPhanTram, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(dateTimePickerNgKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(7, 7, 7)
                        .addComponent(txtTenKM, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateTimePickerNgBD, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(7, 7, 7)
                        .addComponent(txtPhanTram, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateTimePickerNgKT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Find, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cbb_search, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 680));

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

    public void clearKM() {
        txtTenKM.setText("");
        txtPhanTram.setText("");
        dateTimePickerNgBD.setDateTimeStrict(null);
        dateTimePickerNgKT.setDateTimeStrict(null);
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
    
    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String tenKM = txtTenKM.getText();
        String phanTram = txtPhanTram.getText();
        String ngbd = "", ngkt = "";
        if (tenKM.equals("") || phanTram.equals("")) {
            JOptionPane.showMessageDialog(this, "Thông tin không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!isNumeric(txtPhanTram.getText())) {
            JOptionPane.showMessageDialog(this, "Hãy nhập vào 1 số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (dateTimePickerNgBD.getDateTimePermissive() != null && dateTimePickerNgKT.getDateTimePermissive() != null) {
            ngbd = dateTimePickerNgBD.getDateTimePermissive().format(dateFormat);
            ngkt = dateTimePickerNgKT.getDateTimePermissive().format(dateFormat);
        }
        int reply = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn cập nhật?", "Xác nhận",JOptionPane.YES_NO_OPTION );
        if (reply == JOptionPane.NO_OPTION || reply == JOptionPane.CLOSED_OPTION) {
            return;
        }
        try {
            float phanTramKM = Float.parseFloat(phanTram);
            
            LocalDateTime ngBD = null, ngKT = null;
            if (!ngbd.equals("") || !ngkt.equals("")) {
                ngBD = LocalDateTime.parse(ngbd, dateFormat);
                ngKT = LocalDateTime.parse(ngkt, dateFormat);
            }
            KhuyenMai km = new KhuyenMai(maKMSave, tenKM, phanTramKM, ngBD, ngKT);
            KhuyenMaiBUS bus = new KhuyenMaiBUS();

            if (bus.updateKM(km)) {
                JOptionPane.showMessageDialog(this, "Đã cập nhật thành công!");
                clearKM();
                loadKhuyenMaiAll();
            } else {
                JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi, vui lòng thử lại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int rowSelected = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String ngbd = "", ngkt = "";
        LocalDateTime ngBD = null, ngKT = null;
        if (model.getValueAt(rowSelected, 3) != null || model.getValueAt(rowSelected, 4) != null) {
            ngbd = (String) model.getValueAt(rowSelected, 3);
            ngkt = (String) model.getValueAt(rowSelected, 4);
        }
        if (!ngbd.equals("") || !ngkt.equals("")) {
            ngBD = LocalDateTime.parse(ngbd, dateFormat);
            ngKT = LocalDateTime.parse(ngkt, dateFormat);
        }
        txtTenKM.setText((String) model.getValueAt(rowSelected, 1));
        txtPhanTram.setText(String.valueOf(model.getValueAt(rowSelected, 2)));
        dateTimePickerNgBD.setDateTimePermissive(ngBD);
        dateTimePickerNgKT.setDateTimePermissive(ngKT);
        String ma = model.getValueAt(rowSelected, 0).toString();
        int makm = Integer.parseInt(ma);
        maKMSave = makm;
    }//GEN-LAST:event_jTable1MouseClicked

    private void FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindActionPerformed
        // TODO add your handling code here:
        String search = txtSearch.getText();
        if (search.equals("")) {
            loadKhuyenMaiAll();
        } else {
            FindKhuyenMai();
        }
    }//GEN-LAST:event_FindActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        hide();
        TraCuuKhuyenMai_QL.main(user);
    }//GEN-LAST:event_BackActionPerformed

    public void FindKhuyenMai() {
        DefaultTableModel SearchTable = (DefaultTableModel) jTable1.getModel();
        String option = (String) cbb_search.getSelectedItem();
        String search = txtSearch.getText();
        SearchTable.setRowCount(0);

        if (option.equals("Mã NV") || option.equals("Phần trăm")) {
            if (!isNumeric(txtSearch.getText())) {
                JOptionPane.showMessageDialog(this, "Hãy nhập vào 1 số", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        ArrayList<KhuyenMai> arr = new ArrayList<KhuyenMai>();
        arr = KhuyenMaiBUS.timKhuyenMai(option, search);
        KhuyenMai km = new KhuyenMai();
        for (int i = 0; i < arr.size(); i++) {
            km = arr.get(i);
            int maKM = km.getMaKM();
            String tenKM = km.getTenKM();
            float phanTram = km.getPhanTram();
            String ngbd = km.toString(km.getNgBD());
            String ngkt = km.toString(km.getNgKT());
            Object[] row = {maKM, tenKM, phanTram, ngbd, ngkt};
            SearchTable.addRow(row);
        }
        if (arr.size() <= 0) {
            JOptionPane.showMessageDialog(this, "Thông tin tìm kiếm không tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void loadKhuyenMaiAll() {
        String[] header = {"Mã KM", "Tên khuyến mãi", "Phần trăm", "Ngày bắt đầu", "Ngày kết thúc"};
        DefaultTableModel dtm = new DefaultTableModel(header, 0);
        ArrayList<KhuyenMai> arr = new ArrayList<KhuyenMai>();
        arr = KhuyenMaiBUS.getKhuyenMaiAll();
        KhuyenMai km = new KhuyenMai();
        for (int i = 0; i < arr.size(); i++) {
            km = arr.get(i);
            int maKM = km.getMaKM();
            String tenKM = km.getTenKM();
            float phanTram = km.getPhanTram();
            String ngbd = km.toString(km.getNgBD());
            String ngkt = km.toString(km.getNgKT());
            Object[] row = {maKM, tenKM, phanTram, ngbd, ngkt};
            dtm.addRow(row);
        }
        jTable1.setModel(dtm);
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
            java.util.logging.Logger.getLogger(SuaKhuyenMai_QL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaKhuyenMai_QL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaKhuyenMai_QL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaKhuyenMai_QL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuaKhuyenMai_QL(args).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Find;
    private javax.swing.JButton Save;
    private javax.swing.JComboBox<String> cbb_search;
    private com.github.lgooddatepicker.components.DateTimePicker dateTimePickerNgBD;
    private com.github.lgooddatepicker.components.DateTimePicker dateTimePickerNgKT;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtPhanTram;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTenKM;
    // End of variables declaration//GEN-END:variables
}
