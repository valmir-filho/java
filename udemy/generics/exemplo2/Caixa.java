package generics.exemplo2;

public class Caixa<T> {  // Exemplo com "generics". O símbolo "<>" representa a criação.
	private T coisa;
	public void guardar(T coisa) {
		this.coisa = coisa;
	}
	public T abrir() {
		return coisa;
	}
}