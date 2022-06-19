package estruturas.controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite a média do aluno: ");
		double media = scan.nextDouble();
		if(media >= 7.0) {
			System.out.println("Aluno aprovado!");
		} else {
			System.out.println("Aluno reprovado!");
		}
		scan.close();
	}
}