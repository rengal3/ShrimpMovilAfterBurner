/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shrimpmovilafterburner.TO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Renato
 */
@XmlRootElement
public class CboEmpresaTO implements Serializable{
    @XmlElement(name="estadoOperacion")
    private String estadoOperacion;
    @XmlElement(name="operacionMensaje")
    private String operacionMensaje;
    @XmlElementWrapper
    @XmlElement(name="extraInfo")
    private List<DatosEmpresaTO> extraInfo;

    public CboEmpresaTO() {
    }

    public String getEstadoOperacion() {
        return estadoOperacion;
    }

    public void setEstadoOperacion(String estadoOperacion) {
        this.estadoOperacion = estadoOperacion;
    }

    public String getOperacionMensaje() {
        return operacionMensaje;
    }

    public void setOperacionMensaje(String operacionMensaje) {
        this.operacionMensaje = operacionMensaje;
    }

    public List<DatosEmpresaTO> getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(List<DatosEmpresaTO> extraInfo) {
        this.extraInfo = extraInfo;
    }
    
}
