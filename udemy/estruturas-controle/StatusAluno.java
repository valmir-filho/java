package estruturas.controle;

import java.util.Scanner;

public class StatusAluno {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite a nota 1: ");
		double n1 = scan.nextDouble();
		System.out.print("Digite a nota 2: ");
		double n2 = scan.nextDouble();
		double media = (n1 + n2) / 2;
		System.out.printf("A média do aluno é: %.2f.\n", media);
		if(media >= 7) {
			System.out.println("O aluno está aprovado!");
		} else if(media >= 4) {
			System.out.println("O aluno está em recuperação!");
		} else {
			System.out.println("O aluno está reprovado!");
		}
		scan.close();
	}
}