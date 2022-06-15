package classes.metodos.exemplo6;

public class AreaCircunferencia {
	
	double raio;
	static double pi = 3.14;
	/*
	 * Usando o modificador "static" eu transformei a 
	 * variável (ou constante, ou método) que pertencia a instância
	 * (ou ao objeto) para uma variável que pertence a classe.
	 */
	
	AreaCircunferencia(double raioInicial) {
		
		pi = 3.14;
		raio = raioInicial;
	}
	
	double area() {
		
		return pi * Math.pow(raio, 2);
	}
}