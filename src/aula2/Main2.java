package aula2;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main2 {

	public static void main(String[] args) 
			throws ClassNotFoundException, 
			NoSuchMethodException, SecurityException, 
			InstantiationException, IllegalAccessException, 
			IllegalArgumentException, InvocationTargetException {
		
		Class<?> classT = 
				Class.forName("com.curvello.reflection.aula02.Pessoa");
		
		Constructor<?> constT = 
				classT.getDeclaredConstructor(String.class);
		
		System.out.println(constT);
		
		Object obj = constT.newInstance("Teste");
		
		System.out.println(obj);
		
	}
}