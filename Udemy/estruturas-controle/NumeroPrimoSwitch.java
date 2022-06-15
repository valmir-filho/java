package estruturas.controle;

import java.util.Scanner;

public class NumeroPrimoSwitch {
	
	public static void main(String[] args) {
		
		int contadorDivisores = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número inteiro positivo qualquer: ");
		int num = scan.nextInt();
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				contadorDivisores++;
			}
		}
		switch(contadorDivisores) {
		case 0:
			System.out.printf("%d é um número primo.", num);
			break;
		default:
			System.out.printf("%d não é um número primo.", num);
			break;
		}
		scan.close();
	}
}