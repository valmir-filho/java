package desktop.swing.calculadora;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Teclado extends JPanel implements ActionListener {
	private final Color COR_CINZA_ESCURO = new Color(68, 68, 68);
	private final Color COR_CINZA_CLARO = new Color(99, 99, 99);
	private final Color COR_LARANJA = new Color(242, 163, 60);
	public Teclado() {
		// Comandos para criação do layout do teclado da calculadora.
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		setLayout(layout);
		// Comando para ajuste dos botões do teclado da calculadora.
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		c.gridwidth = 2;  // Comando para ajustar o tamanho apenas do botão "AC" do teclado da calculadora.
		// Comandos para criação da linha 1 do teclado da calculadora.
		adicionarBotao("AC", COR_CINZA_ESCURO, c, 0, 0);
		c.gridwidth = 1;  // Comando para retornar com o tamanho original dos demais botões (dessa linha) do teclado da calculadora.
		adicionarBotao("±", COR_CINZA_ESCURO, c, 2, 0);
		adicionarBotao("/", COR_LARANJA, c, 3, 0);
		// Comandos para criação da linha 2 do teclado da calculadora.
		adicionarBotao("7", COR_CINZA_CLARO, c, 0, 1);
		adicionarBotao("8", COR_CINZA_CLARO, c, 1, 1);
		adicionarBotao("9", COR_CINZA_CLARO, c, 2, 1);
		adicionarBotao("*", COR_LARANJA, c, 3, 1);
		// Comandos para criação da linha 3 do teclado da calculadora.
		adicionarBotao("4", COR_CINZA_CLARO, c, 0, 2);
		adicionarBotao("5", COR_CINZA_CLARO, c, 1, 2);
		adicionarBotao("6", COR_CINZA_CLARO, c, 2, 2);
		adicionarBotao("-", COR_LARANJA, c, 3, 2);
		// Comandos para criação da linha 4 do teclado da calculadora.
		adicionarBotao("1", COR_CINZA_CLARO, c, 0, 3);
		adicionarBotao("2", COR_CINZA_CLARO, c, 1, 3);
		adicionarBotao("3", COR_CINZA_CLARO, c, 2, 3);
		adicionarBotao("+", COR_LARANJA, c, 3, 3);
		// Comandos para criação da linha 5 do teclado da calculadora.
		c.gridwidth = 2;  // Comando para ajustar o tamanho apenas do botão "0" do teclado da calculadora.
		adicionarBotao("0", COR_CINZA_CLARO, c, 0, 4);
		c.gridwidth = 1;  // Comando para retornar com o tamanho original dos demais botões (dessa linha) do teclado da calculadora.
		adicionarBotao(",", COR_CINZA_CLARO, c, 2, 4);
		adicionarBotao("=", COR_LARANJA, c, 3, 4);
	}
	private void adicionarBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {
		c.gridx = x;
		c.gridy = y;
		Botao botao = new Botao(texto, cor);
		botao.addActionListener(this);
		add(botao, c);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// Comandos para coletar as informações do botões da calculadora.
		if(e.getSource() instanceof JButton) {
			JButton botao = (JButton) e.getSource();
			Memoria.getInstancia().processarComando(botao.getText());
		}
	}
}