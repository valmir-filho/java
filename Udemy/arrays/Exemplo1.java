package arrays;

import java.util.Arrays;

public class Exemplo1 {
	public static void main(String[] args) {
		double[] notasAluno1 = new double[3];  // Criação de um array.
		notasAluno1[0] = 7.9;
		notasAluno1[1] = 8.5;
		notasAluno1[2] = 7.7;
		System.out.println(Arrays.toString(notasAluno1));  // Para imprimir o array, usa-se a função "Arrays.toString".
		for(int i = 0; i < notasAluno1.length; i++) { // Outra forma de imprimir o array.
			System.out.println(notasAluno1[i]);
		}
	}
}
