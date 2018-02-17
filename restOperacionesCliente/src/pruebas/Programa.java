/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 *
 * @author ONivia
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String uri="http://localhost:8080/restOperaciones/webresources";

        Client client = Client.create();
        WebResource webResource = client.resource(uri);
        ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

        /*if (response.getStatus() != 200) {
           throw new RuntimeException("Fallo, HTTP codigo error: " + response.getStatus());
        }
        */
        String salida = webResource.path("/generic").queryParam("num1","100").queryParam("num2", "200").get(String.class);
        System.out.println(salida);
    }
}
