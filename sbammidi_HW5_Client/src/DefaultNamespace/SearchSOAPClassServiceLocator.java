/**
 * SearchSOAPClassServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public class SearchSOAPClassServiceLocator extends org.apache.axis.client.Service implements DefaultNamespace.SearchSOAPClassService {

    public SearchSOAPClassServiceLocator() {
    }


    public SearchSOAPClassServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SearchSOAPClassServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SearchSOAPClass
    private java.lang.String SearchSOAPClass_address = "http://localhost:8080/sbammidi_hw5/services/SearchSOAPClass";

    public java.lang.String getSearchSOAPClassAddress() {
        return SearchSOAPClass_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SearchSOAPClassWSDDServiceName = "SearchSOAPClass";

    public java.lang.String getSearchSOAPClassWSDDServiceName() {
        return SearchSOAPClassWSDDServiceName;
    }

    public void setSearchSOAPClassWSDDServiceName(java.lang.String name) {
        SearchSOAPClassWSDDServiceName = name;
    }

    public DefaultNamespace.SearchSOAPClass getSearchSOAPClass() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SearchSOAPClass_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSearchSOAPClass(endpoint);
    }

    public DefaultNamespace.SearchSOAPClass getSearchSOAPClass(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DefaultNamespace.SearchSOAPClassSoapBindingStub _stub = new DefaultNamespace.SearchSOAPClassSoapBindingStub(portAddress, this);
            _stub.setPortName(getSearchSOAPClassWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSearchSOAPClassEndpointAddress(java.lang.String address) {
        SearchSOAPClass_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DefaultNamespace.SearchSOAPClass.class.isAssignableFrom(serviceEndpointInterface)) {
                DefaultNamespace.SearchSOAPClassSoapBindingStub _stub = new DefaultNamespace.SearchSOAPClassSoapBindingStub(new java.net.URL(SearchSOAPClass_address), this);
                _stub.setPortName(getSearchSOAPClassWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SearchSOAPClass".equals(inputPortName)) {
            return getSearchSOAPClass();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DefaultNamespace", "SearchSOAPClassService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DefaultNamespace", "SearchSOAPClass"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SearchSOAPClass".equals(portName)) {
            setSearchSOAPClassEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
