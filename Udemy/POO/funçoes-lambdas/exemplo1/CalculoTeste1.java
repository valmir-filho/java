package lambdas.exemplo1;

public class CalculoTeste1 {
	public static void main(String[] args) {
		Calculo somar = new Somar();
		Calculo multiplicar = new Multiplicar();
		System.out.println(somar.executar(4, 5));
		System.out.println(multiplicar.executar(5, 4));
	}
}