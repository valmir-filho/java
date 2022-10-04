package arrays;

// import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		int quantidadeAlunos, numeroNotas;
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a quantidade de alunos da turma: ");
		quantidadeAlunos = scan.nextInt();
		System.out.print("Informe o número de notas (por aluno) a serem digitadas: ");
		numeroNotas = scan.nextInt();
		double[][] turma = new double[quantidadeAlunos][numeroNotas];
		double mediaTurma = 0;
		for(int a = 0; a < turma.length; a++) {
			for(int n = 0; n < turma[a].length; n++) {
				System.out.print("Digite a nota " + (n + 1) + " do aluno " + (a + 1) + ": ");
				turma[a][n] = scan.nextDouble();
				mediaTurma += turma[a][n];
			}
		}
		System.out.printf("A média da turma é: %.2f.", (mediaTurma / (quantidadeAlunos * numeroNotas)));
		System.out.println();
		/* Para imprimir a matriz, utiliza-se o comando a seguir:
		for(double[] notasAluno: turma) {
			System.out.println(Arrays.toString(notasAluno));
		} */
		scan.close();
	}
}
