package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.basico.Usuario;

public class AlterarUsuario1 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Usuario usuario = em.find(Usuario.class, 7L);
		usuario.setNome("Leo");  // Método para informar a alteração do dado (nesse caso o "nome"), na tabela "Usuario" do BD "curso_java".
		usuario.setEmail("leo@lanche.com.br");
		em.merge(usuario);  // Método para a alteração dos dados na tabela "Usuario" do BD "curso_java".
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}