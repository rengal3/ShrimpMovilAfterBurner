/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shrimpmovilafterburner.views;

import com.gluonhq.charm.glisten.afterburner.GluonPresenter;
import com.gluonhq.charm.glisten.animation.BounceInRightTransition;
import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.mvc.View;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;
import com.gluonhq.connect.GluonObservableList;
import com.shrimpmovilafterburner.ShrimpMovilAfterBurner;
import com.shrimpmovilafterburner.TO.DatosTablaGramajeTO;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author Renato
 */
public class ConsultaEditaGramajePresenter extends GluonPresenter<ShrimpMovilAfterBurner>{
    @FXML
    private View consultaeditagrameaje; 
    
    @FXML
    private TableView<DatosTablaGramajeTO> tbvgrameajes;
    
    @FXML
    private TableColumn<DatosTablaGramajeTO,String> tblclpiscina;
    
    @FXML
    private TableColumn<DatosTablaGramajeTO,Double> tblclhectarea;
    
    @FXML
    private TableColumn<DatosTablaGramajeTO,Integer> tblcldiascultivo;
    
    @FXML
    private TableColumn<DatosTablaGramajeTO,Integer> tblcllarvas;
    
    @FXML
    private TableColumn<DatosTablaGramajeTO,Double> tblclultimopeso;
    
    @FXML
    private TableColumn<DatosTablaGramajeTO,Double> tblclgramospromedio;
    
    @FXML
    private TableColumn<DatosTablaGramajeTO,Double> tblclbiomasa;
    
    @FXML
    private TableColumn<DatosTablaGramajeTO,Double> tblclsobrevivientes;
    
    @FXML
    private TableColumn<DatosTablaGramajeTO,Double> tblclanimales;
    
    @FXML
    private TableColumn<DatosTablaGramajeTO,Double> tblclincremento;
    
    @FXML
    private TableColumn<DatosTablaGramajeTO,String> tblclcomentario;
    
    
    private  GluonObservableList<DatosTablaGramajeTO> listaDatos;
    
    
    public void initialize() {                   
        consultaeditagrameaje.setShowTransitionFactory(BounceInRightTransition::new);        
               
        consultaeditagrameaje.showingProperty().addListener((obs, oldValue, newValue) -> {
            if (newValue) {
                AppBar appBar = MobileApplication.getInstance().getAppBar();
                appBar.setNavIcon(MaterialDesignIcon.MENU.button(e -> 
                        MobileApplication.getInstance().getDrawer().open()));
                appBar.setTitleText("Editar Gramaje");                
            }
        });
    
        /********************************************/
        this.tblclpiscina.setCellValueFactory(new PropertyValueFactory<DatosTablaGramajeTO,String>("graPiscinaNombre"));
        this.tblclpiscina.setPrefWidth(120);
        this.tblclhectarea.setCellValueFactory(new PropertyValueFactory<DatosTablaGramajeTO,Double>("graHectareas"));
        this.tblcldiascultivo.setCellValueFactory(new PropertyValueFactory<DatosTablaGramajeTO,Integer>("graDiasCultivo"));
        this.tblcllarvas.setCellValueFactory(new PropertyValueFactory<DatosTablaGramajeTO,Integer>("graCantidadLarvas"));
        this.tblclultimopeso.setCellValueFactory(new PropertyValueFactory<DatosTablaGramajeTO,Double>("graPesoAnterior"));
        this.tblclgramospromedio.setCellValueFactory(new PropertyValueFactory<DatosTablaGramajeTO,Double>("graPesoActual"));
        this.tblclbiomasa.setCellValueFactory(new PropertyValueFactory<DatosTablaGramajeTO,Double>("graBiomasa"));
        this.tblclsobrevivientes.setCellValueFactory(new PropertyValueFactory<DatosTablaGramajeTO,Double>("graSobrevivencia"));
        this.tblclanimales.setCellValueFactory(new PropertyValueFactory<DatosTablaGramajeTO,Double>("graAnimalesM2"));
        this.tblclcomentario.setCellValueFactory(new PropertyValueFactory<DatosTablaGramajeTO,String>("graComentario"));
          
        tbvgrameajes.setItems(this.listaDatos);  
        tbvgrameajes.setEditable(true);
    }
    
    void llenaTablaGramaje(GluonObservableList<DatosTablaGramajeTO> listaDatos){
        this.listaDatos=listaDatos;
        this.tbvgrameajes.setItems(this.listaDatos);  
        this.tbvgrameajes.refresh();
    }
    
    @FXML
    void btnCancelAction() {        
        listaDatos.clear();
        this.tbvgrameajes.setItems(this.listaDatos);  
        this.tbvgrameajes.refresh();
        AppViewManager.INGRESAGRAMAJE_VIEW.switchView();
       
    }
}
