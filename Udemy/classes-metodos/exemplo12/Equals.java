package classes.metodos.exemplo12;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "meuemail@ezmail.com.br";
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "meuemail@ezmail.com.br";
		System.out.println(u1 == u2);
		/* Mesmo os dados sendos os mesmos, o resultado será falso,
		 * pois como são 2 objetos, o Java compara o espaço criado
		 * na memória (que são diferentes) e não os dados.
		 */
		System.out.println(u1.equals(u2));
		/* Se utilizarmos o equals() dessa maneira, o resultado
		 * também será falso, pois segue a mesma comparação usando o
		 * "==". 
		 */
		System.out.println(u2.equals(u1));		
	}
}