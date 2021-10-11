/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author vietn
 */
public class SinhVien {

    String MaSinhVien;
    String TenSinhVien;
    String SDT;
    String DiaChi;
    boolean GioTinh;
    Date NgayDK;
    Date NgayHetHan;
    int MaPhong;
    //chi tiet
    int tienDong;
    int tienDaDong;

    public float getTienDong() {
        return tienDong;
    }

    public void setTienDong(int tienDong) {
        this.tienDong = tienDong;
    }

    public float getTienDaDong() {
        return tienDaDong;
    }

    public void setTienDaDong(int tienDaDong) {
        this.tienDaDong = tienDaDong;
    }
    String soluong;
    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public String getTenSinhVien() {
        return TenSinhVien;
    }

    public void setTenSinhVien(String TenSinhVien) {
        this.TenSinhVien = TenSinhVien;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public boolean isGioTinh() {
        return GioTinh;
    }

    public void setGioTinh(boolean GioTinh) {
        this.GioTinh = GioTinh;
    }

    public Date getNgayDK() {
        return NgayDK;
    }

    public void setNgayDK(Date NgayDK) {
        this.NgayDK = NgayDK;
    }

    public Date getNgayHetHan() {
        return NgayHetHan;
    }

    public void setNgayHetHan(Date NgayHetHan) {
        this.NgayHetHan = NgayHetHan;
    }

    public int getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(int MaPhong) {
        this.MaPhong = MaPhong;
    }
    
    
}
