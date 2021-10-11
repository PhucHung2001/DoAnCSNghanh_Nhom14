/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import helper.jdbc;
import helper.xDate;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.SinhVien;

/**
 *
 * @author vietn
 */
public class SinhVienDao {

    public void insert(SinhVien model) {
        String sql = "INSERT INTO SinhVien(MaSinhVien,TenSinhVien,SDT,DiaChi,GioTinh,NgayDK,NgayHetHan, MaPhong) VALUES (?,?,?,?,?,?,?,?)";
        jdbc.executeUpdate(sql,
                model.getMaSinhVien(),
                model.getTenSinhVien(),
                model.getSDT(),
                model.getDiaChi(),
                model.isGioTinh(),
                xDate.toString( model.getNgayDK(),"yyyy/MM/dd"),
                xDate.toString( model.getNgayHetHan(),"yyyy/MM/dd"),
                model.getMaPhong()
        );
    }

    public void update(SinhVien model) {
        String sql = "UPDATE SinhVien SET TenSinhVien=?, sdt=?, Diachi=? ,gioTinh=?,NgayDk=?  , Ngayhethan=?,MaPhong=? WHERE MaSinhVien=?";
        jdbc.executeUpdate(sql,
                model.getTenSinhVien(),
                model.getSDT(),
                model.getDiaChi(),
                model.isGioTinh(),
               xDate.toString( model.getNgayDK(), "yyyy/MM/dd"),
               xDate.toString( model.getNgayHetHan(), "yyyy/MM/dd"),
                model.getMaPhong(),
                model.getMaSinhVien()
        );
    }
    public void updateChiTiet(SinhVien model) {
        String sql = "UPDATE SinhVien SET tiendong = ?,dadong=? WHERE MaSinhVien=?";
        jdbc.executeUpdate(sql,
               model.getTienDong(),
               model.getTienDaDong(),
               model.getMaSinhVien()
        );
    }
    public void delete(Integer MaSV) {
        String sql = "DELETE FROM SinhVien WHERE MaSinhVien=?";
        jdbc.executeUpdate(sql, MaSV);
    }

    public List<SinhVien> select() {
        String sql = "SELECT * FROM SinhVien";
        return select(sql);
    }
    public List<SinhVien> Tim(String keyword) {
        String sql = "SELECT * FROM SinhVien where TenSinhVien like ?";
        return select(sql,"%"+keyword+"%");
    }
    public List<SinhVien> KiemTraTonTai(String keyword) {
        String sql = "SELECT * FROM SinhVien where masinhvien= ?";
        List<SinhVien> list =select(sql,keyword);
        return list.size()>0?list:null;
    }
    public List<Object[]> selectByMaP(int map) {

        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "select* from sinhvien where maphong  = ?";
                rs = jdbc.executeQuery(sql, map);
                while (rs.next()) {
                    Object[] model = {              
                        rs.getString("maSinhvien"),
                        rs.getString("tensinhvien"),
                        rs.getString("TienDong"),
                        rs.getString("Dadong"),
                        rs.getInt("tiendong")-rs.getInt("dadong")
                    };
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }

    public String SoLuongSVTheoMap(int map) {
        ResultSet rs = null;
        String sql = "select Count(masinhvien) as 'soluong' from sinhvien where maphong = ? ";
        try {
            rs = jdbc.executeQuery(sql, map);
            while (rs.next()) {
                  return rs.getString("soluong");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
      return "d";
    }
    private List<SinhVien> select(String sql, Object... args) {
        List<SinhVien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = jdbc.executeQuery(sql, args);
                while (rs.next()) {
                    SinhVien model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            throw new RuntimeException(ex);
        }
        return list;
    }

    private SinhVien readFromResultSet(ResultSet rs) throws SQLException {
        SinhVien model = new SinhVien();
        model.setMaSinhVien(rs.getString("MaSinhVien"));
        model.setTenSinhVien(rs.getString("TenSinhVien"));
        model.setSDT(rs.getString("sdt"));
        model.setDiaChi(rs.getString("DiaChi"));
        model.setGioTinh(rs.getBoolean("giotinh"));
        model.setNgayDK(rs.getDate("ngayDk"));
        model.setNgayHetHan(rs.getDate("ngayhethan"));
        model.setMaPhong(rs.getInt("MaPhong"));
        return model;
    }

}
