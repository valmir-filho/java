package classes.metodos.exemplo4;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data(07, "maio", 1979);
		Data d2 = new Data(30, "maio", 1979);
		Data d3 = new Data();
		System.out.println("Valmir nasceu em " + d1.dataFormatada());
		System.out.println("Audi nasceu em " + d2.dataFormatada());
		System.out.println("Data usando método construtor padrão: " + d3.dataFormatada());
	}
}