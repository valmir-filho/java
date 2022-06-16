package arrays;

public class Exemplo3 {
	
	public static void main(String[] args) {
		
		double[] notasAluno1 = new double[4];
		notasAluno1[0] = 5.5;
		notasAluno1[1] = 6.5;
		notasAluno1[2] = 4.5;
		notasAluno1[3] = 3.5;
		double[] notasAluno2 = new double[4];
		notasAluno2[0] = 6.5;
		notasAluno2[1] = 9.5;
		notasAluno2[2] = 7.5;
		notasAluno2[3] = 8.5;
		System.out.print("Notas aluno 1: ");
		for(double notas: notasAluno1 ) {
			System.out.print(notas + " ");
		}
		System.out.println();
		System.out.print("Notas aluno 2: ");
		for(double notas: notasAluno2 ) {
			System.out.print(notas + " ");
		}
	}
}