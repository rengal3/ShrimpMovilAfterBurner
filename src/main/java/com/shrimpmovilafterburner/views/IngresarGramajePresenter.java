package com.shrimpmovilafterburner.views;

import com.gluonhq.charm.glisten.afterburner.GluonPresenter;
import com.gluonhq.charm.glisten.animation.BounceInRightTransition;
import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.control.DatePicker;

import com.gluonhq.charm.glisten.mvc.View;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;
import com.gluonhq.connect.GluonObservableList;
import com.shrimpmovilafterburner.ShrimpMovilAfterBurner;
import com.shrimpmovilafterburner.TO.DatosEmpresaTO;
import com.shrimpmovilafterburner.TO.DatosSectorTO;
import com.shrimpmovilafterburner.TO.DatosTablaGramajeTO;
import com.shrimpmovilafterburner.rest.PruebasRest;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class IngresarGramajePresenter extends GluonPresenter<ShrimpMovilAfterBurner>{

    @FXML
    private View ingresargramaje;        
    
    @FXML
    private ComboBox<DatosEmpresaTO> cmbEmpresa;
    
    @FXML
    private ComboBox<DatosSectorTO> cmbSector;
    
    @FXML
    private TextField txfFecha;
    
    DatePicker datePicker;        
       
    public void initialize() {
        ingresargramaje.setShowTransitionFactory(BounceInRightTransition::new);
        cmbEmpresa.setVisibleRowCount(10);
        cmbEmpresa.setItems(PruebasRest.getListaEmpresasTORest());
        
        datePicker = new DatePicker();  
        

        //datePicker.setAutoHide(true);
        
        txfFecha.setText(datePicker.getDate().getYear()+"-"+datePicker.getDate().getMonthValue()+"-"+datePicker.getDate().getDayOfMonth());  
        
       /* 
        si se desea personalizar los datos a mostrar del combo
        cmbEmpresa.setCellFactory(lv -> new ListCell<DatosEmpresaTO>() {
            
            @Override
            protected void updateItem(DatosEmpresaTO item, boolean empty) {
                super.updateItem(item, empty);

                if (!empty) {
                    setText(item.getEmpNombre());
                    
                } else {
                    setText(null);
                }
            }
        });*/
        
       
       //cmbEmpresa.getSelectionModel().selectFirst();
       
        
        ingresargramaje.showingProperty().addListener((obs, oldValue, newValue) -> {
            if (newValue) {
                AppBar appBar = MobileApplication.getInstance().getAppBar();
                appBar.setNavIcon(MaterialDesignIcon.MENU.button(e -> 
                        MobileApplication.getInstance().getDrawer().open()));
                appBar.setTitleText("Ingresar Gramaje");                
            }
        });
        
        /******************************/
       
    }
    
    
    @FXML
    void botonBuscarClick() {
        String idempresa=this.cmbEmpresa.getSelectionModel().getSelectedItem().getEmpCodigo();
        String codsector=this.cmbSector.getSelectionModel().getSelectedItem().getSecCodigo();
        String fecha=this.txfFecha.getText().trim();
        GluonObservableList<DatosTablaGramajeTO> listaDatos=PruebasRest.getDatosTablaGramajeTORest(
                idempresa,codsector,fecha);
        AppViewManager.CONSULTAGRAMAJE_VIEW.switchView().
               ifPresent(presenter -> 
            ((ConsultaEditaGramajePresenter) presenter).llenaTablaGramaje(listaDatos,idempresa,codsector,fecha));
             
        //MobileApplication.getInstance().switchView(ShrimpGluonProject1.CONSULTAEDITAGRAMAJE_VIEW);
        /*ConsultaEditaGramajePresenter.listaDatos=PruebasRest.getDatosTablaGramajeTORest(
                this.cmbEmpresa.getSelectionModel().getSelectedItem().getEmpCodigo(), 
                this.cmbSector.getSelectionModel().getSelectedItem().getSecCodigo(), 
                this.txfFecha.getText().trim());*/
        
        
    }
    
    @FXML
    void btnCancelAction() {                
        MobileApplication.getInstance().switchToPreviousView();
       
    }
    
    @FXML
    void comboBoxEmpresaAction() {        
       cmbSector.setItems(PruebasRest.getListaSectorTORest(this.cmbEmpresa.getSelectionModel().getSelectedItem().getEmpCodigo()));        
    }
    
    @FXML
    void txtFechaAction() {        
        
        datePicker.showAndWait().ifPresent((x)->{                        
                    txfFecha.setText(x.getYear()+"-"+x.getMonthValue()+"-"+x.getDayOfMonth());                    
            });
    }
}
