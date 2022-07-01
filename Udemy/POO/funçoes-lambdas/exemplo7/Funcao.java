package lambdas.exemplo7;

import java.util.function.Function;

public class Funcao {  // Interface funcional.
	public static void main(String[] args) {
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par": "Ímpar";
		System.out.println(parOuImpar.apply(32));
		System.out.println();
		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
		Function<String, String> empolgado = valor -> valor + "!!!";
		String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);  // O comando "andThen" está encadeando uma função na outra (composição de funções).
		System.out.println(resultadoFinal);
	}
}