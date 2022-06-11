package fundamentos;

public class DesafioOperadoresAritmeticos {
	
	public static void main(String[] args) {
		
		double numerador1 = Math.pow((6 * (3 + 2)), 2);
		double denominador1 = 3 * 2;
		double divisao1 = numerador1 / denominador1;
		double numerador2 = (1 - 5) * (2 - 7);
		double denominador2 = 2;
		double divisao2 = Math.pow(numerador2 / denominador2, 2);
		double numerador3 = Math.pow(divisao1 - divisao2, 3);
		double denominador3 = Math.pow(10, 3);
		double resultado = numerador3 / denominador3;
		System.out.print("O resultado é: " + resultado);
	}
}