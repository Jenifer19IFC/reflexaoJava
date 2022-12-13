package atividade;

import java.lang.reflect.Constructor;

public class Construtor {
	
	public Class<?> criaClasse(String entrada) throws Exception {
		Formatador f = new Formatador(entrada);
		StringBuilder classe = f.formataDado();
		
			try {
				Class<?> classT = 
						Class.forName("atividade."+classe.toString());
				return classT;
			}catch (Exception e) {
				 throw new MyExceptionConstrutor("Classe " + classe.toString() + " não encontrada ou não existe.");
			}
	}
	
	

}
