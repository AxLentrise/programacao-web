package poo.modelo.loja;

import java.util.ArrayList;
import java.util.List;

public class Vitrine {
	
	private List<ItensVitrine> produtosVitrine;
	
	public Vitrine() {
		produtosVitrine = new ArrayList<>();
	}
	
	public Vitrine(List<ItensVitrine> produtosVitrine) {
		this.produtosVitrine = produtosVitrine;
	}

	public List<ItensVitrine> getProdutosVitrine() {
		return produtosVitrine;
	}

	public void setProdutosVitrine(List<ItensVitrine> produtosVitrine) {
		this.produtosVitrine = produtosVitrine;
	}
	
	public void addProduto(ItensVitrine produto) {
		produtosVitrine.add(produto);
	}
	
	public void removeProduto(ItensVitrine produto) throws UnsupportedOperationException {
		produtosVitrine.remove(produto);
	}
	
	public ItensVitrine getProduto(int index) throws IndexOutOfBoundsException {
		return produtosVitrine.get(index);
	}
}
