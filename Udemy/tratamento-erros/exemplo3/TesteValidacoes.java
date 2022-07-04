package tratamento.erros.exemplo3;

public class TesteValidacoes {
	public static void main(String[] args) {
		try {
			Aluno aluno = new Aluno("Ana", 7);  // Conforme eu altero os atributos do aluno, os erros abaixo ocorrem.
			Validar.aluno(aluno);
			Validar.aluno(null);
		} catch (StringVaziaException | NumeroForaIntervaloException | IllegalArgumentException excecao) {
			System.out.println(excecao.getMessage());
		}
		System.out.println("Fim!");
	}
}