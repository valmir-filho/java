package estruturas.controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int quantidadeNotas = 0;
		double nota = 0;
		double total = 0;
		while(nota != -1) {
			System.out.print("Digite a nota do aluno (para sair, digite -1): ");
			nota = scan.nextDouble();
			if(nota <=10 && nota >= 0) {
				total += nota;
				quantidadeNotas++;
			} else if(nota != -1) {
				System.out.println("Erro! Digite uma nota entre 0 e 10.");
			}
		}
		double media = total / quantidadeNotas;
		System.out.printf("Foram digitadas %d notas.", quantidadeNotas);
		System.out.printf("\nA média das notas digitadas é: %.2f.", media);
		scan.close();
	}
}