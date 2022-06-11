package fundamentos;

public class OperadoresUnarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		a++;  // A mesma coisa que: a = a + 1. Forma pós-fixada.
		a--;  // A mesma coisa que: a = a - 1. Forma pós-fixada.
		++b;  // A mesma coisa que: b = b + 1. Forma pré-fixada.
		--b;  // A mesma coisa que: b = b - 1. Forma pré-fixada.
		System.out.println(++a == b--);
		/*
		 * Aqui é verdadeiro, pois ele incrementou o "a" antes de comparar
		 * com o b, que será decrementado somente após a comparação, por
		 * isso que a é igual a b, nesse caso.
		 */
		System.out.println(a);
		System.out.println(b);
	}
}