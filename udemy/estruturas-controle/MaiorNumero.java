package estruturas.controle;

import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) {
		int maiorValor = 0;
		int contador = 0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("Digite um número inteiro qualquer: ");
			int valor = scan.nextInt();
			if (valor > maiorValor) {
				maiorValor = valor;
			}
			contador++;
		} while (contador != 10);
		System.out.printf("O maior número digitado foi o " + maiorValor + ".");
		scan.close();
	}
}