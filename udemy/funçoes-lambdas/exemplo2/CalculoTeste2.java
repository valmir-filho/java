package lambdas.exemplo2;

public class CalculoTeste2 {
	public static void main(String[] args) {
		Calculo somar = (a, b) -> {  // Criação de uma função "lambda".
			return a + b;
		};
		System.out.println(somar.executar(2, 3));
		Calculo multiplicar = (a, b) -> a * b;
		System.out.println(multiplicar.executar(2, 3));  // Outra forma de criação de uma função "lambda".
	}
}