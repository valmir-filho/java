package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		conjunto.add(1.2);
		/* Estou adicionando dados no meu conjunto, usando o
		 * comando "add" (que é a minha coleção). Como collections
		 * não aceita dados primitivos, ele vai converter todos eles
		 * para classes. Nesse caso: double em Double.
		 */
		conjunto.add(true);  // Nesse caso: boolean em Boolean.  
		conjunto.add("Teste");
		conjunto.add(1);  // Nesse caso: int em Integer.
		conjunto.add('x');  // Nesse caso: char em Character.
		System.out.println(conjunto.size());  // Imprime o tamanho do conjunto.
		/* Se eu adicionar dados repetidos, o tamanho não será alterado,
		 * pois o "hashset não aceita dados repetidos.
		 */
		conjunto.remove("Teste");  // Remove um elemento.
		System.out.println(conjunto.contains(1));
		/* Está verificando se contém o número "1" dentro do meu
		 * conjunto.
		 */
		System.out.println(conjunto);
		HashSet nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		conjunto.addAll(nums);  // Adicionei o "nums" no "conjunto". União entre as duas coleções.
		System.out.println(conjunto);
		conjunto.retainAll(nums);  // Faz a intersecção entre as duas coleções.
		System.out.println(conjunto);
		conjunto.clear();  // Limpei a coleção conjunto.
		System.out.println(conjunto);
	}	
}