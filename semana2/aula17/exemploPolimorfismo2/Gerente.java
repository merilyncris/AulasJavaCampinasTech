package aula17.exemploPolimorfismo2;

public class Gerente extends Funcionario {

	private String usuario;
	private int senha;
	
	public boolean autentica(String usuario, int senha) {
		return this.usuario.equals(usuario) && this.senha == senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
}
