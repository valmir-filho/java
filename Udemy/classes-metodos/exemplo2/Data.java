package classes.metodos.exemplo2;

public class Data {
	int dia, ano;
	String mes;
	String dataFormatada() {
		return String.format("%d de %s de %d.", dia, mes, ano);
	}
}
