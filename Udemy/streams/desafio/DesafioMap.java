package streams.desafio1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		UnaryOperator<String> inverter = texto -> new StringBuilder(texto).reverse().toString();  // Função que inverte e String.
		Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s, 2);  // Função que converte uma String binária em um inteiro.
		nums.stream()
			.map(Integer::toBinaryString)  // Função que transforma um número inteiro para uma String binária.
			.map(inverter)
			.map(binarioParaInt)
			.forEach(System.out::println);		
	}
}
