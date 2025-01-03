package poo.modelo.acesso;

import java.util.ArrayList;
import java.util.List;

import poo.modelo.loja.Usuario;

public class UsuarioADM extends Usuario {

	private List<Perfil> perfis;
	
	public UsuarioADM(int id, String nome, String email, String senha) {
		super(id, nome, email, senha);
		this.perfis= new ArrayList<>(); 
	}

	public UsuarioADM(int id, String nome, String email, String senha, List<Perfil> perfis) {
		super(id, nome, email, senha);
		this.perfis = perfis;
	}

	public List<Perfil> getPerfis() {
		return perfis;
	}

	public void setPerfis(List<Perfil> perfis) {
		this.perfis = perfis;
	}
	
	public Perfil getPerfil(int index) throws IndexOutOfBoundsException {
		return perfis.get(index);
	}

	public void addPerfil(Perfil perfil) {
		perfis.add(perfil);
	}
	
	public void removePerfil(Perfil perfil) throws UnsupportedOperationException {
		perfis.remove(perfil);
	}
}
