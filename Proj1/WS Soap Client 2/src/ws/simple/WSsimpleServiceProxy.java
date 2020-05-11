package ws.simple;

public class WSsimpleServiceProxy implements ws.simple.WSsimpleService {
  private String _endpoint = null;
  private ws.simple.WSsimpleService wSsimpleService = null;
  
  public WSsimpleServiceProxy() {
    _initWSsimpleServiceProxy();
  }
  
  public WSsimpleServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSsimpleServiceProxy();
  }
  
  private void _initWSsimpleServiceProxy() {
    try {
      wSsimpleService = (new ws.simple.SimpleserviceLocator()).getWSsimpleServicePort();
      if (wSsimpleService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSsimpleService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSsimpleService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSsimpleService != null)
      ((javax.xml.rpc.Stub)wSsimpleService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.simple.WSsimpleService getWSsimpleService() {
    if (wSsimpleService == null)
      _initWSsimpleServiceProxy();
    return wSsimpleService;
  }
  
  public java.lang.String exposedMethod() throws java.rmi.RemoteException{
    if (wSsimpleService == null)
      _initWSsimpleServiceProxy();
    return wSsimpleService.exposedMethod();
  }
  
  
}