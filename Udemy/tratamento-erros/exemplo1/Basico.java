package tratamento.erros.exemplo1;

public class Basico {
	public static void main(String[] args) {
		Aluno a1 = null;
		try {
			imprimirNomeDoAluno(a1);
		} catch(Exception excecao) {
			System.out.println("Erro no momento de imprimir o nome do usuário.");
		}
		/* Sem o uso do "try/catch", aconteceria o seguinte erro: 
		 * Exception in thread "main" java.lang.NullPointerException: Cannot
		 * read field "nome" because "aluno" is null. */
		try {
			System.out.println(7/0);
		} catch (ArithmeticException excecao) {
			System.out.println("Erro: " + excecao.getMessage());;
		}
		/* Sem o uso do "try/catch", aconteceria o seguinte erro:
		 * Exception in thread "main" java.lang.ArithmeticException:
		 * / by zero. */
		System.out.println("Fim!");
	}
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}