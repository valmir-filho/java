package lambdas.exemplo8;

import java.util.function.Predicate;

public class PredicadoComposicao {  // Interface funcional.
	public static void main(String[] args) {
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
		System.out.println(isPar.and(isTresDigitos).test(122));  // Composição de funções.
		System.out.println(isPar.or(isTresDigitos).test(123));  // Composição de funções.
	}
}