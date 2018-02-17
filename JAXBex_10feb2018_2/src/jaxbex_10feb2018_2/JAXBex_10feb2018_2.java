/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaxbex_10feb2018_2;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author ONivia
 */
public class JAXBex_10feb2018_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Customer customer = null;
        
        customer = new Customer();
        customer.setId(100);
        customer.setName("oskr");
        customer.setAge(30);
        
        try {
            File file = new File("C:\\Tmp\\Cursos\\JavaWebServices\\JAXBex_10feb2018_2\\salida.xml");
            JAXBContext jaxbcontext = JAXBContext.newInstance(Customer.class);
            Marshaller jaxbmarshaller = jaxbcontext.createMarshaller();
            jaxbmarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbmarshaller.marshal(customer, file);
            jaxbmarshaller.marshal(customer, System.out);
        } catch(JAXBException ex) {
            ex.printStackTrace();            
        }
        */
        try {
            File file = new File("C:\\Tmp\\Cursos\\JavaWebServices\\JAXBex_10feb2018_2\\salida.xml");
            JAXBContext jaxbcontext = JAXBContext.newInstance(Customer.class);
            Unmarshaller jaxbunmarshaller = jaxbcontext.createUnmarshaller();
            Customer customer = (Customer) jaxbunmarshaller.unmarshal(file);
            System.out.println(customer.toString());
            
        } catch(JAXBException ex) {
            ex.printStackTrace();            
        }
    }
}
