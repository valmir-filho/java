package teste.basico;

import infra.Dao;
import modelo.basico.Produto;

public class NovoProduto {
	public static void main(String[] args) {
		Produto produto = new Produto("Monitor", 789.32);
		Dao<Produto> dao = new Dao<>(Produto.class);
		dao.abrirT().incluir(produto).fecharT().fechar();  // Uma maneira de inclusão de um produto na tabela "produtos" no BD "curso_java".
		// dao.incluirAtomico(produto).fechar();  // Outra maneira de inclusão de um produto na tabela "produtos" no BD "curso_java".
		System.out.println("id do produto: " + produto.getId());
	}
}