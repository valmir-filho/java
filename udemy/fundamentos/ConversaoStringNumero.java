package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");
		double numero1 = Double.parseDouble(valor1);  // Converte uma String em um double.
		double numero2 = Double.parseDouble(valor2);
		double soma = numero1 + numero2;
		double media = (numero1 + numero2) / 2;
		System.out.println(soma);
		System.out.println(media);
	}
}