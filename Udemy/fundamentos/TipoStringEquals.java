package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		
		String s1 = new String("2");
		System.out.println("2".equals(s1));  // O equals comparou o conteúdo da variável "s" com o valor "2" digitado.
		Scanner scan = new Scanner (System.in);
		System.out.print("Digite o número 2: ");
		String s2 = scan.nextLine();
		System.out.println("2".equals(s2.trim()));
		/*
		 * / O trim serve para tirar os eventuais espaços digitados pelo usuário.
		 * Se usar o comand next() no lugal do nextLine(), os espaços já são
		 * retirados automaticamente.
		 */
		scan.close();
	}
}