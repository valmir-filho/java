package poo.relacionamentomuitosparamuitos;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		Curso curso1 = new Curso("POO com Java");
		Curso curso2 = new Curso("HTML5");
		Curso curso3 = new Curso("Python");
		curso1.adicionarAluno(aluno1);  // Relacionado o curso com o aluno.
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno2);
		aluno1.adicionarCurso(curso3);  // Relacionado o aluno com o curso.
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		System.out.print("Alunos do curso 1: ");
		for(Aluno aluno: curso1.alunos) {
			System.out.print(aluno.nome + ", ");
		}
		System.out.print("Fim!");
		System.out.println();
		System.out.print("Alunos do curso 2: ");
		for(Aluno aluno: curso2.alunos) {
			System.out.print(aluno.nome + ", ");
		}
		System.out.print("Fim!");
		System.out.println();
		System.out.print("Alunos do curso 3: ");
		for(Aluno aluno: curso3.alunos) {
			System.out.print(aluno.nome + ", ");
		}
		System.out.print("Fim!");
	}
}