package poo.modelo.loja;

import java.util.ArrayList;
import java.util.List;

public class Secao {
	
	private int id;
	private String nome;
	private List<Produto> produtos;
	
	public Secao(int id, String nome) {
		this.id = id;
		this.nome = nome;
		this.produtos = new ArrayList<>();
	}

	public Secao(int id, String nome, List<Produto> produtos) {
		this.id = id;
		this.nome = nome;
		this.produtos = produtos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
}
