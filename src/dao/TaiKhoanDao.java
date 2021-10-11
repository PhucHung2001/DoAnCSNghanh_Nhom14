/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import helper.jdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.TaiKhoan;

/**
 *
 * @author vietn
 */
public class TaiKhoanDao {
     public void insert(TaiKhoan model) {
        String sql = "INSERT INTO taikhoan (taikhoan, MatKhau,Email, HoTen, VaiTro) VALUES (?, ?, ?, ?,?)";
         jdbc.executeUpdate(sql,
                model.getTaiKhoan(),
                model.getMatKhau(),
                model.getEmail(),
                model.getHoTen(),
                model.isVaiTro());
    }

    public void update(TaiKhoan model) {
        String sql = "UPDATE taikhoan SET MatKhau=?,Email=?, HoTen =?, VaiTro=? WHERE taikhoan=?";
        jdbc.executeUpdate(sql,
                model.getMatKhau(),
                model.getEmail(),
                model.getHoTen(),
                model.isVaiTro(),
                model.getTaiKhoan());
    }

    public void delete(String MaNV) {
        String sql = "DELETE FROM taikhoan WHERE taikhoan=?";
        jdbc.executeUpdate(sql, MaNV);
    }

    public List<TaiKhoan> select() {
        String sql = "SELECT * FROM taikhoan";
        return select(sql);
    }

    public TaiKhoan findById(String manv) {
        String sql = "SELECT * FROM TaiKhoan WHERE TaiKhoan=?";
        List<TaiKhoan> list = select(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
    }
     public void DoiMK(TaiKhoan model) {
        String sql = "UPDATE taikhoan SET MatKhau=? WHERE taikhoan=?";
        jdbc.executeUpdate(sql,
                model.getMatKhau(),
                model.getTaiKhoan());
    }
//      public TaiKhoan MD5(String manv,String mk) {
//        String sql = "SELECT * FROM NhanVien WHERE MaNV='"+manv+"' and matkhau like CONVERT(VARCHAR(100), HashBytes('MD5','"+mk+"'), 2)";
//        List<TaiKhoan> list = select(sql);
//        return list.size() > 0 ? list.get(0) : null;
//    }
    private List<TaiKhoan> select(String sql, Object... args) {
        List<TaiKhoan> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = jdbc.executeQuery(sql, args);
                while (rs.next()) {
                    TaiKhoan model = readFromResultSet(rs);
                    list.add(model);                  
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);

        }
        return list;
    }

    private TaiKhoan readFromResultSet(ResultSet rs) throws SQLException {
        TaiKhoan model = new TaiKhoan();
        model.setTaiKhoan(rs.getString("TaiKhoan"));
        model.setMatKhau(rs.getString("MatKhau"));
        model.setHoTen(rs.getString("HoTen"));
        model.setVaiTro(rs.getBoolean("VaiTro"));
        model.setEmail(rs.getString("Email"));
        return model;
    }
}
