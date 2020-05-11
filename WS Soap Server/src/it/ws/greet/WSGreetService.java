package it.ws.greet;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Session Bean implementation class WSGreetService
 */
@Stateless
@WebService (serviceName = "greetservice")
public class WSGreetService {

    
    public WSGreetService() {
        // TODO Auto-generated constructor stub
    }
    
    
    @WebMethod
	public String getGreeting(String nome, String cognome) {
		
		return "Ciao " + nome + " " + cognome;
	}
    
}
