public class MetodoRandom {

    public static void main(String[] args) {

        double aleatorio = Math.random(); // Gera um aleatório entre 0 e 1.
        System.out.println(aleatorio);
        int n = (int) (5 + aleatorio * (10 - 5)); // Gera um aleatório entre 5 e 10.
        System.out.println(n);
    }
}
