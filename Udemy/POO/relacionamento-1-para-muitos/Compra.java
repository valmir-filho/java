package poo.relacionamento1paramuitos;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	double valorTotal() {	
		double total = 0;
		for(Item item: itens) {
			total += item.quantidade * item.preço;
		}
		return total;
	}
}