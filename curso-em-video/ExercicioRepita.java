import javax.swing.JOptionPane;

public class ExercicioRepita {

    public static void main(String[] args) {

        int n;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número (0 para parar): "));
        } while (n != 0);
    }
}
