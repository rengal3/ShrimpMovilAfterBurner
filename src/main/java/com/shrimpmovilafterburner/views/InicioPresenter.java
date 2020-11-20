package com.shrimpmovilafterburner.views;

import com.gluonhq.charm.glisten.afterburner.GluonPresenter;
import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.layout.layer.PopupView;
import com.gluonhq.charm.glisten.mvc.View;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;
import com.shrimpmovilafterburner.ShrimpMovilAfterBurner;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class InicioPresenter extends GluonPresenter<ShrimpMovilAfterBurner> {

    @FXML
    private View inicio;

    @FXML
    private Label label;

    @FXML
    private ResourceBundle resources;
    
    @FXML
    private Button btnPrueba;
    
    private PopupView popup ;
    
    public void initialize() {
        btnPrueba.getStyleClass().add("flat");
        btnPrueba.setStyle("-fx-border-color: lightgray; -fx-border-width: 0 0 1 0");
        btnPrueba.setContentDisplay(ContentDisplay.RIGHT);
        popup= new PopupView(btnPrueba);
        VBox vBox = new VBox();
        for (int i = 0; i < 100; i++) {
            Button item = new Button("item " + i);
            item.setPrefWidth(100);
            item.getStyleClass().add("flat");
            item.setOnAction(e -> {
                System.out.println("item " + item.getText());
                popup.hide();
            });
            vBox.getChildren().add(item);
        }
        ScrollPane scrollPane = new ScrollPane(vBox);
        scrollPane.setMaxHeight(200);
        scrollPane.setPrefWidth(110);

        popup.setContent(scrollPane);
        
        
        
        
        inicio.showingProperty().addListener((obs, oldValue, newValue) -> {
            if (newValue) {
                AppBar appBar = getApp().getAppBar();
                appBar.setNavIcon(MaterialDesignIcon.MENU.button(e -> 
                        getApp().getDrawer().open()));
                appBar.setTitleText("Inicio");
                appBar.getActionItems().add(MaterialDesignIcon.SEARCH.button(e -> 
                        System.out.println("click en buscar")));
            }
        });
    }
       
    @FXML
    void buttonClick() {
        label.setText(resources.getString("label.text.2"));
    }
    
    @FXML
    void buttonPruebaClick() {
        popup.show();
    }
    
}
