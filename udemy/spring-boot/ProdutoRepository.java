package exercicios.spring.boot.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import exercicios.spring.boot.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
}