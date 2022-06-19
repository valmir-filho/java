package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {  // Parecido com um dicionário.
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1, "Roberto");  // Adiciona (ou altera) valores.
		usuarios.put(2, "Pedro");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Ricardo");
		System.out.println(usuarios);
		System.out.println(usuarios.size());  // Mostra o tamanho do Map.
		System.out.println(usuarios.isEmpty());  // Verifica se o Map está vazio.
		System.out.println(usuarios.keySet());  // Retorna as chaves do Map.
		System.out.println(usuarios.values());  // Retorna os valores do Map.
		System.out.println(usuarios.entrySet());  // Retorna chave e valor do Map.
		System.out.println(usuarios.containsKey(2)); // Verifica se existe a chave 2 dentro do Map.
		System.out.println(usuarios.containsValue("Pedro"));  // Verifica se existe o valor "Pedro" dentro do Map.
		System.out.println(usuarios.get(3));  // Pega o valor referente a chave 3 do Map.
		for(int chave: usuarios.keySet()) {  // Percorre as chaves do Map.
			System.out.println(chave);
		}
		for(String valor: usuarios.values()) {  // Percorre os valores do Map.
			System.out.println(valor);
		}
		for(Entry<Integer, String> usuario: usuarios.entrySet()) {  // Percorre o Map
			System.out.println(usuario.getKey());  // Percorre as chaves do Map.
			System.out.println(usuario.getValue());  // Percorre os valores do Map.
		}
		System.out.println(usuarios.remove(2));  // Remove o valor da chave 2 do Map.
	}
}