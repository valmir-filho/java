package poo.relacionamentomuitosparamuitos;

import java.util.ArrayList;

public class Aluno {
	final String nome;
	final ArrayList<Curso> cursos = new ArrayList<Curso>();
	/* A palavra reservada "final", transformou a lista em uma lista constante,
	ou seja, o endereço de memória não muda. */
	Aluno(String nome) {
		this.nome = nome;
	}
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
}