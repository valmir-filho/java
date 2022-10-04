package lambdas.exemplo2;

@FunctionalInterface  // Interface funcional. Pode ter somente 1 único método.
public interface Calculo {
	public double executar(double a, double b);  // Mesmo não estando explícito, esse método é sempre abstrato.
}