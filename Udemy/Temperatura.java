package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		double fahrenheit = 86;
		final int FATOR = 32;
		final double DIVISAO = 5.0/9.0;
		double celsius = (fahrenheit - FATOR) * DIVISAO;
		System.out.printf("A temperatura de 86˚F em ˚C é igual a: " + celsius + "˚C.");
	}
}