/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pojo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ONivia
 */
@Entity
@Table(name = "cartera")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cartera.findAll", query = "SELECT c FROM Cartera c")
    , @NamedQuery(name = "Cartera.findByCodigo", query = "SELECT c FROM Cartera c WHERE c.codigo = :codigo")
    , @NamedQuery(name = "Cartera.findByNombre", query = "SELECT c FROM Cartera c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Cartera.findByDeuda", query = "SELECT c FROM Cartera c WHERE c.deuda = :deuda")})
public class Cartera implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "deuda")
    private int deuda;

    public Cartera() {
    }

    public Cartera(Integer codigo) {
        this.codigo = codigo;
    }

    public Cartera(Integer codigo, String nombre, int deuda) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.deuda = deuda;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDeuda() {
        return deuda;
    }

    public void setDeuda(int deuda) {
        this.deuda = deuda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cartera)) {
            return false;
        }
        Cartera other = (Cartera) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pojo.Cartera[ codigo=" + codigo + " ]";
    }
    
}
