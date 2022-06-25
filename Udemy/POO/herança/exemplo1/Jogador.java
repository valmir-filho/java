package heranca.exemplo1;

public class Jogador {
	int x, y;
	boolean andar(Enumeracao direcao) {
		switch(direcao) {
		case Norte:
			y--;
			break;
		case Leste:
			x++;
			break;
		case Sul:
			y++;
			break;
		case Oeste:
			x--;
			break;
		}
		return true;
	}
}