package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {  // Usa o sistema "FIFO: First In First Out", ou seja, o primeiro que entra é o primeiro que sai.
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();  // Forma de criar uma fila.
		fila.add("Ana");  // Adiciona um elemento na fila.
		fila.offer("Bia");  // Outra forma de adicionar.
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Guilherme");
		System.out.println(fila);
		System.out.println(fila.peek());  // Pega o 1˚ elemento na fila.
		System.out.println(fila.element());  // Outra forma de pegar o 1˚ elemento na fila.
		System.out.println(fila.size());  // Retorna o tamanho da fila.
		System.out.println(fila.isEmpty());  // Verifica se a fila está vazia.
		// fila.clear();  // Limpa a fila.
		System.out.println(fila.poll());  // Retorna o 1˚ elemento da fila e remove-o.
		System.out.println(fila.remove());  // Retorna o 1˚ elemento da fila e remove-o.
	}
}