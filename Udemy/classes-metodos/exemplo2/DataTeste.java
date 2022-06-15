package classes.metodos.exemplo2;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 07;
		d1.mes = "maio";
		d1.ano = 1979;
		Data d2 = new Data();
		d2.dia = 30;
		d2.mes = "maio";
		d2.ano = 1979;
		System.out.println("Valmir nasceu em " + d1.dataFormatada());
		System.out.println("Audi nasceu em " + d2.dataFormatada());
	}
}