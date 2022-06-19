package fundamentos;

import java.util.Scanner;

public class FahrenheitCelsius {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Digite a temperatura em ˚F: ");
		double temperatura = scan.nextDouble();
		double conversao = (temperatura - 32) * (5.0 / 9.0);
		System.out.printf("%.0f˚F equivale a %.0f˚C.", temperatura, conversao);
		scan.close();
	}
}