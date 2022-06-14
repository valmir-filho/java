package estruturas.controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String texto = "";
		do {
			System.out.print("Digite a palavra mágica para sair: ");
			texto = scan.nextLine();
		} while (!texto.equalsIgnoreCase("sair"));  // Apenas no do-while é utilizado ; após o while.
		System.out.println("Obrigado!");
		scan.close();
	}
}