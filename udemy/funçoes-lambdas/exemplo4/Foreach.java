package lambdas.exemplo4;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		for(String nome: aprovados) {  // Forma tradicional para percorrer uma lista.
			System.out.println(nome);
		}
		System.out.println();
		aprovados.forEach(nome -> System.out.println(nome));  // Usando a função lambda para percorrer uma lista.
		System.out.println();
		aprovados.forEach(System.out::println);  // Foi passada uma referência para essa função (method reference).
		System.out.println();
		aprovados.forEach(nome -> meuImprimir(nome));  // Uso da função personalizada.
		System.out.println();
		aprovados.forEach(Foreach::meuImprimir);  // Uso da função personalizada.
	}
	static void meuImprimir(String nome) {  // Criação de uma função personalizada.
		System.out.println("Oi! Meu nome é " + nome);
	}
}