package fundamentos;

import java.util.Scanner;

public class IndiceMassaCorporal {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Digite o seu peso (em kg): ");
		double peso = scan.nextDouble();
		System.out.print("Digite a sua altura (em m): ");
		double altura = scan.nextDouble();
		double imc = peso / (altura * altura);
		System.out.printf("O valor do seu IMC é: %.2f.", imc);
		scan.close();
	}
}