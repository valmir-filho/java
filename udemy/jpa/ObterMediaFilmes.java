package teste.consulta;

import infra.Dao;
import modelo.consulta.NotaFilme;

public class ObterMediaFilmes {
	public static void main(String[] args) {
		Dao<NotaFilme> dao = new Dao<>(NotaFilme.class);
		NotaFilme nota = dao.consultarUm("obterMediaGeralDosFilmes");
		System.out.println(nota.getMedia());
		dao.fechar();
	}
}