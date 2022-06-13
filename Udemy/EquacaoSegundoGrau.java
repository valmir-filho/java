package fundamentos;

public class EquacaoSegundoGrau {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 12;
		int c = -13;
		double delta = (b * b) - 4 * a * c;
		double x1 = (-b + delta) / (2 * a);
		double x2 = (-b - delta) / (2 * a);
		System.out.println(x1);
		System.out.println(x2);
	}
}