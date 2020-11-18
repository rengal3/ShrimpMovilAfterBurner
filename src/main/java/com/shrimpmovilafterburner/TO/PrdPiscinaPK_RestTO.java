/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shrimpmovilafterburner.TO;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 *
 * @author Renato
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
public class PrdPiscinaPK_RestTO implements Serializable{
    private String pisEmpresa="";
    private String pisSector="";
    private String pisNumero="";

    public PrdPiscinaPK_RestTO(String idempresa, String idsector, String numPiscina){
        this.pisEmpresa=idempresa;
        this.pisNumero=numPiscina;
        this.pisSector=idsector;
    }
    public String getPisEmpresa() {
        return pisEmpresa;
    }

    public void setPisEmpresa(String pisEmpresa) {
        this.pisEmpresa = pisEmpresa;
    }

    public String getPisSector() {
        return pisSector;
    }

    public void setPisSector(String pisSector) {
        this.pisSector = pisSector;
    }

    public String getPisNumero() {
        return pisNumero;
    }

    public void setPisNumero(String pisNumero) {
        this.pisNumero = pisNumero;
    }
    
    
    
}
