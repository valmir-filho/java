package generics.exemplo4;

public class CaixaNumeroTeste {
	public static void main(String[] args) {
		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		caixaA.guardar(2.3);
		System.out.println(caixaA.abrir());
		CaixaNumero<Integer> caixaB = new CaixaNumero<>();
		caixaB.guardar(23);
		System.out.println(caixaB.abrir());
	}
}