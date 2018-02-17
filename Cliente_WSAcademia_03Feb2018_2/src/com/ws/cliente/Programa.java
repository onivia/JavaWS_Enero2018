/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws.cliente;

import com.ws.wsreferencias.Alumnos;
import com.ws.wsreferencias.WSAcademia;
import com.ws.wsreferencias.WSAcademia_Service;
import java.util.List;

/**
 *
 * @author ONivia
 */
public class Programa {
    public static void main(String[] args) {
        pruebaWSAcademia_findAll();        
    }
    
    private static void pruebaWSAcademia_findAll() {
        WSAcademia_Service servicio = new WSAcademia_Service();
        WSAcademia puerto = servicio.getWSAcademiaPort();
        
        List<Alumnos> alumnos = puerto.findAll();        
    }    
}
