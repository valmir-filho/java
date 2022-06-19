package classes.metodos.exemplo5;

public class AreaCircunferenciaTeste {
	public static void main(String[] args) {	
		AreaCircunferencia a1 = new AreaCircunferencia(10);
		a1.pi = 10;
		/* Para cada objeto (ou instância), têm-se um valor de Pi, ou seja, essa
		variável (ou constante), pertence ao objeto e não a classe. */
		System.out.println(a1.area());
		AreaCircunferencia a2 = new AreaCircunferencia(5);
		a2.pi = 5;
		System.out.println(a2.area());
	}
}
