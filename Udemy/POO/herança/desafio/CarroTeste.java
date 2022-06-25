package heranca.desafio;

public class CarroTeste {
	public static void main(String[] args) {
		Fusca c1 = new Fusca();
		System.out.println(c1);
		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		System.out.println(c1);
		c1.frear();
		System.out.println(c1);
		Ferrari c2 = new Ferrari();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.frear();
		System.out.println(c2);
	}
}