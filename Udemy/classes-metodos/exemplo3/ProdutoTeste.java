package classes.metodos.exemplo3;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook");  // Passei o parâmetro do método construtor na hora de criar o objeto.
		p1.preco = 4345.89;
		p1.desconto = 0.25;
		Produto p2 = new Produto("Caneta");
		p2.preco = 2.56;
		p2.desconto = 0.15;
		System.out.println(p1.nome);
		System.out.println(p2.preco);
		double precoFinal = p1.precoDesconto();
		System.out.printf("Preço final: R$%.2f.", precoFinal);
	}
}