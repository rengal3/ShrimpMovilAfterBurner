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
public class ParamDataCBoEmpresaTO implements Serializable{
    private String item;
    private SisInfoTO sisInfoTO;

    public ParamDataCBoEmpresaTO() {
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public SisInfoTO getSisInfoTO() {
        return sisInfoTO;
    }

    public void setSisInfoTO(SisInfoTO sisInfoTO) {
        this.sisInfoTO = sisInfoTO;
    }
    
    
    
}
