package teste.heranca;

import infra.Dao;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {
	public static void main(String[] args) {
		Dao<Aluno> alunoDao = new Dao<>();
		Aluno aluno1 = new Aluno(123L, "João");
		AlunoBolsista aluno2 = new AlunoBolsista(345L, "Maria", 1000);
		alunoDao.incluirAtomico(aluno1);
		alunoDao.incluirAtomico(aluno2);
		alunoDao.fechar();
	}
}