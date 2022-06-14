package estruturas.controle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		String faixa = "verde";
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei todos os Katas.");
		case "marrom":
			System.out.println("Sei o Kata Tekki Shodan.");
		case "roxa":
			System.out.println("Sei o Kata Heian Godan.");
		case "verde":
			System.out.println("Sei o Kata Heian Yodan.");
		case "laranja":
			System.out.println("Sei o Kata Heian Sandan.");
		case "vermelha":
			System.out.println("Sei o Kata Heian Nidan.");
		case "amarela":
			System.out.println("Sei o Kata Heian Shodan.");
		default:
			System.out.println("Não sei nenhum Kata.");
		}
	}
}