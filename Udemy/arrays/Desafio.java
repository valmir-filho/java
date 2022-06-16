package arrays;

import java.util.Scanner;

public class Desafio {
	
	public static void main(String[] args) {
		
		int tamanhoArray;
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe quantas notas quer incluir: ");
		tamanhoArray = scan.nextInt();
		double[] notas = new double[tamanhoArray];
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota " + (i + 1) + ": ");
			notas[i] = scan.nextDouble();
		}
		double media = 0;
		System.out.print("Notas digitadas: ");
		for(double nota: notas) {
			System.out.print(nota + " ");
			media += nota;
		}
		System.out.println();
		System.out.printf("A média das notas é: %.2f.", (media / notas.length));
		scan.close();
	}
}