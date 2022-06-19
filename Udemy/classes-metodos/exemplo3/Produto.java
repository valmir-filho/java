package classes.metodos.exemplo3;

public class Produto {
	String nome;
	double preco, desconto;
	public Produto(String nomeInicial) {  // Criado o método construtor.
		nome = nomeInicial;
	}
	double precoDesconto() {
		return preco * (1 - desconto);
	}
}
