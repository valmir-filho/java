public class ComparacaoString {

    public static void main(String[] args) {

        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String res, res1, res2;
        res = (nome1==nome2)?"igual":"diferente";
        System.out.println(res);
        res1 = (nome1==nome3)?"igual":"diferente";
        /*
        Mesmo o conteúdo sendo igual nas 3 variáveis nome,
        o resultado deu diferente, pois como o nome3 foi instanciado
        usado a cláusula "new", tecnicamente eles não têm a mesma
        estrutura. Para resolver isso fazemos o seguinte:
         */
        System.out.println(res1);
        res2 = (nome1.equals(nome3))?"igual":"diferente"; // O "equals" verifica se o conteúdo é o mesmo.
        System.out.println(res2);
    }
}
