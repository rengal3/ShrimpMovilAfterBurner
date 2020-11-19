package com.shrimpmovilafterburner.views;

import com.gluonhq.charm.glisten.afterburner.GluonPresenter;
import com.gluonhq.charm.glisten.animation.BounceInRightTransition;
import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.control.Alert;
import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.control.DatePicker;
import com.gluonhq.charm.glisten.layout.layer.PopupView;

import com.gluonhq.charm.glisten.mvc.View;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;
import com.gluonhq.connect.GluonObservableList;
import com.shrimpmovilafterburner.ShrimpMovilAfterBurner;
import com.shrimpmovilafterburner.TO.DatosEmpresaTO;
import com.shrimpmovilafterburner.TO.DatosSectorTO;
import com.shrimpmovilafterburner.TO.DatosTablaGramajeTO;
import com.shrimpmovilafterburner.rest.PruebasRest;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class IngresarGramajePresenter extends GluonPresenter<ShrimpMovilAfterBurner>{

    @FXML
    private View ingresargramaje;        
    
    @FXML
    private Button btnEmpresa;
    
    @FXML
    private Button btnSector;
    
    @FXML
    private TextField txfFecha;
    
    DatePicker datePicker;    
    private PopupView popupEmpresa, popupSector ;
    
    private String idempresa="",idsector="";
       
    public void initialize() {
        ingresargramaje.setShowTransitionFactory(BounceInRightTransition::new);
        
        /*********inicializar combos**********/
        btnEmpresa.getStyleClass().add("flat");
        btnEmpresa.setStyle("-fx-border-color: lightgray; -fx-border-width: 0 0 1 0");
        btnEmpresa.setContentDisplay(ContentDisplay.RIGHT);
        popupEmpresa= new PopupView(btnEmpresa);
        this.llenarComboEmpresa();
        
        btnSector.getStyleClass().add("flat");
        btnSector.setStyle("-fx-border-color: lightgray; -fx-border-width: 0 0 1 0");
        btnSector.setContentDisplay(ContentDisplay.RIGHT);
        popupSector= new PopupView(btnSector);
                                      
        /****************************************************/
        datePicker = new DatePicker();  
        
        txfFecha.setText(datePicker.getDate().getYear()+"-"+datePicker.getDate().getMonthValue()+"-"+datePicker.getDate().getDayOfMonth());                     
        
        ingresargramaje.showingProperty().addListener((obs, oldValue, newValue) -> {
            if (newValue) {
                AppBar appBar = MobileApplication.getInstance().getAppBar();
                appBar.setNavIcon(MaterialDesignIcon.MENU.button(e -> 
                        MobileApplication.getInstance().getDrawer().open()));
                appBar.setTitleText("Ingresar Grameaje");                
            }
        });
        
    }
    
     void llenarComboEmpresa(){
         VBox vBox = new VBox();         
        Iterator<DatosEmpresaTO> obe=null;
        try {
            obe = PruebasRest.getListaEmpresasTOIterator();
        } catch (Exception ex) {
            Logger.getLogger(IngresarGramajePresenter.class.getName()).log(Level.SEVERE, null, ex);
            Alert alert = new Alert(AlertType.ERROR, "Error al cargar las empresas");
            alert.showAndWait();
            return;
        }
        
        obe.forEachRemaining((dato) -> {            
            Button item = new Button(dato.getEmpNombre());
            item.setPrefWidth(200);
            item.getStyleClass().add("flat");
            item.setOnAction(e -> {
                btnEmpresa.setText(dato.getEmpNombre());
                btnSector.setText("seleccione sector");
                this.idsector="";
                llenarComboSector(dato.getEmpCodigo().trim());
                popupEmpresa.hide();
            });
            vBox.getChildren().add(item);            
          });
                
        ScrollPane scrollPane = new ScrollPane(vBox);
        scrollPane.setMaxHeight(400);
        scrollPane.setPrefWidth(210);

        popupEmpresa.setContent(scrollPane);
        
    }
    
      void llenarComboSector(String idempresa){
        this.idempresa=idempresa;
        VBox vBox = new VBox();  
        Iterator<DatosSectorTO> obe=null;
        try {
            obe = PruebasRest.getListaSectorTOIterator(idempresa);
        } catch (Exception ex) {
            Logger.getLogger(IngresarGramajePresenter.class.getName()).log(Level.SEVERE, null, ex);
            Alert alert = new Alert(AlertType.ERROR, "Error al cargar los sectores");
            alert.showAndWait();
            return;
        }
        
        obe.forEachRemaining((dato) -> { 
            Button item = new Button(dato.getSecNombre());
            item.setPrefWidth(200);
            item.getStyleClass().add("flat");
            item.setOnAction(e -> {
                btnSector.setText(dato.getSecNombre());
                this.idsector=dato.getSecCodigo().trim();
                popupSector.hide();
            });
            vBox.getChildren().add(item);
        });
        ScrollPane scrollPane = new ScrollPane(vBox);
        scrollPane.setMaxHeight(400);
        scrollPane.setPrefWidth(210);

        popupSector.setContent(scrollPane);
        
    }
    
    @FXML
    void botonBuscarClick() {                
        if(this.idempresa.trim().isEmpty()){
            Alert alert = new Alert(AlertType.WARNING, "Elija una empresa");
            alert.showAndWait();
            return;
        }
        
         if(this.idsector.trim().isEmpty()){
            Alert alert = new Alert(AlertType.WARNING, "Elija un sector");
            alert.showAndWait();
            return;
        }
        String fecha=this.txfFecha.getText().trim();
        GluonObservableList<DatosTablaGramajeTO> listaDatos=PruebasRest.getDatosTablaGramajeTORest(
                this.idempresa,this.idsector,fecha);
        AppViewManager.CONSULTAGRAMAJE_VIEW.switchView().
               ifPresent(presenter -> 
            ((ConsultaEditaGramajePresenter) presenter).
                    llenaTablaGramaje(listaDatos,this.idempresa,this.idsector,fecha));                                     
    }
    
    @FXML
    void btnCancelAction() {                
        MobileApplication.getInstance().switchToPreviousView();
       
    }
    
    @FXML
    void btnEmpresaClick() {
        popupEmpresa.show();
    }
    
    @FXML
    void btnSectorClick() {
        popupSector.show();
    }
    
    @FXML
    void txtFechaAction() {                
        datePicker.showAndWait().ifPresent((x)->{                        
                    txfFecha.setText(x.getYear()+"-"+x.getMonthValue()+"-"+x.getDayOfMonth());                    
            });
    }
}
