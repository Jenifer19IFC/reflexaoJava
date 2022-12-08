package atividade;

import java.lang.reflect.Constructor;

public class Construtor {
	
	public Class<?> criaClasse(String entrada) {
		Formatador f = new Formatador(entrada);
		StringBuilder classe = f.formataDado();
		
			try {
				
				Class<?> classT = 
						Class.forName("atividade."+classe.toString());
				return classT;
			}catch (Exception e) {
					System.out.println("Classe " + classe.toString() + " não encontrada ou não existe.");
			}
			return null;
	}
	
	

}
