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
@XmlRootElement(name = "EmpCodigo")
@XmlAccessorType(XmlAccessType.PROPERTY)
class EmpCodigoTO {
    public String empCodigo;
    public Object empRuc;
    public Object empNombre;
    public Object empRazonSocial;
    public Object empDireccion;
    public Object empCiudad;
    public Object empTelefono;
    public Object empCelular;
    public Object empEmail;
    public Object empClave;
    public Object empActiva;
    public String usrCodigo;
    public Object usrFechaInsertaEmpresa;
    public Object empPais;

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public Object getEmpRuc() {
        return empRuc;
    }

    public void setEmpRuc(Object empRuc) {
        this.empRuc = empRuc;
    }

    public Object getEmpNombre() {
        return empNombre;
    }

    public void setEmpNombre(Object empNombre) {
        this.empNombre = empNombre;
    }

    public Object getEmpRazonSocial() {
        return empRazonSocial;
    }

    public void setEmpRazonSocial(Object empRazonSocial) {
        this.empRazonSocial = empRazonSocial;
    }

    public Object getEmpDireccion() {
        return empDireccion;
    }

    public void setEmpDireccion(Object empDireccion) {
        this.empDireccion = empDireccion;
    }

    public Object getEmpCiudad() {
        return empCiudad;
    }

    public void setEmpCiudad(Object empCiudad) {
        this.empCiudad = empCiudad;
    }

    public Object getEmpTelefono() {
        return empTelefono;
    }

    public void setEmpTelefono(Object empTelefono) {
        this.empTelefono = empTelefono;
    }

    public Object getEmpCelular() {
        return empCelular;
    }

    public void setEmpCelular(Object empCelular) {
        this.empCelular = empCelular;
    }

    public Object getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(Object empEmail) {
        this.empEmail = empEmail;
    }

    public Object getEmpClave() {
        return empClave;
    }

    public void setEmpClave(Object empClave) {
        this.empClave = empClave;
    }

    public Object getEmpActiva() {
        return empActiva;
    }

    public void setEmpActiva(Object empActiva) {
        this.empActiva = empActiva;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public Object getUsrFechaInsertaEmpresa() {
        return usrFechaInsertaEmpresa;
    }

    public void setUsrFechaInsertaEmpresa(Object usrFechaInsertaEmpresa) {
        this.usrFechaInsertaEmpresa = usrFechaInsertaEmpresa;
    }

    public Object getEmpPais() {
        return empPais;
    }

    public void setEmpPais(Object empPais) {
        this.empPais = empPais;
    }
    
}
