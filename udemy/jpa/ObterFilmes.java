package teste.consulta;

import java.util.List;
import infra.Dao;
import modelo.muitosparamuitos.Ator;
import modelo.muitosparamuitos.Filme;

public class ObterFilmes {
	public static void main(String[] args) {
		Dao<Filme> dao = new Dao<>(Filme.class);
		List<Filme> filmes = dao.consultar("obterFilmesComNotaMaiorQue", "nota", 8.5);
		System.out.println(filmes.size());
		for(Filme filme: filmes) {
			System.out.println(filme.getNome() + " -> " + filme.getNota());
			for(Ator ator: filme.getAtores()) {
				System.out.println(ator.getNome());
			}
		}
	}
}