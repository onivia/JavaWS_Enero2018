
package com.ws.wsreferencias;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para edit complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="edit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alumnos" type="{http://servicios.ws.com/}alumnos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "edit", propOrder = {
    "alumnos"
})
public class Edit {

    protected Alumnos alumnos;

    /**
     * Obtiene el valor de la propiedad alumnos.
     * 
     * @return
     *     possible object is
     *     {@link Alumnos }
     *     
     */
    public Alumnos getAlumnos() {
        return alumnos;
    }

    /**
     * Define el valor de la propiedad alumnos.
     * 
     * @param value
     *     allowed object is
     *     {@link Alumnos }
     *     
     */
    public void setAlumnos(Alumnos value) {
        this.alumnos = value;
    }

}
