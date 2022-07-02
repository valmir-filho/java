package streams.exemplo2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS");  // Uma forma de criação de uma "Stream". O "Stream.of" é um método estático.
		langs.forEach(print);
		System.out.println();
		String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go"};  // Outra forma de criação de uma "Stream".
		Stream.of(maisLangs).forEach(print);
		System.out.println();
		Arrays.stream(maisLangs).forEach(print);  // Outra forma de criação de uma "Stream".
		System.out.println();
		Arrays.stream(maisLangs, 1, 3).forEach(print);  // Essa opção percorre o "Array" do elemento na posição 1 até o elemento na posição 3 (exlusive).
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin ");  // Outra forma de criação de uma "Stream".
		System.out.println();
		outrasLangs.stream().forEach(print);
		System.out.println();
		outrasLangs.parallelStream().forEach(print);
		System.out.println();
		Stream.generate(() -> "a").forEach(print);  // Outra forma de criação de uma "Stream" ("infinita").
		Stream.iterate(0, n -> n + 1).forEach(println);  // Outra forma de criação de uma "Stream" ("infinita").
	}
}