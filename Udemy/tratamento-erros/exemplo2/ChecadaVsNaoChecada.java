package tratamento.erros.exemplo2;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {
		try {
			geraErro1();
		} catch (RuntimeException excecao) {
			System.out.println(excecao.getMessage());
		}
		try {
			geraErro2();
		} catch (Exception excecao) {
			System.out.println(excecao.getMessage());
		}
		System.out.println("Fim!");
	}
	static void geraErro1() {  // Exceção não checada ou não verificada. 
		throw new RuntimeException("Ocorreu um erro 01.");
	}
	static void geraErro2() throws Exception{  // Exceção checada ou verificada.
		throw new Exception("Ocorreu um erro 02.");
	}
}