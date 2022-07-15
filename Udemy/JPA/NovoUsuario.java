package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.basico.Usuario;

public class NovoUsuario {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		Usuario novoUsuario = new Usuario("Pedro", "pedro@lanche.com.br");
		em.persist(novoUsuario);
		em.close();
		emf.close();
	}
}