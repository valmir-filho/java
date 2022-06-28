package encapsulamento.exemplo1.casa1;

public class Paulo {
	void testeAcessos() {
		Ana esposa = new Ana();
		// System.out.println(esposa.segredo);  // Esse atributo não está disponível, pois ele está com o modificador de acesso "private".
		System.out.println(esposa.facoDentroDeCasa);  // Esse atributo está disponível, pois mesmo ele estando com o modificador de acesso "default", ele está no mesmo pacote.
		System.out.println(esposa.formaDeFalar);  // Esse atributo está disponível, pois mesmo ele estando com o modificador de acesso "protected", ele está no mesmo pacote.
		System.out.println(esposa.todosSabem);  // Esse atributo está disponível, pois ele está com o modificador de acesso "public".
	}
}