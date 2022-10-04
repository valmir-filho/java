package classes.metodos.exemplo11;

public class Pessoa {
	String nomePessoa;
	double pesoPessoa;
	Pessoa(String nomePessoa, double pesoComida) {
		this.nomePessoa = nomePessoa;
		this.pesoPessoa = pesoComida;
	}
	void comer(Comida comida) {
		if(comida != null) {
			this.pesoPessoa += comida.pesoComida;
		}
	}
	String apresentar() {
		return "Meu nome é " + nomePessoa + " e tenho " + pesoPessoa + " quilos.";
	}
}
