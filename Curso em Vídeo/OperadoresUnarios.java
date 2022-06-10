public class OperadoresUnarios {

    public static void main(String[] args) {

        int numero = 5;
        numero++; // Incrementa o número.
        System.out.println(numero);
        int numero1 = 5;
        numero1--; // Decrementa o número.
        System.out.println(numero1);
        int numero2 = 5;
        int valor = 5 + numero2++;
        /*
        No pós-incremento, ele só vai incrementar o número após.
         */
        System.out.println(valor);
        System.out.println(numero2);
        int numero3 = 5;
        int valor1 = 5 + ++numero3;
        /*
        No pré-incremento, ele só vai incrementar o número antes.
         */
        System.out.println(valor1);
        System.out.println(numero3);
    }
}
