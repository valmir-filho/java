package desktop.swing.observer1;

public class AniversarioSurpresa {
	public static void main(String[] args) {
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		porteiro.registrarObservador(namorada);
		porteiro.monitorar();	
	}
}
