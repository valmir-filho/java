package generics.exemplo1;

public class CaixaObjeto {  // Exemplo sem "generics".
	private Object coisa;
	public void guardar(Object coisa) {
		this.coisa = coisa;
	}
	public Object abrir() {
		return coisa;
	}
}