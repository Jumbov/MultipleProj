package it.ws.greet;

public class WSGreetServiceProxy implements it.ws.greet.WSGreetService {
  private String _endpoint = null;
  private it.ws.greet.WSGreetService wSGreetService = null;
  
  public WSGreetServiceProxy() {
    _initWSGreetServiceProxy();
  }
  
  public WSGreetServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSGreetServiceProxy();
  }
  
  private void _initWSGreetServiceProxy() {
    try {
      wSGreetService = (new it.ws.greet.GreetserviceLocator()).getWSGreetServicePort();
      if (wSGreetService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSGreetService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSGreetService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSGreetService != null)
      ((javax.xml.rpc.Stub)wSGreetService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.ws.greet.WSGreetService getWSGreetService() {
    if (wSGreetService == null)
      _initWSGreetServiceProxy();
    return wSGreetService;
  }
  
  public java.lang.String getGreeting(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (wSGreetService == null)
      _initWSGreetServiceProxy();
    return wSGreetService.getGreeting(arg0, arg1);
  }
  
  
}