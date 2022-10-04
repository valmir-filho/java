package tratamento.erros.exemplo4;

import java.util.Scanner;

public class Finally {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println(7 / scan.nextInt());
		} catch (Exception excecao) {
			System.out.println(excecao.getMessage());
		} finally {  // Sempre será chamado.
			System.out.println("Finally!");
			scan.close();
		}
		System.out.println("Fim!");
	}
}