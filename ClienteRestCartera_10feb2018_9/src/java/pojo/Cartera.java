/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author ONivia
 */
public class Cartera {
    private int codigo;    
    private String nombre;    
    private int deuda;
    
    public Cartera() {
    }

    public Cartera(Integer codigo) {
        this.codigo = codigo;
    }

    public Cartera(int codigo, String nombre, int deuda) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.deuda = deuda;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the deuda
     */
    public int getDeuda() {
        return deuda;
    }

    /**
     * @param deuda the deuda to set
     */
    public void setDeuda(int deuda) {
        this.deuda = deuda;
    }
    
    
}
