package encapsulamento.exemplo1.casa2;

import encapsulamento.exemplo1.casa1.Ana;

public class Julia {
	void testeAcessos() {
		Ana sogra = new Ana();
		// System.out.println(sogra.segredo);  // Esse atributo não está disponível, pois ele está com o modificador de acesso "private".
		// System.out.println(sogra.facoDentroDeCasa);  // Esse atributo não está disponível, pois ele não está no mesmo pacote.
		// System.out.println(sogra.formaDeFalar);  // Esse atributo não está disponível, pois ele não está no mesmo pacote.
		System.out.println(sogra.todosSabem);  // Esse atributo está disponível, pois ele está com o modificador de acesso "public".
	}
}