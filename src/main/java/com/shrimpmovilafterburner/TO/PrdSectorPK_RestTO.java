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
public class PrdSectorPK_RestTO implements Serializable{
    private String secEmpresa="";
    private String secCodigo="";

    public PrdSectorPK_RestTO(){
        this.secCodigo="";
        this.secEmpresa="";
    }
    public String getSecEmpresa() {
        return secEmpresa;
    }

    public void setSecEmpresa(String secEmpresa) {
        this.secEmpresa = secEmpresa;
    }

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
    }
    
            
    
}
