package classes.metodos.exemplo8;

public class VariavelGlobal {
	
	int a = 3;
	/*
	 * Poderia resolver também, sem precisar criar
	 * um objeto, colocando a palavra reservada
	 * static na frente: static int a = 3;.
	 */
	
	public static void main(String[] a) {	
		
		VariavelGlobal v = new VariavelGlobal();
		/*
		 * Para usar a variável global dentro desse método,
		 * foi necessário criar um objeto.
		 */
		System.out.println(v.a);
	}
}