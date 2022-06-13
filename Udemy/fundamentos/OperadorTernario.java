package fundamentos;

public class OperadorTernario {
	
	public static void main(String[] args) {
		
		double media = 7.6;
		String resultado = media >= 7.0 ? "Aprovado" : "Recuperação";
		System.out.println("O aluno está: " + resultado + ".");
	}
}