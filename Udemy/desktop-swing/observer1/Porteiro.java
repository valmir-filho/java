package desktop.swing.observer1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
	private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();
	public void registrarObservador(ObservadorChegadaAniversariante observador) {
		observadores.add(observador);
	}
	public void monitorar() {
		Scanner scan = new Scanner(System.in);
		String valor = "";
		while(!"sair".equalsIgnoreCase(valor)) {
			System.out.print("Aniversariante chegou? ");
			valor = scan.nextLine();
			if("sim".equalsIgnoreCase(valor)) {
				EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());
				observadores.stream()
					.forEach(o -> o.chegou(evento));
				valor = "sair";
			} else {
				System.out.println("Alarme falso!");
			}
		}
		scan.close();
	}
}
