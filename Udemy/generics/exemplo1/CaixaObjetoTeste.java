package generics.exemplo1;

public class CaixaObjetoTeste {  // Exemplo sem "generics".
	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3);
		Double coisaA = (Double) caixaA.abrir();
		System.out.println(coisaA);
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Olá");
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
	}
}