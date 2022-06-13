package fundamentos;

import java.util.Scanner;

public class Potencia {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número qualquer: ");
		double num = scan.nextDouble();
		System.out.printf("O número %.2f elevado a 2 é: %.2f.", num, Math.pow(num, 2));
		System.out.printf("\nO número %.2f elevado a 3 é: %.2f.", num, Math.pow(num, 3));

		scan.close();
	}
}