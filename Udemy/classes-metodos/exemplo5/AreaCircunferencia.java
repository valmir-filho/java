package classes.metodos.exemplo5;

public class AreaCircunferencia {
	double raio, pi;
	// double pi = 3.14; Pode-se inicializar a variável aqui também.
	AreaCircunferencia(double raioInicial) {
		pi = 3.14;
		raio = raioInicial;
	}
	double area() {	
		return pi * Math.pow(raio, 2);
	}
}
