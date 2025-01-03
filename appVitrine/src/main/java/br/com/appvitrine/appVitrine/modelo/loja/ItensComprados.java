package br.com.appvitrine.appVitrine.modelo.loja;

import static jakarta.persistence.GenerationType.AUTO;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ItensComprados")
public class ItensComprados implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = AUTO)
	private UUID id;
	@Column(nullable = false, length = 4)
	private int quantidade;
	@Column(columnDefinition = "DECIMAL(7,2)")
	private BigDecimal valor;
	@ManyToOne
	@JoinColumn(name = "id_compra")
	private Compra compra;
	@ManyToOne
	@JoinColumn(name = "id_produto")
	private Produto produto;

	public ItensComprados() {}

	public UUID getId() {
		return id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
