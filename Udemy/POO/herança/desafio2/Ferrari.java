package heranca.desafio2;

public class Ferrari extends Carro {
	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
	}
	@Override
	void acelerar() {
		velocidadeAtual += 15;
	}
}