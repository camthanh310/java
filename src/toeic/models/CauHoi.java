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
public class CauHoi {
    private String maCauHoi;
    private LoaiCauHoi loaiCauHoi;
    private String cauHoi;
    private DapAn dapAn;

    /**
     * @return the maCauHoi
     */
    public String getMaCauHoi() {
        return maCauHoi;
    }

    /**
     * @param maCauHoi the maCauHoi to set
     */
    public void setMaCauHoi(String maCauHoi) {
        this.maCauHoi = maCauHoi;
    }


    /**
     * @return the cauHoi
     */
    public String getCauHoi() {
        return cauHoi;
    }

    /**
     * @param cauHoi the cauHoi to set
     */
    public void setCauHoi(String cauHoi) {
        this.cauHoi = cauHoi;
    }

    /**
     * @return the loaiCauHoi
     */
    public LoaiCauHoi getLoaiCauHoi() {
        return loaiCauHoi;
    }

    /**
     * @param loaiCauHoi the loaiCauHoi to set
     */
    public void setLoaiCauHoi(LoaiCauHoi loaiCauHoi) {
        this.loaiCauHoi = loaiCauHoi;
    }

    /**
     * @return the dapAn
     */
    public DapAn getDapAn() {
        return dapAn;
    }

    /**
     * @param dapAn the dapAn to set
     */
    public void setDapAn(DapAn dapAn) {
        this.dapAn = dapAn;
    }

}
