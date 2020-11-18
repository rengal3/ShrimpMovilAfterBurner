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
    private String graFecha= ((new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'"))).format(new Date());

    public PrdGrameajePK_RestTO(){
        
    }
    
     public PrdGrameajePK_RestTO(String idempresa, String codsector,String idpiscina){
        
        this.graEmpresa=idempresa;
        this.graSector=codsector;
        this.graPiscina=idpiscina;                
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

    public String getGraFecha() {
        return graFecha;
    }

    public void setGraFecha(String graFecha) {
        this.graFecha = graFecha;
    }
    
    
    
}
