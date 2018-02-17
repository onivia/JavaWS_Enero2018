/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import com.areasws.wsdl.AreasWs;
import com.areasws.wsdl.AreasWs_Service;
import java.util.Scanner;

/**
 *
 * @author ONivia
 */
public class Programa {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String opcion = null;
        
        do {
            System.out.println("1. Triangulo");
            System.out.println("2. Rectangulo");
            System.out.println("\nX. SALIR");
            
            System.out.print("opcion: ");            
            opcion = scann.next();                        
            switch(opcion) {
                case "1":
                    calcularAreaTriangulo();
                    break;
                case "2":
                    calcularAreaRectangulo();
                    break;                
            }            
        }while(!opcion.toUpperCase().equals("X"));        
    }
    
    private static void calcularAreaTriangulo() {
        Scanner scann = new Scanner(System.in);
        AreasWs_Service servicio = new AreasWs_Service();
        AreasWs puerto = servicio.getAreasWsPort();
        double base = 0.00, altura = 0.00;
        
        System.out.println("\n\tCALCULAR AREA TRIANGULO");
        
        System.out.print("\t\tbase: ");
        base = scann.nextDouble();
        System.out.print("\t\taltura: ");
        altura = scann.nextDouble();
                
        System.out.println("\t\tArea del Triangulo: " + puerto.calcularAreaTriangulo(base, altura) + "\n");
    }
    
    private static void calcularAreaRectangulo() {
        Scanner scann = new Scanner(System.in);
        AreasWs_Service servicio = new AreasWs_Service();
        AreasWs puerto = servicio.getAreasWsPort();
        double base = 0.00, altura = 0.00;        
        
        System.out.println("\n\tCALCULAR AREA RECTANGULO");
        
        System.out.print("\t\tbase: ");
        base = scann.nextDouble();
        System.out.print("\t\taltura: ");
        altura = scann.nextDouble();
            
        System.out.println("\t\tArea del Rectangulo: " + puerto.calcularAreaRectangulo(base, altura) + "\n");
    }
}
