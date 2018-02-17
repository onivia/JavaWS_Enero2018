/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ONivia
 */
@WebService(serviceName = "MyWebService")
public class MyWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "sumar")
    public int sumar(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        return a + b;
    }
}
