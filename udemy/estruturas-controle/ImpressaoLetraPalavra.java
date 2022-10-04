package estruturas.controle;

import java.util.Scanner;

public class ImpressaoLetraPalavra {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite uma palavra qualquer: ");
		String palavra = scan.nextLine();
		for(int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
		scan.close();
	}
}