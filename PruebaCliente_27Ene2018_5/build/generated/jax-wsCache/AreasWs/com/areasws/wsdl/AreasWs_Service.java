
package com.areasws.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AreasWs", targetNamespace = "http://ws.areasws.com/", wsdlLocation = "http://localhost:8080/WebServiceAreas_27Ene2018_6/AreasWs?WSDL")
public class AreasWs_Service
    extends Service
{

    private final static URL AREASWS_WSDL_LOCATION;
    private final static WebServiceException AREASWS_EXCEPTION;
    private final static QName AREASWS_QNAME = new QName("http://ws.areasws.com/", "AreasWs");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WebServiceAreas_27Ene2018_6/AreasWs?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AREASWS_WSDL_LOCATION = url;
        AREASWS_EXCEPTION = e;
    }

    public AreasWs_Service() {
        super(__getWsdlLocation(), AREASWS_QNAME);
    }

    public AreasWs_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), AREASWS_QNAME, features);
    }

    public AreasWs_Service(URL wsdlLocation) {
        super(wsdlLocation, AREASWS_QNAME);
    }

    public AreasWs_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AREASWS_QNAME, features);
    }

    public AreasWs_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AreasWs_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AreasWs
     */
    @WebEndpoint(name = "AreasWsPort")
    public AreasWs getAreasWsPort() {
        return super.getPort(new QName("http://ws.areasws.com/", "AreasWsPort"), AreasWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AreasWs
     */
    @WebEndpoint(name = "AreasWsPort")
    public AreasWs getAreasWsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.areasws.com/", "AreasWsPort"), AreasWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AREASWS_EXCEPTION!= null) {
            throw AREASWS_EXCEPTION;
        }
        return AREASWS_WSDL_LOCATION;
    }

}
