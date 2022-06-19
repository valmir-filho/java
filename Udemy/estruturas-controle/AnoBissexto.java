package estruturas.controle;

import java.util.Scanner;

public class AnoBissexto {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um ano qualquer: ");
		int ano = scan.nextInt();
		if(ano % 4 == 0 && ano % 100 != 0) {
			System.out.printf("%d é um ano bissexto.", ano);
		} else if(ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0) {
			System.out.printf("%d é um ano bissexto.", ano);
		} else {
			System.out.printf("%d não é um ano bissexto.", ano);
		}
		scan.close();
	}
}