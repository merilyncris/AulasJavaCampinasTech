package aula16.exercicio1;

public class Morador extends Pessoa implements Autorizavel{

	private boolean presente;
	private int senha;
	
	
	public Morador(boolean presente, int senha) {
		super();
		this.presente = presente;
		this.senha = senha;
	}

	

	public boolean isPresente() {
		return presente;
	}



	public void setPresente(boolean presente) {
		this.presente = presente;
	}



	public int getSenha() {
		return senha;
	}



	public void setSenha(int senha) {
		this.senha = senha;
	}



	@Override
	public boolean autoriza(int senha) {
		if(this.getSenha() == (senha)) {
		return true;
		} else {
			return false;
			}
		}
	}

