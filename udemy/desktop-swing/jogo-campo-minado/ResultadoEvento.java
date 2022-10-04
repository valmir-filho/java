package desktop.swing.jogo.campo.minado;

public class ResultadoEvento {
	private final boolean ganhou;
	public ResultadoEvento(boolean ganhou) {
		this.ganhou = ganhou;
	}
	public boolean isGanhou() {
		return ganhou;
	}
}