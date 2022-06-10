import java.util.Scanner;

public class ProgramaPernas {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        System.out.print("Quantas pernas? ");
        int perna = tec.nextInt();
        String tipo;
        System.out.print("Isso é um(a): ");
        tipo = switch (perna) {
            case 1 -> "Saci";
            case 2 -> "Bípede";
            case 3 -> "Tripé";
            case 4 -> "Quadrúpede";
            case 6 -> "Aranha";
            default -> "ET";
        };
        System.out.println(tipo);
    }
}
