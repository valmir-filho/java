package fundamentos;

import java.util.Scanner;

public class CelsiusFahreinheit {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Digite a temperatura em ˚C: ");
		double temperatura = scan.nextDouble();
		double conversao = (temperatura * (9.0/5.0)) + 32;
		System.out.printf("%.0f˚C equivale a %.0f˚F.", temperatura, conversao);
		scan.close();
	}
}