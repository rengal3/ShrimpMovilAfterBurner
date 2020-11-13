/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shrimpmovilafterburner.TO;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Renato
 */
public class DatosTablaGramajeTO {    
    
    private final StringProperty id = new SimpleStringProperty();
    private final StringProperty graPiscinaCodigo = new SimpleStringProperty();
    private final StringProperty graPiscinaNombre = new SimpleStringProperty();
    private final DoubleProperty graHectareas = new SimpleDoubleProperty();
    private final LongProperty graFechaSiembra = new SimpleLongProperty();
    private final IntegerProperty graDiasCultivo = new SimpleIntegerProperty();
    private final IntegerProperty graCantidadLarvas = new SimpleIntegerProperty();
    private final DoubleProperty graPesoAnterior = new SimpleDoubleProperty();
    private final DoubleProperty graPesoActual = new SimpleDoubleProperty();
    private final DoubleProperty graBiomasa = new SimpleDoubleProperty();
    private final DoubleProperty graAnimalesM2 = new SimpleDoubleProperty();
    private final DoubleProperty graSobrevivencia = new SimpleDoubleProperty();   
    private final StringProperty graComentario = new SimpleStringProperty();
    
    public StringProperty idProperty() {
        return id;
    }

    @XmlElement(name = "id")
    public String getId() {
        return id.get();
    }
    
    public void setId(String id) {
        this.id.set(id);
    }
    
    public StringProperty graPiscinaCodigoProperty() {
        return graPiscinaCodigo;
    }

    @XmlElement(name = "graPiscinaCodigo")
    public String getGraPiscinaCodigo() {
        return graPiscinaCodigo.get();
    }
    
    public void setGraPiscinaCodigo(String graPiscinaCodigo) {
        this.graPiscinaCodigo.set(graPiscinaCodigo);
    }
    
    public StringProperty graPiscinaNombreProperty() {
        return graPiscinaNombre;
    }

    @XmlElement(name = "graPiscinaNombre")
    public String getGraPiscinaNombre() {
        return graPiscinaNombre.get();
    }
    
    public void setGraPiscinaNombre(String graPiscinaNombre) {
        this.graPiscinaNombre.set(graPiscinaNombre);
    }
    
    public DoubleProperty graHectareasProperty() {
        return graHectareas;
    }

    @XmlElement(name = "graHectareas")
    public Double getGraHectareas() {
        return graHectareas.get();
    }
    
    public void setGraHectareas(Double graHectareas) {
        this.graHectareas.set(graHectareas);
    }
    
    public LongProperty graFechaSiembraProperty() {
        return graFechaSiembra;
    }

    @XmlElement(name = "graFechaSiembra")
    public Long getGraFechaSiembra() {
        return graFechaSiembra.get();
    }
    
    public void setGraFechaSiembra(Long graFechaSiembra) {
        this.graFechaSiembra.set(graFechaSiembra);
    }
    
    public IntegerProperty graDiasCultivoProperty() {
        return graDiasCultivo;
    }

    @XmlElement(name = "graDiasCultivo")
    public Integer getGraDiasCultivo() {
        return graDiasCultivo.get();
    }
    
    public void setGraDiasCultivo(Integer graDiasCultivo) {
        this.graDiasCultivo.set(graDiasCultivo);
    }
    
    public IntegerProperty graCantidadLarvasProperty() {
        return graCantidadLarvas;
    }

    @XmlElement(name = "graCantidadLarvas")
    public Integer getGraCantidadLarvas() {
        return graCantidadLarvas.get();
    }
    
    public void setGraCantidadLarvas(Integer graCantidadLarvas) {
        this.graCantidadLarvas.set(graCantidadLarvas);
    }
    
    public DoubleProperty graPesoAnteriorProperty() {
        return graPesoAnterior;
    }

    @XmlElement(name = "graPesoAnterior")
    public Double getGraPesoAnterior() {
        return graPesoAnterior.get();
    }
    
    public void setGraPesoAnterior(Double graPesoAnterior) {
        this.graPesoAnterior.set(graPesoAnterior);
    }
    
    public DoubleProperty graPesoActualProperty() {
        return graPesoActual;
    }

    @XmlElement(name = "graPesoActual")
    public Double getGraPesoActual() {
        return graPesoActual.get();
    }
    
    public void setGraPesoActual(Double graPesoActual) {
        this.graPesoActual.set(graPesoActual);
    }
    
    public DoubleProperty graBiomasaProperty() {
        return graBiomasa;
    }

    @XmlElement(name = "graBiomasa")
    public Double getGraBiomasa() {
        return graBiomasa.get();
    }
    
    public void setGraBiomasa(Double graBiomasa) {
        this.graBiomasa.set(graBiomasa);
    }
    
    public DoubleProperty graAnimalesM2Property() {
        return graAnimalesM2;
    }

    @XmlElement(name = "graAnimalesM2")
    public Double getGraAnimalesM2() {
        return graAnimalesM2.get();
    }
    
    public void setGraAnimalesM2(Double graAnimalesM2) {
        this.graAnimalesM2.set(graAnimalesM2);
    }
    
    public DoubleProperty graSobrevivenciaProperty() {
        return graSobrevivencia;
    }

    @XmlElement(name = "graSobrevivencia")
    public Double getGraSobrevivencia() {
        return graSobrevivencia.get();
    }
    
    public void setGraSobrevivencia(Double graSobrevivencia) {
        this.graSobrevivencia.set(graSobrevivencia);
    }
    
    public StringProperty graComentarioProperty() {
        return graComentario;
    }

    @XmlElement(name = "graComentario")
    public String getGraComentario() {
        return graComentario.get();
    }
    
    public void setGraComentario(String graComentario) {
        this.graComentario.set(graComentario);
    }
    
}
