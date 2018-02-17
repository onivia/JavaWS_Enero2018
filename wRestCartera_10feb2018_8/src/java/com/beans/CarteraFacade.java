/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import com.pojo.Cartera;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ONivia
 */
@Stateless
public class CarteraFacade extends AbstractFacade<Cartera> implements CarteraFacadeLocal {

    @PersistenceContext(unitName = "wRestCartera_10feb2018_8PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CarteraFacade() {
        super(Cartera.class);
    }
    
}
