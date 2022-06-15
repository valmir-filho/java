package estruturas.controle;

import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
	
	public static void main(String[] args) {
		
		int continuar, numeroSorteado, tentativas, numero;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Estou pensando em um número entre 0 e 50...");
			System.out.println("Tente descobrir, você tem 10 tentativas!");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(51);
			tentativas = 0;
			do {
				tentativas++;
				System.out.printf("\nTentativa %d: ", tentativas);
				numero = scan.nextInt();
				if (numero > numeroSorteado) {
					System.out.printf("\nErrou!!! O número sorteado e menor que %d.\n", numero);
				} else if (numero < numeroSorteado) {
					System.out.printf("\nErrou!!! O número sorteado e maior que %d.\n", numero);
				} else {
					System.out.printf("\nParabéns!!! Você acertou o numero em %d tentativas!", tentativas);
				}
			} while (numero != numeroSorteado);
			System.out.print("\n\nDigite 0 para sair, ou qualquer outro numero para continuar: ");
			continuar = scan.nextInt();
		} while (continuar != 0);
		scan.close();
	}
}