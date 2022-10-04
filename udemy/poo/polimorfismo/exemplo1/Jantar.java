package polimorfismo.exemplo1;

public class Jantar {
	public static void main(String[] args) {
		Pessoa convidado = new Pessoa(99.2);
		Arroz alimento1 = new Arroz(0.35);
		Feijao alimento2 = new Feijao(0.25);
		System.out.println(convidado.getPeso());
		convidado.comer(alimento1);
		convidado.comer(alimento2);
		System.out.println(convidado.getPeso());
		Sorvete sobremesa = new Sorvete(0.25);
		convidado.comer(sobremesa);
		System.out.println(convidado.getPeso());
	}
}