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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.TaiKhoan;

/**
 *
 * @author vietn
 */
public class NhoTaiKhoanDao {

    String[] tkmk = {"",""};
    boolean nho;

    public void update(String tk, String mk, String nho) {
        String sql = "UPDATE nhotaikhoan SET TaiKhoan='" + tk + "',MatKhau='" + mk + "', checknho=" + nho;
        jdbc.executeUpdate(sql);
    }
    public void insert(String tk, String mk, String nho) {
        String sql = "insert nhotaikhoan values (?,?,?)";
        jdbc.executeUpdate(sql,tk,mk,nho);
    }
    
    public void updateSetting(String tk, String chedo, String nhac) {
        String sql = "update setting set chedo=?,nhac=? where taikhoan=?";
        jdbc.executeUpdate(sql,chedo,nhac,tk);
    }
     public void insertSetting(String tk, String chedo, String nhac) {
        String sql = "insert setting values (?,?,?)";
        jdbc.executeUpdate(sql,tk,chedo,nhac);
    }
    public TaiKhoan selectSetting(String tk) {
        ResultSet rs = jdbc.executeQuery("select * from setting  where taikhoan= ?",tk);
        TaiKhoan t = new TaiKhoan();
        List<TaiKhoan> list = new ArrayList<>();
        try {
            while(rs.next()){
                t.setCheDo(rs.getBoolean("chedo"));
                t.setNhac(rs.getBoolean("nhac"));
                list.add(t);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
       return list.size()>0?t:null;
    }
    public boolean checknho() {
       
        try {
             ResultSet rs = jdbc.executeQuery("Select checknho from nhotaikhoan");
            while (rs.next()) {
                nho = rs.getBoolean("checknho");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        if (nho) {
            return true;
        } else {
            return false;
        }
    }

    public String[] Select() {
        ResultSet rs = jdbc.executeQuery("Select * from nhotaikhoan");
        try {
            while (rs.next()) {
                tkmk[0] = rs.getString("TaiKhoan");
                tkmk[1] = rs.getString("MatKhau");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return tkmk;
    }

}
