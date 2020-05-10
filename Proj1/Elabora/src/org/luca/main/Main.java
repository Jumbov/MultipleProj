package org.luca.main;

import java.util.ArrayList;
import java.util.List;

import org.luca.logic.BibliotecaManager;

public class Main {
	
	public static void main(String[] args) {
		
		List<String> libri = new ArrayList<String>();
		libri.add("Pnl per il carisma");
		libri.add("Amore libero");
		libri.add("Cinciallegre");
		libri.add("Natura e civiltà");
		System.out.println(libri);
		System.out.println("------------------");
		BibliotecaManager biblioteca = new BibliotecaManager();
		libri = biblioteca.ordinaAscendente(libri);
		System.out.println(libri);
		
	}

}
