/**
 * GreetserviceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.ws.greet;

public class GreetserviceLocator extends org.apache.axis.client.Service implements it.ws.greet.Greetservice {

    public GreetserviceLocator() {
    }


    public GreetserviceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GreetserviceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSGreetServicePort
    private java.lang.String WSGreetServicePort_address = "http://localhost:8080/WS_Soap_Server/webservices/WSGreetService";

    public java.lang.String getWSGreetServicePortAddress() {
        return WSGreetServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSGreetServicePortWSDDServiceName = "WSGreetServicePort";

    public java.lang.String getWSGreetServicePortWSDDServiceName() {
        return WSGreetServicePortWSDDServiceName;
    }

    public void setWSGreetServicePortWSDDServiceName(java.lang.String name) {
        WSGreetServicePortWSDDServiceName = name;
    }

    public it.ws.greet.WSGreetService getWSGreetServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSGreetServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSGreetServicePort(endpoint);
    }

    public it.ws.greet.WSGreetService getWSGreetServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.ws.greet.GreetserviceSoapBindingStub _stub = new it.ws.greet.GreetserviceSoapBindingStub(portAddress, this);
            _stub.setPortName(getWSGreetServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSGreetServicePortEndpointAddress(java.lang.String address) {
        WSGreetServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.ws.greet.WSGreetService.class.isAssignableFrom(serviceEndpointInterface)) {
                it.ws.greet.GreetserviceSoapBindingStub _stub = new it.ws.greet.GreetserviceSoapBindingStub(new java.net.URL(WSGreetServicePort_address), this);
                _stub.setPortName(getWSGreetServicePortWSDDServiceName());
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
        if ("WSGreetServicePort".equals(inputPortName)) {
            return getWSGreetServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://greet.ws.it/", "greetservice");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://greet.ws.it/", "WSGreetServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSGreetServicePort".equals(portName)) {
            setWSGreetServicePortEndpointAddress(address);
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
