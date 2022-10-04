package desktop.swing.jogo.campo.minado;

@FunctionalInterface
public interface CampoObservador {
	public void eventoOcorreu(Campo campo, CampoEvento evento);
}