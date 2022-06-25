package heranca.exemplo1;

public class Jogo {
	public static void main(String[] args) {
		Jogador j1 = new Jogador();
		j1.x = 10;
		j1.y = 10;
		j1.andar(Enumeracao.Norte);
		j1.andar(Enumeracao.Leste);
		j1.andar(Enumeracao.Norte);
		j1.andar(Enumeracao.Leste);
		System.out.println(j1.x);
		System.out.println(j1.y);
	}
}