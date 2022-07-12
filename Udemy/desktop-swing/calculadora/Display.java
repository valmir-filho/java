package desktop.swing.calculadora;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {
	private final JLabel label;
	public Display() {
		Memoria.getInstancia().adicionarObservador(this);
		setBackground(new Color(46, 49, 50));  // Comando para colorir o display (local onde aparecerão os números digitados na calculadora).
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.white);  // Comando para colorir o label (os números digitados que aparecerão no display da calculadora).
		label.setFont(new Font("courier", Font.PLAIN, 30));  // Comando para definição da fonte (tipo, formato e tamanho) dos números digitados que aparecerão no display da calculadora.
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
		/* Comando para definição do alinhamento dos números digitados que aparecerão no display da calculadora. Os valores após o
		alinhamento a direita, definem o alinhamento acima e abaixo dos números digitados que aparecerão no display da calculadora. */
		add(label);
	}
	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
	}
}