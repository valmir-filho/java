package colecoes;

import java.util.TreeSet;
// import java.util.HashSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		// HashSet<String> listaAprovados = new HashSet<String>();
		/* Foi definido que só podem ser adicionadas Strings na minha coleção. Porém, dessa forma, na hora de imprimir,
		o "HashSet" não colocará na ordem que a coleção foi gerada. */
		TreeSet<String> listaAprovados = new TreeSet<String>(); // O "TreeSet" imprime a coleção na ordem em que ela foi gerada.
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Lucas");
		listaAprovados.add("Pedro");
		System.out.printf("Lista de aprovados: ");
		for(String candidato: listaAprovados ) {
			System.out.printf("%s, ", candidato);
		}
		System.out.print("Fim!");
	}
}