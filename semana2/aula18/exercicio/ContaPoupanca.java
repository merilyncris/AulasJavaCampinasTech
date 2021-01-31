package aula18.exercicio;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(String nome, int saldo) {
		super(nome, saldo);
		this.setTipo("Poupança");
	}
	

}
