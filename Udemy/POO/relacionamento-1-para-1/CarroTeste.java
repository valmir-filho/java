package poo.relacionamento1para1;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		System.out.println("Está ligado? " + c1.estaLigado());
		System.out.println("Ligando o carro...");
		c1.ligar();
		System.out.println("Está ligado? " + c1.estaLigado());
		System.out.println("Giros do motor: " + c1.motor.giros());
		System.out.println("Acelerando o carro...");
		c1.acelerar();
		System.out.println("Giros do motor: " + c1.motor.giros());
		System.out.println("Acelerando o carro...");
		c1.acelerar();
		System.out.println("Giros do motor: " + c1.motor.giros());
		System.out.println("Freando o carro...");
		c1.frear();
		System.out.println("Giros do motor: " + c1.motor.giros());
		System.out.println("Freando o carro...");
		c1.frear();
		System.out.println("Giros do motor: " + c1.motor.giros());
		System.out.println("Freando o carro...");
		c1.frear();
		System.out.println("Giros do motor: " + c1.motor.giros());
		System.out.println("Freando o carro...");
		c1.frear();
		System.out.println("Giros do motor: " + c1.motor.giros());
	}
}