package estruturas.controle;

import java.util.Scanner;

public class NumerosPositivos {
	public static void main(String[] args) {
		double num = 0;
		double soma = 0;
		Scanner scan = new Scanner(System.in);
		while(num >= 0) {
			System.out.print("Digite um número qualquer: ");
			num = scan.nextDouble();
			if(num >= 0) {
				soma += num;
				System.out.printf("A soma parcial do(s) número(s) digitado(s) é igual a: %.1f\n", soma);
			}
		}
		System.out.printf("A soma final do(s) número(s) digitado(s) é igual a: %.1f\n", soma);
		System.out.println("Fim!");
		scan.close();
	}
}