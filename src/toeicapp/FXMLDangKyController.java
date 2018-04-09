/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toeicapp;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.UUID;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import toeic.models.NguoiDung;

/**
 * FXML Controller class
 *
 * @author thanhtieu
 */
public class FXMLDangKyController implements Initializable {
    private SessionFactory factory;
    @FXML
    private JFXTextField txtTenDangNhap;
    @FXML
    private JFXPasswordField txtMatKhau;
    @FXML
    private JFXTextField txtHo;
    @FXML
    private JFXTextField txtTen;
    @FXML
    private JFXButton btnDangKy;
    @FXML
    private JFXButton btnLamMoi;

    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        factory = HibernateUtil.getSessionFactory();
    }  
    
    public void themNguoiDung(){
        Session session = this.factory.openSession();
        
        String maNguoiDung = UUID.randomUUID().toString();
        NguoiDung nguoiDung = (NguoiDung) session.get(NguoiDung.class, maNguoiDung);
        
        Transaction trans =session.beginTransaction();
        nguoiDung = new NguoiDung();
        nguoiDung.setMaNguoiDung(maNguoiDung);
        nguoiDung.setTenDangNhap(txtTenDangNhap.getText());
        nguoiDung.setMatKhau(txtMatKhau.getText());
        nguoiDung.setHoVaTenLot(txtHo.getText());
        nguoiDung.setTen(txtTen.getText());
        nguoiDung.setLoaiQuyen(true);
        session.save(nguoiDung);
        trans.commit();
        session.close();  
    }
    
    @FXML
    public void themNguoiDungAction(ActionEvent e){
        this.themNguoiDung();
    }
    
}
