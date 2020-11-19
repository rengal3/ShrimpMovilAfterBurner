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
import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.mvc.View;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;
import com.gluonhq.connect.GluonObservableList;
import com.shrimpmovilafterburner.ShrimpMovilAfterBurner;
import com.shrimpmovilafterburner.TO.DatosTablaGramajeTO;
import com.shrimpmovilafterburner.TO.RespuestaOperacionRestTO;
import com.shrimpmovilafterburner.rest.PruebasRest;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import javafx.util.converter.DoubleStringConverter;
import javafx.fxml.FXML;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

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
    
    private String idEmpresa, fecha,codSector;
    
    
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
        this.tblclincremento.setCellValueFactory(new PropertyValueFactory<DatosTablaGramajeTO,Double>("graIncremento"));
        this.tblclcomentario.setCellValueFactory(new PropertyValueFactory<DatosTablaGramajeTO,String>("graComentario"));
          
        
        DoubleStringConverter dconverter=new DoubleStringConverter();
        this.tblclgramospromedio.setEditable(true);
        this.tblclgramospromedio.setCellFactory(TextFieldTableCell.<DatosTablaGramajeTO,Double>forTableColumn(dconverter));
        this.tblclsobrevivientes.setEditable(true);
        this.tblclsobrevivientes.setCellFactory(TextFieldTableCell.<DatosTablaGramajeTO,Double>forTableColumn(dconverter));
        this.tblclanimales.setEditable(true);
        this.tblclanimales.setCellFactory(TextFieldTableCell.<DatosTablaGramajeTO,Double>forTableColumn(dconverter));
        this.tblclcomentario.setEditable(true);
        this.tblclcomentario.setCellFactory(TextFieldTableCell.forTableColumn());
        
        
       
        tblclgramospromedio.setOnEditCommit((TableColumn.CellEditEvent<DatosTablaGramajeTO, Double> t) -> {            
            ((DatosTablaGramajeTO)t.getTableView().getItems().get(
            t.getTablePosition().getRow())).setGraPesoActual(t.getNewValue());
            ((DatosTablaGramajeTO)t.getTableView().getItems().get(
            t.getTablePosition().getRow())).setGuardar();           
        });
        tblclsobrevivientes.setOnEditCommit((TableColumn.CellEditEvent<DatosTablaGramajeTO, Double> t) -> {            
            ((DatosTablaGramajeTO)t.getTableView().getItems().get(
            t.getTablePosition().getRow())).setGraSobrevivencia(t.getNewValue());
            ((DatosTablaGramajeTO)t.getTableView().getItems().get(
            t.getTablePosition().getRow())).setGuardar(); 
            
            double biomasa=((DatosTablaGramajeTO)t.getTableView().getItems().get(
            t.getTablePosition().getRow())).getGraPesoActual().doubleValue()*((DatosTablaGramajeTO)t.getTableView().getItems().get(
            t.getTablePosition().getRow())).getGraCantidadLarvas().doubleValue()/Double.valueOf("453.6").doubleValue();
            ((DatosTablaGramajeTO)t.getTableView().getItems().get(
                    t.getTablePosition().getRow())).setGraBiomasa(ConsultaEditaGramajePresenter.round(biomasa, 2));
            
        });
        tblclanimales.setOnEditCommit((TableColumn.CellEditEvent<DatosTablaGramajeTO, Double> t) -> {            
            double sobrevivencia=0;
            double hectareas=((DatosTablaGramajeTO)t.getTableView().getItems().get(
                    t.getTablePosition().getRow())).getGraHectareas()*10000;
            double nAnimM2=((DatosTablaGramajeTO)t.getTableView().getItems().get(
                    t.getTablePosition().getRow())).getGraCantidadLarvas().doubleValue()/hectareas;
            sobrevivencia=(t.getNewValue().doubleValue()*100)/nAnimM2;
            ((DatosTablaGramajeTO)t.getTableView().getItems().get(
            t.getTablePosition().getRow())).setGraSobrevivencia(ConsultaEditaGramajePresenter.round(sobrevivencia, 2));
            
             double biomasa=((DatosTablaGramajeTO)t.getTableView().getItems().get(
            t.getTablePosition().getRow())).getGraPesoActual().doubleValue()*((DatosTablaGramajeTO)t.getTableView().getItems().get(
            t.getTablePosition().getRow())).getGraCantidadLarvas().doubleValue()/Double.valueOf("453.6").doubleValue();
            ((DatosTablaGramajeTO)t.getTableView().getItems().get(
                    t.getTablePosition().getRow())).setGraBiomasa(ConsultaEditaGramajePresenter.round(biomasa, 2));
            
            ((DatosTablaGramajeTO)t.getTableView().getItems().get(
            t.getTablePosition().getRow())).setGraAnimalesM2(t.getNewValue());
            ((DatosTablaGramajeTO)t.getTableView().getItems().get(
            t.getTablePosition().getRow())).setGuardar();           
        });
        tblclcomentario.setOnEditCommit((TableColumn.CellEditEvent<DatosTablaGramajeTO, String> t) -> {            
            ((DatosTablaGramajeTO)t.getTableView().getItems().get(
            t.getTablePosition().getRow())).setGraComentario(t.getNewValue());
            ((DatosTablaGramajeTO)t.getTableView().getItems().get(
            t.getTablePosition().getRow())).setGuardar();           
        });
        tbvgrameajes.setItems(this.listaDatos);  
        tbvgrameajes.setEditable(true);
    }
    
    void llenaTablaGramaje(GluonObservableList<DatosTablaGramajeTO> listaDatos, String idempresa, String codsector,String fecha){
        this.fecha=fecha;
        this.idEmpresa=idempresa;
        this.codSector=codsector;
        this.listaDatos=listaDatos;
        this.tbvgrameajes.setItems(this.listaDatos);  
        this.tbvgrameajes.refresh();
    }
    
    @FXML
    void btnGuardarAction() {
        Alert confirma = new Alert(javafx.scene.control.Alert.AlertType.CONFIRMATION, 
                "¿Desea guardar los cambios?");
        confirma.showAndWait().ifPresent(result -> {            
            if (result == ButtonType.OK) {                                 
                List<DatosTablaGramajeTO> listaGuardar=new ArrayList<DatosTablaGramajeTO>();
                for(DatosTablaGramajeTO in:this.tbvgrameajes.getItems()){
                    if(in.isGuardar()){
                        listaGuardar.add(in);                
                    }            

                }
                if (listaGuardar.size()<1){
                     Alert alert = new Alert(javafx.scene.control.Alert.AlertType.INFORMATION,
                            "No hay datos para guardar");
                      alert.showAndWait();
                      return;
                }
                RespuestaOperacionRestTO retorno = PruebasRest.setDatosTablaGramajeTORest(idEmpresa, codSector, fecha, listaGuardar);
                if (retorno ==null){
                    Alert alert = new Alert(javafx.scene.control.Alert.AlertType.ERROR, "Hubo errores al guardar los datos\nProblemas de conexion");
                    alert.showAndWait();
                }else{
                    if(retorno.getOperacionMensaje().contains("ERROR")){
                        Alert alert = new Alert(javafx.scene.control.Alert.AlertType.ERROR,
                            "Error al guardar los datos\n"+retorno.getOperacionMensaje());
                        alert.showAndWait();
                    }else{
                        Alert alert = new Alert(javafx.scene.control.Alert.AlertType.INFORMATION,
                            "Se guardaron los datos\n"+retorno.getOperacionMensaje());
                        alert.showAndWait();
                    }

                }

            }
         });

    }
    
    @FXML
    void btnCancelaAction() {        
        listaDatos.clear();
        this.tbvgrameajes.setItems(this.listaDatos);  
        this.tbvgrameajes.refresh();
        AppViewManager.INGRESAGRAMAJE_VIEW.switchView();
       
    }
    
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
