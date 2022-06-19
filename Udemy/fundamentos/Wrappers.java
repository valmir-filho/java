package fundamentos;

public class Wrappers {  // Sempre usar letra maiúscula quando for usar o wrapper.
	public static void main(String[] args) {
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("10000");  // Convert uma String em inteiro.
		Long l = 100000L;
		Boolean bo = Boolean.parseBoolean("true");  // Convert uma String em boolean.
		Character c = '#';
		Float f = 123.12f;
		Double d = 1234.5678;
		System.out.println(b.byteValue());
		System.out.println(s.toString());  // Transforma um short em uma String.
		System.out.println(i);
		System.out.println(l);
		System.out.println(bo);
		System.out.println(bo.toString());  // Converteu um boolean em uma String.
		System.out.println(c);
		System.out.println(f);
		System.out.println(d);
	}
}