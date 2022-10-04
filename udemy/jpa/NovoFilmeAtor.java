package teste.muitosparamuitos;

import infra.Dao;
import modelo.muitosparamuitos.Ator;
import modelo.muitosparamuitos.Filme;

public class NovoFilmeAtor {
	public static void main(String[] args) {
		Filme filmeA = new Filme("Star Wars", 8.9);
		Filme filmeB = new Filme("O Fugitivo", 8.1);
		Ator atorA = new Ator("Harrison Ford");
		Ator atrizB = new Ator("Carrie Fisher");
		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atrizB);
		filmeB.adicionarAtor(atorA);
		Dao<Filme> dao = new Dao<Filme>();
		dao.incluirAtomico(filmeA);
	}
}