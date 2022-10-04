package classes.metodos.exemplo1;

public class Produto {
	String nome;
	double preco, desconto;
	double precoDesconto() {
		return preco * (1 - desconto);
	}
}
