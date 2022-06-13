package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1;  // Conversão implícita. Nesse caso um int para double.
		System.out.println(a);
		float b = (float) 1.0;  // Conversão explícita (CAST). Nesse caso um int para float.
		System.out.println(b);
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);
	}
}