package heranca.desafio;

public class Ferrari extends Carro {
	@Override
	void acelerar() {
		velocidadeAtual += 15;
	}
}