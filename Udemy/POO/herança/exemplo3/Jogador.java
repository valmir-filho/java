package heranca.exemplo3;

public class Jogador {
	int x, y;
	int vida = 100;
	boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		} else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
			return true;
		} else {
			return false;
		}
	}
	boolean andar(Direcao direcao) {
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