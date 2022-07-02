package lambdas.exemplo2;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
		BinaryOperator<Double> somar = (a, b) -> {  // Criação de uma função "lambda".
			return a + b;
		};
		System.out.println(somar.apply(2.0, 3.0));  // Obrigatoriamente, o número tem que ser do tipo double.
		BinaryOperator<Double> multiplicar = (a, b) -> a * b;
		System.out.println(multiplicar.apply(2.0, 3.0));  // Outra forma de criação de uma função "lambda".
		BinaryOperator<Integer> somar1 = (a, b) -> {  // Criação de uma função "lambda".
			return a + b;
		};
		System.out.println(somar1.apply(2, 3));  // Obrigatoriamente, o número tem que ser do tipo inteiro.
		BinaryOperator<Integer> multiplicar1 = (a, b) -> a * b;
		System.out.println(multiplicar1.apply(2, 3));  // Outra forma de criação de uma função "lambda".
	}
}