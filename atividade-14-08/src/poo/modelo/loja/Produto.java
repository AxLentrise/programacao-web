package poo.modelo.loja;

public class Produto {
	
	private int id;
	private String nome;
	private String descricao;
	private double valor;
	private int qtdeEstoque;
	private int estoqueMinimo;
	private String imagem;
	
	private Secao secao;
	private ItensVitrine vitrines;

	// duvida nesse ponto 
	//private Set<ItensComprados> itensComprados;
	
	public Produto(int id, String nome, String descricao, double valor, int qtdeEstoque, int estoqueMinimo,
			String imagem, Secao secao, ItensVitrine vitrines) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.qtdeEstoque = qtdeEstoque;
		this.estoqueMinimo = estoqueMinimo;
		this.imagem = imagem;
		this.secao = secao;
		this.vitrines = vitrines;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQtdeEstoque() {
		return qtdeEstoque;
	}

	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}

	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public Secao getSecao() {
		return secao;
	}

	public void setSecao(Secao secao) {
		this.secao = secao;
	}

	public ItensVitrine getVitrines() {
		return vitrines;
	}

	public void setVitrines(ItensVitrine vitrines) {
		this.vitrines = vitrines;
	}
}
