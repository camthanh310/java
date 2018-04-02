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
public class DapAn {
    private String maDapAn;
    private CauHoi cauHoi; 
    private String dapAn;

    /**
     * @return the maDapAn
     */
    public String getMaDapAn() {
        return maDapAn;
    }

    /**
     * @param maDapAn the maDapAn to set
     */
    public void setMaDapAn(String maDapAn) {
        this.maDapAn = maDapAn;
    }

    

    /**
     * @return the dapAn
     */
    public String getDapAn() {
        return dapAn;
    }

    /**
     * @param dapAn the dapAn to set
     */
    public void setDapAn(String dapAn) {
        this.dapAn = dapAn;
    }

    /**
     * @return the cauHoi
     */
    public CauHoi getCauHoi() {
        return cauHoi;
    }

    /**
     * @param cauHoi the cauHoi to set
     */
    public void setCauHoi(CauHoi cauHoi) {
        this.cauHoi = cauHoi;
    }
}
