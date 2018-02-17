/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.areasws.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ONivia
 */
@WebService(serviceName = "AreasWs")
public class AreasWs {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "calcularAreaTriangulo")
    public double calcularAreaTriangulo(@WebParam(name = "base") double base, @WebParam(name = "altura") double altura) {
        return ((base*altura)/2);
    }
    
    @WebMethod(operationName = "calcularAreaRectangulo")
    public double calcularAreaRectangulo(@WebParam(name = "base") double base, @WebParam(name = "altura") double altura) {
        return (base*altura);
    }
}
