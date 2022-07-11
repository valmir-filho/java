package desktop.swing.observer2;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
	public static void main(String[] args) {
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Comando para definição da forma de encerramento da janela.
		janela.setSize(600, 200);  // Comando para definição do tamanho da janela.
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null);
		/* Comando para posicionar a nova tela criada. Se o parâmetro for "nulo", ocorre a centralização tela do computador, senão, a janela
		fica centralizada na tela do próprio programa que está sendo utilizado */
		JButton botao = new JButton("Clicar!");  // Comando para criação de um "botão" na janela.
		janela.add(botao);  // Comando para adição do botão na janela.
		botao.addActionListener(e -> {  // Comando (função lambda) para fazer com que o evento ocorra.
				System.out.println("Evento ocorreu!");
		});
		janela.setVisible(true);  // Comando para criação da janela.
	}
}
