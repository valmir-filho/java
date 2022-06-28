package polimorfismo.exemplo2;

public class Comida {
	private double peso;
	public Comida(double peso) {
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