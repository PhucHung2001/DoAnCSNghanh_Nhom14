package view;

import dao.NhoTaiKhoanDao;
import dao.PhongDao;
import dao.SinhVienDao;
import dao.TaiKhoanDao;
import dao.ThongKeDAO;
import helper.Auth;
import helper.DialogHelper;
import helper.LuongMP3;
import helper.xDate;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import model.Phong;
import model.SinhVien;
import model.TaiKhoan;

public class CuaSoChinh extends javax.swing.JFrame {

    public CuaSoChinh() {
        this.setUndecorated(true);
        initComponents();
        init();
        mousing();

    }

    public CuaSoChinh(boolean a) {
        this.setUndecorated(true);
        initComponents();
        // init();
        setLocationRelativeTo(null);
        //new MangHinhChao(this, true).setVisible(true);
        //new Login(this, true).setVisible(true);
        setVisiblePnl(pnlGiaoDienChinh);
        this.setResizable(false);
        txtDMKNhanVien.setEditable(false);

        // MP3.start();
        Timerr();
        phanQuyen();
        if (ntkDao.selectSetting(Auth.user.getTaiKhoan()) != null) {
            CapNhatCaiDat();
        }
        mousing();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        GrdoQLSV = new javax.swing.ButtonGroup();
        pnlGiaoDienChinh = new javax.swing.JPanel();
        pnlP3 = new javax.swing.JPanel();
        pnlP3Ten = new javax.swing.JLabel();
        pnlP3SoSV = new javax.swing.JLabel();
        pnlP3NgayThem = new javax.swing.JLabel();
        pnlP3GhiChu = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnTrang2 = new javax.swing.JButton();
        pnlP2 = new javax.swing.JPanel();
        pnlP2Ten = new javax.swing.JLabel();
        pnlP2SoSV = new javax.swing.JLabel();
        pnlP2NgayThem = new javax.swing.JLabel();
        pnlP2GhiChu = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pnlP4 = new javax.swing.JPanel();
        pnlP4Ten = new javax.swing.JLabel();
        pnlP4SoSV = new javax.swing.JLabel();
        pnlP4NgayThem = new javax.swing.JLabel();
        pnlP4GhiChu = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pnlP5 = new javax.swing.JPanel();
        pnlP5Ten = new javax.swing.JLabel();
        pnlP5SoSV = new javax.swing.JLabel();
        pnlP5NgayThem = new javax.swing.JLabel();
        pnlP5GhiChu = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        pnlP6 = new javax.swing.JPanel();
        pnlP6Ten = new javax.swing.JLabel();
        pnlP6SoSV = new javax.swing.JLabel();
        pnlP6NgayThem = new javax.swing.JLabel();
        pnlP6GhiChu = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        pnlP1 = new javax.swing.JPanel();
        pnlP1Ten = new javax.swing.JLabel();
        pnlP1SoSV = new javax.swing.JLabel();
        pnlP1NgayThem = new javax.swing.JLabel();
        pnlP1GhiChu = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblMHCnho = new javax.swing.JLabel();
        pnlQuanLyPhong = new javax.swing.JPanel();
        tabsQLP = new javax.swing.JTabbedPane();
        tabs1 = new javax.swing.JPanel();
        txtQLPNgayThem = new javax.swing.JTextField();
        txtQLPTenPhong = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtQLPGhiChu = new javax.swing.JTextArea();
        txtQLPMaPhong = new javax.swing.JTextField();
        lblQLPSoSV = new javax.swing.JLabel();
        lblTBtxtQLPTenP = new javax.swing.JLabel();
        lblTBtxtQLPMaP = new javax.swing.JLabel();
        lblTBtxtQLPNgayThem = new javax.swing.JLabel();
        btnQLPMoi = new javax.swing.JLabel();
        btnQLPThem = new javax.swing.JLabel();
        btnQLPCapNhat = new javax.swing.JLabel();
        btnQLPXoa = new javax.swing.JLabel();
        btnQLPChiTiet = new javax.swing.JLabel();
        lblQLPtrong = new javax.swing.JLabel();
        tabs2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblQLPPhong = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblQLPngoai = new javax.swing.JLabel();
        pnlChiTietPhong = new javax.swing.JPanel();
        tabsChiTietP = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        txtCTPTienDong = new javax.swing.JTextField();
        txtCTPDaDong = new javax.swing.JTextField();
        btnCTPCapNhat = new javax.swing.JLabel();
        lblTBtxtTienDong = new javax.swing.JLabel();
        lblTBtxtDaDong = new javax.swing.JLabel();
        txtCTPMsv = new javax.swing.JLabel();
        txtCTPHoTen = new javax.swing.JLabel();
        txtCTPconlai = new javax.swing.JLabel();
        txt = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblChiTietP = new javax.swing.JTable();
        cboChitietP = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        lblQuanLyPhong1 = new javax.swing.JLabel();
        lblCTPNenNgoai = new javax.swing.JLabel();
        pnlQuanLySV = new javax.swing.JPanel();
        tabsQLSV = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtQLSVMasv = new javax.swing.JTextField();
        txtQLSVTenSV = new javax.swing.JTextField();
        txtQLSVNgayDK = new javax.swing.JTextField();
        txtQLSVSDT = new javax.swing.JTextField();
        txtQLSVNgayHetHan = new javax.swing.JTextField();
        cboQLSVMaP = new javax.swing.JComboBox<>();
        rdoQLSVNam = new javax.swing.JRadioButton();
        rdoQLSVNu = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtQLSVGhiChu = new javax.swing.JTextArea();
        btnQLSVMoi = new javax.swing.JLabel();
        btnQLSVThem = new javax.swing.JLabel();
        btnQLSVCapNhat = new javax.swing.JLabel();
        btnQLSVXoa = new javax.swing.JLabel();
        lblTBtxtQLSVtensv = new javax.swing.JLabel();
        lblTBtxtQLSVsdt = new javax.swing.JLabel();
        lblTBtxtQLSVngayhethan = new javax.swing.JLabel();
        lblTBtxtQLSVmasv = new javax.swing.JLabel();
        lblQLSVNenCN = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        txtQLSVTimKiem = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblQLSV = new javax.swing.JTable();
        lblQLSVNenDS = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        lblQLSVNenNgoai = new javax.swing.JLabel();
        pnlQuanLyNV = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        tabsQLNV = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        txtQLNVTaiKhoan = new javax.swing.JTextField();
        txtQLNVEmail = new javax.swing.JTextField();
        txtQLNVHoTen = new javax.swing.JTextField();
        rdoQLNVQuanLy = new javax.swing.JRadioButton();
        rdoQLNVNhanVien = new javax.swing.JRadioButton();
        txtQLNVxacNhanMK = new javax.swing.JPasswordField();
        txtQLNVMatKhau = new javax.swing.JPasswordField();
        tblTBtxtQLNVMatKHau = new javax.swing.JLabel();
        lblTBtxtQLNVEmail = new javax.swing.JLabel();
        lblTBtxtQLNVXacNhanmk = new javax.swing.JLabel();
        lblTBtxtQLNVHoTen = new javax.swing.JLabel();
        lblTBtxtQLNVTaiKhoan = new javax.swing.JLabel();
        btnQLNVMoi = new javax.swing.JLabel();
        btnQLNVThem = new javax.swing.JLabel();
        btnQLNVCapNhat = new javax.swing.JLabel();
        btnQLNVXoa = new javax.swing.JLabel();
        lblQLNVNenTrong = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQLNV = new javax.swing.JTable();
        lblQLNVNenNgoai = new javax.swing.JLabel();
        pnlDoiMatKhau = new javax.swing.JPanel();
        txtDMKNhanVien = new javax.swing.JTextField();
        txtDMKMatKhauM = new javax.swing.JPasswordField();
        txtDMKXacNhan = new javax.swing.JPasswordField();
        lblKetQuaDMK = new javax.swing.JLabel();
        btnDMKHuy = new javax.swing.JLabel();
        btnDMKXacNhan = new javax.swing.JLabel();
        lblDMKNen = new javax.swing.JLabel();
        pnlThongKe = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblThongKe = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        lblThongKeNen = new javax.swing.JLabel();
        pnlCaiDat = new javax.swing.JPanel();
        lblKetQuaDMK1 = new javax.swing.JLabel();
        btnCDBatTat = new javax.swing.JLabel();
        btnCDNgay = new javax.swing.JLabel();
        btnCDDem = new javax.swing.JLabel();
        btnCDDoiMK = new javax.swing.JLabel();
        btnCDDangXuat = new javax.swing.JLabel();
        btnNen = new javax.swing.JLabel();
        pnlGiaoDienChinh2 = new javax.swing.JPanel();
        pnlP9 = new javax.swing.JPanel();
        pnlP9Ten = new javax.swing.JLabel();
        pnlP9SoSV = new javax.swing.JLabel();
        pnlP9NgayThem = new javax.swing.JLabel();
        pnlP9GhiChu = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnlP8 = new javax.swing.JPanel();
        pnlP8Ten = new javax.swing.JLabel();
        pnlP8SoSV = new javax.swing.JLabel();
        pnlP8NgayThem = new javax.swing.JLabel();
        pnlP8GhiChu = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pnlP10 = new javax.swing.JPanel();
        pnlP10Ten = new javax.swing.JLabel();
        pnlP10SoSV = new javax.swing.JLabel();
        pnlP10NgayThem = new javax.swing.JLabel();
        pnlP10GhiChu = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        pnlP11 = new javax.swing.JPanel();
        pnlP11Ten = new javax.swing.JLabel();
        pnlP11SoSV = new javax.swing.JLabel();
        pnlP11NgayThem = new javax.swing.JLabel();
        pnlP11GhiChu = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        pnlP12 = new javax.swing.JPanel();
        pnlP12Ten = new javax.swing.JLabel();
        pnlP12SoSV = new javax.swing.JLabel();
        pnlP12NgayThem = new javax.swing.JLabel();
        pnlP12GhiChu = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        pnlP7 = new javax.swing.JPanel();
        pnlP7Ten = new javax.swing.JLabel();
        pnlP7SoSV = new javax.swing.JLabel();
        pnlP7NgayThem = new javax.swing.JLabel();
        pnlP7GhiChu = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnTrang1 = new javax.swing.JButton();
        lblMHCnho1 = new javax.swing.JLabel();
        lblToday = new javax.swing.JLabel();
        lblNgay = new javax.swing.JLabel();
        lblTen = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnTrangChu = new javax.swing.JButton();
        btnQuanLyNhanVien = new javax.swing.JButton();
        btnQuanLyPhong = new javax.swing.JButton();
        btnQuanLySinhVien = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnCaiDat = new javax.swing.JButton();
        lblDongHo = new javax.swing.JLabel();
        lblNenChinh = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 730));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlGiaoDienChinh.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlGiaoDienChinh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlP3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlP3.setPreferredSize(new java.awt.Dimension(3, 3));
        pnlP3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlP3MouseClicked(evt);
            }
        });

        pnlP3Ten.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pnlP3Ten.setText("Phòng:");

        pnlP3SoSV.setText("Số SV hiện tại:");

        pnlP3NgayThem.setText("Ngày Thêm:");

        pnlP3GhiChu.setText("Ghi Chú:");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home.png"))); // NOI18N

        javax.swing.GroupLayout pnlP3Layout = new javax.swing.GroupLayout(pnlP3);
        pnlP3.setLayout(pnlP3Layout);
        pnlP3Layout.setHorizontalGroup(
            pnlP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlP3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlP3SoSV)
                    .addComponent(pnlP3NgayThem)
                    .addComponent(pnlP3GhiChu))
                .addContainerGap(259, Short.MAX_VALUE))
            .addGroup(pnlP3Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(pnlP3Ten)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(23, 23, 23))
        );
        pnlP3Layout.setVerticalGroup(
            pnlP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlP3Layout.createSequentialGroup()
                .addGroup(pnlP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlP3Ten)
                    .addGroup(pnlP3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlP3SoSV)
                .addGap(18, 18, 18)
                .addComponent(pnlP3NgayThem)
                .addGap(18, 18, 18)
                .addComponent(pnlP3GhiChu)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pnlGiaoDienChinh.add(pnlP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 340, 141));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("KÝ TÚC XÁ ĐẠI HỌC HS");
        pnlGiaoDienChinh.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        btnTrang2.setText("Trang 2");
        btnTrang2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrang2ActionPerformed(evt);
            }
        });
        pnlGiaoDienChinh.add(btnTrang2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 620, -1, -1));

        pnlP2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlP2.setPreferredSize(new java.awt.Dimension(3, 3));
        pnlP2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlP2MouseClicked(evt);
            }
        });

        pnlP2Ten.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pnlP2Ten.setText("Phòng:");

        pnlP2SoSV.setText("Số SV hiện tại:");

        pnlP2NgayThem.setText("Ngày Thêm:");

        pnlP2GhiChu.setText("Ghi Chú:");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home.png"))); // NOI18N

        javax.swing.GroupLayout pnlP2Layout = new javax.swing.GroupLayout(pnlP2);
        pnlP2.setLayout(pnlP2Layout);
        pnlP2Layout.setHorizontalGroup(
            pnlP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlP2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlP2SoSV)
                    .addComponent(pnlP2NgayThem)
                    .addComponent(pnlP2GhiChu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlP2Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(pnlP2Ten)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(23, 23, 23))
        );
        pnlP2Layout.setVerticalGroup(
            pnlP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlP2Layout.createSequentialGroup()
                .addGroup(pnlP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlP2Ten)
                    .addGroup(pnlP2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlP2SoSV)
                .addGap(18, 18, 18)
                .addComponent(pnlP2NgayThem)
                .addGap(18, 18, 18)
                .addComponent(pnlP2GhiChu)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlGiaoDienChinh.add(pnlP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 340, 141));

        pnlP4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlP4.setPreferredSize(new java.awt.Dimension(3, 3));
        pnlP4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlP4MouseClicked(evt);
            }
        });

        pnlP4Ten.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pnlP4Ten.setText("Phòng:");

        pnlP4SoSV.setText("Số SV hiện tại:");

        pnlP4NgayThem.setText("Ngày Thêm:");

        pnlP4GhiChu.setText("Ghi Chú:");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home.png"))); // NOI18N

        javax.swing.GroupLayout pnlP4Layout = new javax.swing.GroupLayout(pnlP4);
        pnlP4.setLayout(pnlP4Layout);
        pnlP4Layout.setHorizontalGroup(
            pnlP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlP4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlP4SoSV)
                    .addComponent(pnlP4NgayThem)
                    .addComponent(pnlP4GhiChu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlP4Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(pnlP4Ten)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(23, 23, 23))
        );
        pnlP4Layout.setVerticalGroup(
            pnlP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlP4Layout.createSequentialGroup()
                .addGroup(pnlP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlP4Ten)
                    .addGroup(pnlP4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlP4SoSV)
                .addGap(18, 18, 18)
                .addComponent(pnlP4NgayThem)
                .addGap(18, 18, 18)
                .addComponent(pnlP4GhiChu)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pnlGiaoDienChinh.add(pnlP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 340, 141));

        pnlP5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlP5.setPreferredSize(new java.awt.Dimension(3, 3));
        pnlP5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlP5MouseClicked(evt);
            }
        });

        pnlP5Ten.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pnlP5Ten.setText("Phòng:");

        pnlP5SoSV.setText("Số SV hiện tại:");

        pnlP5NgayThem.setText("Ngày Thêm:");

        pnlP5GhiChu.setText("Ghi Chú:");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home.png"))); // NOI18N

        javax.swing.GroupLayout pnlP5Layout = new javax.swing.GroupLayout(pnlP5);
        pnlP5.setLayout(pnlP5Layout);
        pnlP5Layout.setHorizontalGroup(
            pnlP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlP5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlP5SoSV)
                    .addComponent(pnlP5NgayThem)
                    .addComponent(pnlP5GhiChu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlP5Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(pnlP5Ten)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addGap(23, 23, 23))
        );
        pnlP5Layout.setVerticalGroup(
            pnlP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlP5Layout.createSequentialGroup()
                .addGroup(pnlP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlP5Ten)
                    .addGroup(pnlP5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel28)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlP5SoSV)
                .addGap(18, 18, 18)
                .addComponent(pnlP5NgayThem)
                .addGap(18, 18, 18)
                .addComponent(pnlP5GhiChu)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlGiaoDienChinh.add(pnlP5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 340, 141));

        pnlP6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlP6.setPreferredSize(new java.awt.Dimension(3, 3));
        pnlP6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlP6MouseClicked(evt);
            }
        });

        pnlP6Ten.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pnlP6Ten.setText("Phòng:");

        pnlP6SoSV.setText("Số SV hiện tại:");

        pnlP6NgayThem.setText("Ngày Thêm:");

        pnlP6GhiChu.setText("Ghi Chú:");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home.png"))); // NOI18N

        javax.swing.GroupLayout pnlP6Layout = new javax.swing.GroupLayout(pnlP6);
        pnlP6.setLayout(pnlP6Layout);
        pnlP6Layout.setHorizontalGroup(
            pnlP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlP6Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(pnlP6Ten)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(23, 23, 23))
            .addGroup(pnlP6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlP6SoSV)
                    .addComponent(pnlP6NgayThem)
                    .addComponent(pnlP6GhiChu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlP6Layout.setVerticalGroup(
            pnlP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlP6Layout.createSequentialGroup()
                .addGroup(pnlP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlP6Ten)
                    .addGroup(pnlP6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlP6SoSV)
                .addGap(18, 18, 18)
                .addComponent(pnlP6NgayThem)
                .addGap(18, 18, 18)
                .addComponent(pnlP6GhiChu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlGiaoDienChinh.add(pnlP6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 340, 141));

        pnlP1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlP1.setPreferredSize(new java.awt.Dimension(3, 3));
        pnlP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlP1MouseClicked(evt);
            }
        });

        pnlP1Ten.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pnlP1Ten.setText("Phòng:");

        pnlP1SoSV.setText("Số SV hiện tại:");

        pnlP1NgayThem.setText("Ngày Thêm:");

        pnlP1GhiChu.setText("Ghi Chú:");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home.png"))); // NOI18N

        javax.swing.GroupLayout pnlP1Layout = new javax.swing.GroupLayout(pnlP1);
        pnlP1.setLayout(pnlP1Layout);
        pnlP1Layout.setHorizontalGroup(
            pnlP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlP1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlP1SoSV)
                    .addComponent(pnlP1NgayThem)
                    .addComponent(pnlP1GhiChu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlP1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(pnlP1Ten)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(23, 23, 23))
        );
        pnlP1Layout.setVerticalGroup(
            pnlP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlP1Layout.createSequentialGroup()
                .addGroup(pnlP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlP1Ten)
                    .addGroup(pnlP1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlP1SoSV)
                .addGap(18, 18, 18)
                .addComponent(pnlP1NgayThem)
                .addGap(18, 18, 18)
                .addComponent(pnlP1GhiChu)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pnlGiaoDienChinh.add(pnlP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 340, 141));

        lblMHCnho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pnlall.png"))); // NOI18N
        pnlGiaoDienChinh.add(lblMHCnho, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 650));

        getContentPane().add(pnlGiaoDienChinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 830, 650));

        pnlQuanLyPhong.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlQuanLyPhong.setPreferredSize(new java.awt.Dimension(840, 503));
        pnlQuanLyPhong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabs1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtQLPNgayThem.setBorder(null);
        tabs1.add(txtQLPNgayThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 470, 34));

        txtQLPTenPhong.setBorder(null);
        tabs1.add(txtQLPTenPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 470, 33));

        txtQLPGhiChu.setColumns(20);
        txtQLPGhiChu.setRows(5);
        jScrollPane2.setViewportView(txtQLPGhiChu);

        tabs1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 520, 110));

        txtQLPMaPhong.setBorder(null);
        tabs1.add(txtQLPMaPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 470, 40));

        lblQLPSoSV.setText("0");
        tabs1.add(lblQLPSoSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 20, -1));

        lblTBtxtQLPTenP.setForeground(new java.awt.Color(255, 0, 0));
        tabs1.add(lblTBtxtQLPTenP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 250, 20));

        lblTBtxtQLPMaP.setForeground(new java.awt.Color(255, 0, 0));
        tabs1.add(lblTBtxtQLPMaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 250, 20));

        lblTBtxtQLPNgayThem.setForeground(new java.awt.Color(255, 0, 0));
        tabs1.add(lblTBtxtQLPNgayThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 250, 30));

        btnQLPMoi.setFont(new java.awt.Font("UVN Bay Buom Hep Nang", 0, 18)); // NOI18N
        btnQLPMoi.setText("Mới");
        btnQLPMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQLPMoiMouseClicked(evt);
            }
        });
        tabs1.add(btnQLPMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 40, -1));

        btnQLPThem.setFont(new java.awt.Font("UVN Bay Buom Hep Nang", 0, 18)); // NOI18N
        btnQLPThem.setText("Thêm");
        btnQLPThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQLPThemMouseClicked(evt);
            }
        });
        tabs1.add(btnQLPThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, -1, -1));

        btnQLPCapNhat.setFont(new java.awt.Font("UVN Bay Buom Hep Nang", 0, 18)); // NOI18N
        btnQLPCapNhat.setText("Cập Nhật");
        btnQLPCapNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQLPCapNhatMouseClicked(evt);
            }
        });
        tabs1.add(btnQLPCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, -1, -1));

        btnQLPXoa.setFont(new java.awt.Font("UVN Bay Buom Hep Nang", 0, 18)); // NOI18N
        btnQLPXoa.setText("Xóa");
        btnQLPXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQLPXoaMouseClicked(evt);
            }
        });
        tabs1.add(btnQLPXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, -1, -1));

        btnQLPChiTiet.setFont(new java.awt.Font("UVN Bay Buom Hep Nang", 0, 18)); // NOI18N
        btnQLPChiTiet.setText("Chi Tiết");
        btnQLPChiTiet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQLPChiTietMouseClicked(evt);
            }
        });
        tabs1.add(btnQLPChiTiet, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, -1, -1));

        lblQLPtrong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pnlQLPS.png"))); // NOI18N
        tabs1.add(lblQLPtrong, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 830, 590));

        tabsQLP.addTab("Cập Nhật", tabs1);

        tabs2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));

        tblQLPPhong.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Phòng", "Tên Phòng", "Số SV", "Ngày Thêm", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblQLPPhong.setToolTipText("");
        tblQLPPhong.setAutoscrolls(false);
        tblQLPPhong.setRowHeight(25);
        tblQLPPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQLPPhongMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblQLPPhong);

        javax.swing.GroupLayout tabs2Layout = new javax.swing.GroupLayout(tabs2);
        tabs2.setLayout(tabs2Layout);
        tabs2Layout.setHorizontalGroup(
            tabs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabs2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        tabs2Layout.setVerticalGroup(
            tabs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );

        tabsQLP.addTab("Danh Sách", tabs2);

        pnlQuanLyPhong.add(tabsQLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 59, 820, 554));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("QUẢN LÝ PHÒNG");
        pnlQuanLyPhong.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        lblQLPngoai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pnlall.png"))); // NOI18N
        pnlQuanLyPhong.add(lblQLPngoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, -2, 850, -1));

        getContentPane().add(pnlQuanLyPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 830, 650));

        pnlChiTietPhong.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlChiTietPhong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCTPTienDong.setBorder(null);
        txtCTPTienDong.setPreferredSize(new java.awt.Dimension(6, 20));
        jPanel6.add(txtCTPTienDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 260, 40));

        txtCTPDaDong.setBorder(null);
        txtCTPDaDong.setPreferredSize(new java.awt.Dimension(6, 20));
        jPanel6.add(txtCTPDaDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 250, 40));

        btnCTPCapNhat.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCTPCapNhat.setText("Cập Nhật");
        btnCTPCapNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCTPCapNhatMouseClicked(evt);
            }
        });
        jPanel6.add(btnCTPCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 90, 30));

        lblTBtxtTienDong.setForeground(new java.awt.Color(204, 0, 0));
        jPanel6.add(lblTBtxtTienDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 140, 20));

        lblTBtxtDaDong.setForeground(new java.awt.Color(204, 0, 0));
        jPanel6.add(lblTBtxtDaDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 150, 20));
        jPanel6.add(txtCTPMsv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 250, 30));
        jPanel6.add(txtCTPHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 390, 30));
        jPanel6.add(txtCTPconlai, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 400, 30));

        txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pnlCTPS.png"))); // NOI18N
        jPanel6.add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 570));

        tabsChiTietP.addTab("Cập Nhật", jPanel6);

        jPanel7.setPreferredSize(new java.awt.Dimension(800, 450));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblChiTietP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã SV", "Tên SV", "Tiền phải đóng", "Tiền đã đóng", "Còn lại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChiTietP.setAutoscrolls(false);
        tblChiTietP.setMinimumSize(new java.awt.Dimension(90, 224));
        tblChiTietP.setPreferredSize(new java.awt.Dimension(450, 450));
        tblChiTietP.setRowHeight(25);
        tblChiTietP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChiTietPMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblChiTietP);

        jPanel7.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 768, 485));

        cboChitietP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboChitietP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboChitietPActionPerformed(evt);
            }
        });
        jPanel7.add(cboChitietP, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 41, 192, 33));

        jLabel45.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel45.setText("Phòng:");
        jPanel7.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 45, -1, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pnlall.png"))); // NOI18N
        jPanel7.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 590));

        tabsChiTietP.addTab("Danh Sách", jPanel7);

        pnlChiTietPhong.add(tabsChiTietP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 797, 600));

        lblQuanLyPhong1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblQuanLyPhong1.setForeground(new java.awt.Color(0, 51, 255));
        lblQuanLyPhong1.setText("CHI TIẾT PHÒNG");
        pnlChiTietPhong.add(lblQuanLyPhong1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        lblCTPNenNgoai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pnlall.png"))); // NOI18N
        lblCTPNenNgoai.setPreferredSize(new java.awt.Dimension(845, 681));
        pnlChiTietPhong.add(lblCTPNenNgoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 840, 680));

        getContentPane().add(pnlChiTietPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 830, 650));

        pnlQuanLySV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlQuanLySV.setPreferredSize(new java.awt.Dimension(840, 503));
        pnlQuanLySV.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtQLSVMasv.setBorder(null);
        jPanel1.add(txtQLSVMasv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 740, 30));

        txtQLSVTenSV.setBorder(null);
        jPanel1.add(txtQLSVTenSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 114, 740, 30));

        txtQLSVNgayDK.setBorder(null);
        jPanel1.add(txtQLSVNgayDK, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 300, 30));

        txtQLSVSDT.setBorder(null);
        jPanel1.add(txtQLSVSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 193, 290, 30));

        txtQLSVNgayHetHan.setBorder(null);
        jPanel1.add(txtQLSVNgayHetHan, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 310, 30));

        cboQLSVMaP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboQLSVMaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboQLSVMaPActionPerformed(evt);
            }
        });
        jPanel1.add(cboQLSVMaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 330, 40));

        GrdoQLSV.add(rdoQLSVNam);
        rdoQLSVNam.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rdoQLSVNam.setText("Nam");
        jPanel1.add(rdoQLSVNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        GrdoQLSV.add(rdoQLSVNu);
        rdoQLSVNu.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rdoQLSVNu.setText("Nữ");
        jPanel1.add(rdoQLSVNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        txtQLSVGhiChu.setColumns(20);
        txtQLSVGhiChu.setRows(4);
        txtQLSVGhiChu.setBorder(null);
        jScrollPane4.setViewportView(txtQLSVGhiChu);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 770, 70));

        btnQLSVMoi.setFont(new java.awt.Font("UVN Bach Tuyet Nang", 0, 14)); // NOI18N
        btnQLSVMoi.setText("Mới");
        btnQLSVMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQLSVMoiMouseClicked(evt);
            }
        });
        jPanel1.add(btnQLSVMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, -1, -1));

        btnQLSVThem.setFont(new java.awt.Font("UVN Bach Tuyet Nang", 0, 14)); // NOI18N
        btnQLSVThem.setText("Thêm");
        btnQLSVThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQLSVThemMouseClicked(evt);
            }
        });
        jPanel1.add(btnQLSVThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, -1, -1));

        btnQLSVCapNhat.setFont(new java.awt.Font("UVN Bach Tuyet Nang", 0, 14)); // NOI18N
        btnQLSVCapNhat.setText("Cập Nhật");
        btnQLSVCapNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQLSVCapNhatMouseClicked(evt);
            }
        });
        jPanel1.add(btnQLSVCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, -1, -1));

        btnQLSVXoa.setFont(new java.awt.Font("UVN Bach Tuyet Nang", 0, 14)); // NOI18N
        btnQLSVXoa.setText("Xóa");
        btnQLSVXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQLSVXoaMouseClicked(evt);
            }
        });
        jPanel1.add(btnQLSVXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, -1, -1));

        lblTBtxtQLSVtensv.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblTBtxtQLSVtensv, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 230, 20));

        lblTBtxtQLSVsdt.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblTBtxtQLSVsdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 210, 20));

        lblTBtxtQLSVngayhethan.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblTBtxtQLSVngayhethan, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 190, 20));

        lblTBtxtQLSVmasv.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblTBtxtQLSVmasv, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 230, 20));

        lblQLSVNenCN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pnlQLSVS.png"))); // NOI18N
        jPanel1.add(lblQLSVNenCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 540));

        tabsQLSV.addTab("Cập nhật", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setText("Danh Sách Sinh Viên:");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        txtQLSVTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQLSVTimKiemKeyReleased(evt);
            }
        });
        jPanel2.add(txtQLSVTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 340, 37));

        jLabel32.setText("Tìm kiếm theo tên sinh viên:");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        tblQLSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Ma SV", "Tên SV", "SĐT", "Giới tính", "Ngày ĐK", "Ngày HH", "Mã phòng", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblQLSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQLSVMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblQLSV);

        jPanel2.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 820, 360));

        lblQLSVNenDS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pnlall.png"))); // NOI18N
        jPanel2.add(lblQLSVNenDS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 520));

        tabsQLSV.addTab("Danh sách", jPanel2);

        pnlQuanLySV.add(tabsQLSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 830, -1));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 255));
        jLabel34.setText("QUẢN LÝ SINH VIÊN");
        pnlQuanLySV.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        lblQLSVNenNgoai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pnlall.png"))); // NOI18N
        pnlQuanLySV.add(lblQLSVNenNgoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 660));

        getContentPane().add(pnlQuanLySV, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 830, 650));

        pnlQuanLyNV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlQuanLyNV.setMinimumSize(new java.awt.Dimension(812, 650));
        pnlQuanLyNV.setName(""); // NOI18N
        pnlQuanLyNV.setPreferredSize(new java.awt.Dimension(840, 650));
        pnlQuanLyNV.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 255));
        jLabel35.setText("QUẢN LÝ NHÂN VIÊN");
        pnlQuanLyNV.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtQLNVTaiKhoan.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtQLNVTaiKhoan.setBorder(null);
        jPanel11.add(txtQLNVTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 530, 30));

        txtQLNVEmail.setBorder(null);
        jPanel11.add(txtQLNVEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 520, 30));

        txtQLNVHoTen.setBorder(null);
        txtQLNVHoTen.setMinimumSize(new java.awt.Dimension(5, 22));
        txtQLNVHoTen.setPreferredSize(new java.awt.Dimension(5, 22));
        jPanel11.add(txtQLNVHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 530, 30));

        buttonGroup1.add(rdoQLNVQuanLy);
        rdoQLNVQuanLy.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rdoQLNVQuanLy.setText("Quản Lý");
        jPanel11.add(rdoQLNVQuanLy, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, -1, -1));

        buttonGroup1.add(rdoQLNVNhanVien);
        rdoQLNVNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rdoQLNVNhanVien.setText("Nhân Viên");
        jPanel11.add(rdoQLNVNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, -1, -1));

        txtQLNVxacNhanMK.setBorder(null);
        jPanel11.add(txtQLNVxacNhanMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 520, 30));

        txtQLNVMatKhau.setBorder(null);
        jPanel11.add(txtQLNVMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 520, 30));

        tblTBtxtQLNVMatKHau.setForeground(new java.awt.Color(255, 0, 0));
        jPanel11.add(tblTBtxtQLNVMatKHau, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 250, 20));

        lblTBtxtQLNVEmail.setForeground(new java.awt.Color(255, 0, 0));
        jPanel11.add(lblTBtxtQLNVEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 250, 20));

        lblTBtxtQLNVXacNhanmk.setBackground(new java.awt.Color(255, 0, 0));
        lblTBtxtQLNVXacNhanmk.setForeground(new java.awt.Color(255, 0, 0));
        jPanel11.add(lblTBtxtQLNVXacNhanmk, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 260, 20));

        lblTBtxtQLNVHoTen.setForeground(new java.awt.Color(255, 0, 0));
        jPanel11.add(lblTBtxtQLNVHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 250, 20));

        lblTBtxtQLNVTaiKhoan.setForeground(new java.awt.Color(255, 0, 0));
        jPanel11.add(lblTBtxtQLNVTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 250, 20));

        btnQLNVMoi.setFont(new java.awt.Font("UVN Bach Tuyet Nang", 1, 14)); // NOI18N
        btnQLNVMoi.setText("Mới");
        btnQLNVMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQLNVMoiMouseClicked(evt);
            }
        });
        jPanel11.add(btnQLNVMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 60, 50));

        btnQLNVThem.setFont(new java.awt.Font("UVN Bach Tuyet Nang", 1, 14)); // NOI18N
        btnQLNVThem.setText("Thêm");
        btnQLNVThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQLNVThemMouseClicked(evt);
            }
        });
        jPanel11.add(btnQLNVThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 80, 40));

        btnQLNVCapNhat.setFont(new java.awt.Font("UVN Bach Tuyet Nang", 1, 14)); // NOI18N
        btnQLNVCapNhat.setText("Sửa");
        btnQLNVCapNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQLNVCapNhatMouseClicked(evt);
            }
        });
        jPanel11.add(btnQLNVCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, 70, 40));

        btnQLNVXoa.setFont(new java.awt.Font("UVN Bach Tuyet Nang", 1, 14)); // NOI18N
        btnQLNVXoa.setText("Xóa");
        btnQLNVXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQLNVXoaMouseClicked(evt);
            }
        });
        jPanel11.add(btnQLNVXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, 70, 40));

        lblQLNVNenTrong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pnlQLNVS.png"))); // NOI18N
        jPanel11.add(lblQLNVNenTrong, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 830, 580));

        tabsQLNV.addTab("Cập Nhật", jPanel11);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tblQLNV.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tài khoản", "mật khẩu", "Email", "Họ tên", "vai trò"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblQLNV.setMinimumSize(new java.awt.Dimension(85, 300));
        tblQLNV.setPreferredSize(new java.awt.Dimension(310, 509));
        tblQLNV.setRowHeight(30);
        tblQLNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQLNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblQLNV);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );

        tabsQLNV.addTab("Danh Sách", jPanel3);

        pnlQuanLyNV.add(tabsQLNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 820, 600));

        lblQLNVNenNgoai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pnlall.png"))); // NOI18N
        pnlQuanLyNV.add(lblQLNVNenNgoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 650));

        getContentPane().add(pnlQuanLyNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 830, 650));

        pnlDoiMatKhau.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlDoiMatKhau.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDMKNhanVien.setBackground(new java.awt.Color(160, 221, 248));
        txtDMKNhanVien.setForeground(new java.awt.Color(153, 153, 153));
        txtDMKNhanVien.setBorder(null);
        txtDMKNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDMKNhanVienActionPerformed(evt);
            }
        });
        pnlDoiMatKhau.add(txtDMKNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 720, 30));

        txtDMKMatKhauM.setBackground(new java.awt.Color(160, 221, 248));
        txtDMKMatKhauM.setBorder(null);
        pnlDoiMatKhau.add(txtDMKMatKhauM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 720, 30));

        txtDMKXacNhan.setBackground(new java.awt.Color(160, 221, 248));
        txtDMKXacNhan.setBorder(null);
        pnlDoiMatKhau.add(txtDMKXacNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 710, 20));

        lblKetQuaDMK.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblKetQuaDMK.setForeground(new java.awt.Color(204, 0, 51));
        pnlDoiMatKhau.add(lblKetQuaDMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 410, 40));

        btnDMKHuy.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnDMKHuy.setText("Hủy");
        btnDMKHuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDMKHuyMouseClicked(evt);
            }
        });
        pnlDoiMatKhau.add(btnDMKHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 580, -1, -1));

        btnDMKXacNhan.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnDMKXacNhan.setText("Xác Nhận");
        btnDMKXacNhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDMKXacNhanMouseClicked(evt);
            }
        });
        pnlDoiMatKhau.add(btnDMKXacNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, -1, -1));

        lblDMKNen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pnlDoiMatKhau.png"))); // NOI18N
        pnlDoiMatKhau.add(lblDMKNen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 830, 650));

        getContentPane().add(pnlDoiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 830, 650));

        pnlThongKe.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlThongKe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Thống Kê");
        pnlThongKe.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        tblThongKe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Ma Phong", "Ma Sinh Vien", "Ngay DK", "Ngay HH"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblThongKe);

        pnlThongKe.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 800, 530));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Danh sách sinh viên quá hạn đăng ký :");
        pnlThongKe.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        lblThongKeNen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pnlall.png"))); // NOI18N
        pnlThongKe.add(lblThongKeNen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 650));

        getContentPane().add(pnlThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 830, 650));

        pnlCaiDat.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlCaiDat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblKetQuaDMK1.setForeground(new java.awt.Color(204, 0, 51));
        pnlCaiDat.add(lblKetQuaDMK1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 410, 40));

        btnCDBatTat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCDBatTat.setText("Tắt");
        btnCDBatTat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCDBatTatMouseClicked(evt);
            }
        });
        pnlCaiDat.add(btnCDBatTat, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 40, 20));

        btnCDNgay.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnCDNgay.setText("Ngày");
        btnCDNgay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCDNgayMouseClicked(evt);
            }
        });
        pnlCaiDat.add(btnCDNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 60, 40));

        btnCDDem.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnCDDem.setText("Đêm");
        btnCDDem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCDDemMouseClicked(evt);
            }
        });
        pnlCaiDat.add(btnCDDem, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 70, 30));

        btnCDDoiMK.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCDDoiMK.setText("Đổi Mật Khẩu");
        btnCDDoiMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCDDoiMKMouseClicked(evt);
            }
        });
        pnlCaiDat.add(btnCDDoiMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, -1, -1));

        btnCDDangXuat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCDDangXuat.setText("Đăng Xuất");
        btnCDDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCDDangXuatMouseClicked(evt);
            }
        });
        pnlCaiDat.add(btnCDDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, -1, -1));

        btnNen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pnlCaiDat.png"))); // NOI18N
        btnNen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlCaiDat.add(btnNen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 840, 670));

        getContentPane().add(pnlCaiDat, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 830, 650));

        pnlGiaoDienChinh2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlGiaoDienChinh2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlP9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlP9.setPreferredSize(new java.awt.Dimension(3, 3));
        pnlP9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlP9MouseClicked(evt);
            }
        });

        pnlP9Ten.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pnlP9Ten.setText("Phòng:");

        pnlP9SoSV.setText("Số SV hiện tại:");

        pnlP9NgayThem.setText("Ngày Thêm:");

        pnlP9GhiChu.setText("Ghi Chú:");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home.png"))); // NOI18N

        javax.swing.GroupLayout pnlP9Layout = new javax.swing.GroupLayout(pnlP9);
        pnlP9.setLayout(pnlP9Layout);
        pnlP9Layout.setHorizontalGroup(
            pnlP9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlP9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlP9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlP9SoSV)
                    .addComponent(pnlP9NgayThem)
                    .addComponent(pnlP9GhiChu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlP9Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(pnlP9Ten)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(23, 23, 23))
        );
        pnlP9Layout.setVerticalGroup(
            pnlP9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlP9Layout.createSequentialGroup()
                .addGroup(pnlP9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlP9Ten)
                    .addGroup(pnlP9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlP9SoSV)
                .addGap(18, 18, 18)
                .addComponent(pnlP9NgayThem)
                .addGap(18, 18, 18)
                .addComponent(pnlP9GhiChu)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pnlGiaoDienChinh2.add(pnlP9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 340, 141));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("PHẦN MỀM QUẢN LÝ KÝ TÚC XÁ");
        pnlGiaoDienChinh2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        pnlP8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlP8.setPreferredSize(new java.awt.Dimension(3, 3));
        pnlP8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlP8MouseClicked(evt);
            }
        });

        pnlP8Ten.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pnlP8Ten.setText("Phòng:");

        pnlP8SoSV.setText("Số SV hiện tại:");

        pnlP8NgayThem.setText("Ngày Thêm:");

        pnlP8GhiChu.setText("Ghi Chú:");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home.png"))); // NOI18N

        javax.swing.GroupLayout pnlP8Layout = new javax.swing.GroupLayout(pnlP8);
        pnlP8.setLayout(pnlP8Layout);
        pnlP8Layout.setHorizontalGroup(
            pnlP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlP8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlP8SoSV)
                    .addComponent(pnlP8NgayThem)
                    .addComponent(pnlP8GhiChu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlP8Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(pnlP8Ten)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(23, 23, 23))
        );
        pnlP8Layout.setVerticalGroup(
            pnlP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlP8Layout.createSequentialGroup()
                .addGroup(pnlP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlP8Ten)
                    .addGroup(pnlP8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlP8SoSV)
                .addGap(18, 18, 18)
                .addComponent(pnlP8NgayThem)
                .addGap(18, 18, 18)
                .addComponent(pnlP8GhiChu)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pnlGiaoDienChinh2.add(pnlP8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 340, 141));

        pnlP10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlP10.setPreferredSize(new java.awt.Dimension(3, 3));
        pnlP10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlP10MouseClicked(evt);
            }
        });

        pnlP10Ten.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pnlP10Ten.setText("Phòng:");

        pnlP10SoSV.setText("Số SV hiện tại:");

        pnlP10NgayThem.setText("Ngày Thêm:");

        pnlP10GhiChu.setText("Ghi Chú:");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home.png"))); // NOI18N

        javax.swing.GroupLayout pnlP10Layout = new javax.swing.GroupLayout(pnlP10);
        pnlP10.setLayout(pnlP10Layout);
        pnlP10Layout.setHorizontalGroup(
            pnlP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlP10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlP10SoSV)
                    .addComponent(pnlP10NgayThem)
                    .addComponent(pnlP10GhiChu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlP10Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(pnlP10Ten)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(23, 23, 23))
        );
        pnlP10Layout.setVerticalGroup(
            pnlP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlP10Layout.createSequentialGroup()
                .addGroup(pnlP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlP10Ten)
                    .addGroup(pnlP10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlP10SoSV)
                .addGap(18, 18, 18)
                .addComponent(pnlP10NgayThem)
                .addGap(18, 18, 18)
                .addComponent(pnlP10GhiChu)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pnlGiaoDienChinh2.add(pnlP10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 340, 141));

        pnlP11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlP11.setPreferredSize(new java.awt.Dimension(3, 3));
        pnlP11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlP11MouseClicked(evt);
            }
        });

        pnlP11Ten.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pnlP11Ten.setText("Phòng:");

        pnlP11SoSV.setText("Số SV hiện tại:");

        pnlP11NgayThem.setText("Ngày Thêm:");

        pnlP11GhiChu.setText("Ghi Chú:");

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home.png"))); // NOI18N

        javax.swing.GroupLayout pnlP11Layout = new javax.swing.GroupLayout(pnlP11);
        pnlP11.setLayout(pnlP11Layout);
        pnlP11Layout.setHorizontalGroup(
            pnlP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlP11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlP11SoSV)
                    .addComponent(pnlP11NgayThem)
                    .addComponent(pnlP11GhiChu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlP11Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(pnlP11Ten)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addGap(23, 23, 23))
        );
        pnlP11Layout.setVerticalGroup(
            pnlP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlP11Layout.createSequentialGroup()
                .addGroup(pnlP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlP11Ten)
                    .addGroup(pnlP11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel38)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlP11SoSV)
                .addGap(18, 18, 18)
                .addComponent(pnlP11NgayThem)
                .addGap(18, 18, 18)
                .addComponent(pnlP11GhiChu)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pnlGiaoDienChinh2.add(pnlP11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 340, 141));

        pnlP12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlP12.setPreferredSize(new java.awt.Dimension(3, 3));
        pnlP12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlP12MouseClicked(evt);
            }
        });

        pnlP12Ten.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pnlP12Ten.setText("Phòng:");

        pnlP12SoSV.setText("Số SV hiện tại:");

        pnlP12NgayThem.setText("Ngày Thêm:");

        pnlP12GhiChu.setText("Ghi Chú:");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home.png"))); // NOI18N

        javax.swing.GroupLayout pnlP12Layout = new javax.swing.GroupLayout(pnlP12);
        pnlP12.setLayout(pnlP12Layout);
        pnlP12Layout.setHorizontalGroup(
            pnlP12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlP12Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(pnlP12Ten)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(23, 23, 23))
            .addGroup(pnlP12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlP12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlP12SoSV)
                    .addComponent(pnlP12NgayThem)
                    .addComponent(pnlP12GhiChu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlP12Layout.setVerticalGroup(
            pnlP12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlP12Layout.createSequentialGroup()
                .addGroup(pnlP12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlP12Ten)
                    .addGroup(pnlP12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlP12SoSV)
                .addGap(18, 18, 18)
                .addComponent(pnlP12NgayThem)
                .addGap(18, 18, 18)
                .addComponent(pnlP12GhiChu)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pnlGiaoDienChinh2.add(pnlP12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 340, 141));

        pnlP7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlP7.setPreferredSize(new java.awt.Dimension(3, 3));
        pnlP7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlP7MouseClicked(evt);
            }
        });

        pnlP7Ten.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pnlP7Ten.setText("Phòng:");

        pnlP7SoSV.setText("Số SV hiện tại:");

        pnlP7NgayThem.setText("Ngày Thêm:");

        pnlP7GhiChu.setText("Ghi Chú:");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home.png"))); // NOI18N

        javax.swing.GroupLayout pnlP7Layout = new javax.swing.GroupLayout(pnlP7);
        pnlP7.setLayout(pnlP7Layout);
        pnlP7Layout.setHorizontalGroup(
            pnlP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlP7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlP7SoSV)
                    .addComponent(pnlP7NgayThem)
                    .addComponent(pnlP7GhiChu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlP7Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(pnlP7Ten)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(23, 23, 23))
        );
        pnlP7Layout.setVerticalGroup(
            pnlP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlP7Layout.createSequentialGroup()
                .addGroup(pnlP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlP7Ten)
                    .addGroup(pnlP7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel21)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlP7SoSV)
                .addGap(18, 18, 18)
                .addComponent(pnlP7NgayThem)
                .addGap(18, 18, 18)
                .addComponent(pnlP7GhiChu)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pnlGiaoDienChinh2.add(pnlP7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 340, 141));

        btnTrang1.setText("Trang 1");
        btnTrang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrang1ActionPerformed(evt);
            }
        });
        pnlGiaoDienChinh2.add(btnTrang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 620, -1, -1));

        lblMHCnho1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pnlall.png"))); // NOI18N
        pnlGiaoDienChinh2.add(lblMHCnho1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 650));

        getContentPane().add(pnlGiaoDienChinh2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 830, 650));

        lblToday.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblToday.setText("Today:");
        getContentPane().add(lblToday, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        lblNgay.setForeground(new java.awt.Color(204, 0, 0));
        lblNgay.setText("Ngày");
        getContentPane().add(lblNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        lblTen.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTen.setForeground(new java.awt.Color(204, 0, 51));
        getContentPane().add(lblTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 139, 26));

        lblRole.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblRole.setText("Nhân viên:");
        getContentPane().add(lblRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Menu");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        btnTrangChu.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnTrangChu.setText("Trang Chủ");
        btnTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChuActionPerformed(evt);
            }
        });
        getContentPane().add(btnTrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 183, 40));

        btnQuanLyNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnQuanLyNhanVien.setText("Quản Lý Nhân Viên");
        btnQuanLyNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyNhanVienActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuanLyNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 180, 40));

        btnQuanLyPhong.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnQuanLyPhong.setText("Quản Lý Phòng");
        btnQuanLyPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyPhongActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuanLyPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 180, 40));

        btnQuanLySinhVien.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnQuanLySinhVien.setText("Quản Lý Sinh Viên");
        btnQuanLySinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLySinhVienActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuanLySinhVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 180, 40));

        btnThongKe.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnThongKe.setText("Thống kê");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });
        getContentPane().add(btnThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 180, 40));

        btnThoat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        getContentPane().add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 180, 40));

        btnCaiDat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCaiDat.setText("Cài Đặt");
        btnCaiDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaiDatActionPerformed(evt);
            }
        });
        getContentPane().add(btnCaiDat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 180, 40));

        lblDongHo.setText("đồng hồ");
        getContentPane().add(lblDongHo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 700, -1, 26));

        lblNenChinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menuC.png"))); // NOI18N
        getContentPane().add(lblNenChinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void tblQLPPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQLPPhongMouseClicked
        ClickTablePhong();
    }//GEN-LAST:event_tblQLPPhongMouseClicked

    public void btnQuanLySinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLySinhVienActionPerformed
        setVisiblePnl(pnlQuanLySV); 
        loadQLSVCBOmaP();
        LamMoiFormQLSV();
        loadTableQLSV();
    }//GEN-LAST:event_btnQuanLySinhVienActionPerformed

    public void btnQuanLyNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyNhanVienActionPerformed
        setVisiblePnl(pnlQuanLyNV);
        LoadTableTaiKhoan();
        LamMoiFormQLNV();
    }//GEN-LAST:event_btnQuanLyNhanVienActionPerformed

    public void btnTrang2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrang2ActionPerformed
        setVisiblePnl(pnlGiaoDienChinh2);
    }//GEN-LAST:event_btnTrang2ActionPerformed

    public void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        if (DialogHelper.confirm(this, "Bạn chắc muốn thoát khỏi ứng dụng?")) {
            if (ntkDao.selectSetting(Auth.user.getTaiKhoan()) != null) {

                ntkDao.updateSetting(Auth.user.getTaiKhoan(), cheDo, nhac);
            } else {

                ntkDao.insertSetting(Auth.user.getTaiKhoan(), cheDo, nhac);
            }
            System.exit(0);
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    public void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        setVisiblePnl(pnlThongKe);
        loadtblThongKe();
    }//GEN-LAST:event_btnThongKeActionPerformed

    public void btnCaiDatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaiDatActionPerformed
        setVisiblePnl(pnlCaiDat);
    }//GEN-LAST:event_btnCaiDatActionPerformed

    public void btnTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChuActionPerformed
        setVisiblePnl(pnlGiaoDienChinh);
    }//GEN-LAST:event_btnTrangChuActionPerformed

    public void btnQuanLyPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyPhongActionPerformed
        LamMoiFormQLP();
        setVisiblePnl(pnlQuanLyPhong);
        loadTableQLP();
    }//GEN-LAST:event_btnQuanLyPhongActionPerformed

    public void tblQLNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQLNVMouseClicked
        ClickTableNhanVien();
    }//GEN-LAST:event_tblQLNVMouseClicked

    public void btnCDBatTatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCDBatTatMouseClicked
        playMP3();
    }//GEN-LAST:event_btnCDBatTatMouseClicked

    public void btnCDDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCDDangXuatMouseClicked
        DangXuat();
    }//GEN-LAST:event_btnCDDangXuatMouseClicked

    public void btnCDDoiMKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCDDoiMKMouseClicked
        setVisiblePnl(pnlDoiMatKhau);
    }//GEN-LAST:event_btnCDDoiMKMouseClicked

    public void btnCDNgayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCDNgayMouseClicked
        ngay();
    }//GEN-LAST:event_btnCDNgayMouseClicked

    public void btnCDDemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCDDemMouseClicked
        Dem();
    }//GEN-LAST:event_btnCDDemMouseClicked

    public void btnDMKHuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDMKHuyMouseClicked
        if (DialogHelper.confirm(this, "Bạn chắc muốn hủy không?")) {
            setVisiblePnl(pnlGiaoDienChinh);
        }
    }//GEN-LAST:event_btnDMKHuyMouseClicked

    public void btnDMKXacNhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDMKXacNhanMouseClicked
        doiMK();
    }//GEN-LAST:event_btnDMKXacNhanMouseClicked

    public void btnQLNVMoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLNVMoiMouseClicked
        LamMoiFormQLNV();
    }//GEN-LAST:event_btnQLNVMoiMouseClicked

    public void btnQLNVThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLNVThemMouseClicked
        ThemTaiKhoanNhanVien();
    }//GEN-LAST:event_btnQLNVThemMouseClicked

    public void btnQLNVXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLNVXoaMouseClicked
        XoaTaiKhoanNhanVien();
    }//GEN-LAST:event_btnQLNVXoaMouseClicked

    public void btnQLNVCapNhatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLNVCapNhatMouseClicked
        UpdateTaiKhoanNhanVien();
    }//GEN-LAST:event_btnQLNVCapNhatMouseClicked

    public void btnQLPMoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLPMoiMouseClicked
        LamMoiFormQLP();
    }//GEN-LAST:event_btnQLPMoiMouseClicked

    public void btnQLPThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLPThemMouseClicked
        ThemPhong();
    }//GEN-LAST:event_btnQLPThemMouseClicked

    public void btnQLPCapNhatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLPCapNhatMouseClicked
        UpdatePhong();
    }//GEN-LAST:event_btnQLPCapNhatMouseClicked

    public void btnQLPXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLPXoaMouseClicked
        XoaPhong();
    }//GEN-LAST:event_btnQLPXoaMouseClicked

    public void btnQLPChiTietMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLPChiTietMouseClicked
        clickPNL(0);
    }//GEN-LAST:event_btnQLPChiTietMouseClicked

    public void btnTrang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrang1ActionPerformed
        setVisiblePnl(pnlGiaoDienChinh);
    }//GEN-LAST:event_btnTrang1ActionPerformed

    public void btnQLSVThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLSVThemMouseClicked
        ThemSinhVien();
    }//GEN-LAST:event_btnQLSVThemMouseClicked

    public void tblQLSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQLSVMouseClicked
        ClickTableSV();
    }//GEN-LAST:event_tblQLSVMouseClicked

    public void btnQLSVCapNhatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLSVCapNhatMouseClicked
        UpdateSinhVien();
    }//GEN-LAST:event_btnQLSVCapNhatMouseClicked

    public void btnQLSVXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLSVXoaMouseClicked
        if (btnQLSVXoa.isEnabled()) {
            if (DialogHelper.confirm(this, "Xóa sinh vien này ?")) {
                XoaSinhVien();
                LamMoiFormQLSV();
            }
        }
    }//GEN-LAST:event_btnQLSVXoaMouseClicked

    public void btnQLSVMoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLSVMoiMouseClicked
        LamMoiFormQLSV();
    }//GEN-LAST:event_btnQLSVMoiMouseClicked

    public void txtQLSVTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQLSVTimKiemKeyReleased
        loadTableQLSVTim();
    }//GEN-LAST:event_txtQLSVTimKiemKeyReleased

    public void pnlP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlP1MouseClicked
        if (evt.getClickCount() >= 2) {
            clickPNL(0);
        }
    }//GEN-LAST:event_pnlP1MouseClicked

    public void pnlP2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlP2MouseClicked
        if (evt.getClickCount() >= 2) {
            clickPNL(1);
        }
    }//GEN-LAST:event_pnlP2MouseClicked

    public void pnlP3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlP3MouseClicked
        if (evt.getClickCount() >= 2) {
            clickPNL(2);
        }
    }//GEN-LAST:event_pnlP3MouseClicked

    public void pnlP4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlP4MouseClicked
        if (evt.getClickCount() >= 2) {
            clickPNL(3);
        }
    }//GEN-LAST:event_pnlP4MouseClicked

    public void pnlP5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlP5MouseClicked
        if (evt.getClickCount() >= 2) {
            clickPNL(4);
        }
    }//GEN-LAST:event_pnlP5MouseClicked

    public void pnlP6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlP6MouseClicked
        if (evt.getClickCount() >= 2) {
            clickPNL(5);
        }
    }//GEN-LAST:event_pnlP6MouseClicked

    public void tblChiTietPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChiTietPMouseClicked
        ClickTableChitiet();
    }//GEN-LAST:event_tblChiTietPMouseClicked

    public void btnCTPCapNhatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCTPCapNhatMouseClicked
        capNhapChiTiet();
    }//GEN-LAST:event_btnCTPCapNhatMouseClicked

    public void cboChitietPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChitietPActionPerformed
        clickCBOchitietP();
    }//GEN-LAST:event_cboChitietPActionPerformed

    public void pnlP7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlP7MouseClicked
        if (evt.getClickCount() >= 2) {
            clickPNL(6);
        }
    }//GEN-LAST:event_pnlP7MouseClicked

    public void pnlP8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlP8MouseClicked
        if (evt.getClickCount() >= 2) {
            clickPNL(7);
        }
    }//GEN-LAST:event_pnlP8MouseClicked

    public void pnlP9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlP9MouseClicked
        if (evt.getClickCount() >= 2) {
            clickPNL(8);
        }
    }//GEN-LAST:event_pnlP9MouseClicked

    public void pnlP10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlP10MouseClicked
        if (evt.getClickCount() >= 2) {
            clickPNL(9);
        }
    }//GEN-LAST:event_pnlP10MouseClicked

    public void pnlP11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlP11MouseClicked
        if (evt.getClickCount() >= 2) {
            clickPNL(10);
        }
    }//GEN-LAST:event_pnlP11MouseClicked

    public void pnlP12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlP12MouseClicked
        if (evt.getClickCount() >= 2) {
            clickPNL(11);
        }
    }//GEN-LAST:event_pnlP12MouseClicked

    private void txtDMKNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDMKNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDMKNhanVienActionPerformed

    private void cboQLSVMaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboQLSVMaPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboQLSVMaPActionPerformed
    void init() {
        setLocationRelativeTo(null);
       
        new MangHinhChao(this, true).setVisible(true); //chào xong tắt tới login
        new Login(this, true).setVisible(true); //login tắt gọi pnl chính
        setVisiblePnl(pnlGiaoDienChinh);//cái này là hàm của t tự viết nhe //nhét cái nào zo thì hiện cái đó còn lại tắt hêt
        this.setResizable(false);
        txtDMKNhanVien.setEditable(false);

        // MP3.start();
        Timerr();
        phanQuyen();
        if (ntkDao.selectSetting(Auth.user.getTaiKhoan()) != null) {
            CapNhatCaiDat();
        }

        //////////////////////////////////////load
    }

    void phanQuyen() {
        if (Auth.isManager()) {
            btnQuanLyNhanVien.setEnabled(true);
        } else {
            btnQuanLyNhanVien.setEnabled(false);
        }
    }

    void mousing() {
        btnCDBatTat.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnCDDoiMK.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnCDNgay.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnCDDem.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnCDDangXuat.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnDMKHuy.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnDMKXacNhan.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnQLNVMoi.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnQLNVThem.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnQLNVCapNhat.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnQLNVXoa.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnQLSVMoi.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnQLSVThem.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnQLSVCapNhat.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnQLSVXoa.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnQLPMoi.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnQLPThem.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnQLPCapNhat.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnQLPXoa.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnQLPChiTiet.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    void CapNhatGiaoDien() {
        Date date = new Date();

        //pnl thông tin 
        phanQuyen();
        if (Auth.user != null) {
            if (Auth.isManager()) {
                setTitle("HỆ THỐNG QUẢN LÝ KTX- Manager : " + Auth.user.getHoTen());
                lblRole.setText("Quản lý :");
                lblTen.setText(Auth.user.getHoTen());
                lblNgay.setText(xDate.toString(date, "E, dd/MM/yyyy"));
            } else {
                setTitle("HỆ THỐNG QUẢN LÝ KTX - User : " + Auth.user.getHoTen());
                lblRole.setText("Nhân viên :");
                lblTen.setText(Auth.user.getHoTen());
                lblNgay.setText(xDate.toString(date, "E , dd / MM / yyyy"));
            }
            ///update txtDMKTaikhoan
            txtDMKNhanVien.setText(Auth.user.getTaiKhoan());

        } else {
            setTitle("HỆ THỐNG QUẢN LÝ KTX");
            lblTen.setText("Chưa đăng nhập");
            txtDMKNhanVien.setText("");
        }

        //dong ho
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss a");
        String text = formatter.format(date);
        lblDongHo.setText(text);

    }

    void CapNhatCaiDat() {
        TaiKhoan tk = ntkDao.selectSetting(Auth.user.getTaiKhoan());
        if (tk.getCheDo()) {
            Dem();
        } else {
            ngay();
        }
        if (tk.getNhac()) {
            btnCDBatTat.setText("Bật");
            playMP3();
        } else {
            btnCDBatTat.setText("Tắt");

            playMP3();
        }
    }

    void Timerr() {
        new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CapNhatGiaoDien();
            }
        }).start();
    }

    void ngay() {
        Color cl = new Color(255, 255, 255);
        Color mauchu = new Color(105, 105, 105);
        Mode(cl, cl, mauchu);
        Color R = new Color(160, 221, 248);
        ModeC(R);
        Color E = new Color(252, 253, 255);
        ModeB(E);
        lblNenChinh.setIcon(new ImageIcon("src/icon\\menuC.png"));
        lblMHCnho.setIcon(new ImageIcon("src/icon\\pnlall.png"));
        lblMHCnho1.setIcon(new ImageIcon("src/icon\\pnlall.png"));
        lblQLPngoai.setIcon(new ImageIcon("src/icon\\pnlall.png"));
        lblQLPtrong.setIcon(new ImageIcon("src/icon\\pnlQLPS.png"));
        lblQLSVNenDS.setIcon(new ImageIcon("src/icon\\pnlall.png"));
        lblQLSVNenCN.setIcon(new ImageIcon("src/icon\\pnlQLSVS.png"));
        lblQLSVNenNgoai.setIcon(new ImageIcon("src/icon\\pnlall.png"));
        lblQLNVNenNgoai.setIcon(new ImageIcon("src/icon\\pnlall.png"));
        lblQLNVNenTrong.setIcon(new ImageIcon("src/icon\\pnlQLNVS.png"));
        lblCTPNenNgoai.setIcon(new ImageIcon("src/icon\\pnlall.png"));
        txt.setIcon(new ImageIcon("src/icon\\pnlCTPS.png"));
        lblDMKNen.setIcon(new ImageIcon("src/icon\\pnlDoiMatKhau.png"));
        lblThongKeNen.setIcon(new ImageIcon("src/icon\\pnlall.png"));
        btnNen.setIcon(new ImageIcon("src/icon\\pnlCaiDat.png"));

        cheDo = "0";
    }

    void Dem() {
        Color br = new Color(54, 54, 54);
        Color pnl = new Color(105, 105, 105);
        Color chu = new Color(255, 255, 255);
        Color R = new Color(151, 211, 236);
        Color E = new Color(228, 234, 236);
        Mode(br, pnl, chu);
        ModeC(R);
        ModeB(E);
        lblNenChinh.setIcon(new ImageIcon("src/icon\\manghinhchinh.png"));
        lblMHCnho.setIcon(new ImageIcon("src/icon\\pnl2.png"));
        lblMHCnho1.setIcon(new ImageIcon("src/icon\\pnl2.png"));
        lblQLPngoai.setIcon(new ImageIcon("src/icon\\pnl2.png"));
        lblQLPtrong.setIcon(new ImageIcon("src/icon\\pnlQLPD.png"));
        lblQLSVNenDS.setIcon(new ImageIcon("src/icon\\pnl2.png"));
        lblQLSVNenCN.setIcon(new ImageIcon("src/icon\\pnlQLSVD.png"));
        lblQLSVNenNgoai.setIcon(new ImageIcon("src/icon\\pnl2.png"));
        lblQLNVNenNgoai.setIcon(new ImageIcon("src/icon\\pnl2.png"));
        lblQLNVNenTrong.setIcon(new ImageIcon("src/icon\\pnlQLNVD.png"));
        lblCTPNenNgoai.setIcon(new ImageIcon("src/icon\\pnl2.png"));
        txt.setIcon(new ImageIcon("src/icon\\pnlCTPD.png"));
        lblDMKNen.setIcon(new ImageIcon("src/icon\\pnlDoiMatKhau2.png"));
        lblThongKeNen.setIcon(new ImageIcon("src/icon\\pnl2.png"));
        btnNen.setIcon(new ImageIcon("src/icon\\pnlCaiDatD.png"));

        cheDo = "1";
    }

    void ModeC(Color R) {
        txtDMKNhanVien.setBackground(R);
        txtDMKMatKhauM.setBackground(R);
        txtDMKXacNhan.setBackground(R);
    }

    void ModeB(Color E) {
        txtQLNVTaiKhoan.setBackground(E);
        txtQLNVMatKhau.setBackground(E);
        txtQLNVxacNhanMK.setBackground(E);
        txtQLNVEmail.setBackground(E);
        txtQLNVHoTen.setBackground(E);
        txtQLSVMasv.setBackground(E);
        txtQLSVTenSV.setBackground(E);
        txtQLSVSDT.setBackground(E);
        txtQLSVNgayDK.setBackground(E);
        txtQLSVNgayHetHan.setBackground(E);
        txtQLSVGhiChu.setBackground(E);
        txtQLSVTimKiem.setBackground(E);
        txtQLSVGhiChu.setBackground(E);
        txtCTPMsv.setBackground(E);
        txtCTPHoTen.setBackground(E);
        txtCTPDaDong.setBackground(E);
        txtCTPTienDong.setBackground(E);
        txt.setBackground(E);
        txtQLPMaPhong.setBackground(E);
        txtQLPTenPhong.setBackground(E);
        txtQLPNgayThem.setBackground(E);
        txtQLPGhiChu.setBackground(E);

    }

    void Mode(Color Background, Color pnl, Color mauChu) {

        pnlP1.setBackground(pnl);
        pnlP2.setBackground(pnl);
        pnlP3.setBackground(pnl);
        pnlP4.setBackground(pnl);
        pnlP5.setBackground(pnl);
        pnlP6.setBackground(pnl);
        pnlP7.setBackground(pnl);
        pnlP8.setBackground(pnl);
        pnlP9.setBackground(pnl);
        pnlP10.setBackground(pnl);
        pnlP11.setBackground(pnl);
        pnlP12.setBackground(pnl);

        pnlGiaoDienChinh.setBackground(Background);
        pnlP1Ten.setForeground(mauChu);
        pnlP2Ten.setForeground(mauChu);
        pnlP3Ten.setForeground(mauChu);
        pnlP4Ten.setForeground(mauChu);
        pnlP5Ten.setForeground(mauChu);
        pnlP6Ten.setForeground(mauChu);
        pnlP7Ten.setForeground(mauChu);
        pnlP8Ten.setForeground(mauChu);
        pnlP9Ten.setForeground(mauChu);
        pnlP10Ten.setForeground(mauChu);
        pnlP11Ten.setForeground(mauChu);
        pnlP12Ten.setForeground(mauChu);

        pnlP1SoSV.setForeground(mauChu);
        pnlP2SoSV.setForeground(mauChu);
        pnlP3SoSV.setForeground(mauChu);
        pnlP4SoSV.setForeground(mauChu);
        pnlP5SoSV.setForeground(mauChu);
        pnlP6SoSV.setForeground(mauChu);
        pnlP7SoSV.setForeground(mauChu);
        pnlP8SoSV.setForeground(mauChu);
        pnlP9SoSV.setForeground(mauChu);
        pnlP10SoSV.setForeground(mauChu);
        pnlP11SoSV.setForeground(mauChu);
        pnlP12SoSV.setForeground(mauChu);

        pnlP1NgayThem.setForeground(mauChu);
        pnlP2NgayThem.setForeground(mauChu);
        pnlP3NgayThem.setForeground(mauChu);
        pnlP4NgayThem.setForeground(mauChu);
        pnlP5NgayThem.setForeground(mauChu);
        pnlP6NgayThem.setForeground(mauChu);
        pnlP7NgayThem.setForeground(mauChu);
        pnlP8NgayThem.setForeground(mauChu);
        pnlP9NgayThem.setForeground(mauChu);
        pnlP10NgayThem.setForeground(mauChu);
        pnlP11NgayThem.setForeground(mauChu);
        pnlP12NgayThem.setForeground(mauChu);

        pnlP1GhiChu.setForeground(mauChu);
        pnlP2GhiChu.setForeground(mauChu);
        pnlP3GhiChu.setForeground(mauChu);
        pnlP4GhiChu.setForeground(mauChu);
        pnlP5GhiChu.setForeground(mauChu);
        pnlP6GhiChu.setForeground(mauChu);
        pnlP7GhiChu.setForeground(mauChu);
        pnlP8GhiChu.setForeground(mauChu);
        pnlP9GhiChu.setForeground(mauChu);
        pnlP10GhiChu.setForeground(mauChu);
        pnlP11GhiChu.setForeground(mauChu);
        pnlP12GhiChu.setForeground(mauChu);
        ///////////////////////////////////////////
        btnQuanLyNhanVien.setBackground(pnl);
        btnQuanLySinhVien.setBackground(pnl);
        btnQuanLyPhong.setBackground(pnl);
        btnTrangChu.setBackground(pnl);
        btnCaiDat.setBackground(pnl);
        btnThongKe.setBackground(pnl);
        btnThoat.setBackground(pnl);
    }

    public void setVisiblePnl(JPanel pnl) {
        pnlGiaoDienChinh.setVisible(false);
        pnlGiaoDienChinh2.setVisible(false);
        pnlChiTietPhong.setVisible(false);
        pnlQuanLyPhong.setVisible(false);
        pnlQuanLySV.setVisible(false);
        pnlQuanLyNV.setVisible(false);
        pnlThongKe.setVisible(false);
        pnlDoiMatKhau.setVisible(false);
        pnlCaiDat.setVisible(false);
        pnl.setVisible(true);
        /////////////////////////////////////
        if (pDao.select().size() == 1) {
            openTrangChu(pDao.select(), pnlP1);
        } else if (pDao.select().size() == 2) {
            openTrangChu(pDao.select(), pnlP1, pnlP2);
        } else if (pDao.select().size() == 3) {
            openTrangChu(pDao.select(), pnlP1, pnlP2, pnlP3);
        } else if (pDao.select().size() == 4) {
            openTrangChu(pDao.select(), pnlP1, pnlP2, pnlP3, pnlP4);
        } else if (pDao.select().size() == 5) {
            openTrangChu(pDao.select(), pnlP1, pnlP2, pnlP3, pnlP4, pnlP5);
        } else if (pDao.select().size() == 6) {
            openTrangChu(pDao.select(), pnlP1, pnlP2, pnlP3, pnlP4, pnlP5, pnlP6);
        } else if (pDao.select().size() == 7) {
            openTrangChu(pDao.select(), pnlP1, pnlP2, pnlP3, pnlP4, pnlP5, pnlP6, pnlP7);
        } else if (pDao.select().size() == 8) {
            openTrangChu(pDao.select(), pnlP1, pnlP2, pnlP3, pnlP4, pnlP5, pnlP6, pnlP7, pnlP8);
        } else if (pDao.select().size() == 9) {
            openTrangChu(pDao.select(), pnlP1, pnlP2, pnlP3, pnlP4, pnlP5, pnlP6, pnlP7, pnlP8, pnlP9);
        } else if (pDao.select().size() == 10) {
            openTrangChu(pDao.select(), pnlP1, pnlP2, pnlP3, pnlP4, pnlP5, pnlP6, pnlP7, pnlP8, pnlP9, pnlP10);
        } else if (pDao.select().size() == 11) {
            openTrangChu(pDao.select(), pnlP1, pnlP2, pnlP3, pnlP4, pnlP5, pnlP6, pnlP7, pnlP8, pnlP9, pnlP10, pnlP11);
        } else if (pDao.select().size() == 12) {
            openTrangChu(pDao.select(), pnlP1, pnlP2, pnlP3, pnlP4, pnlP5, pnlP6, pnlP7, pnlP8, pnlP9, pnlP10, pnlP11, pnlP12);
        }
    }

    void DangXuat() {
        Auth.user = null;
        new Login(this, true).setVisible(true);
    }
    //////////////////////////////////////////////////////////////////////////////////

    TaiKhoanDao tkDao = new TaiKhoanDao();
    NhoTaiKhoanDao ntkDao = new NhoTaiKhoanDao();
    PhongDao pDao = new PhongDao();
    SinhVienDao svDao = new SinhVienDao();

    String cheDo = "";
    String nhac = "";

    //////////////////////////////////////////////////////////////////////////////////
    public void doiMK() {
        if (txtDMKMatKhauM.getText().equals("")) {
            lblKetQuaDMK.setText("Không được bỏ trống mật khẩu !");
        } else if (!txtDMKXacNhan.getText().equals(txtDMKMatKhauM.getText())) {
            lblKetQuaDMK.setText("Xác nhận mật khẩu không khớp !");
        } else if (txtDMKMatKhauM.getText().equals(Auth.user.getMatKhau())) {
            lblKetQuaDMK.setText("Không được trùng với mật khẩu hiện tại !");
        } else {
            lblKetQuaDMK.setText("");
            if (txtDMKMatKhauM.getText().equals(txtDMKXacNhan.getText())) {

                TaiKhoan model = new TaiKhoan();
                model.setMatKhau(txtDMKMatKhauM.getText());
                model.setTaiKhoan(Auth.user.getTaiKhoan());
                tkDao.DoiMK(model);
                Auth.user.setMatKhau(model.getMatKhau());
                lblKetQuaDMK.setText("Đổi mật khẩu thành công");
                txtDMKMatKhauM.setText("");
                txtDMKXacNhan.setText("");
            }
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////
    Thread MP3 = new LuongMP3("src/nhac.mp3");

    void playMP3() {
        if (btnCDBatTat.getText().equals("Tắt")) {
            this.MP3.stop();
            btnCDBatTat.setText("Bật");
            nhac = "0";
        } else {
            this.MP3 = new LuongMP3("src/nhac.mp3");
            MP3.start();
            btnCDBatTat.setText("Tắt");
            nhac = "1";
        }
    }
////////////////////////////Form QLNV//////////////////////////////////////////////////////

    public void LoadTableTaiKhoan() {
        DefaultTableModel model = (DefaultTableModel) tblQLNV.getModel();
        model.setRowCount(0);
        List<TaiKhoan> list = tkDao.select();
        for (TaiKhoan taiKhoan : list) {
            model.addRow(new Object[]{
                taiKhoan.getTaiKhoan(), taiKhoan.getMatKhau(), taiKhoan.getEmail(), taiKhoan.getHoTen(), taiKhoan.isVaiTro() ? "Quản lý" : "Nhân viên"
            });
        }
        tblQLNV.setModel(model);
    }

    public void ClickTableNhanVien() {
        int vitri = tblQLNV.getSelectedRow();
        if (vitri >= 0) {
            LamMoiFormQLNV();
            txtQLNVTaiKhoan.setText(tblQLNV.getValueAt(vitri, 0) + "");
            txtQLNVMatKhau.setText(tblQLNV.getValueAt(vitri, 1) + "");
            txtQLNVxacNhanMK.setText(tblQLNV.getValueAt(vitri, 1) + "");
            txtQLNVEmail.setText(tblQLNV.getValueAt(vitri, 2) + "");
            txtQLNVHoTen.setText(tblQLNV.getValueAt(vitri, 3) + "");
            if (tblQLNV.getValueAt(vitri, 4).equals("Quản lý")) {
                rdoQLNVQuanLy.setSelected(true);
            } else {
                rdoQLNVNhanVien.setSelected(true);
            }
            //////////////////////////////////////////////////////////
            tabsQLNV.setSelectedIndex(0);
            /////////////////////////////////////////////////////////
            btnQLNVThem.setEnabled(false);
            btnQLNVCapNhat.setEnabled(true);
            btnQLNVXoa.setEnabled(true);

            txtQLNVTaiKhoan.setEditable(false);
        }
    }

    void LamMoiFormQLNV() {
        txtQLNVTaiKhoan.setText("");
        txtQLNVMatKhau.setText("");
        txtQLNVxacNhanMK.setText("");
        txtQLNVEmail.setText("");
        txtQLNVHoTen.setText("");

        txtQLNVTaiKhoan.setEditable(true);
        // txtQLNVTaiKhoan.requestFocus();
        btnQLNVThem.setEnabled(true);
        btnQLNVCapNhat.setEnabled(false);
        btnQLNVXoa.setEnabled(false);

        rdoQLNVQuanLy.setSelected(true);
        /////////////////////////////////////
        lblTBtxtQLNVTaiKhoan.setText("");
        tblTBtxtQLNVMatKHau.setText("");
        lblTBtxtQLNVXacNhanmk.setText("");
        lblTBtxtQLNVEmail.setText("");
        lblTBtxtQLNVHoTen.setText("");
    }

    TaiKhoan getFormQLNV() {
        TaiKhoan model = new TaiKhoan();
        model.setTaiKhoan(txtQLNVTaiKhoan.getText());
        model.setMatKhau(txtQLNVMatKhau.getText());
        model.setEmail(txtQLNVEmail.getText());
        model.setHoTen(txtQLNVHoTen.getText());
        model.setVaiTro(rdoQLNVQuanLy.isSelected());
        return model;
    }

    void ThemTaiKhoanNhanVien() {
        if (btnQLNVThem.isEnabled()) {
            if (tkDao.findById(txtQLNVTaiKhoan.getText()) == null) {
                lblTBtxtQLNVTaiKhoan.setText("");
                if (checkFormQLNV()) {
                    tkDao.insert(getFormQLNV());
                    LoadTableTaiKhoan();
                    tabsQLNV.setSelectedIndex(1);
                }
            } else {
                checkFormQLNV();
                lblTBtxtQLNVTaiKhoan.setText("* Tài khoản này đã có !");

            }
        }
    }

    void UpdateTaiKhoanNhanVien() {
        if (btnQLNVCapNhat.isEnabled()) {
            if (checkFormQLNV()) {
                tkDao.update(getFormQLNV());

                LoadTableTaiKhoan();
                tabsQLNV.setSelectedIndex(1);
                if (txtQLNVTaiKhoan.getText().equals(Auth.user.getTaiKhoan())) {
                    Auth.user = getFormQLNV();
                }
            }
        }
    }

    void XoaTaiKhoanNhanVien() {
        if (btnQLNVXoa.isEnabled()) {
            if (DialogHelper.confirm(this, "Xóa tài khoản " + txtQLNVTaiKhoan.getText() + " ?")) {
                if (txtQLNVTaiKhoan.getText().equals(Auth.user.getTaiKhoan())) {
                    DialogHelper.alert(this, "Lỗi, Không thể tự xóa tài khoản !");
                } else {
                    tkDao.delete(txtQLNVTaiKhoan.getText());
                    LamMoiFormQLNV();
                    LoadTableTaiKhoan();
                    tabsQLNV.setSelectedIndex(1);
                }
            }
        }
    }

    boolean checkFormQLNV() {
        boolean check = true;
        if (txtQLNVTaiKhoan.getText().equals("")) {
            lblTBtxtQLNVTaiKhoan.setText("* Không được bỏ trống tài khoản !");
            check = false;
        } else {
            lblTBtxtQLNVTaiKhoan.setText("");
        }

        if (txtQLNVMatKhau.getText().equals("")) {
            tblTBtxtQLNVMatKHau.setText("* Không được bỏ trống mật khẩu !");
            check = false;
        } else {
            tblTBtxtQLNVMatKHau.setText("");
        }

        if (!txtQLNVxacNhanMK.getText().equals(txtQLNVMatKhau.getText())) {
            lblTBtxtQLNVXacNhanmk.setText("* Xác nhận mật khẩu không khớp !");
            check = false;
        } else {
            lblTBtxtQLNVXacNhanmk.setText("");
        }

        if (!txtQLNVEmail.getText().matches("^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$")) {
            lblTBtxtQLNVEmail.setText("* Email không đúng định dạng !");
            check = false;
        } else {
            lblTBtxtQLNVEmail.setText("");
        }

        if (txtQLNVHoTen.getText().equals("")) {
            lblTBtxtQLNVHoTen.setText("* Không được bỏ trống họ tên !");
            check = false;
        } else {
            lblTBtxtQLNVHoTen.setText("");
        }
        return check;
    }
    ///////////////Ket thuc Form QLNV////////////////////////////////////////////////////

    //////////////Form QL Phong////////////////////////////////////////////////////////////
    void LamMoiFormQLP() {
        txtQLPMaPhong.setText("");
        txtQLPTenPhong.setText("");
        txtQLPNgayThem.setText("");
        txtQLPGhiChu.setText("");

        btnQLPThem.setEnabled(true);
        btnQLPCapNhat.setEnabled(false);
        btnQLPXoa.setEnabled(false);

        txtQLPMaPhong.setEditable(true);
        /////////////////////////////////////
        lblTBtxtQLPMaP.setText("");
        lblTBtxtQLPTenP.setText("");
        lblTBtxtQLPNgayThem.setText("");
        lblQLPSoSV.setText("0");

        txtQLPNgayThem.setText(xDate.toString(new Date(), "dd/MM/yyyy"));

    }

    boolean checkFormQLP() {
        boolean check = true;
        if (txtQLPMaPhong.getText().equals("")) {
            lblTBtxtQLPMaP.setText("* Không được trống mã phòng !");
            check = false;
        } else if (!txtQLPMaPhong.getText().matches("\\d+")) {
            lblTBtxtQLPMaP.setText("* Mã phòng phải là số !");
            check = false;
        } else {
            lblTBtxtQLPMaP.setText("");
        }
        if (txtQLPTenPhong.getText().equals("")) {
            lblTBtxtQLPTenP.setText("* Không được trống tên phòng !");
            check = false;
        } else {
            lblTBtxtQLPTenP.setText("");
        }
        return check;
    }

    void ThemPhong() {
        if (btnQLPThem.isEnabled()) {
            if (checkFormQLP()) {
                if (pDao.findById(Integer.valueOf(txtQLPMaPhong.getText())) == null) {
                    lblTBtxtQLPMaP.setText("");
                    pDao.insert(getFormQLP());
                    loadTableQLP();
                    tabsQLP.setSelectedIndex(1);
                } else {
                    lblTBtxtQLPMaP.setText("* Mã phòng đã tồn tại !");
                }
            }
        }
    }

    public void loadTableQLP() {
        DefaultTableModel model = (DefaultTableModel) tblQLPPhong.getModel();
        model.setRowCount(0);
        List<Phong> list = pDao.select();
        for (Phong phong : list) {
            model.addRow(new Object[]{
                phong.getMaPhong(), phong.getTenPhong(), pDao.SoLuongSV(phong.getMaPhong()), xDate.toString(phong.getNgayThem(), "dd/MM/yyyy"), phong.getGhiChu()
            });
        }
        tblQLPPhong.setModel(model);
    }

    public void ClickTablePhong() {
        int vitri = tblQLPPhong.getSelectedRow();
        if (vitri >= 0) {
            LamMoiFormQLP();
            txtQLPMaPhong.setText(tblQLPPhong.getValueAt(vitri, 0) + "");
            txtQLPTenPhong.setText(tblQLPPhong.getValueAt(vitri, 1) + "");
            lblQLPSoSV.setText(tblQLPPhong.getValueAt(vitri, 2) + "");
            txtQLPNgayThem.setText(tblQLPPhong.getValueAt(vitri, 3) + "");
            txtQLPGhiChu.setText(tblQLPPhong.getValueAt(vitri, 4) + "");

            //////////////////////////////////////////////////////////
            tabsQLP.setSelectedIndex(0);
            /////////////////////////////////////////////////////////
            btnQLPThem.setEnabled(false);
            btnQLPCapNhat.setEnabled(true);
            btnQLPXoa.setEnabled(true);

            txtQLPMaPhong.setEditable(false);
        }
    }

    void UpdatePhong() {
        if (btnQLPCapNhat.isEnabled()) {
            if (checkFormQLP()) {
                pDao.update(getFormQLP());
                loadTableQLP();
                tabsQLP.setSelectedIndex(1);
            }
        }
    }

    void XoaPhong() {
        if (btnQLPXoa.isEnabled()) {
            if (DialogHelper.confirm(this, "Xóa phòng " + txtQLPMaPhong.getText() + " ?")) {
                if (Integer.valueOf(pDao.SoLuongSV(Integer.valueOf(txtQLPMaPhong.getText()))) == 0) {
                    pDao.delete(Integer.valueOf(txtQLPMaPhong.getText()));
                    LamMoiFormQLP();
                    loadTableQLP();
                    tabsQLP.setSelectedIndex(1);
                } else {
                    DialogHelper.alert(this, "Không thể xóa phòng đang có sinh viên !");
                }
            }
        }
    }

    Phong getFormQLP() {
        Phong model = new Phong();
        model.setMaPhong(Integer.valueOf(txtQLPMaPhong.getText()));
        model.setTenPhong(txtQLPTenPhong.getText());
        model.setNgayThem(xDate.toDate(txtQLPNgayThem.getText(), "dd/MM/yyyy"));
        model.setGhiChu(txtQLPGhiChu.getText());
        return model;
    }
    /////////////////////////////Ket Thuc Form QLP/////////////////////////

    /////////////////////Form QLSV////////////////////////////
    void loadQLSVCBOmaP() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        List<Phong> list = pDao.select();
        for (Phong p : list) {
            model.addElement(p);
        }
        cboQLSVMaP.setModel(model);
    }

    void LamMoiFormQLSV() {
        txtQLSVMasv.setText("");
        txtQLSVTenSV.setText("");
        txtQLSVSDT.setText("");
        txtQLSVNgayDK.setText("");
        txtQLSVNgayHetHan.setText("");
        txtQLSVGhiChu.setText("");
        btnQLPThem.setEnabled(true);

        rdoQLSVNam.setSelected(true);

        btnQLSVCapNhat.setEnabled(false);
        btnQLSVXoa.setEnabled(false);
        btnQLSVThem.setEnabled(true);
        txtQLSVMasv.setEditable(true);
        /////////////////////////////////////
        lblTBtxtQLSVmasv.setText("");
        lblTBtxtQLSVtensv.setText("");
        lblTBtxtQLSVsdt.setText("");
        lblTBtxtQLSVngayhethan.setText("");
        txtQLSVNgayDK.setText(xDate.toString(new Date(), "dd/MM/yyyy"));
        txtQLSVNgayDK.setEditable(false);
    }

    public boolean checkFormQLSV() {
        boolean check = true;
        if (txtQLSVMasv.getText().equals("")) {
            lblTBtxtQLSVmasv.setText("* Không được trống mã sinh viên !");
            check = false;
        } else {
            lblTBtxtQLSVmasv.setText("");
        }
        if (!txtQLSVSDT.getText().matches("\\d+{9,10}")) {
            lblTBtxtQLSVsdt.setText("* Số điện thoại không đúng định dạng !");
            check = false;
        } else {
            lblTBtxtQLSVsdt.setText("");
        }
        if (txtQLSVTenSV.getText().equals("")) {
            lblTBtxtQLSVtensv.setText("* Không được trống tên sinh viên !");
            check = false;
        } else {
            lblTBtxtQLSVtensv.setText("");
        }
        try {
            DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
            double ngayHH = Double.parseDouble(formatter.format(xDate.toDate(txtQLSVNgayHetHan.getText(), "dd/MM/yyyy")));
            System.out.println(ngayHH);
            double ngayDK = Double.parseDouble(formatter.format(xDate.toDate(txtQLSVNgayDK.getText(), "dd/MM/yyyy")));

            System.out.println(ngayDK - ngayHH);
            boolean a = ngayDK - ngayHH >= 0;
            if (a) {
                lblTBtxtQLSVngayhethan.setText("* ngày hết hạn phải sau ngày đk !");
                return false;
            } else {
                lblTBtxtQLSVngayhethan.setText("");
            }
        } catch (Exception e) {
            System.out.println(e);
            lblTBtxtQLSVngayhethan.setText("* ngày hết hạn không hợp lệ !");
        }
        return check;
    }

    SinhVien getFormSV() {
        SinhVien model = new SinhVien();
        model.setMaSinhVien(txtQLSVMasv.getText());
        model.setTenSinhVien(txtQLSVTenSV.getText());
        model.setDiaChi(txtQLSVGhiChu.getText());
        model.setSDT(txtQLSVSDT.getText());
        model.setNgayDK(xDate.toDate(txtQLSVNgayDK.getText(), "dd/MM/yyyy"));
        model.setNgayHetHan(xDate.toDate(txtQLSVNgayHetHan.getText(), "dd/MM/yyyy"));
        model.setGioTinh(rdoQLSVNam.isSelected());
        String maP = cboQLSVMaP.getSelectedItem() + "";
        System.out.println(maP);

       

        model.setMaPhong(Integer.valueOf(maP));
        return model;
    }

    public void ThemSinhVien() {
        if (btnQLSVThem.isEnabled()) {

            if (checkFormQLSV()) {
                if (svDao.KiemTraTonTai(txtQLSVMasv.getText()) == null) {
                    lblTBtxtQLSVmasv.setText("");
                    try {

                        svDao.insert(getFormSV());
                        loadTableQLSV();
                        tabsQLSV.setSelectedIndex(1);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                } else {
                    lblTBtxtQLSVmasv.setText("* Mã sinh viên đã tồn tại !");
                }
            }
        }
    }

    public void loadTableQLSV() {
        DefaultTableModel model = (DefaultTableModel) tblQLSV.getModel();
        model.setRowCount(0);
        List<SinhVien> list = svDao.select();
        for (SinhVien sv : list) {
            model.addRow(new Object[]{
                sv.getMaSinhVien(), sv.getTenSinhVien(), sv.getSDT(), sv.isGioTinh() ? "Nam" : "Nữ", xDate.toString(sv.getNgayDK(), "dd/MM/yyyy"), xDate.toString(sv.getNgayHetHan(), "dd/MM/yyyy"), sv.getMaPhong(), sv.getDiaChi()
            });
        }
        tblQLSV.setModel(model);
    }

    public void loadTableQLSVTim() {
        DefaultTableModel model = (DefaultTableModel) tblQLSV.getModel();
        model.setRowCount(0);
        List<SinhVien> list = svDao.Tim(txtQLSVTimKiem.getText());
        for (SinhVien sv : list) {
            model.addRow(new Object[]{
                sv.getMaSinhVien(), sv.getTenSinhVien(), sv.getSDT(), sv.getDiaChi(), sv.isGioTinh() ? "Nam" : "Nữ", xDate.toString(sv.getNgayDK(), "dd/MM/yyyy"), xDate.toString(sv.getNgayHetHan(), "dd/MM/yyyy"), sv.getMaPhong()
            });
        }
        tblQLSV.setModel(model);
    }

    public void ClickTableSV() {
        int vitri = tblQLSV.getSelectedRow();
        if (vitri >= 0) {
            LamMoiFormQLSV();
            txtQLSVMasv.setText(tblQLSV.getValueAt(vitri, 0) + "");
            txtQLSVTenSV.setText(tblQLSV.getValueAt(vitri, 1) + "");
            txtQLSVSDT.setText(tblQLSV.getValueAt(vitri, 2) + "");

            rdoQLSVNam.setSelected(tblQLSV.getValueAt(vitri, 3).equals("Nam") ? true : false);
            txtQLSVNgayDK.setText(tblQLSV.getValueAt(vitri, 4) + "");
            txtQLSVNgayHetHan.setText(tblQLSV.getValueAt(vitri, 5) + "");

            Phong p = pDao.findById(Integer.valueOf(tblQLSV.getValueAt(vitri, 6) + ""));
            txtQLSVGhiChu.setText(tblQLSV.getValueAt(vitri, 7).toString());
            List<Phong> list = pDao.select();
            int index = 0;
            for (Phong phong : list) {
                if (phong.getMaPhong() == p.getMaPhong()) {
                    index = list.indexOf(phong);
                }
            }
            cboQLSVMaP.setSelectedIndex(index);
            //////////////////////////////////////////////////////////
            tabsQLSV.setSelectedIndex(0);
            /////////////////////////////////////////////////////////
            btnQLSVThem.setEnabled(false);
            btnQLSVCapNhat.setEnabled(true);
            btnQLSVXoa.setEnabled(true);

            txtQLSVMasv.setEditable(false);
        }
    }

    void UpdateSinhVien() {
        if (btnQLSVCapNhat.isEnabled()) {
            if (checkFormQLSV()) {
                svDao.update(getFormSV());
                LamMoiFormQLSV();
                loadTableQLSV();
                tabsQLSV.setSelectedIndex(1);
            }
        }
    }

    void XoaSinhVien() {
        try {
            svDao.delete(Integer.valueOf(txtQLSVMasv.getText()));
            loadTableQLSV();
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi");
        }
    }

///////////////////////////////////////////////////////Trang chu////////////////////
    String[] MangModel(String... model) {
        String[] array = {"", "", "", ""};
        for (int i = 0; i < 4; i++) {
            array[i] = model[i];
        }
        return array;
    }

    void openTrangChu(List<Phong> a, JPanel... b) {
        pnlP1.setVisible(false);
        pnlP2.setVisible(false);
        pnlP3.setVisible(false);
        pnlP4.setVisible(false);
        pnlP5.setVisible(false);
        pnlP6.setVisible(false);
        ///Trang 2
        pnlP7.setVisible(false);
        pnlP8.setVisible(false);
        pnlP9.setVisible(false);
        pnlP10.setVisible(false);
        pnlP11.setVisible(false);
        pnlP12.setVisible(false);
        int dem = 0;

        for (Phong list : a) {
            b[dem].setVisible(true);
            String[] model = MangModel(list.getTenPhong(), "Số lượng SV đang ở  : " + pDao.SoLuongSV(list.getMaPhong()), "Ngày thêm :   " + list.getNgayThem(), "Ghi chú :   " + list.getGhiChu());
            if (dem == 0) {
                // setpnlP1(list.getTenPhong(), pDao.SoLuongSV(list.getMaPhong()), list.getNgayThem(), list.getGhiChu());
                setpnlP(model, pnlP1Ten, pnlP1SoSV, pnlP1NgayThem, pnlP1GhiChu);
            } else if (dem == 1) {
                setpnlP(model, pnlP2Ten, pnlP2SoSV, pnlP2NgayThem, pnlP2GhiChu);
            } else if (dem == 2) {
                setpnlP(model, pnlP3Ten, pnlP3SoSV, pnlP3NgayThem, pnlP3GhiChu);
            } else if (dem == 3) {
                setpnlP(model, pnlP4Ten, pnlP4SoSV, pnlP4NgayThem, pnlP4GhiChu);
            } else if (dem == 4) {
                setpnlP(model, pnlP5Ten, pnlP5SoSV, pnlP5NgayThem, pnlP5GhiChu);
            } else if (dem == 5) {
                setpnlP(model, pnlP6Ten, pnlP6SoSV, pnlP6NgayThem, pnlP6GhiChu);
            } else if (dem == 6) {
                setpnlP(model, pnlP7Ten, pnlP7SoSV, pnlP7NgayThem, pnlP7GhiChu);
            } else if (dem == 7) {
                setpnlP(model, pnlP8Ten, pnlP8SoSV, pnlP8NgayThem, pnlP8GhiChu);
            } else if (dem == 8) {
                setpnlP(model, pnlP9Ten, pnlP9SoSV, pnlP9NgayThem, pnlP9GhiChu);
            } else if (dem == 9) {
                setpnlP(model, pnlP10Ten, pnlP10SoSV, pnlP10NgayThem, pnlP10GhiChu);
            } else if (dem == 10) {
                setpnlP(model, pnlP11Ten, pnlP11SoSV, pnlP11NgayThem, pnlP11GhiChu);
            } else if (dem == 11) {
                setpnlP(model, pnlP12Ten, pnlP12SoSV, pnlP12NgayThem, pnlP12GhiChu);
            }
            dem++;
        }
        if (dem >= 6) {
            btnTrang2.setVisible(true);
        } else {
            btnTrang2.setVisible(false);
        }
    }

    void setpnlP(String[] model, JLabel... lbl) {
        for (int i = 0; i < 4; i++) {
            lbl[i].setText(model[i]);
        }
    }

    void clickPNL(int index) {
        List<Phong> list = pDao.select();
        LoadTableChiTietP(list.get(index).getMaPhong());
        loadCBOchitietP();
        cboChitietP.setSelectedIndex(index);
        setVisiblePnl(pnlChiTietPhong);
        tabsChiTietP.setSelectedIndex(1);
    }
///////////////////////////////////////////chi tiet phog/////////

    void LoadTableChiTietP(int map) {
        DefaultTableModel model = (DefaultTableModel) tblChiTietP.getModel();
        model.setRowCount(0);
        List<Object[]> list = svDao.selectByMaP(map);
        int dem = 1;
        for (Object[] ob : list) {
            model.addRow(new Object[]{
                dem, ob[0], ob[1], ob[2] == null ? "Chưa nhập" : Integer.parseInt(ob[2] + ""), ob[3] == null ? "Chưa nhập" : Integer.parseInt(ob[3] + ""), ob[4]
            });
            dem++;
        }
        tblChiTietP.setModel(model);
    }

    void loadCBOchitietP() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        List<Phong> list = pDao.select();
        for (Phong phong : list) {
            model.addElement(phong);
        }
        cboChitietP.setModel(model);
    }

    boolean checkFormChiTiet() {
        String regex = "\\d+";
        boolean check = true;
        if (!txtCTPTienDong.getText().matches(regex)) {
            lblTBtxtTienDong.setText("* Tiền nhập không hợp lệ!");
            check = false;
        } else {
            lblTBtxtTienDong.setText("");
        }
        if (!txtCTPDaDong.getText().matches(regex)) {
            lblTBtxtDaDong.setText("* Tiền nhập không hợp lệ!");
            check = false;
        } else {
            lblTBtxtDaDong.setText("");
        }
        return check;
    }

    void ClickTableChitiet() {
        int vitri = tblChiTietP.getSelectedRow();
        if (vitri >= 0) {
            txtCTPMsv.setText(tblChiTietP.getValueAt(vitri, 1) + "");
            txtCTPHoTen.setText(tblChiTietP.getValueAt(vitri, 2) + "");

            txtCTPconlai.setText(tblChiTietP.getValueAt(vitri, 5) + "");

            if (tblChiTietP.getValueAt(vitri, 3).equals("Chưa nhập")) {
                txtCTPTienDong.setText("");
            } else {
                txtCTPTienDong.setText(tblChiTietP.getValueAt(vitri, 3) + "");
            }
            if (tblChiTietP.getValueAt(vitri, 4).equals("Chưa nhập")) {
                txtCTPDaDong.setText("");
            } else {
                txtCTPDaDong.setText(tblChiTietP.getValueAt(vitri, 4) + "");
            }
            tabsChiTietP.setSelectedIndex(0);
        }
    }

    void capNhapChiTiet() {
        if (checkFormChiTiet()) {
            SinhVien sv = new SinhVien();
            sv.setMaSinhVien(txtCTPMsv.getText());
            sv.setTienDong(Integer.parseInt(txtCTPTienDong.getText()));
            sv.setTienDaDong(Integer.parseInt(txtCTPDaDong.getText()));
            svDao.updateChiTiet(sv);
            tabsChiTietP.setSelectedIndex(1);

            List<Phong> list = pDao.select();

            LoadTableChiTietP(list.get(cboChitietP.getSelectedIndex()).getMaPhong());
        }
    }

    void clickCBOchitietP() {
        List<Phong> list = pDao.select();
        LoadTableChiTietP(list.get(cboChitietP.getSelectedIndex()).getMaPhong());
    }

    //////////////////THongKe////////////////
    ThongKeDAO tkedao = new ThongKeDAO();

    void loadtblThongKe() {

        DefaultTableModel model = (DefaultTableModel) tblThongKe.getModel();

        model.setRowCount(0);
        List<Object[]> list = tkedao.selectSinhVien();
        for (Object[] ob : list) {
            model.addRow(new Object[]{
                ob[0], ob[1], ob[2], ob[3]
            });
        }
        tblThongKe.setModel(model);
        tblThongKe.getColumnModel().getColumn(0).setPreferredWidth(5);
        tblThongKe.getColumnModel().getColumn(1).setPreferredWidth(120);
        tblThongKe.getColumnModel().getColumn(2).setPreferredWidth(120);
        tblThongKe.getColumnModel().getColumn(3).setPreferredWidth(120);
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
            java.util.logging.Logger.getLogger(CuaSoChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CuaSoChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CuaSoChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CuaSoChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CuaSoChinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrdoQLSV;
    private javax.swing.JLabel btnCDBatTat;
    private javax.swing.JLabel btnCDDangXuat;
    private javax.swing.JLabel btnCDDem;
    private javax.swing.JLabel btnCDDoiMK;
    private javax.swing.JLabel btnCDNgay;
    private javax.swing.JLabel btnCTPCapNhat;
    private javax.swing.JButton btnCaiDat;
    private javax.swing.JLabel btnDMKHuy;
    private javax.swing.JLabel btnDMKXacNhan;
    private javax.swing.JLabel btnNen;
    private javax.swing.JLabel btnQLNVCapNhat;
    private javax.swing.JLabel btnQLNVMoi;
    private javax.swing.JLabel btnQLNVThem;
    private javax.swing.JLabel btnQLNVXoa;
    private javax.swing.JLabel btnQLPCapNhat;
    private javax.swing.JLabel btnQLPChiTiet;
    private javax.swing.JLabel btnQLPMoi;
    private javax.swing.JLabel btnQLPThem;
    private javax.swing.JLabel btnQLPXoa;
    private javax.swing.JLabel btnQLSVCapNhat;
    private javax.swing.JLabel btnQLSVMoi;
    private javax.swing.JLabel btnQLSVThem;
    private javax.swing.JLabel btnQLSVXoa;
    private javax.swing.JButton btnQuanLyNhanVien;
    private javax.swing.JButton btnQuanLyPhong;
    private javax.swing.JButton btnQuanLySinhVien;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnTrang1;
    private javax.swing.JButton btnTrang2;
    private javax.swing.JButton btnTrangChu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboChitietP;
    private javax.swing.JComboBox<String> cboQLSVMaP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lblCTPNenNgoai;
    private javax.swing.JLabel lblDMKNen;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblKetQuaDMK;
    private javax.swing.JLabel lblKetQuaDMK1;
    private javax.swing.JLabel lblMHCnho;
    private javax.swing.JLabel lblMHCnho1;
    private javax.swing.JLabel lblNenChinh;
    private javax.swing.JLabel lblNgay;
    private javax.swing.JLabel lblQLNVNenNgoai;
    private javax.swing.JLabel lblQLNVNenTrong;
    private javax.swing.JLabel lblQLPSoSV;
    private javax.swing.JLabel lblQLPngoai;
    private javax.swing.JLabel lblQLPtrong;
    private javax.swing.JLabel lblQLSVNenCN;
    private javax.swing.JLabel lblQLSVNenDS;
    private javax.swing.JLabel lblQLSVNenNgoai;
    private javax.swing.JLabel lblQuanLyPhong1;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTBtxtDaDong;
    private javax.swing.JLabel lblTBtxtQLNVEmail;
    private javax.swing.JLabel lblTBtxtQLNVHoTen;
    private javax.swing.JLabel lblTBtxtQLNVTaiKhoan;
    private javax.swing.JLabel lblTBtxtQLNVXacNhanmk;
    private javax.swing.JLabel lblTBtxtQLPMaP;
    private javax.swing.JLabel lblTBtxtQLPNgayThem;
    private javax.swing.JLabel lblTBtxtQLPTenP;
    private javax.swing.JLabel lblTBtxtQLSVmasv;
    private javax.swing.JLabel lblTBtxtQLSVngayhethan;
    private javax.swing.JLabel lblTBtxtQLSVsdt;
    private javax.swing.JLabel lblTBtxtQLSVtensv;
    private javax.swing.JLabel lblTBtxtTienDong;
    private javax.swing.JLabel lblTen;
    private javax.swing.JLabel lblThongKeNen;
    private javax.swing.JLabel lblToday;
    private javax.swing.JPanel pnlCaiDat;
    private javax.swing.JPanel pnlChiTietPhong;
    private javax.swing.JPanel pnlDoiMatKhau;
    private javax.swing.JPanel pnlGiaoDienChinh;
    private javax.swing.JPanel pnlGiaoDienChinh2;
    private javax.swing.JPanel pnlP1;
    private javax.swing.JPanel pnlP10;
    private javax.swing.JLabel pnlP10GhiChu;
    private javax.swing.JLabel pnlP10NgayThem;
    private javax.swing.JLabel pnlP10SoSV;
    private javax.swing.JLabel pnlP10Ten;
    private javax.swing.JPanel pnlP11;
    private javax.swing.JLabel pnlP11GhiChu;
    private javax.swing.JLabel pnlP11NgayThem;
    private javax.swing.JLabel pnlP11SoSV;
    private javax.swing.JLabel pnlP11Ten;
    private javax.swing.JPanel pnlP12;
    private javax.swing.JLabel pnlP12GhiChu;
    private javax.swing.JLabel pnlP12NgayThem;
    private javax.swing.JLabel pnlP12SoSV;
    private javax.swing.JLabel pnlP12Ten;
    private javax.swing.JLabel pnlP1GhiChu;
    private javax.swing.JLabel pnlP1NgayThem;
    private javax.swing.JLabel pnlP1SoSV;
    private javax.swing.JLabel pnlP1Ten;
    private javax.swing.JPanel pnlP2;
    private javax.swing.JLabel pnlP2GhiChu;
    private javax.swing.JLabel pnlP2NgayThem;
    private javax.swing.JLabel pnlP2SoSV;
    private javax.swing.JLabel pnlP2Ten;
    private javax.swing.JPanel pnlP3;
    private javax.swing.JLabel pnlP3GhiChu;
    private javax.swing.JLabel pnlP3NgayThem;
    private javax.swing.JLabel pnlP3SoSV;
    private javax.swing.JLabel pnlP3Ten;
    private javax.swing.JPanel pnlP4;
    private javax.swing.JLabel pnlP4GhiChu;
    private javax.swing.JLabel pnlP4NgayThem;
    private javax.swing.JLabel pnlP4SoSV;
    private javax.swing.JLabel pnlP4Ten;
    private javax.swing.JPanel pnlP5;
    private javax.swing.JLabel pnlP5GhiChu;
    private javax.swing.JLabel pnlP5NgayThem;
    private javax.swing.JLabel pnlP5SoSV;
    private javax.swing.JLabel pnlP5Ten;
    private javax.swing.JPanel pnlP6;
    private javax.swing.JLabel pnlP6GhiChu;
    private javax.swing.JLabel pnlP6NgayThem;
    private javax.swing.JLabel pnlP6SoSV;
    private javax.swing.JLabel pnlP6Ten;
    private javax.swing.JPanel pnlP7;
    private javax.swing.JLabel pnlP7GhiChu;
    private javax.swing.JLabel pnlP7NgayThem;
    private javax.swing.JLabel pnlP7SoSV;
    private javax.swing.JLabel pnlP7Ten;
    private javax.swing.JPanel pnlP8;
    private javax.swing.JLabel pnlP8GhiChu;
    private javax.swing.JLabel pnlP8NgayThem;
    private javax.swing.JLabel pnlP8SoSV;
    private javax.swing.JLabel pnlP8Ten;
    private javax.swing.JPanel pnlP9;
    private javax.swing.JLabel pnlP9GhiChu;
    private javax.swing.JLabel pnlP9NgayThem;
    private javax.swing.JLabel pnlP9SoSV;
    private javax.swing.JLabel pnlP9Ten;
    private javax.swing.JPanel pnlQuanLyNV;
    private javax.swing.JPanel pnlQuanLyPhong;
    private javax.swing.JPanel pnlQuanLySV;
    private javax.swing.JPanel pnlThongKe;
    private javax.swing.JRadioButton rdoQLNVNhanVien;
    private javax.swing.JRadioButton rdoQLNVQuanLy;
    private javax.swing.JRadioButton rdoQLSVNam;
    private javax.swing.JRadioButton rdoQLSVNu;
    private javax.swing.JPanel tabs1;
    private javax.swing.JPanel tabs2;
    private javax.swing.JTabbedPane tabsChiTietP;
    private javax.swing.JTabbedPane tabsQLNV;
    private javax.swing.JTabbedPane tabsQLP;
    private javax.swing.JTabbedPane tabsQLSV;
    private javax.swing.JTable tblChiTietP;
    private javax.swing.JTable tblQLNV;
    private javax.swing.JTable tblQLPPhong;
    private javax.swing.JTable tblQLSV;
    private javax.swing.JLabel tblTBtxtQLNVMatKHau;
    private javax.swing.JTable tblThongKe;
    private javax.swing.JLabel txt;
    private javax.swing.JTextField txtCTPDaDong;
    private javax.swing.JLabel txtCTPHoTen;
    private javax.swing.JLabel txtCTPMsv;
    private javax.swing.JTextField txtCTPTienDong;
    private javax.swing.JLabel txtCTPconlai;
    private javax.swing.JPasswordField txtDMKMatKhauM;
    private javax.swing.JTextField txtDMKNhanVien;
    private javax.swing.JPasswordField txtDMKXacNhan;
    private javax.swing.JTextField txtQLNVEmail;
    private javax.swing.JTextField txtQLNVHoTen;
    private javax.swing.JPasswordField txtQLNVMatKhau;
    private javax.swing.JTextField txtQLNVTaiKhoan;
    private javax.swing.JPasswordField txtQLNVxacNhanMK;
    private javax.swing.JTextArea txtQLPGhiChu;
    private javax.swing.JTextField txtQLPMaPhong;
    private javax.swing.JTextField txtQLPNgayThem;
    private javax.swing.JTextField txtQLPTenPhong;
    private javax.swing.JTextArea txtQLSVGhiChu;
    private javax.swing.JTextField txtQLSVMasv;
    private javax.swing.JTextField txtQLSVNgayDK;
    private javax.swing.JTextField txtQLSVNgayHetHan;
    private javax.swing.JTextField txtQLSVSDT;
    private javax.swing.JTextField txtQLSVTenSV;
    private javax.swing.JTextField txtQLSVTimKiem;
    // End of variables declaration//GEN-END:variables
}
