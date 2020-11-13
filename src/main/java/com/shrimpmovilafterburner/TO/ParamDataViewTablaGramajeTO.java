/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shrimpmovilafterburner.TO;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Renato
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class ParamDataViewTablaGramajeTO implements Serializable{
    private String empresa;
    private String fecha;
    private String sector;
    private boolean incluirTodos;
    private SisInfoTO sisInfoTO;

    public ParamDataViewTablaGramajeTO() {
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public boolean isIncluirTodos() {
        return incluirTodos;
    }

    public void setIncluirTodos(boolean incluirTodos) {
        this.incluirTodos = incluirTodos;
    }

    public SisInfoTO getSisInfoTO() {
        return sisInfoTO;
    }

    public void setSisInfoTO(SisInfoTO sisInfoTO) {
        this.sisInfoTO = sisInfoTO;
    }

      
}
