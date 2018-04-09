/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toeicapp;

import Util.TranferForm;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author thanhtieu
 */
public class FXMLDangNhapController implements Initializable {

    @FXML
    private JFXTextField txtTenDangNhap;
    @FXML
    private JFXPasswordField txtMatKhau;
    @FXML
    private JFXButton btnDangKy;
    @FXML
    private JFXButton btnDangNhap;

    /**
     * Initializes the controller class.
     * @param e
     * @throws java.io.IOException
     */
    @FXML
    public void dangKy(ActionEvent e) throws IOException{
        TranferForm.loadWindow(getClass().getResource("FXMLDangKy.fxml"), "Đăng ký người dùng", null);
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
