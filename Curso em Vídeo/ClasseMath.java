public class ClasseMath {
    
    public static void main(String[] args) {
        
        int x = 5;
        float raiz = (float) Math.sqrt(x);
        System.out.println(raiz);
        double y = -14.567;
        double abs = Math.abs(y); // Transforma o número negativo em positivo.
        System.out.println(abs);
        float z = (float) 6.6;
        double arredbaixo = Math.floor(z); // Arredonda para baixo.
        System.out.println(arredbaixo);
        double arredcima = Math.ceil(z); // Arredonda para cima.
        System.out.println(arredcima);
        double arredaritmetico = Math.round(z); // Arredonda aritmeticamente.
        System.out.println(arredaritmetico);
    }
}
