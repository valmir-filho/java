package teste.umparaum;

import infra.Dao;
import modelo.umparaum.Assento;
import modelo.umparaum.Cliente;

public class NovoClienteAssento1 {
	public static void main(String[] args) {
		Assento assento = new Assento("8C");
		Cliente cliente = new Cliente("Carlos", assento);
		Dao<Object> dao = new Dao<>();
		dao.abrirT().incluir(assento).incluir(cliente).fecharT().fechar();
	}
}