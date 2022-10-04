package polimorfismo.exemplo1;

// Exemplo de um polimorfismo estático.

public class Pessoa {
	private double peso;
	public Pessoa(double peso) {
		this.peso = peso;
	}
	public void comer(Arroz arroz) {
		this.peso += arroz.getPeso();
	}
	public void comer(Feijao feijao) {  // Sobrecarga do método "comer".
		this.peso += feijao.getPeso();
	}
	public void comer(Sorvete sorvete) {  // Sobrecarga do método "comer".
		this.peso += sorvete.getPeso();
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
		}
	}
}
