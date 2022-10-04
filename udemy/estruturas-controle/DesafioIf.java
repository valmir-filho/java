package estruturas.controle;

public class DesafioIf {
	public static void main(String[] args) {
		double nota = 1.3;
		if (nota >= 9.0); { 
			/* Tomar cuidado com o ; colocado após a condição do if, pois ele faz com que o código seja executado da
			mesma forma. Se retirarmos fica certo. */
			System.out.println("Quadro de honra!");
			System.out.println("Você é fera!");
		}
	}
}