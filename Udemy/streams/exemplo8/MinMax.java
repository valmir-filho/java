package streams.exemplo8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("João", 7.1);
		Aluno a2 = new Aluno("Pedro", 6.1);
		Aluno a3 = new Aluno("José", 8.1);
		Aluno a4 = new Aluno("Lucas", 10);
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
			if(aluno1.nota > aluno2.nota) return 1;
			if(aluno1.nota < aluno2.nota) return -1;
			return 0;
		};
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());
	}
}