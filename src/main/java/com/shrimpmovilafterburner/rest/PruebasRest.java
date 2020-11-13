/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shrimpmovilafterburner.rest;

import com.gluonhq.connect.GluonObservableList;
import com.gluonhq.connect.converter.InputStreamIterableInputConverter;
import com.gluonhq.connect.converter.JsonConverter;
import com.gluonhq.connect.provider.DataProvider;
import com.gluonhq.connect.provider.RestClient;
import com.shrimpmovilafterburner.TO.DatosEmpresaTO;
import com.shrimpmovilafterburner.TO.DatosSectorTO;
import com.shrimpmovilafterburner.TO.DatosTablaGramajeTO;
import com.shrimpmovilafterburner.TO.ParamDataCBoEmpresaTO;
import com.shrimpmovilafterburner.TO.ParamDataCBoSectorTO;
import com.shrimpmovilafterburner.TO.ParamDataViewTablaGramajeTO;
import com.shrimpmovilafterburner.TO.SisInfoTO;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author Renato
 */
public class PruebasRest {
    
    public static void main (String args[]){
        System.out.println("inicio:\n");
        SisInfoTO sis=new SisInfoTO();
        ParamDataCBoEmpresaTO paramData=new ParamDataCBoEmpresaTO();
        sis.setEmpresa(null);
        sis.setUsuarioCompleto("SOPORTE OWS");
        sis.setUsuario("SOPORTE");
        sis.setUsuarioNick("soporte");
        sis.setMac("");
        sis.setEmpresaRuc(null);
        sis.setAmbiente("WEB");
        sis.setImagen("");
        sis.setEmail("soporte@obinte.com");
        sis.setTelefono(null);
        
        paramData.setItem("grameaje");
        paramData.setSisInfoTO(sis);
        
        JsonConverter jxb=new JsonConverter(ParamDataCBoEmpresaTO.class);
        JsonObject jsonob=jxb.writeToJson(paramData);
        
        RestClient restClient = RestClient.create()
                .method("POST")
                .host("https://test.acosux.com")
                .path("/Pruebas/todocompuWS/appWebController/validarPermisos")
                .contentType("application/json")
                .dataString(jsonob.toString()) ;
                
        
       
        }
    
    public static GluonObservableList<DatosEmpresaTO> getListaEmpresasTORest(){      
        GluonObservableList<DatosEmpresaTO> lista=new GluonObservableList();
        try{
            SisInfoTO sis=new SisInfoTO();
            ParamDataCBoEmpresaTO paramData=new ParamDataCBoEmpresaTO();
            sis.setEmpresa(null);
            sis.setUsuarioCompleto("SOPORTE OWS");
            sis.setUsuario("SOPORTE");
            sis.setUsuarioNick("soporte");
            sis.setMac("");
            sis.setEmpresaRuc(null);
            sis.setAmbiente("WEB");
            sis.setImagen("");
            sis.setEmail("soporte@obinte.com");
            sis.setTelefono(null);

            paramData.setItem("grameaje");
            paramData.setSisInfoTO(sis);

            JsonConverter jxb=new JsonConverter(ParamDataCBoEmpresaTO.class);
            JsonObject jsonob=jxb.writeToJson(paramData);

            RestClient restClient = RestClient.create()
                    .method("POST")
                    .host("https://test.acosux.com")
                    .path("/Pruebas/todocompuWS/appWebController/validarPermisos")
                    .contentType("application/json")
                    .dataString(jsonob.toString()) ;
            
            InputStreamIterableInputConverter<DatosEmpresaTO> converter = new ItemsIterableInputConverter<>(DatosEmpresaTO.class);           
            lista = DataProvider.retrieveList(restClient.createListDataReader(converter));

        }catch(Exception e){
            e.printStackTrace();
        }
        return lista;
                
        
    }
    
