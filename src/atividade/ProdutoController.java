package atividade;

public class ProdutoController {

	String valor = "banana";
	
	public ProdutoController() {
		
	}
	
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProdutoController [valor=");
		builder.append(valor);
		builder.append("]");
		return builder.toString();
	}
	
	
		
}
