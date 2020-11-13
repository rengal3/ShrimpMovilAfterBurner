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

@XmlAccessorType(XmlAccessType.PROPERTY)
class ParametroTO {
    public String parEmpresa;
    public String parGerente;
    public String parGerenteTipoId;
    public String parGerenteId;
    public String parContador;
    public String parContadorRuc;
    public String parFinanciero;
    public String parFinancieroId;
    public String parActividad;
    public String parEscogerPrecioPor;
    public boolean parObligadoLlevarContabilidad;
    public String parResolucionContribuyenteEspecial;
    public int parColumnasEstadosFinancieros;
    public Object parCodigoDinardap;
    public Object parWebDocumentosElectronicos;
    public boolean parObligadoEmitirDocumentosElectronicos;
    public boolean parObligadoRegistrarLiquidacionPesca;
    public boolean parObligadoAprobarPagos;
    public EmpCodigoTO empCodigo;
    public String parRutaReportes;
    public String parRutaLogo;
    public boolean isExportadora;
    public Object parTextoAgrupacion;
    public boolean parContribuyenteRegimenMicroempresa;
    public String parAgenteRetencion;
    public Object parRutaImagen;

    public String getParEmpresa() {
        return parEmpresa;
    }

    public void setParEmpresa(String parEmpresa) {
        this.parEmpresa = parEmpresa;
    }

    public String getParGerente() {
        return parGerente;
    }

    public void setParGerente(String parGerente) {
        this.parGerente = parGerente;
    }

    public String getParGerenteTipoId() {
        return parGerenteTipoId;
    }

    public void setParGerenteTipoId(String parGerenteTipoId) {
        this.parGerenteTipoId = parGerenteTipoId;
    }

    public String getParGerenteId() {
        return parGerenteId;
    }

    public void setParGerenteId(String parGerenteId) {
        this.parGerenteId = parGerenteId;
    }

    public String getParContador() {
        return parContador;
    }

    public void setParContador(String parContador) {
        this.parContador = parContador;
    }

    public String getParContadorRuc() {
        return parContadorRuc;
    }

    public void setParContadorRuc(String parContadorRuc) {
        this.parContadorRuc = parContadorRuc;
    }

    public String getParFinanciero() {
        return parFinanciero;
    }

    public void setParFinanciero(String parFinanciero) {
        this.parFinanciero = parFinanciero;
    }

    public String getParFinancieroId() {
        return parFinancieroId;
    }

    public void setParFinancieroId(String parFinancieroId) {
        this.parFinancieroId = parFinancieroId;
    }

    public String getParActividad() {
        return parActividad;
    }

    public void setParActividad(String parActividad) {
        this.parActividad = parActividad;
    }

    public String getParEscogerPrecioPor() {
        return parEscogerPrecioPor;
    }

    public void setParEscogerPrecioPor(String parEscogerPrecioPor) {
        this.parEscogerPrecioPor = parEscogerPrecioPor;
    }

    public boolean isParObligadoLlevarContabilidad() {
        return parObligadoLlevarContabilidad;
    }

    public void setParObligadoLlevarContabilidad(boolean parObligadoLlevarContabilidad) {
        this.parObligadoLlevarContabilidad = parObligadoLlevarContabilidad;
    }

    public String getParResolucionContribuyenteEspecial() {
        return parResolucionContribuyenteEspecial;
    }

    public void setParResolucionContribuyenteEspecial(String parResolucionContribuyenteEspecial) {
        this.parResolucionContribuyenteEspecial = parResolucionContribuyenteEspecial;
    }

    public int getParColumnasEstadosFinancieros() {
        return parColumnasEstadosFinancieros;
    }

    public void setParColumnasEstadosFinancieros(int parColumnasEstadosFinancieros) {
        this.parColumnasEstadosFinancieros = parColumnasEstadosFinancieros;
    }

    public Object getParCodigoDinardap() {
        return parCodigoDinardap;
    }

    public void setParCodigoDinardap(Object parCodigoDinardap) {
        this.parCodigoDinardap = parCodigoDinardap;
    }

    public Object getParWebDocumentosElectronicos() {
        return parWebDocumentosElectronicos;
    }

    public void setParWebDocumentosElectronicos(Object parWebDocumentosElectronicos) {
        this.parWebDocumentosElectronicos = parWebDocumentosElectronicos;
    }

    public boolean isParObligadoEmitirDocumentosElectronicos() {
        return parObligadoEmitirDocumentosElectronicos;
    }

    public void setParObligadoEmitirDocumentosElectronicos(boolean parObligadoEmitirDocumentosElectronicos) {
        this.parObligadoEmitirDocumentosElectronicos = parObligadoEmitirDocumentosElectronicos;
    }

    public boolean isParObligadoRegistrarLiquidacionPesca() {
        return parObligadoRegistrarLiquidacionPesca;
    }

    public void setParObligadoRegistrarLiquidacionPesca(boolean parObligadoRegistrarLiquidacionPesca) {
        this.parObligadoRegistrarLiquidacionPesca = parObligadoRegistrarLiquidacionPesca;
    }

    public boolean isParObligadoAprobarPagos() {
        return parObligadoAprobarPagos;
    }

    public void setParObligadoAprobarPagos(boolean parObligadoAprobarPagos) {
        this.parObligadoAprobarPagos = parObligadoAprobarPagos;
    }

    public EmpCodigoTO getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(EmpCodigoTO empCodigo) {
        this.empCodigo = empCodigo;
    }

    public String getParRutaReportes() {
        return parRutaReportes;
    }

    public void setParRutaReportes(String parRutaReportes) {
        this.parRutaReportes = parRutaReportes;
    }

    public String getParRutaLogo() {
        return parRutaLogo;
    }

    public void setParRutaLogo(String parRutaLogo) {
        this.parRutaLogo = parRutaLogo;
    }

    public boolean isIsExportadora() {
        return isExportadora;
    }

    public void setIsExportadora(boolean isExportadora) {
        this.isExportadora = isExportadora;
    }

    public Object getParTextoAgrupacion() {
        return parTextoAgrupacion;
    }

    public void setParTextoAgrupacion(Object parTextoAgrupacion) {
        this.parTextoAgrupacion = parTextoAgrupacion;
    }

    public boolean isParContribuyenteRegimenMicroempresa() {
        return parContribuyenteRegimenMicroempresa;
    }

    public void setParContribuyenteRegimenMicroempresa(boolean parContribuyenteRegimenMicroempresa) {
        this.parContribuyenteRegimenMicroempresa = parContribuyenteRegimenMicroempresa;
    }

    public String getParAgenteRetencion() {
        return parAgenteRetencion;
    }

    public void setParAgenteRetencion(String parAgenteRetencion) {
        this.parAgenteRetencion = parAgenteRetencion;
    }

    public Object getParRutaImagen() {
        return parRutaImagen;
    }

    public void setParRutaImagen(Object parRutaImagen) {
        this.parRutaImagen = parRutaImagen;
    }
    
    
}
