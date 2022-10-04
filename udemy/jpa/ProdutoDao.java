package infra;

import modelo.basico.Produto;

public class ProdutoDao extends Dao<Produto> {
	public ProdutoDao() {
		super(Produto.class);
	}
}