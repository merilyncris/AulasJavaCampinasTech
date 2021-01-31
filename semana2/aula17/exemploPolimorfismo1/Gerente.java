package aula17.exemploPolimorfismo1;

public class Gerente extends Funcionario implements AutenticavelUSuarioSenha {

	@Override
	public boolean autentica(String usuario, int senha) {
		return this.getUsuario().equals(usuario) && this.getSenha() == senha;
	}

	@Override
	public void setUsuario(String usuario) {
		this.usuario = "gerente"+usuario;
	}


	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
}
