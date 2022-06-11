package fundamentos;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		System.out.println(condicao1 && condicao2);  // Operador lógico e.
		System.out.println(condicao1 || condicao2);  // Operador lógico ou. 
		System.out.println(condicao1 ^ condicao2);  // Operador lógico ou exclusivo.
		System.out.println(!condicao1);  // Operador lógico negação.
		System.out.println(!!condicao2);  // Operador lógico dupla negação.
	}
}