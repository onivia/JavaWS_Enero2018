/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestion.ws;

import com.gestion.cl.Habitacion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ONivia
 */
@WebService(serviceName = "GesHabitac")
public class GesHabitac {

    private Statement st;
    private Connection conn;
    
    public GesHabitac() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = DriverManager.getConnection("jdbc:mysql://192.168.0.40:3306/hotel", "root", "123");
            st = conn.createStatement();
        } catch(Exception ex) {
            System.out.println("Error al cargar el driver");
        }
    }
    
    @WebMethod(operationName = "MostrarHabitaciones")
    public String mostrarHabitaciones() {
        ArrayList<Habitacion> habitaciones = new ArrayList<>();
        Habitacion habitacion = null;
        
        try {
            ResultSet rs = st.executeQuery("select * from habitacion");
            while(rs.next()) {
                habitacion = new Habitacion();
                habitacion.setNumero(rs.getInt("numero"));
                habitacion.setTipo(rs.getString("tipo"));
                habitacion.setPrecio(rs.getInt("precio"));
                
                habitaciones.add(habitacion);
            }
        } catch(Exception ex) {
            System.out.println("Error al realizar la consulta");            
        }
        
        return habitaciones.toString();
    }
}
