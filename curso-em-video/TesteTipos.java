public class TesteTipos {

    public static void main(String[] args) {

        int idade = 30;
        String valor = Integer.toString(idade);  // Transforma um valor inteiro em uma string.
        System.out.println(valor);
        String valor2 = "30";
        int idade2 = Integer.parseInt(valor2);  // Transforma uma string em um valor inteiro.
        System.out.println(valor2);
        String valor3 = "30.5";
        float idade3 = Float.parseFloat(valor3);  // Transforma uma string em um valor float.
        System.out.println(valor3);
    }
}
