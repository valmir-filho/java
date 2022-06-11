package fundamentos;

public class Wrappers {
	
	// Sempre usa a letra maiúscula quando for usar o wrapper.
	
	public static void main(String[] args) {
		
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("10000");  // Converteu uma String em inteiro.
		Long l = 100000L;
		Boolean bo = Boolean.parseBoolean("true");  // Converteu uma String em boolean.
		Character c = '#';
		Float f = 123.12f;
		Double d = 1234.5678;
		System.out.println(b.byteValue());
		System.out.println(s.toString());  // Transformou um short em String.
		System.out.println(i);
		System.out.println(l);
		System.out.println(bo);
		System.out.println(bo.toString());  // Converteu um boolean em String.
		System.out.println(c);
		System.out.println(f);
		System.out.println(d);
	}
}