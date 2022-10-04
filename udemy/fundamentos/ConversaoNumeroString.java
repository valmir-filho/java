package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString());  // Converte um inteiro em uma String.
		System.out.println(num1.toString().length());  // Com a conversão, é possível usar as funcionalidades da String.
		int num2 = 10000;
		System.out.println(Integer.toString(num2));  // Outra forma de conversão.
	}
}