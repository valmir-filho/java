package infra;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Dao<E> {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe;
	static {
		try {
			emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		} catch (Exception excecao) {
		}
	}
	public Dao() {
		this(null);
	}
	public Dao(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}
	public Dao<E> abrirT() {
		em.getTransaction().begin();
		return this;
	}
	public Dao<E> fecharT() {
		em.getTransaction().commit();;
		return this;
	}
	public Dao<E> incluir(E entidade) {
		em.persist(entidade);
		return this;
	}
	public Dao<E> incluirAtomico(E entidade) {
		em.getTransaction().begin();
		return this.abrirT().incluir(entidade).fecharT();
	}
	public E obterPorId(Object id) {
		return em.find(classe, id);
	}
	public List<E> obterTodos() {
		return this.obterTodos(10, 0);
	}
	public List<E> obterTodos(int quantidade, int deslocamento) {
		if(classe == null) {
			throw new UnsupportedOperationException("Classe nula");
		}
		String jpql = "select e from " + classe.getName() + " e";
		TypedQuery<E> query = em.createQuery(jpql, classe);
		// Método para definição da quantidade de resultados gerados (nesse caso o máximo).
		query.setMaxResults(quantidade);
		// Método para definição do início da geração dos resultados gerados (nesse caso a partir do primeiro).
		query.setFirstResult(deslocamento);
		return query.getResultList();
	}
	public List<E> consultar(String nomeConsulta, Object... params) {
		TypedQuery<E> query = em.createNamedQuery(nomeConsulta, classe);
		for(int i = 0; i < params.length; i += 2) {
			query.setParameter(params[i].toString(), params[i + 1]);
		}
		return query.getResultList();
	}
	public E consultarUm(String nomeConsulta, Object... params) {
		List<E> lista = consultar(nomeConsulta, params);
		return lista.isEmpty() ? null : lista.get(0);
	}
	public void fechar() {
		em.close();
	}
}