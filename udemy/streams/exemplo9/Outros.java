package streams.exemplo9;

import java.util.Arrays;
import java.util.List;

public class Outros {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("João", 7.1);
		Aluno a2 = new Aluno("Pedro", 6.1);
		Aluno a3 = new Aluno("José", 8.1);
		Aluno a4 = new Aluno("Lucas", 10);
		Aluno a5 = new Aluno("João", 7.1);
		Aluno a6 = new Aluno("Pedro", 6.1);
		Aluno a7 = new Aluno("José", 8.1);
		Aluno a8 = new Aluno("Lucas", 10);
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		alunos.stream().distinct().forEach(System.out::println);
		// O método "distinct()" busca apenas os elementos distintos da lista.
		System.out.println();
		alunos.stream().distinct().skip(2).forEach(System.out::println);
		// O método "skip()" pula os elementos da lista, conforme o parâmetro informado.
		System.out.println();
		alunos.stream().distinct().limit(4).forEach(System.out::println);
		// O método "limit()" limita os elementos da lista, conforme o parâmetro informado.
		System.out.println();
		alunos.stream().distinct().takeWhile(a -> a.nota >= 7).forEach(System.out::println);
		// O método "takeWhile()" busca os elementos da lista, conforme o parâmetro informado.
	}
}