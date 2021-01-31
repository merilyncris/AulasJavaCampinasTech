package segundaAvaliacao;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(double saldoInicial, Cliente cliente) {
		super(saldoInicial, cliente);
		this.setTipo("Poupança");
	}

	

}
