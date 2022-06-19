package classes.metodos.exemplo11;

public class Jantar {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("João da Silva", 73.4);
		Comida c1 = new Comida("Feijão", 0.350);
		Comida c2 = new Comida("Arroz", 0.450);
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
		p.comer(c2);
		System.out.println(p.apresentar());
	}
}
