/**
 * Simpleservice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws.simple;

public interface Simpleservice extends javax.xml.rpc.Service {
    public java.lang.String getWSsimpleServicePortAddress();

    public ws.simple.WSsimpleService getWSsimpleServicePort() throws javax.xml.rpc.ServiceException;

    public ws.simple.WSsimpleService getWSsimpleServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
