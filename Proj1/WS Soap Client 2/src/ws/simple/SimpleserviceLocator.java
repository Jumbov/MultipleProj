/**
 * SimpleserviceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws.simple;

public class SimpleserviceLocator extends org.apache.axis.client.Service implements ws.simple.Simpleservice {

    public SimpleserviceLocator() {
    }


    public SimpleserviceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SimpleserviceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSsimpleServicePort
    private java.lang.String WSsimpleServicePort_address = "http://localhost:8080/WS_Soap_Server_2/simpleservice";

    public java.lang.String getWSsimpleServicePortAddress() {
        return WSsimpleServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSsimpleServicePortWSDDServiceName = "WSsimpleServicePort";

    public java.lang.String getWSsimpleServicePortWSDDServiceName() {
        return WSsimpleServicePortWSDDServiceName;
    }

    public void setWSsimpleServicePortWSDDServiceName(java.lang.String name) {
        WSsimpleServicePortWSDDServiceName = name;
    }

    public ws.simple.WSsimpleService getWSsimpleServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSsimpleServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSsimpleServicePort(endpoint);
    }

    public ws.simple.WSsimpleService getWSsimpleServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ws.simple.SimpleserviceSoapBindingStub _stub = new ws.simple.SimpleserviceSoapBindingStub(portAddress, this);
            _stub.setPortName(getWSsimpleServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSsimpleServicePortEndpointAddress(java.lang.String address) {
        WSsimpleServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ws.simple.WSsimpleService.class.isAssignableFrom(serviceEndpointInterface)) {
                ws.simple.SimpleserviceSoapBindingStub _stub = new ws.simple.SimpleserviceSoapBindingStub(new java.net.URL(WSsimpleServicePort_address), this);
                _stub.setPortName(getWSsimpleServicePortWSDDServiceName());
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
        if ("WSsimpleServicePort".equals(inputPortName)) {
            return getWSsimpleServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://simple.ws/", "simpleservice");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://simple.ws/", "WSsimpleServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSsimpleServicePort".equals(portName)) {
            setWSsimpleServicePortEndpointAddress(address);
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
