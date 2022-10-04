package teste.umparamuitos;

import infra.Dao;
import modelo.umparamuitos.ItemPedido;
import modelo.umparamuitos.Pedido;

public class ObterPedido {
	public static void main(String[] args) {
		Dao<Pedido> dao = new Dao<>(Pedido.class);
		Pedido pedido = dao.obterPorId(1L);
		for(ItemPedido item: pedido.getItens()) {
			System.out.println(item.getQuantidade());
			System.out.println(item.getProduto().getNome());
		}
		dao.fechar();
	}
}