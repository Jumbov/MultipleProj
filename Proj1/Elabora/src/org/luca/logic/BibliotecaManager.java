package org.luca.logic;

import java.util.Collections;
import java.util.List;


public class BibliotecaManager {
	
	public List<String> ordinaAscendente(List<String> libri){
		
		Collections.sort(libri);
		
		return libri;
	}

}
