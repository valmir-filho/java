package exercicios.spring.boot.model.repositories;

import org.springframework.data.repository.CrudRepository;
import exercicios.spring.boot.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
}