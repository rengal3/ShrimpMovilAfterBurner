/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shrimpmovilafterburner.TO;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 *
 * @author Renato
 */

@XmlAccessorType(XmlAccessType.PROPERTY)
public class GrameajeParamRestTO implements Serializable{
    private PrdGrameajePK_RestTO prdGrameajePK;
    private double graTgrande=0;
    private double graTmediano=0;
    private double graTpequeno=0;
    private double graTpromedio=0;
    private double graItgrande=0;
    private double graItmediano=0;
    private double graItpequeno=0;
    private double graIpromedio=0;
    private double graBiomasa=0;
    private double graSobrevivencia=0;
    private double graAlimentacion=0;
    private double graLibrasBalanceado=0;
    private double graCostoDirecto=0;
    private double graCostoIndirecto=0;
    private String graComentario="";
    private boolean graAnulado=false;
    private String usrEmpresa="";
    private String usrCodigo="";
    private String  usrFechaInserta=
            ((new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'"))).format(new Date());
    
    private PrdPiscina_RestTO prdPiscina;

    public PrdGrameajePK_RestTO getPrdGrameajePK() {
        return prdGrameajePK;
    }

    public void setPrdGrameajePK(PrdGrameajePK_RestTO prdGrameajePK) {
        this.prdGrameajePK = prdGrameajePK;
    }

    public double getGraTgrande() {
        return graTgrande;
    }

    public void setGraTgrande(double graTgrande) {
        this.graTgrande = graTgrande;
    }

    public double getGraTmediano() {
        return graTmediano;
    }

    public void setGraTmediano(double graTmediano) {
        this.graTmediano = graTmediano;
    }

    public double getGraTpequeno() {
        return graTpequeno;
    }

    public void setGraTpequeno(double graTpequeno) {
        this.graTpequeno = graTpequeno;
    }

    public double getGraTpromedio() {
        return graTpromedio;
    }

    public void setGraTpromedio(double graTpromedio) {
        this.graTpromedio = graTpromedio;
    }

    public double getGraItgrande() {
        return graItgrande;
    }

    public void setGraItgrande(double graItgrande) {
        this.graItgrande = graItgrande;
    }

    public double getGraItmediano() {
        return graItmediano;
    }

    public void setGraItmediano(double graItmediano) {
        this.graItmediano = graItmediano;
    }

    public double getGraItpequeno() {
        return graItpequeno;
    }

    public void setGraItpequeno(double graItpequeno) {
        this.graItpequeno = graItpequeno;
    }

    public double getGraIpromedio() {
        return graIpromedio;
    }

    public void setGraIpromedio(double graIpromedio) {
        this.graIpromedio = graIpromedio;
    }

    public double getGraBiomasa() {
        return graBiomasa;
    }

    public void setGraBiomasa(double graBiomasa) {
        this.graBiomasa = graBiomasa;
    }

    public double getGraSobrevivencia() {
        return graSobrevivencia;
    }

    public void setGraSobrevivencia(double graSobrevivencia) {
        this.graSobrevivencia = graSobrevivencia;
    }

    public double getGraAlimentacion() {
        return graAlimentacion;
    }

    public void setGraAlimentacion(double graAlimentacion) {
        this.graAlimentacion = graAlimentacion;
    }

    public double getGraLibrasBalanceado() {
        return graLibrasBalanceado;
    }

    public void setGraLibrasBalanceado(double graLibrasBalanceado) {
        this.graLibrasBalanceado = graLibrasBalanceado;
    }

    public double getGraCostoDirecto() {
        return graCostoDirecto;
    }

    public void setGraCostoDirecto(double graCostoDirecto) {
        this.graCostoDirecto = graCostoDirecto;
    }

    public double getGraCostoIndirecto() {
        return graCostoIndirecto;
    }

    public void setGraCostoIndirecto(double graCostoIndirecto) {
        this.graCostoIndirecto = graCostoIndirecto;
    }

    public String getGraComentario() {
        return graComentario;
    }

    public void setGraComentario(String graComentario) {
        this.graComentario = graComentario;
    }

    public boolean isGraAnulado() {
        return graAnulado;
    }

    public void setGraAnulado(boolean graAnulado) {
        this.graAnulado = graAnulado;
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

   

    public PrdPiscina_RestTO getPrdPiscina() {
        return prdPiscina;
    }

    public void setPrdPiscina(PrdPiscina_RestTO prdPiscina) {
        this.prdPiscina = prdPiscina;
    }
    
    
    
}
