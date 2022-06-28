package polimorfismo.exemplo1;

public class Arroz {
	private double peso;
	public Arroz(double peso) {
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