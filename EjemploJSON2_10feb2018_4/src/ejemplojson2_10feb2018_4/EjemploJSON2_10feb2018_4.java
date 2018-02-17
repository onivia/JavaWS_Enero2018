/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojson2_10feb2018_4;

//import net.sf.json.JSONObject;
import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerator;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author ONivia
 */
public class EjemploJSON2_10feb2018_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JSONException, IOException {
        /*
        JSONObject jsonObject = new JSONObject();
        
        jsonObject.put("Nombre", "oskr").put("Ciudad", "Ibague").put("Laura", "Bogota");
        String documento = jsonObject.toString();
        System.out.println(documento);
        */
        JsonFactory factory = new JsonFactory();
        
        try(JsonGenerator generator = factory.createJsonGenerator(
                new File("C:\\Tmp\\Cursos\\JavaWebServices\\EjemploJSON2_10feb2018_4\\salida.json"),JsonEncoding.UTF8)) {
            generator.writeStartObject();
            generator.writeStartArray();
            generator.writeStringField("brand","Mercedes");
            generator.writeNumberField("doors",5);
            generator.writeStringField("brand","Chevrolet");
            generator.writeNumberField("doors",2);
            generator.writeEndArray();
            generator.writeEndObject();            
        }
    }
}
