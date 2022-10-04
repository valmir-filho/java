package desktop.swing.calculadora;

@FunctionalInterface
public interface MemoriaObservador {
	public void valorAlterado(String novoValor);
}