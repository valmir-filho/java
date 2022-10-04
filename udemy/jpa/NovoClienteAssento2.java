package teste.umparaum;

import infra.Dao;
import modelo.umparaum.Assento;
import modelo.umparaum.Cliente;

public class NovoClienteAssento2 {
	public static void main(String[] args) {
		Assento assento = new Assento("4D");
		Cliente cliente = new Cliente("Rodrigo", assento);
		Dao<Cliente> dao = new Dao<>(Cliente.class);
		dao.incluirAtomico(cliente);
	}
}