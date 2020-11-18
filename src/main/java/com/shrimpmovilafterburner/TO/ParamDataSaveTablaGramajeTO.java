/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shrimpmovilafterburner.TO;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Renato
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class ParamDataSaveTablaGramajeTO implements Serializable{    

    private List<GrameajeParamRestTO> listaGrameajes;
    private String fecha;
    private SisInfoTO sisInfoTO;
    
    public ParamDataSaveTablaGramajeTO() {
    }

    public List<GrameajeParamRestTO> getListaGrameajes() {
        return listaGrameajes;
    }

    public void setListaGrameajes(List<GrameajeParamRestTO> listaGrameajes) {
        this.listaGrameajes = listaGrameajes;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public SisInfoTO getSisInfoTO() {
        return sisInfoTO;
    }

    public void setSisInfoTO(SisInfoTO sisInfoTO) {
        this.sisInfoTO = sisInfoTO;
    }

    
    }
