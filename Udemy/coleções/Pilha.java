package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {  // Usa o sistema "LIFO: Last In First Out", ou seja, o último que entra é o primeiro que sai.
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		livros.add("MEGA-ANIMAIS");  // Adiciona na pilha;
		livros.push("O MEU LUGAR");  // Outra forma de adicionar.
		livros.push("A VERDADE");
		System.out.println(livros);
		livros.pop();  // Exclui o 1˚ elemento da pilha. Nesse caso o livro "A VERDADE".
		// A pilha (Deque) utiliza basicamente os mesmos métodos da fila (Queue).
	}
}