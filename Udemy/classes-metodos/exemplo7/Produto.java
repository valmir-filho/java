package classes.metodos.exemplo7;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(String nomeInicial) {
		
		nome = nomeInicial;
	}
	
	double precoDesconto() {
		return preco * (1 - desconto);
	}
}