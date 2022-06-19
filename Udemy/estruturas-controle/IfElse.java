package estruturas.controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Informe o número: ");
		int numero = Integer.parseInt(valor); // Transforma uma String em número inteiro.
		if(numero % 2 == 0) {
			System.out.println("O número digitado é par.");
		} else {
			System.out.println("O número digitado é impar.");
		}
	}
}