/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miws1.ws;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ONivia
 */
@WebService(serviceName = "MiWs1")
public class MiWs1 {

    private static final List<Cliente> clientes = Arrays.asList(new Cliente(1,"pedrito"),
                                                                new Cliente(2,"laurita"),
                                                                new Cliente(3,"valeria"));
            
    @WebMethod(operationName = "consultarLista")
    public String consultarLista(@WebParam(name = "id") int id) {
        String resultado = "Cliente NO existe";        
        
        try {
            resultado = clientes.get(id).getNombre();
        } catch (Exception e) {
            resultado += "; " + e.getMessage();
        }
        
        return resultado;
    }
}
