package lambdas.exemplo10;

import java.util.function.UnaryOperator;

public class OperadorUnario {  // Interface funcional.
	public static void main(String[] args) {
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		int resultado1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
		// Composição de funções.
		System.out.println(resultado1);
		int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);
		// O comando "compose" faz o caminho inverso do comando "andThen".
		System.out.println(resultado2);
	}
}