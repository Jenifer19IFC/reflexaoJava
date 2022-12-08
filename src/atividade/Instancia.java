package atividade;

import java.lang.reflect.Constructor;

public class Instancia {
	
	public Object startInstancia(String entrada) {
		Construtor construct = new Construtor();
		Class<?> classT = construct.criaClasse(entrada);
		Object obj = null;
		
		try {
			Constructor<?> constT = 
					classT.getDeclaredConstructor();
			
			obj = constT.newInstance();
			return obj;
		} catch (Exception e) {
			System.out.println("Não foi possível instanciar a classe.");
		}
		return null;
	}

}
