/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toeic.models;

import java.util.Date;

/**
 *
 * @author thanhtieu
 */
public class Diem {
    private String maDiem;
    private NguoiDung nguoiDung;
    private double diem;
    private Date ngayLamBai;

    /**
     * @return the maDiem
     */
    public String getMaDiem() {
        return maDiem;
    }

    /**
     * @param maDiem the maDiem to set
     */
    public void setMaDiem(String maDiem) {
        this.maDiem = maDiem;
    }

    

    /**
     * @return the diem
     */
    public double getDiem() {
        return diem;
    }

    /**
     * @param diem the diem to set
     */
    public void setDiem(double diem) {
        this.diem = diem;
    }

    /**
     * @return the ngayLamBai
     */
    public Date getNgayLamBai() {
        return ngayLamBai;
    }

    /**
     * @param ngayLamBai the ngayLamBai to set
     */
    public void setNgayLamBai(Date ngayLamBai) {
        this.ngayLamBai = ngayLamBai;
    }

    /**
     * @return the nguoiDung
     */
    public NguoiDung getNguoiDung() {
        return nguoiDung;
    }

    /**
     * @param nguoiDung the nguoiDung to set
     */
    public void setNguoiDung(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
    }
}
