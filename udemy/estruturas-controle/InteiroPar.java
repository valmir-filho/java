package estruturas.controle;

import java.util.Scanner;

public class InteiroPar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número qualquer: ");
		int numero = scan.nextInt();
		if(numero >= 0 && numero < 10) {
			if(numero % 2 == 0) {
				System.out.printf("O número %d está entre 0 e 10 e é par.", numero);
			} else {
				System.out.printf("O número %d está entre 0 e 10, porém é ímpar.", numero);
			}
		} else {
			System.out.println("O número digitado não está entre 0 e 10.");
		}
		scan.close();
	}
}