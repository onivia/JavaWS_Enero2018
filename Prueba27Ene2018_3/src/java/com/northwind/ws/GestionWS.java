/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.northwind.ws;

import com.northwind1.Customers;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ONivia
 */
@WebService(serviceName = "GestionWS")
public class GestionWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "consultarCustomer")
    public String consultarCustomer(@WebParam(name = "CustomerID") String customerId) {
        
        Customers Customers = em.find(Employee.class, 1);
        Customers Customers = new Customers(customerId);
        
        return customers.getCompanyName();
    }
}
