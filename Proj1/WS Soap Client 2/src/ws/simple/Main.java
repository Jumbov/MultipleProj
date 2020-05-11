package ws.simple;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		WSsimpleServiceProxy wsproxy = new WSsimpleServiceProxy();
		System.out.println(wsproxy.exposedMethod());

	}

}
