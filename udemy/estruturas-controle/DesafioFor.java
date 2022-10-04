package estruturas.controle;

public class DesafioFor {
	public static void main(String[] args) {
		for(String valor = "#"; !valor.equals("######"); valor += "#") {
			System.out.println(valor);
		}
	}
}