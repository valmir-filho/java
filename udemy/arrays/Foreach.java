package arrays;

public class Foreach {
	
	public static void main(String[] args) {
		double[] notas = new double[4];
		notas[0] = 9.9;
		notas[1] = 8.7;
		notas[2] = 7.2;
		notas[3] = 9.4;
		System.out.print("Notas: ");
		for(double nota: notas) {  // Maneira mais simples de percorrer o array.
			System.out.print(nota + " ");
		}
	}
}
