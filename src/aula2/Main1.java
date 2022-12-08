package aula2;



import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main1 {

	public static void main(String[] args) 
			throws ClassNotFoundException, 
			NoSuchMethodException, SecurityException, 
			InstantiationException, IllegalAccessException, 
			IllegalArgumentException, InvocationTargetException {
		
		Class<?> classT = 
				Class.forName("com.curvello.reflection.aula02.Pessoa");
		
		Constructor<?> constT = 
				classT.getDeclaredConstructor();
		
		System.out.println(constT);
		
		Object obj = constT.newInstance();
		
		System.out.println(obj);
		
	}
}