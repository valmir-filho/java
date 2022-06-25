package heranca.exemplo4;

public class Jogo {
	public static void main(String[] args) {
		Monstro j1 = new Monstro(10, 10);
		Heroi j2 = new Heroi(10, 11);
		System.out.println(j1.vida);
		System.out.println(j2.vida);
		j1.atacar(j2);
		System.out.println(j1.vida);
		System.out.println(j2.vida);
		j2.atacar(j1);
		System.out.println(j1.vida);
		System.out.println(j2.vida);
	}
}