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
import com.shrimpmovilafterburner.TO.GrameajeParamRestTO;
import com.shrimpmovilafterburner.TO.ParamDataCBoEmpresaTO;
import com.shrimpmovilafterburner.TO.ParamDataCBoSectorTO;
import com.shrimpmovilafterburner.TO.ParamDataSaveTablaGramajeTO;
import com.shrimpmovilafterburner.TO.ParamDataViewTablaGramajeTO;
import com.shrimpmovilafterburner.TO.PrdGrameajePK_RestTO;
import com.shrimpmovilafterburner.TO.PrdPiscinaPK_RestTO;
import com.shrimpmovilafterburner.TO.PrdPiscina_RestTO;
import com.shrimpmovilafterburner.TO.PrdSectorPK_RestTO;
import com.shrimpmovilafterburner.TO.PrdSectorTO;
import com.shrimpmovilafterburner.TO.RespuestaOperacionRestTO;
import com.shrimpmovilafterburner.TO.SisInfoTO;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        try {
           Iterator<DatosEmpresaTO> a=restClient.createListDataReader(converter).iterator();
            //Iterator<DatosEmpresaTO> a=PruebasRest.getListaEmpresasTORest().iterator();
            a.forEachRemaining(dat -> {
            System.out.println(dat.getEmpCodigo()+" - "+dat.getEmpNombre());    
            });
            
        } catch (IOException ex) {
            Logger.getLogger(PruebasRest.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
                
        
       
        }
    
    public static Iterator<DatosEmpresaTO> getListaEmpresasTOIterator() throws Exception{      
        Iterator<DatosEmpresaTO> lista;
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
            lista = restClient.createListDataReader(converter).iterator();
            
        }catch(Exception e){
            e.printStackTrace();
            throw e;
        }
        return lista;
                
        
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
    
     public static Iterator<DatosSectorTO> getListaSectorTOIterator(String codEmpresa) throws Exception{      
        Iterator<DatosSectorTO> lista;
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
            lista = restClient.createListDataReader(converter).iterator();
            
        }catch(Exception e){
            e.printStackTrace();
            throw e;
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
     
     
     public static RespuestaOperacionRestTO setDatosTablaGramajeTORest(String codEmpresa, String codSector,String fecha, List<DatosTablaGramajeTO> listaGuardar){      
        RespuestaOperacionRestTO respuesta=null;
        try{
           
            Calendar cal=Calendar.getInstance();
            String[] val=fecha.split("-");
            cal.set(Integer.valueOf(val[0]).intValue(),Integer.valueOf(val[1]).intValue(),Integer.valueOf(val[2]).intValue());
            Date dFecha=cal.getTime();
            
            SisInfoTO sis=new SisInfoTO();
            List<GrameajeParamRestTO> listaGrameajes=new ArrayList<GrameajeParamRestTO>();
            ParamDataSaveTablaGramajeTO paramData=new ParamDataSaveTablaGramajeTO();              
            paramData.setFecha(fecha);            
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

            for(DatosTablaGramajeTO datoGuardar:listaGuardar){
                GrameajeParamRestTO dato=new GrameajeParamRestTO();
                
                dato.setPrdGrameajePK(new PrdGrameajePK_RestTO(codEmpresa, codSector, datoGuardar.getGraPiscinaCodigo(),dFecha.getTime()));
                dato.setGraTpromedio(datoGuardar.getGraPesoActual());
                dato.setGraTgrande(datoGuardar.getGraPesoActual());
                dato.setGraIpromedio(datoGuardar.getGraPesoActual());
                dato.setGraItgrande(datoGuardar.getGraPesoActual());
                dato.setGraSobrevivencia(dato.getGraSobrevivencia());                 
                dato.setGraComentario(dato.getGraComentario());
                dato.setGraBiomasa(datoGuardar.getGraBiomasa());
                dato.setGraSobrevivencia(datoGuardar.getGraSobrevivencia());
                PrdPiscina_RestTO piscina=new PrdPiscina_RestTO();
                PrdSectorTO sector=new PrdSectorTO();
                sector.setPrdSectorPK(new PrdSectorPK_RestTO());
                piscina.setPisNombre(datoGuardar.getGraPiscinaNombre());
                piscina.setPrdPiscinaPK(new PrdPiscinaPK_RestTO(codEmpresa, codSector, datoGuardar.getGraPiscinaCodigo()));
                piscina.setPrdSector(sector);
                dato.setPrdPiscina(piscina);
                listaGrameajes.add(dato);
            }
            paramData.setListaGrameajes(listaGrameajes);
            JsonConverter jxb=new JsonConverter(ParamDataSaveTablaGramajeTO.class);
            JsonObject jsonob=jxb.writeToJson(paramData);

            System.out.println(jsonob.toString());
            RestClient restClient = RestClient.create()
                    .method("POST")
                    .host("https://test.acosux.com")
                    .path("/Pruebas/todocompuWS/produccionWebController/insertarGrameajeListado")
                    .contentType("application/json")
                    .dataString(jsonob.toString()) ;            
            respuesta=restClient.createObjectDataReader(RespuestaOperacionRestTO.class).readObject();                                    
        }catch(Exception e){
            e.printStackTrace();
        }
        return respuesta;                        
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
