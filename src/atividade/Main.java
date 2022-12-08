package atividade;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

	public static void main(String[] args){
		
		String recurso = "/produto";
		
		Instancia inst = new Instancia();
		System.out.println(inst.startInstancia(recurso));	

	}

}
