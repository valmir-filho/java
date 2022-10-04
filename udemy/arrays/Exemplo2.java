package arrays;

import java.util.Arrays;

public class Exemplo2 {
	public static void main(String[] args) {
		double[] notasAluno1 = {6.9, 8.9, 5.5, 6.6};  // Outra forma de criar um array.
		System.out.println("Notas do aluno 1: "+ Arrays.toString(notasAluno1));
		double media = 0;
		for(int i = 0; i < notasAluno1.length; i++) {	
			media += notasAluno1[i];
		}
		System.out.printf("A média é: %.2f.", media/notasAluno1.length);
	}
}
