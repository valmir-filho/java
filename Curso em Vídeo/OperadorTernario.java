public class OperadorTernario {

    public static void main(String[] args) {

        int n1, n2, r, r1;
        n1 = 14;
        n2 = 8;
        r = (n1 > n2) ? 0 : 1; // Operador ternário.
        System.out.println(r);
        r1 = (n1 > n2) ? n1 + n2 : n1 - n2; // Operador ternário.
        System.out.println(r1);
    }
}
