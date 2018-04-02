/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toeic.models;

/**
 *
 * @author thanhtieu
 */
public class NguoiDung {
    private String maNguoiDung;
    private String tenDangNhap;
    private String matKhau;
    private String hoVaTenLot;
    private String ten;
    private boolean loaiQuyen;

    /**
     * @return the maNguoiDung
     */
    public String getMaNguoiDung() {
        return maNguoiDung;
    }

    /**
     * @param maNguoiDung the maNguoiDung to set
     */
    public void setMaNguoiDung(String maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }

    /**
     * @return the tenDangNhap
     */
    public String getTenDangNhap() {
        return tenDangNhap;
    }

    /**
     * @param tenDangNhap the tenDangNhap to set
     */
    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    /**
     * @return the matKhau
     */
    public String getMatKhau() {
        return matKhau;
    }

    /**
     * @param matKhau the matKhau to set
     */
    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    /**
     * @return the hoVaTenLot
     */
    public String getHoVaTenLot() {
        return hoVaTenLot;
    }

    /**
     * @param hoVaTenLot the hoVaTenLot to set
     */
    public void setHoVaTenLot(String hoVaTenLot) {
        this.hoVaTenLot = hoVaTenLot;
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }

    /**
     * @return the loaiQuyen
     */
    public boolean isLoaiQuyen() {
        return loaiQuyen;
    }

    /**
     * @param loaiQuyen the loaiQuyen to set
     */
    public void setLoaiQuyen(boolean loaiQuyen) {
        this.loaiQuyen = loaiQuyen;
    }
}
