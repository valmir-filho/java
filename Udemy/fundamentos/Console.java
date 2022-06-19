package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = scan.nextLine();
		System.out.printf("Seu nome é: %s", nome);
		scan.close();
	}
}