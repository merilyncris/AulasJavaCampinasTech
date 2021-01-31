package aula16.exercicio1;

public class Visitante extends Pessoa implements Autorizavel {

	private Morador morador;
	

	public Visitante(Morador morador) {
		super();
		this.morador = morador;
	}

	
	@Override
	public boolean autoriza(int senha) {
		if (this.morador.getSenha() == (senha) && (this.morador.isPresente())) {
			return true;
		} else {
			return false;
		}
	}

}
