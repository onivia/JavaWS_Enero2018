
package com.areasws.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para calcularAreaTriangulo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="calcularAreaTriangulo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="base" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="altura" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calcularAreaTriangulo", propOrder = {
    "base",
    "altura"
})
public class CalcularAreaTriangulo {

    protected double base;
    protected double altura;

    /**
     * Obtiene el valor de la propiedad base.
     * 
     */
    public double getBase() {
        return base;
    }

    /**
     * Define el valor de la propiedad base.
     * 
     */
    public void setBase(double value) {
        this.base = value;
    }

    /**
     * Obtiene el valor de la propiedad altura.
     * 
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Define el valor de la propiedad altura.
     * 
     */
    public void setAltura(double value) {
        this.altura = value;
    }

}
