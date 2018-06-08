
package com.ejercicio6.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements Initializable {
    
    @FXML private TextField txtLogin;
    @FXML private PasswordField txtPassword;
    
    private void initializable(URL location, ResourceBundle resources) {
        
    }
    
    public void login (){
            
        if(txtPassword.getText().equals("admin")){
            javax.swing.JOptionPane.showMessageDialog(null,
                " Bienvenido " + txtLogin.getText());
        }else{
            javax.swing.JOptionPane.showMessageDialog(null,
                "No Autorizado");
        }    
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
    }
}
     
    

