package streams.desafio2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	public static void main(String[] args) {
		Produto p1 = new Produto("Geladeira", 3.543, 0.25, 300);
		Produto p2 = new Produto("Fogão", 700, 0.35, 250);
		Produto p3 = new Produto("Mesa", 2.454, 0.15, 150);
		Produto p4 = new Produto("Microondas", 900, 0.05, 100);
		Produto p5 = new Produto("Liquidificador", 300, 0.15, 200);
		Produto p6 = new Produto("Televisão", 4.500, 0.35, 250);
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		Predicate<Produto> superPromocao = p -> p.desconto > 0.10;
		Predicate<Produto> freteGratis = p -> p.valorFrete > 100;
		Predicate<Produto> precoRelevante = p -> p.preco < 500;
		Function<Produto, String> chamadaPromocional = p -> "Aproveite! " + p.nome + " por R$" + p.preco;
		produtos.stream()
			.filter(superPromocao)
			.filter(freteGratis)
			.filter(precoRelevante)
			.map(chamadaPromocional)
			.forEach(System.out::println);
	}
}