package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(2));  // Imprime a letra do índice 2.
		String s = "Boa tarde!";
		System.out.println(s.startsWith("F"));  // Serve para verificar como inicia a String.
		System.out.println(s.length());  // Imprime o tamanho da String.
		System.out.println(s.endsWith("!"));  // Serve para verificar como finaliza a String.
		System.out.println(s.equals("Boa tarde!"));  // Serve para comparar Strings. Leva em consideração letras maiúsculas e minúsculas.
		System.out.println(s.equalsIgnoreCase("Boa tarde!"));  // Serve para comparar Strings. Não leva em consideração letras maiúsculas e minúsculas.
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 1243.33;
		System.out.printf("Nome: %s %s", nome, sobrenome);  // O "%s" serve para concatenar String, usando o "printf".
		System.out.printf("\nIdade: %d", idade);  // O "%d" serve para concatenar int, usando o "printf".
		System.out.printf("\nSalário: R$%.2f", salario);  // O "%f" serve para concatenar float, usando o "printf".
	}
}