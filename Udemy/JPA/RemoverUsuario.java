package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.basico.Usuario;

public class RemoverUsuario {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		Usuario usuario = em.find(Usuario.class, 7l);
		if(usuario != null) {
			em.getTransaction().begin();  // Método para abertura da transação.
			em.remove(usuario);  // Método para exclusão do dado (nesse caso o usuário 7 da tabela "Usuarios") do BD "curso_java".
			em.getTransaction().commit();  // Método para efetuação do método de eclusão (nesse caso).
		}
		em.close();
		emf.close();
	}
}