package heranca.exemplo6;

public class Pessoa {
	private int idade;
	private String nome;
	public Pessoa(int idade, String nome) {  // Construtor.
		this.idade = idade;
		this.nome = nome;
	}
	public int getIdade() {  // Método Getter (faz a leitura).
		return idade;
	}
	public void setIdade(int idade) {  // Método Setter (faz a alteração).
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {  // Método toString.
		return "Meu nome é " + getNome() + " e eu tenho " + getIdade() + " anos.";
	}
}