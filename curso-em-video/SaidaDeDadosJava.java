public class SaidaDeDadosJava {

    public static void main(String[] args) {

        String nome = "Valmir";
        float nota = 8.5f;
        System.out.println(nota + "\n");  // Primeiro exemplo de comando de saída, com um salto de linha (\n).
        System.out.println("A sua nota é: " + nota + "\n");  // Concatenação.
        System.out.printf("A sua nota é: %.2f.\n", nota);  // Formatado com 2 casas decimais (%.2f).
        System.out.printf("\nMeu nome é: %s", nome + ".\n");  // Formatado para uma string (%s).
        System.out.format("\nMeu nome é: %s", nome + ".\n");  // Usando o comando "format" para formatar uma string (%s).
    }
}
