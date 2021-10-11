/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author vietn
 */
public class TaiKhoan {
    private String TaiKhoan;
    private String matKhau;
    private String hoTen;
    private boolean vaiTro = false;
    private String email;
    
    boolean nhac;
    boolean cheDo;

    public boolean getNhac() {
        return nhac;
    }

    public void setNhac(boolean nhac) {
        this.nhac = nhac;
    }

    public boolean getCheDo() {
        return cheDo;
    }

    public void setCheDo(boolean cheDo) {
        this.cheDo = cheDo;
    }
    public String getTaiKhoan() {
    	
        return TaiKhoan;
    }

    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
