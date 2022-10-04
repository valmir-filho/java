package estruturas.controle;

public class BreakRotulado {
	public static void main(String[] args) {
		externo: for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == 1) {
					break externo;
					/* Mesmo o break estando no laço for mais interno, como foi rotulado o laço for mais externo e,
					identificado no break, ele só para o laço for mais externo e não o mais interno. */
				}
			System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
	}
}