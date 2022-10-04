package teste.basico;

import java.util.List;
import infra.ProdutoDao;
import modelo.basico.Produto;

public class ObterProdutos {
	public static void main(String[] args) {
		ProdutoDao dao = new ProdutoDao();
		List<Produto> produtos = dao.obterTodos();
		for(Produto produto: produtos) {
			System.out.println("id: " + produto.getId() + " - Nome: " + produto.getNome());
		}
		double precoTotal = produtos.stream().map(p -> p.getPreco()).reduce(0.0,  (t, p) -> t + p).doubleValue();
		System.out.println("O valor total é de R$" + precoTotal + ".");
		dao.fechar();
	}
}
