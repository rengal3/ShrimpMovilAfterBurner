package com.shrimpmovilafterburner.views;

import com.gluonhq.charm.glisten.afterburner.GluonPresenter;
import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.mvc.View;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;
import com.shrimpmovilafterburner.ShrimpMovilAfterBurner;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class InicioPresenter extends GluonPresenter<ShrimpMovilAfterBurner> {

    @FXML
    private View inicio;

    @FXML
    private Label label;

    @FXML
    private ResourceBundle resources;
    
    public void initialize() {
        inicio.showingProperty().addListener((obs, oldValue, newValue) -> {
            if (newValue) {
                AppBar appBar = getApp().getAppBar();
                appBar.setNavIcon(MaterialDesignIcon.MENU.button(e -> 
                        getApp().getDrawer().open()));
                appBar.setTitleText("Inicio");
                appBar.getActionItems().add(MaterialDesignIcon.SEARCH.button(e -> 
                        System.out.println("Search")));
            }
        });
    }
    
    @FXML
    void buttonClick() {
        label.setText(resources.getString("label.text.2"));
    }
    
}
