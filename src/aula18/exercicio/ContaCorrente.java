package aula18.exercicio;

public class ContaCorrente extends Conta{

	public ContaCorrente(String nome, int saldo) {
		super(nome, saldo);
		this.setTipo("Corrente");
	}
	
}
