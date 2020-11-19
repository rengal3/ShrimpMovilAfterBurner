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
public class PrdPiscina_RestTO implements Serializable{
    private PrdPiscinaPK_RestTO prdPiscinaPK;
    private String pisNombre="";
    private int pisHectareaje=0;
    private boolean pisActiva=false;
    private String usrEmpresa="";
    private String usrCodigo="";
    private String usrFechaInserta= null;//((new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'"))).format(new Date());;
    private String ctaCostoDirecto="";
    private String ctaCostoIndirecto="";
    private String ctaCostoTransferencia="";
    private String ctaCostoProductoTerminado="";
    private List<Object> prdVehiculosList=new ArrayList();
    private List<Object> prdLiquidacionList=new ArrayList();
    private List<Object> prdCorridaList=new ArrayList();
    private List<Object> prdGrameajeList=new ArrayList();
    private PrdSectorTO prdSector;

    public PrdPiscina_RestTO(){
        
    }
    public PrdPiscinaPK_RestTO getPrdPiscinaPK() {
        return prdPiscinaPK;
    }

    public void setPrdPiscinaPK(PrdPiscinaPK_RestTO prdPiscinaPK) {
        this.prdPiscinaPK = prdPiscinaPK;
    }

    public String getPisNombre() {
        return pisNombre;
    }

    public void setPisNombre(String pisNombre) {
        this.pisNombre = pisNombre;
    }

    public int getPisHectareaje() {
        return pisHectareaje;
    }

    public void setPisHectareaje(int pisHectareaje) {
        this.pisHectareaje = pisHectareaje;
    }

    public boolean isPisActiva() {
        return pisActiva;
    }

    public void setPisActiva(boolean pisActiva) {
        this.pisActiva = pisActiva;
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

   

    public String getCtaCostoDirecto() {
        return ctaCostoDirecto;
    }

    public void setCtaCostoDirecto(String ctaCostoDirecto) {
        this.ctaCostoDirecto = ctaCostoDirecto;
    }

    public String getCtaCostoIndirecto() {
        return ctaCostoIndirecto;
    }

    public void setCtaCostoIndirecto(String ctaCostoIndirecto) {
        this.ctaCostoIndirecto = ctaCostoIndirecto;
    }

    public String getCtaCostoTransferencia() {
        return ctaCostoTransferencia;
    }

    public void setCtaCostoTransferencia(String ctaCostoTransferencia) {
        this.ctaCostoTransferencia = ctaCostoTransferencia;
    }

    public String getCtaCostoProductoTerminado() {
        return ctaCostoProductoTerminado;
    }

    public void setCtaCostoProductoTerminado(String ctaCostoProductoTerminado) {
        this.ctaCostoProductoTerminado = ctaCostoProductoTerminado;
    }

    public List<Object> getPrdVehiculosList() {
        return prdVehiculosList;
    }

    public void setPrdVehiculosList(List<Object> prdVehiculosList) {
        this.prdVehiculosList = prdVehiculosList;
    }

    public List<Object> getPrdLiquidacionList() {
        return prdLiquidacionList;
    }

    public void setPrdLiquidacionList(List<Object> prdLiquidacionList) {
        this.prdLiquidacionList = prdLiquidacionList;
    }

    public List<Object> getPrdCorridaList() {
        return prdCorridaList;
    }

    public void setPrdCorridaList(List<Object> prdCorridaList) {
        this.prdCorridaList = prdCorridaList;
    }

    public List<Object> getPrdGrameajeList() {
        return prdGrameajeList;
    }

    public void setPrdGrameajeList(List<Object> prdGrameajeList) {
        this.prdGrameajeList = prdGrameajeList;
    }

    public PrdSectorTO getPrdSector() {
        return prdSector;
    }

    public void setPrdSector(PrdSectorTO prdSector) {
        this.prdSector = prdSector;
    }
    
    
    
}
