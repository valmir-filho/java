package estruturas.controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número entre 1 e 7: ");
		int num = scan.nextInt();
		if(num < 1 || num > 7) {
			System.out.println("Número inválido!");
		} else if(num == 1) {
			System.out.printf("O número %d digitado equivale a Domingo.", num);
		} else if(num == 2) {
			System.out.printf("O número %d digitado equivale a Segunda.", num);
		} else if(num == 3) {
			System.out.printf("O número %d digitado equivale a Terça.", num);
		} else if(num == 4) {
			System.out.printf("O número %d digitado equivale a Quarta.", num);
		} else if(num == 5) {
			System.out.printf("O número %d digitado equivale a Quinta.", num);
		} else if(num == 6) {
			System.out.printf("O número %d digitado equivale a Sexta.", num);
		} else {
			System.out.printf("O número %d digitado equivale a Sábado.", num);
		}
		scan.close();
	}
}