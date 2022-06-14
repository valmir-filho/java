package estruturas.controle;

import java.util.Scanner;

public class SwitchComBreak {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String conceito = "";
		System.out.print("Digite a nota do aluno: ");
		int nota = scan.nextInt();
		switch(nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1: case 0:
			conceito = "E";
			break;
		default:
			conceito = "não encontrado";
		}
		System.out.printf("O conceito referente a nota %d é: %s.", nota, conceito);
		scan.close();
	}
}