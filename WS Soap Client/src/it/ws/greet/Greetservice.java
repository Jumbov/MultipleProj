/**
 * Greetservice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.ws.greet;

public interface Greetservice extends javax.xml.rpc.Service {
    public java.lang.String getWSGreetServicePortAddress();

    public it.ws.greet.WSGreetService getWSGreetServicePort() throws javax.xml.rpc.ServiceException;

    public it.ws.greet.WSGreetService getWSGreetServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
