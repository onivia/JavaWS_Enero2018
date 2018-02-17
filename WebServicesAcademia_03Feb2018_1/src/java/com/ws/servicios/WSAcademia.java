/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws.servicios;

import com.ws.entities.Alumnos;
import com.ws.entities.ejb.AlumnosFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author ONivia
 */
@WebService(serviceName = "WSAcademia")
public class WSAcademia {

    @EJB
    private AlumnosFacadeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "alumnos") Alumnos alumnos) {
        ejbRef.create(alumnos);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "alumnos") Alumnos alumnos) {
        ejbRef.edit(alumnos);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "alumnos") Alumnos alumnos) {
        ejbRef.remove(alumnos);
    }

    @WebMethod(operationName = "find")
    public Alumnos find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Alumnos> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Alumnos> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }
    
}
