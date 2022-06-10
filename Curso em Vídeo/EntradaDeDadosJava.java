import java.util.Scanner;  // Necessária a importação, pois o Java não possui comandos de entrada.

public class EntradaDeDadosJava {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);  // Criado esse objeto para poder usar os comandos de entrada.
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();  // Método do objeto teclado para ler a string.
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();  // Método do objeto teclado para ler o float.
        System.out.print("Digite a idade do aluno: ");
        int idade = teclado.nextInt();  // Método do objeto teclado para ler o número inteiro.
        System.out.format("A nota do %s é %.2f.\n", nome, nota);
        System.out.println("A idade do Valmir é: " + idade + ".");
    }
}
