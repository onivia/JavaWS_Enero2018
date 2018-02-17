/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidad;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 *
 * @author ONivia
 */
@Path("Multiplicacion")
public class Multiplicacion {
    @GET
    public String operar(@QueryParam("num1") int n1,@QueryParam("num2") int n2) {
        return String.valueOf(n1 * n2);
        
    }
}
