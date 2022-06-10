import java.util.Arrays;

public class Vetor03 {

    public static void main(String[] args) {

        int[] v = {3,2,5,4,2,1,5};
        Arrays.sort(v); // "Arrays" é uma classe. "sort" é um método que ordena o vetor.
        int p = Arrays.binarySearch(v,4); // "binarySearch" é um método. Ele busca um valor específico no vetor.
        System.out.println("Encontrei o número 4 na posição: " + p);
        for (int valor: v) { // Esse é o for each. Uma estrutura de repetição usada para vetores.
            System.out.println(valor + " ");
        }
    }
}
