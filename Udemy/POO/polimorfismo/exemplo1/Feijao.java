package polimorfismo.exemplo1;

public class Feijao {
	private double peso;
	public Feijao(double peso) {
		this.peso = peso;
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