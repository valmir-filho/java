package heranca.encapsulamento.casa2;

import heranca.encapsulamento.casa1.Ana;

public class Pedro extends Ana {
	void testeAcessos() {
		// System.out.println(segredo);  // Esse atributo não está disponível, pois ele está com o modificador de acesso "private".
		// System.out.println(facoDentroDeCasa);  // Esse atributo não está disponível (mesmo sendo transmitido por herança), pois ele não está no mesmo pacote.
		System.out.println(formaDeFalar);  // Esse atributo está disponível, pois ele foi transmitido por herança.
		System.out.println(todosSabem);  // Esse atributo está disponível, pois ele está com o modificador de acesso "public".
	}
}