     public static GluonObservableList<DatosSectorTO> getListaSectorTORest(String codEmpresa){      
        GluonObservableList<DatosSectorTO> lista=new GluonObservableList();
        try{
            SisInfoTO sis=new SisInfoTO();
            ParamDataCBoSectorTO paramData=new ParamDataCBoSectorTO();
            paramData.setEmpresa(codEmpresa);
            paramData.setMostrarInactivo(false);
            sis.setEmpresa(codEmpresa);
            sis.setUsuarioCompleto("SOPORTE OWS");
            sis.setUsuario("SOPORTE");
            sis.setUsuarioNick("soporte");
            sis.setMac("");
            sis.setEmpresaRuc(null);
            sis.setAmbiente("WEB");
            sis.setImagen("");
            sis.setEmail("soporte@obinte.com");
            sis.setTelefono(null);           
            paramData.setSisInfoTO(sis);

            JsonConverter jxb=new JsonConverter(ParamDataCBoSectorTO.class);
            JsonObject jsonob=jxb.writeToJson(paramData);

            RestClient restClient = RestClient.create()
                    .method("POST")
                    .host("https://test.acosux.com")
                    .path("/Pruebas/todocompuWS/produccionWebController/getListaSectorTO")
                    .contentType("application/json")
                    .dataString(jsonob.toString()) ;
            
            InputStreamIterableInputConverter<DatosSectorTO> converter = new ItemsIterableInputConverter<>(DatosSectorTO.class);           
            lista = DataProvider.retrieveList(restClient.createListDataReader(converter));
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return lista;
                
        
    }
    
     public static GluonObservableList<DatosTablaGramajeTO> getDatosTablaGramajeTORest(String codEmpresa, String codSector,String fecha){      
        GluonObservableList<DatosTablaGramajeTO> lista=new GluonObservableList();
        try{
            SisInfoTO sis=new SisInfoTO();
            ParamDataViewTablaGramajeTO paramData=new ParamDataViewTablaGramajeTO();
            paramData.setEmpresa(codEmpresa);
            paramData.setFecha(fecha);
            paramData.setSector(codSector);
            paramData.setIncluirTodos(false);
            sis.setEmpresa(codEmpresa);
            sis.setUsuarioCompleto("SOPORTE OWS");
            sis.setUsuario("SOPORTE");
            sis.setUsuarioNick("soporte");
            sis.setMac("");
            sis.setEmpresaRuc(null);
            sis.setAmbiente("WEB");
            sis.setImagen("");
            sis.setEmail("soporte@obinte.com");
            sis.setTelefono(null);           
            paramData.setSisInfoTO(sis);

            JsonConverter jxb=new JsonConverter(ParamDataViewTablaGramajeTO.class);
            JsonObject jsonob=jxb.writeToJson(paramData);
            
            

            RestClient restClient = RestClient.create()
                    .method("POST")
                    .host("https://test.acosux.com")
                    .path("/Pruebas/todocompuWS/produccionWebController/getListaPiscinasGrameaje")
                    .contentType("application/json")
                    .dataString(jsonob.toString()) ;
            
            
            InputStreamIterableInputConverter<DatosTablaGramajeTO> converter = new ItemsIterableInputConverter<>(DatosTablaGramajeTO.class);           
            lista = DataProvider.retrieveList(restClient.createListDataReader(converter));
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return lista;
                
        
    }
    public static GluonObservableList<DatosEmpresaTO> getListaEmpresasTO(){
        GluonObservableList<DatosEmpresaTO> errors=new GluonObservableList();
         try {            
            JsonReader reader = Json.createReader((new FileReader("F://llenarcombojson.json")));
            JsonObject jsonObject = reader.readObject();                                    
            JsonConverter convert=new JsonConverter(DatosEmpresaTO.class);                        
            JsonArray arrayJ=jsonObject.getJsonArray("extraInfo");
           List<DatosEmpresaTO> listaDatos=new ArrayList();
           for(int i=0;i<arrayJ.size();i++){
               listaDatos.add((DatosEmpresaTO)convert.readFromJson(arrayJ.get(i).asJsonObject()));               
           }                      
           errors.addAll(listaDatos);           
            
        } catch (Exception ex) {
            ex.printStackTrace();                      
        }
         return errors;
    }
    
}
