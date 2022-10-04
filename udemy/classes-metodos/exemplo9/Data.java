package classes.metodos.exemplo9;

public class Data {
	int dia, mes, ano;
	Data() {	
		// dia = 1;
		// mes = 1;
		// ano = 1970;
		this(1, 1, 1970);  // Aqui eu usei o método this();.
	}
	Data(int dia, int mes, int ano) {
		this.dia = dia;  // Uso do this para referenciar o objeto atual.
		this.mes = mes;
		this.ano = ano;
	}
	String dataFormatada() {
		
		return String.format("%d/%d/%d.", dia, mes, ano);
	}
	void imprimirDataFormatada() {	
		System.out.println(dataFormatada());
	}
}
