package atividade;

public class Formatador {

	String dadoString;
	
	public Formatador(String dadoString) {
		setDadoString(dadoString);
	}
	
	public String getDadoString() {
		return dadoString;
	}
	public void setDadoString(String dadoString) {
		this.dadoString = dadoString;
	}


	public boolean firstValidationEntrada() {
		if(!(dadoString.isEmpty()) && dadoString != null && dadoString.substring(0,1).equals("/") && dadoString.length() > 1) {
			return true;
		}
		return false;
	}
	
	public StringBuilder formataDado(){
		StringBuilder builder = new StringBuilder();
		
		if(firstValidationEntrada()) {
			//Retira '/' da frente
			dadoString = dadoString.replaceAll("\\/","");
			
			//Coloca a primeira letra maiúscula
			dadoString = dadoString.substring(0,1).toUpperCase().concat(dadoString.substring(1));
		    builder.append(dadoString+"Controller");
		    return builder  ;
		}
		return builder;
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Formatador [dadoString=");
		builder.append(dadoString);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
	
	
}
