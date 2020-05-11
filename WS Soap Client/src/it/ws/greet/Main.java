package it.ws.greet;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		WSGreetServiceProxy wsgproxy = new WSGreetServiceProxy();
		System.out.println(wsgproxy.getGreeting("Umberto", "Miletto"));

	}

}
