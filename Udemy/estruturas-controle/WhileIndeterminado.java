package estruturas.controle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String palavra = "";
		while(!palavra.equalsIgnoreCase("sair")) {
			System.out.print("Digite qualquer coisa (para encerrar, digite sair): ");
			palavra = scan.nextLine();
		}
		scan.close();
		System.out.println("Obrigado!");
	}
}