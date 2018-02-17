
package com.areasws.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.areasws.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CalcularAreaTriangulo_QNAME = new QName("http://ws.areasws.com/", "calcularAreaTriangulo");
    private final static QName _CalcularAreaRectanguloResponse_QNAME = new QName("http://ws.areasws.com/", "calcularAreaRectanguloResponse");
    private final static QName _CalcularAreaTrianguloResponse_QNAME = new QName("http://ws.areasws.com/", "calcularAreaTrianguloResponse");
    private final static QName _CalcularAreaRectangulo_QNAME = new QName("http://ws.areasws.com/", "calcularAreaRectangulo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.areasws.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularAreaTrianguloResponse }
     * 
     */
    public CalcularAreaTrianguloResponse createCalcularAreaTrianguloResponse() {
        return new CalcularAreaTrianguloResponse();
    }

    /**
     * Create an instance of {@link CalcularAreaRectangulo }
     * 
     */
    public CalcularAreaRectangulo createCalcularAreaRectangulo() {
        return new CalcularAreaRectangulo();
    }

    /**
     * Create an instance of {@link CalcularAreaTriangulo }
     * 
     */
    public CalcularAreaTriangulo createCalcularAreaTriangulo() {
        return new CalcularAreaTriangulo();
    }

    /**
     * Create an instance of {@link CalcularAreaRectanguloResponse }
     * 
     */
    public CalcularAreaRectanguloResponse createCalcularAreaRectanguloResponse() {
        return new CalcularAreaRectanguloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularAreaTriangulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.areasws.com/", name = "calcularAreaTriangulo")
    public JAXBElement<CalcularAreaTriangulo> createCalcularAreaTriangulo(CalcularAreaTriangulo value) {
        return new JAXBElement<CalcularAreaTriangulo>(_CalcularAreaTriangulo_QNAME, CalcularAreaTriangulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularAreaRectanguloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.areasws.com/", name = "calcularAreaRectanguloResponse")
    public JAXBElement<CalcularAreaRectanguloResponse> createCalcularAreaRectanguloResponse(CalcularAreaRectanguloResponse value) {
        return new JAXBElement<CalcularAreaRectanguloResponse>(_CalcularAreaRectanguloResponse_QNAME, CalcularAreaRectanguloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularAreaTrianguloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.areasws.com/", name = "calcularAreaTrianguloResponse")
    public JAXBElement<CalcularAreaTrianguloResponse> createCalcularAreaTrianguloResponse(CalcularAreaTrianguloResponse value) {
        return new JAXBElement<CalcularAreaTrianguloResponse>(_CalcularAreaTrianguloResponse_QNAME, CalcularAreaTrianguloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularAreaRectangulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.areasws.com/", name = "calcularAreaRectangulo")
    public JAXBElement<CalcularAreaRectangulo> createCalcularAreaRectangulo(CalcularAreaRectangulo value) {
        return new JAXBElement<CalcularAreaRectangulo>(_CalcularAreaRectangulo_QNAME, CalcularAreaRectangulo.class, null, value);
    }

}
