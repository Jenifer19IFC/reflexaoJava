package atividade;

import java.lang.reflect.Constructor;

public class Instancia {
	
	public Object startInstancia(String entrada) throws Exception {
		Construtor construct = new Construtor();
		Class<?> classT = construct.criaClasse(entrada);
		Object obj = null;
		
		try {
			Constructor<?> constT = 
					classT.getDeclaredConstructor();
			
			obj = constT.newInstance();
			return obj;
		} catch (Exception e) {
			throw new MyExceptionInstancia("Não foi possível instanciar a classe.");
		}
	}

}
