package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Digite o 1˚ número: ");
		double num1 = scan.nextDouble();
		System.out.print("Digite o 2˚ número: ");
		double num2 = scan.nextDouble();
		System.out.print("Digite a operação desejada (+ - * / %): ");
		String operacao = scan.next();
		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		scan.close();
	}
}