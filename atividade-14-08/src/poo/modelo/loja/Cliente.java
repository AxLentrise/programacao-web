package poo.modelo.loja;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente extends Usuario {

	private Date dataNascimento;
	private List<Compra> compras;
	
	public Cliente(int id, String nome, String email, String senha, Date dataNascimento) {
		super(id, nome, email, senha);
		this.dataNascimento = dataNascimento;
		this.compras = new ArrayList<>();
	}
	
	public Cliente(int id, String nome, String email, String senha, Date dataNascimento, List<Compra> compras) {
		super(id, nome, email, senha);
		this.dataNascimento = dataNascimento;
		this.compras = compras;
	}

	public void CalcularIdade() {
		// TODO
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void addCompra(Compra compra) {
		compras.add(compra);
	}
	
	public void removeCompra(Compra compra) throws UnsupportedOperationException {
		compras.remove(compra);
	}
	
	public Compra getCompra(int index) throws IndexOutOfBoundsException {
		return compras.get(index);
	}

	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}
}
