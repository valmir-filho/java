package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Informe o salário 1: ");
		String s1 = scan.nextLine().replace(",", ".");  // Substitui a vírgula por ponto.
		double salario1 = Double.parseDouble(s1);  // Converte uma String em double.
		System.out.print("Informe o salário 2: ");
		String s2 = scan.nextLine().replace(",", ".");
		double salario2 = Double.parseDouble(s2);
		System.out.print("Informe o salário 3: ");
		String s3 = scan.nextLine().replace(",", ".");
		double salario3 = Double.parseDouble(s3);
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.printf("A média salarial é de: R$%.2f", media);
		scan.close();
	}
}