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

/**
 *
 * @author Admin
 */
public class ThongKeDAO {
    
      public List<Object[]> selectSinhVien() {

        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "select MaPhong, MaSinhVien , NgayDK, NgayHetHan\n" +
                            "from SinhVien\n" +
                            "where DATEDIFF (dd,NgayHetHan, GETDATE()) >0";
                rs = jdbc.executeQuery(sql);
                while (rs.next()) {
                    Object[] model = {              
                        rs.getString(1),
                        rs.getString(2),
                        xDate.toString( rs.getDate(3), "dd/MM/yyyy"),
                       xDate.toString( rs.getDate(4), "dd/MM/yyyy"),
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
}
