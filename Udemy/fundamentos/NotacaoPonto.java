package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
	String s = "Bom dia X";
	s = s.toUpperCase(); // Transforma em letras maiúsculas.
	System.out.println(s);
	s = s.replace("X", "AMIGO"); // Substitui.
	System.out.println(s);
	s = s.concat("!!!"); // Concatena.
	System.out.println(s);
	System.out.println(s.replace("AMIGO", "AMIGA")); // Outra forma de usar.
	}
}