package teste.basico;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import modelo.basico.Usuario;

public class ObterUsuarios {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		String jpql = "select u from Usuario u";
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		query.setMaxResults(5);  // Método para especificação da quantidade de resultados (do BD) fornecidos.
		List<Usuario> usuarios = query.getResultList();
		for(Usuario usuario: usuarios ) {
			System.out.println("id: " + usuario.getId() + " - email: " + usuario.getEmail());
		}
		em.close();
		emf.close();
	}
}