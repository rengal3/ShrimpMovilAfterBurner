/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shrimpmovilafterburner.TO;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Renato
 */

@XmlAccessorType(XmlAccessType.PROPERTY)
public class PrdGrameajePK_RestTO implements Serializable{
    private String graEmpresa;
    private String graSector;
    private String graPiscina;
    private long graFecha;

    public PrdGrameajePK_RestTO(){
        
    }
    
     public PrdGrameajePK_RestTO(String idempresa, String codsector,String idpiscina,long fecha){
        
        this.graEmpresa=idempresa;
        this.graSector=codsector;
        this.graPiscina=idpiscina;  
        this.graFecha=fecha;
    }
    
    public String getGraEmpresa() {
        return graEmpresa;
    }

    public void setGraEmpresa(String graEmpresa) {
        this.graEmpresa = graEmpresa;
    }

    public String getGraSector() {
        return graSector;
    }

    public void setGraSector(String graSector) {
        this.graSector = graSector;
    }

    public String getGraPiscina() {
        return graPiscina;
    }

    public void setGraPiscina(String graPiscina) {
        this.graPiscina = graPiscina;
    }

    public Long getGraFecha() {
        return graFecha;
    }

    public void setGraFecha(Long graFecha) {
        this.graFecha = graFecha;
    }

  
    
    
    
}
