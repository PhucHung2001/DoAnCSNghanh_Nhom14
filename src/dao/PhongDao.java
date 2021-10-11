/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import helper.xDate;
import helper.jdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Phong;

/**
 *
 * @author vietn
 */
public class PhongDao {

    public void insert(Phong model) {
        String sql = "INSERT INTO Phong (MaPhong, TenPhong, NgayThem, GhiChu) VALUES (?,?,?,?)";
        jdbc.executeUpdate(sql,
                model.getMaPhong(),
                model.getTenPhong(),
                xDate.toString(model.getNgayThem(), "MM/dd/yyyy"),
                model.getGhiChu()
        );

    }

    public void update(Phong model) {
        String sql
                = "UPDATE phong SET Tenphong=?, ngaythem=?, ghichu=? WHERE Maphong = ?";
        jdbc.executeUpdate(sql,
                model.getTenPhong(),
                xDate.toString(model.getNgayThem(),  "MM/dd/yyyy"),
                model.getGhiChu(),
                model.getMaPhong()
        );
    }

    public void delete(Integer map) {
        String sql = "DELETE FROM phong WHERE Maphong=?";
        jdbc.executeUpdate(sql, map);
    }

    public List<Phong> select() {
        String sql = "SELECT * FROM phong";
        return select(sql);
    }

    public Phong findById(Integer makh) {
        String sql = "SELECT * FROM phong WHERE maphong=?";
        List<Phong> list = select(sql, makh);
        return list.size() > 0 ? list.get(0) : null;
    }

    public Phong findByTP(String makh) {
        String sql = "SELECT * FROM phong WHERE tenphong=?";
        List<Phong> list = select(sql, makh);
        return list.size() > 0 ? list.get(0) : null;
    }
    public String SoLuongSV(int maP){
        String sql = "select count(masinhvien) as 'sl' from SinhVien   where maphong = ?";
        ResultSet rs = jdbc.executeQuery(sql, maP);
        String sl="";
        try {
            while(rs.next()){
             sl=rs.getString("sl");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return sl;
       
    }
    private List<Phong> select(String sql, Object... args) {
        List<Phong> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = jdbc.executeQuery(sql, args);
                while (rs.next()) {
                    Phong model = readFromResultSet(rs);
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

    private Phong readFromResultSet(ResultSet rs) throws SQLException {
        Phong model = new Phong();
        model.setMaPhong(rs.getInt("Maphong"));
        model.setTenPhong(rs.getString("tenphong"));
        model.setNgayThem(rs.getDate("ngaythem"));
        model.setGhiChu(rs.getString("ghichu"));
        return model;
    }

//    public List<Phong> selectByChuyenDe(String macd) {
//        String sql = "Select * from khoahoc where macd = ?";
//        return select(sql, macd);
//    }
//
//    public List<Integer> selectYear() {
//        String sql = "select distinct year(ngayKG) from khoahoc order by year(ngayKG) DESC";
//        List<Integer> list = new ArrayList<>();
//        try {
//            ResultSet rs = jdbc.executeQuery(sql);
//            while (rs.next()) {
//                list.add(rs.getInt(1));
//            }
//            rs.getStatement().getConnection().close();
//            return list;
//        } catch (SQLException e) {
//            System.out.println(e);
//            throw new RuntimeException(e);
//        }
//
//    }
}
