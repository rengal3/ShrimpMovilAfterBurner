/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shrimpmovilafterburner.TO;

import java.util.List;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Renato
 */
public class DatosEmpresaTO {
    private final StringProperty empCodigo = new SimpleStringProperty();
    
    
    private final StringProperty empRuc = new SimpleStringProperty();
    private final StringProperty empNombre = new SimpleStringProperty();
    private final StringProperty empRazonSocial = new SimpleStringProperty();
    private final StringProperty empDireccion = new SimpleStringProperty();
    private final StringProperty empCiudad = new SimpleStringProperty();
    private final StringProperty empTelefono = new SimpleStringProperty();
    private final StringProperty empCelular = new SimpleStringProperty();
    private final StringProperty empEmail = new SimpleStringProperty();
    private final StringProperty empClave = new SimpleStringProperty();
    private final StringProperty empActiva = new SimpleStringProperty();
    private final StringProperty usrCodigo = new SimpleStringProperty();
    private final StringProperty usrFechaInsertaEmpresa = new SimpleStringProperty();
    private final StringProperty empPais = new SimpleStringProperty();
          
    private ListaSisPermisoTO listaSisPermisoTO;
    
    private List<ParametroTO> parametros;
    
    public StringProperty empCodigoProperty() {
        return empCodigo;
    }

    @XmlElement(name = "empCodigo")
    public String getEmpCodigo() {
        return empCodigo.get();
    }
    
    public void setEmpCodigo(String empCodigo) {
        this.empCodigo.set(empCodigo);
    }
    
    public StringProperty empRucProperty() {
        return empRuc;
    }
    
    @XmlElement(name = "empRuc")
    public String getEmpRuc() {
        return empRuc.get();
    }
    
    public void setEmpRuc(String empRuc) {
        this.empRuc.set(empRuc);
    }

    public StringProperty empNombreProperty() {
        return empNombre;
    }

    @XmlElement(name = "empNombre")
    public String getEmpNombre() {
        return empNombre.get();
    }
    
    public void setEmpNombre(String empNombre) {
        this.empNombre.set(empNombre);
    }
    public StringProperty empRazonSocialProperty() {
        return empRazonSocial;
    }
    
    @XmlElement(name = "empRazonSocial")
    public String getEmpRazonSocial() {
        return empRazonSocial.get();
    }
    
    public void setEmpRazonSocial(String empRazon) {
        this.empRazonSocial.set(empRazon);
    }

    public StringProperty empDireccionProperty() {
        return empDireccion;
    }
    
    @XmlElement(name = "empDireccion")
    public String getEmpDireccion() {
        return empDireccion.get();
    }
    
    public void setEmpDireccion(String empdirecc) {
        this.empDireccion.set(empdirecc);
    }

    public StringProperty empCiudadProperty() {
        return empCiudad;
    }
    
    @XmlElement(name = "empCiudad")
    public String getEmpCiudad() {
        return empCiudad.get();
    }
    
    public void setEmpCiudad(String empciudad) {
        this.empCiudad.set(empciudad);
    }

    public StringProperty empTelefonoProperty() {
        return empTelefono;
    }
    
    @XmlElement(name = "empTelefono")
    public String getEmpTelefono() {
        return empTelefono.get();
    }
    
    public void setEmpTelefono(String emptelefono) {
        this.empTelefono.set(emptelefono);
    }

    public StringProperty empCelularProperty() {
        return empCelular;
    }
    
    @XmlElement(name = "empCelular")
    public String getEmpCelular() {
        return empCelular.get();
    }
    
    public void setEmpCelular(String emptelefono) {
        this.empCelular.set(emptelefono);
    }

    public StringProperty empEmailProperty() {
        return empEmail;
    }
    
    @XmlElement(name = "empEmail")
    public String getEmpEmail() {
        return empEmail.get();
    }
    
    public void setEmpEmail(String empemail) {
        this.empEmail.set(empemail);
    }

    public StringProperty empClaveProperty() {
        return empClave;
    }
    
    @XmlElement(name = "empClave")
    public String getEmpClave() {
        return empClave.get();
    }
    
    public void setEmpClave(String empclave) {
        this.empClave.set(empclave);
    }

    public StringProperty empActivaProperty() {
        return empActiva;
    }
    
    @XmlElement(name = "empActiva")
    public String getEmpActiva() {
        return empActiva.get();
    }
    
    public void setEmpActiva(String empactiva) {
        this.empActiva.set(empactiva);
    }

    public StringProperty usrCodigoProperty() {
        return usrCodigo;
    }
    
    @XmlElement(name = "usrCodigo")
    public String getUsrCodigo() {
        return usrCodigo.get();
    }
    
    public void setUsrCodigo(String usrcod) {
        this.usrCodigo.set(usrcod);
    }

    public StringProperty usrFechaInsertaEmpresaProperty() {
        return usrFechaInsertaEmpresa;
    }
    
    @XmlElement(name = "usrFechaInsertaEmpresa")
    public String getUsrFechaInsertaEmpresa() {
        return usrFechaInsertaEmpresa.get();
    }
    
    public void setUsrFechaInsertaEmpresa(String usrcod) {
        this.usrFechaInsertaEmpresa.set(usrcod);
    }

    public StringProperty empPaisProperty() {
        return empPais;
    }
    
    @XmlElement(name = "empPais")
    public String getEmpPais() {
        return empPais.get();
    }
    
    public void setEmpPais(String emppais) {
        this.empPais.set(emppais);
    }

    @XmlElement(name = "ListaSisPermisoTO")
    public ListaSisPermisoTO getListaSisPermisoTO() {
        return listaSisPermisoTO;
    }

    public void setListaSisPermisoTO(ListaSisPermisoTO listaSisPermisoTO) {
        this.listaSisPermisoTO = listaSisPermisoTO;
    }
    
    @XmlElement(name = "Parametro")
    public List<ParametroTO> getParametros() {
        return parametros;
    }

    public void setParametros(List<ParametroTO> parametros) {
        this.parametros = parametros;
    }

    @Override
    public String toString() {
        return this.getEmpNombre();
    }
    
   
}
