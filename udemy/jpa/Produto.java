package modelo.basico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "prod_nome", length = 200, nullable = false)
	/* O annotation "@Column" está sendo utilizado para definição das características da coluna
	"prod_nome" na tabela "produtos" dentro do BD "curso_java", inclusive com os seus atributos
	(nesse caso: tamanho e a não aceitação de dados nulos). */
	private String nome;
	@Column(name = "prod_preco", nullable = false, precision = 11, scale = 2)
	/* O atributo "precision" (nesse caso) está definindo a precisão do número que será apresentado e
	o atributo "scale", a quantidade de números decimais. */
	private Double preco;
	public Produto() {
	}
	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
}