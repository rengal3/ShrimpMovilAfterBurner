/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shrimpmovilafterburner.views;

import com.gluonhq.charm.glisten.afterburner.GluonPresenter;
import com.gluonhq.charm.glisten.animation.BounceInRightTransition;
import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.control.Alert;
import com.gluonhq.charm.glisten.control.TextField;
import com.gluonhq.charm.glisten.mvc.View;
import com.shrimpmovilafterburner.ShrimpMovilAfterBurner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;

/**
 *
 * @author Renato
 */
public class LoginPresenter extends GluonPresenter<ShrimpMovilAfterBurner>{
    @FXML
    private TextField txtUsuario;
    
    @FXML
    private PasswordField txtPassword;
    @FXML
    private View login;        
    
     public void initialize() {
        login.setShowTransitionFactory(BounceInRightTransition::new);
                
    }
    
    @FXML
    void btnLoginlAction() {     
        String usuario=txtUsuario.getText().trim();
        String password=txtPassword.getText().trim();
        Alert confirma;
        if(usuario.length()<1){
             confirma = new Alert(javafx.scene.control.Alert.AlertType.WARNING, 
                "Debe ingresar usuario");
                confirma.showAndWait();
                return;
        }
        if(password.length()<1){
             confirma = new Alert(javafx.scene.control.Alert.AlertType.WARNING, 
                "Debe ingresar password");
                confirma.showAndWait();
                return;
        }
        if(usuario.contentEquals("renato") && password.contentEquals("1234")){
            AppViewManager.INICIO_VIEW.switchView();
        }else{
            confirma = new Alert(javafx.scene.control.Alert.AlertType.ERROR, 
                "Usuario y/o contraseña invalida");
                confirma.showAndWait();
                ;
        }
        
       
    }
    
    @FXML
    void btnCancelAction() {    
        
       Alert confirma = new Alert(javafx.scene.control.Alert.AlertType.CONFIRMATION, 
                "¿Desea salir?");
        confirma.showAndWait().ifPresent(result -> {            
            if (result == ButtonType.OK) {                                 
                Platform.exit();
            }
         });
       
    }
    
    @FXML
    void txtUsuarioTouchAction() {    
        txtUsuario.requestFocus();        
    }
        
    
}
