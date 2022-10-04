package teste.umparamuitos;

import infra.Dao;
import modelo.basico.Produto;
import modelo.umparamuitos.ItemPedido;
import modelo.umparamuitos.Pedido;

public class NovoPedido {
	public static void main(String[] args) {
		Dao<Object> dao = new Dao<>();
		Pedido pedido = new Pedido();
		Produto produto = new Produto("Geladeira", 2789.99);
		ItemPedido item = new ItemPedido(pedido, produto, 10);
		dao.abrirT().incluir(produto).incluir(pedido).incluir(item).fecharT().fechar();
	}
}