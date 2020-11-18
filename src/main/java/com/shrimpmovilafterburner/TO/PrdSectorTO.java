/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shrimpmovilafterburner.TO;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 *
 * @author Renato
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
public class PrdSectorTO implements Serializable{
    private PrdSectorPK_RestTO prdSectorPK;
    private String secNombre="";
    private String secLatitud="";
    private String secLongitud="";
    private boolean secActivo=false;
    private String usrEmpresa="";
    private String usrCodigo="";
    private String usrFechaInserta= ((new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'"))).format(new Date());
    private String secDireccion="";
    private String secTelefono="";
    private List<Object> prdSobrevivenciaList=new ArrayList();
    private List<Object> prdPiscinaList=new ArrayList();

    public PrdSectorTO(){
        this.prdSectorPK=new PrdSectorPK_RestTO();
    }
    public PrdSectorPK_RestTO getPrdSectorPK() {
        return prdSectorPK;
    }

    public void setPrdSectorPK(PrdSectorPK_RestTO prdSectorPK) {
        this.prdSectorPK = prdSectorPK;
    }

    public String getSecNombre() {
        return secNombre;
    }

    public void setSecNombre(String secNombre) {
        this.secNombre = secNombre;
    }

    public String getSecLatitud() {
        return secLatitud;
    }

    public void setSecLatitud(String secLatitud) {
        this.secLatitud = secLatitud;
    }

    public String getSecLongitud() {
        return secLongitud;
    }

    public void setSecLongitud(String secLongitud) {
        this.secLongitud = secLongitud;
    }

    public boolean isSecActivo() {
        return secActivo;
    }

    public void setSecActivo(boolean secActivo) {
        this.secActivo = secActivo;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public String getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(String usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

   
    public String getSecDireccion() {
        return secDireccion;
    }

    public void setSecDireccion(String secDireccion) {
        this.secDireccion = secDireccion;
    }

    public String getSecTelefono() {
        return secTelefono;
    }

    public void setSecTelefono(String secTelefono) {
        this.secTelefono = secTelefono;
    }

    public List<Object> getPrdSobrevivenciaList() {
        return prdSobrevivenciaList;
    }

    public void setPrdSobrevivenciaList(List<Object> prdSobrevivenciaList) {
        this.prdSobrevivenciaList = prdSobrevivenciaList;
    }

    public List<Object> getPrdPiscinaList() {
        return prdPiscinaList;
    }

    public void setPrdPiscinaList(List<Object> prdPiscinaList) {
        this.prdPiscinaList = prdPiscinaList;
    }
    
    
    
}
