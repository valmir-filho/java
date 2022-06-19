package poo.relacionamentomuitosparamuitos;

import java.util.ArrayList;

public class Curso {
	final String nome;
	final ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	public Curso(String nome) {
		this.nome = nome;
	}
	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
}