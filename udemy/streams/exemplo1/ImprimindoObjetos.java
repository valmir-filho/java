package streams.exemplo1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		for(int i = 0; i < aprovados.size(); i++) {  // Uma forma de percorrer uma lista (usando o "for").
			System.out.println(aprovados.get(i));
		}
		System.out.println();
		for(String nome: aprovados) {  // Outra forma de percorrer uma lista (usando o "foreach").
			System.out.println(nome);
		}
		System.out.println();
		Iterator<String> iterator = aprovados.iterator();  // Outra forma de percorrer uma lista (usando o "Iterator", uma interface funcional).
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();
		Stream<String> stream = aprovados.stream();  // Outra forma de percorrer uma lista (usando o "Stream", uma interface funcional).
		stream.forEach(System.out::println);
	}
}