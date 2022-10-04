package fundamentos;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		var x = 34.56;
		double y = 2.2;
		System.out.printf("A soma é: %.2f", x + y);
		System.out.printf("\nA subtração é: %.2f", x - y);
		System.out.printf("\nA multiplicação é: %.2f", x * y);
		System.out.printf("\nA divisão é: %.2f", x / y);
		System.out.printf("\nO resto da divisão é: %.2f", x % y);
	}
}