package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args)
		double area;
		double raio = 3.4;
		final double PI = 3.1415; // transforma PI em uma constante. Sempre representar constantes com letra maiúscula.
		area = PI * raio * raio;
		System.out.println("O valor da área da circunferência é igual a: " + area + " m2.");
	}
}