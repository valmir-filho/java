package fundamentos;

public class OperadoresAtribuicao {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		c += b;  // A mesma coisa que: c = c + b.
		c -= b;  // A mesma coisa que: c = c - b.
		c *= b;  // A mesma coisa que: c = c * b.
		c /= b;  // A mesma coisa que: c = c / b.
		c %= 2;  // A mesma coisa que: c = c % 2. O resultado é 0 ou 1.		
	}
}