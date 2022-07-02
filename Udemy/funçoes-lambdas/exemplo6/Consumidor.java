package lambdas.exemplo6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {  // Interface funcional.
	public static void main(String[] args) {
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);
		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		imprimirNome.accept(p1);
		Produto p2 = new Produto("Notebook", 2897.99, 0.15);
		Produto p3 = new Produto("Caderno", 25.45, 0.05);
		Produto p4 = new Produto("Borracha", 6.75, 0.03);
		Produto p5 = new Produto("Lápis", 4.50, 0.02);
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}