package streams.exemplo4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("João", 7.8);
		Aluno a2 = new Aluno("Pedro", 5.8);
		Aluno a3 = new Aluno("Ana", 9.8);
		Aluno a4 = new Aluno("Maria", 7.1);
		Aluno a5 = new Aluno("José", 8.8);
		Aluno a6 = new Aluno("Mario", 5.5);
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> fraseAprovado = a -> "Parabéns " + a.nome + "! Você está aprovado(a)!";
		alunos.stream().filter(aprovado).map(fraseAprovado).forEach(System.out::println);
	}
}
