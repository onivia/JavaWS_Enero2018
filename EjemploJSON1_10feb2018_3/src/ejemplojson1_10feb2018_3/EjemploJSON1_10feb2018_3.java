/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojson1_10feb2018_3;

import java.time.LocalDate;

/**
 *
 * @author ONivia
 */
public class EjemploJSON1_10feb2018_3 {

    /**
     * @param args the command line arguments
     */
    private static final String APERTURA = "{";
    private static final String CIERRE = "}";
    
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        System.out.println(convertirJson(fechaActual));
    }
    
    public static String convertirJson(LocalDate fechaActual) {
        StringBuilder elemento = new StringBuilder();
        elemento.append(APERTURA).append("\n");
        elemento.append(formatearJson("año",fechaActual.getYear()));
        elemento.append(formatearJson("mes",fechaActual.getMonth()));
        elemento.append(formatearJson("dia",fechaActual.getDayOfMonth()));
        elemento.append(CIERRE).append("\n");        
        return elemento.toString();
    }
    
    public static String formatearJson(String llave, Object valor) {
        return String.format("\"%s\": \"%s\",\n",llave, valor);
    }
}
