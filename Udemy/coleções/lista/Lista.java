package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);  // Uma forma de adicionar na lista.
		lista.add(new Usuario("Carlos"));  // Outra forma de adicionar na lista.
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		for(Usuario u: lista) {  // Percorre a lista.
			System.out.println(u.toString());  // Chamei o método criado.
		}
		System.out.println(lista.get(3));  // Estou imprimindo uma posição específica da lista.
		lista.remove(1);  // Estou removendo o elemento na posição 1 da lista.
		lista.remove(new Usuario("Manu"));  // Outra forma de remover.
		System.out.println(lista.contains(new Usuario("Lia")));  // Verificando se contém o nome "Lia" na lista.
	}
}