/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws.entities.ejb;

import com.ws.entities.Alumnos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ONivia
 */
@Stateless
public class AlumnosFacade extends AbstractFacade<Alumnos> implements AlumnosFacadeLocal {

    @PersistenceContext(unitName = "WebServicesAcademia_03Feb2018_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AlumnosFacade() {
        super(Alumnos.class);
    }
    
}
