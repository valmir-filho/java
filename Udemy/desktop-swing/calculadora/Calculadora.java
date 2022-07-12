package desktop.swing.calculadora;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {
	public Calculadora() {
		organizarLayout();
		setSize(232, 322);  // Comando para definição do tamanho da janela.
		setDefaultCloseOperation(EXIT_ON_CLOSE);  // Comando para definição da forma de encerramento da janela.
		setLocationRelativeTo(null);
		/* Comando para posicionar a nova tela criada. Se o parâmetro for "nulo", ocorre a centralização tela do computador, senão, a janela
		fica centralizada na tela do próprio programa que está sendo utilizado */
		setVisible(true);  // Comando para criação da janela.
	}
	private void organizarLayout() {
		setLayout(new BorderLayout());  // Comando para definição do layout da janela.
		Display display = new Display();
		display.setPreferredSize(new Dimension(233, 60));  // Comando para definição do tamanho do display na janela.
		add(display, BorderLayout.NORTH);  // Comando para alocação do display na região norte da janela.
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);  // Comando para alocação do display no centro da janela.
	}
	public static void main(String[] args) {
		new Calculadora();
	}
}