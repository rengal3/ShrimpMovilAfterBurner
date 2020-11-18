/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shrimpmovilafterburner.TO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Renato
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class RespuestaOperacionRestTO {
    
    private String estadoOperacion;
    private String operacionMensaje;
    private boolean extraInfo;

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

    public boolean isExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(boolean extraInfo) {
        this.extraInfo = extraInfo;
    }
            
    
}
