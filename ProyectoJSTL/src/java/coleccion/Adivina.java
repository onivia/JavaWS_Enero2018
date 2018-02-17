/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccion;

/**
 *
 * @author ONivia
 */
public class Adivina {
    private String nombre="";
    private String apellido="";
    private String banda1="";
    private String banda2="";

    public Adivina() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getBanda1() {
        return banda1;
    }

    public void setBanda1(String banda1) {
        this.banda1 = banda1;
    }

    public String getBanda2() {
        return banda2;
    }
    
    public void setBanda2(String banda2) {
        this.banda2 = banda2;
    }
}
