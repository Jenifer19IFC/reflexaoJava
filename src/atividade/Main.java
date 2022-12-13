package atividade;

public class Main {

	public static void main(String[] args) throws Exception{
		
		try {
			String recurso = "produto";
			
			Instancia inst = new Instancia();
			System.out.println(inst.startInstancia(recurso));
		} catch (Exception e) {
			if(e instanceof MyExceptionConstrutor || e instanceof MyExceptionInstancia) {
				System.out.println(e);
			}
		}
			
		
		

	}

}
