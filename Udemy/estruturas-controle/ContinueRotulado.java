package estruturas.controle;

public class ContinueRotulado {
	public static void main(String[] args) {
		externo: for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == 1) {
					continue externo;
					/* Mesmo o continue estando no laço for mais interno, como foi rotulado o laço for mais externo e, 
					identificado no continue, ele pula a iteração do laço mais externo e não do laço mais interno. */
				}
			System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
	}
}