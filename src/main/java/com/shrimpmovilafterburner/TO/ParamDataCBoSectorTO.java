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
public class ParamDataCBoSectorTO implements Serializable{
    private String empresa;
    private boolean mostrarInactivo;
    private SisInfoTO sisInfoTO;

    public ParamDataCBoSectorTO() {
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public boolean isMostrarInactivo() {
        return mostrarInactivo;
    }

    public void setMostrarInactivo(boolean mostrarInactivo) {
        this.mostrarInactivo = mostrarInactivo;
    }   

    public SisInfoTO getSisInfoTO() {
        return sisInfoTO;
    }

    public void setSisInfoTO(SisInfoTO sisInfoTO) {
        this.sisInfoTO = sisInfoTO;
    }            
}
