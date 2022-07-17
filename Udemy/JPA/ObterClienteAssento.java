package teste.umparaum;

import infra.Dao;
import modelo.umparaum.Assento;
import modelo.umparaum.Cliente;

public class ObterClienteAssento {
	public static void main(String[] args) {
		Dao<Cliente> daoCliente = new Dao<>(Cliente.class);
		Cliente cliente = daoCliente.obterPorId(1L);
		System.out.println(cliente.getAssento().getNome());
		daoCliente.fechar();
		Dao<Assento> daoAssento = new Dao<>(Assento.class);
		Assento assento = daoAssento.obterPorId(1L);
		System.out.println(assento.getCliente().getNome());
		daoAssento.fechar();
	}
}