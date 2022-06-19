package fundamentos;

import java.util.Scanner;

public class AreaTriangulo {
	
	public static void main(String[] args)
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o valor da base do triângulo: ");
		double base = scan.nextDouble();
		System.out.print("Digite o valor da altura do triângulo: ");
		double altura = scan.nextDouble();
		double area = (base * altura) / 2;
		System.out.println("A área do triângulo é igual a: " + area + ".");		
		scan.close();
	}
}