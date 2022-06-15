package classes.metodos.exemplo7;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook");
		p1.preco = 4345.89;
		Produto p2 = new Produto("Caneta");
		p2.preco = 2.56;
		System.out.println(p1.nome);
		System.out.println(p2.preco);
		double precoFinal = p1.precoDesconto();
		System.out.printf("Preço final: R$%.2f.", precoFinal);
	}
}