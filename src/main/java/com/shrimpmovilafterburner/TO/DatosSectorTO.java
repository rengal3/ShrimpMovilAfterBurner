/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shrimpmovilafterburner.TO;

import java.util.List;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Renato
 */
public class DatosSectorTO {
    
    private final StringProperty secCodigo = new SimpleStringProperty();
    private final StringProperty secNomSector = new SimpleStringProperty();
    private final StringProperty secLatitud = new SimpleStringProperty();
    private final StringProperty secLongitud = new SimpleStringProperty();
    private final BooleanProperty secActivo = new SimpleBooleanProperty();   
    private final StringProperty secNombre = new SimpleStringProperty();
    
    
    public StringProperty secCodigoProperty() {
        return secCodigo;
    }

    @XmlElement(name = "secCodigo")
    public String getSecCodigo() {
        return secCodigo.get();
    }
    
    public void setSecCodigo(String secCodigo) {
        this.secCodigo.set(secCodigo);
    }
    
    public StringProperty secNomSectorProperty() {
        return secNomSector;
    }

    @XmlElement(name = "nomSector")
    public String getSecNomSector() {
        return secNomSector.get();
    }
    
    public void setSecNomSector(String secNomSector) {
        this.secNomSector.set(secNomSector);
    }
    
    public StringProperty secLatitudProperty() {
        return secLatitud;
    }

    @XmlElement(name = "secLatitud")
    public String getSecLatitud() {
        return secLatitud.get();
    }
    
    public void setSecLatitud(String secLatitud) {
        this.secLatitud.set(secLatitud);
    }
    
    public StringProperty secLongitudProperty() {
        return secLongitud;
    }

    @XmlElement(name = "secLongitud")
    public String getSecLongitud() {
        return secLongitud.get();
    }
    
    public void setSecLongitud(String secLongitud) {
        this.secLongitud.set(secLongitud);
    }
    
    public BooleanProperty secActivoProperty() {
        return secActivo;
    }

    @XmlElement(name = "secActivo")
    public boolean getSecActivo() {
        return secActivo.get();
    }
    
    public void setSecActivo(boolean secActivo) {
        this.secActivo.set(secActivo);
    }
    
    public StringProperty secNombreProperty() {
        return secNombre;
    }

    @XmlElement(name = "secNombre")
    public String getSecNombre() {
        return secNombre.get();
    }
    
    public void setSecNombre(String secNombre) {
        this.secNombre.set(secNombre);
    }

    @Override
    public String toString() {
        return this.secNombre.get();
    }
    
}
