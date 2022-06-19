package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 123456789;
		/* É possível representar dessa forma: 123_456_789. O "underline" representa a separação
		como se fosse um ponto. */
		float salario = 11455.44f;
		double vendasAcumuladas = 2991797103.01;
		boolean ferias = false;
		char status = 'S';
		System.out.println(anosDeEmpresa);
		System.out.println(numeroDeVoos);
		System.out.println(id);
		System.out.println(pontosAcumulados);
		System.out.println(salario);
		System.out.println(vendasAcumuladas);
		System.out.println(ferias);
		System.out.println(status);
	}
}