public class Contador01 {

    public static void main(String[] args) {

        int c = 0;
        while (c < 10) {
            c++;
            if (c == 5 || c == 7) { // Se c é igual a 5 e c igual a 7.
                continue; // Não imprime nem o 5 e nem o 7. Volta para o início do laço.
            }
            System.out.println("Cambalhota " + c);
        }
    }
}
