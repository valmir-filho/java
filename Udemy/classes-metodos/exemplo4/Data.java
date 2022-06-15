package classes.metodos.exemplo4;

public class Data {
	
	int dia, ano;
	String mes;
	
	Data() {  // Construtor padrão.
		
		dia = 1;
		mes = "janeiro";
		ano = 1970;
	}
	
	Data(int diaAtual, String mesAtual, int anoAtual) {  // Construtor com parâmetros.
		
		dia = diaAtual;
		mes = mesAtual;
		ano = anoAtual;
	}
	
	String dataFormatada() {
		return String.format("%d de %s de %d.", dia, mes, ano);
	}
}