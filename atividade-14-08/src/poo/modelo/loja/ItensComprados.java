package poo.modelo.loja;

import java.util.ArrayList;
import java.util.List;

public class ItensComprados {
	
	private int id;
	private int quantidade;
	private List<Produto> produtos;
	private Compra compra;
	
	public ItensComprados(int id, int quantidade, Compra compra) {
		this.id = id;
		this.quantidade = quantidade;
		this.produtos = new ArrayList<>();
		this.compra = compra;
	}
	
	public ItensComprados(int id, int quantidade, List<Produto> produtos, Compra compra) {
		this.id = id;
		this.quantidade = quantidade;
		this.produtos = produtos;
		this.compra = compra;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void addProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void removeProduto(Produto produto) throws UnsupportedOperationException {
		produtos.remove(produto);
	}
	
	public Produto getProduto(int index) throws IndexOutOfBoundsException {
		return produtos.get(index);
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}
}
