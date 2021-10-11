/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.SinhVienDao;
import java.util.Date;

/**
 *
 * @author vietn
 */
public class Phong {

    int MaPhong;
    String TenPhong;
    Date NgayThem;
    String GhiChu;
    SinhVienDao svdao = new SinhVienDao();
    String soLuong ;

    @Override
    public String toString() {
        return this.MaPhong+"";
    }

    public int getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(int MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String TenPhong) {
        this.TenPhong = TenPhong;
    }

    public Date getNgayThem() {
        return NgayThem;
    }

    public void setNgayThem(Date NgayThem) {
        this.NgayThem = NgayThem;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

}
