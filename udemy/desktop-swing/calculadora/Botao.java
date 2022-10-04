package desktop.swing.calculadora;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton {
	public Botao(String texto, Color cor) {
		setText(texto);
		setFont(new Font("courier", Font.PLAIN, 25));
		setOpaque(true);
		setBackground(cor);
		setForeground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));  // Comando para alteração da borda dos botões da calculadora.
	}
}