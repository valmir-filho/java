package lambdas.exemplo5;

import java.util.function.Predicate;  // Interface funcional.

public class Predicado {
	public static void main(String[] args) {
		Predicate<Produto> isCaro = produto -> (produto.preco * (1 - produto.desconto)) >= 750;
		Produto produto = new Produto("Notebook", 3893.89, 0.15);
		System.out.println(isCaro.test(produto));
	}
}
