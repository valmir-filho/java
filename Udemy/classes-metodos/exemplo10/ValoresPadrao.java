package classes.metodos.exemplo10;

public class ValoresPadrao {
	
	static byte a;
	static short b;
	static int c;
	static long d;
	static float e;
	static double f;
	static boolean g;
	static String h;
	/*Como as variáveis nesse caso são globais,
	 * elas assumem os seus valores padrão.
	 */
	final int X = 50;  // No caso de constantes, preciso sempre inicializar. 
	
	public static void main(String[] args) {
		
		int x = 10;
		/* Como aqui a variável x é local,
		 * obrigatoriamente eu preciso inicializá-la.
		 */
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(x);
	}
}