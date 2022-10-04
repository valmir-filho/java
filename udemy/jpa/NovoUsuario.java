package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.basico.Usuario;

public class NovoUsuario {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		Usuario novoUsuario = new Usuario("Leonardo", "leonardo@lanche.com.br");
		em.getTransaction().begin();
		em.persist(novoUsuario);  // Método para inserção no BD "curso_java".
		em.getTransaction().commit();
		System.out.println("O id gerado foi: " + novoUsuario.getId());
		em.close();
		emf.close();
	}
}