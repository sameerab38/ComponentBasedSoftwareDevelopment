//Author: Sameera Bammidi
//This is a generated class
package org.webservice;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SurveyWebServiceImplService", targetNamespace = "http://webservice.org/", wsdlLocation = "http://ec2-35-160-12-248.us-west-2.compute.amazonaws.com/SurveyWebService/list?wsdl")
public class SurveyWebServiceImplService
    extends Service
{

    private final static URL SURVEYWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException SURVEYWEBSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName SURVEYWEBSERVICEIMPLSERVICE_QNAME = new QName("http://webservice.org/", "SurveyWebServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://ec2-35-160-12-248.us-west-2.compute.amazonaws.com/SurveyWebService/list?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SURVEYWEBSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        SURVEYWEBSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public SurveyWebServiceImplService() {
        super(__getWsdlLocation(), SURVEYWEBSERVICEIMPLSERVICE_QNAME);
    }

    public SurveyWebServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SURVEYWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public SurveyWebServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SURVEYWEBSERVICEIMPLSERVICE_QNAME);
    }

    public SurveyWebServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SURVEYWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public SurveyWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SurveyWebServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SurveyWebService
     */
    @WebEndpoint(name = "SurveyWebServiceImplPort")
    public SurveyWebService getSurveyWebServiceImplPort() {
        return super.getPort(new QName("http://webservice.org/", "SurveyWebServiceImplPort"), SurveyWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SurveyWebService
     */
    @WebEndpoint(name = "SurveyWebServiceImplPort")
    public SurveyWebService getSurveyWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.org/", "SurveyWebServiceImplPort"), SurveyWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SURVEYWEBSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw SURVEYWEBSERVICEIMPLSERVICE_EXCEPTION;
        }
        return SURVEYWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}