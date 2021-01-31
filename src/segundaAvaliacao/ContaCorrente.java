package segundaAvaliacao;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(double saldoInicial, Cliente cliente) {
		super(saldoInicial, cliente);
		this.setTipo("Corrente");
	}

	private double limite;


	
	public void adicionarLimiteChequeEspecial(double limite, int senha) {
		this.verificaContaAtiva();
		if(this.isContaAtiva()) {
		if(senha == this.getGerente().getSenha()) {
			this.limite = limite;
			System.out.printf("Seu novo limite de %.2f foi adicionado com sucesso.\n", limite);
		} else {
			System.out.println("A senha está incorreta.");
		}
		}
	}
	
	@Override
	public void listarExtratoComSaldo() {
		super.listarExtratoComSaldo();
		System.out.printf("Limite de cheque especial %.2f\n", this.limite);
		System.out.printf("Saldo e limite: %.2f\n", this.getSaldo() + this.limite);

	}
	
	@Override
	public void sacar(double valor) {	
		this.verificaContaAtiva();
		
		if(this.isContaAtiva()) {
		if(valor <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor);
			this.addMovimentos(-valor);	
			System.out.printf("Saque no valor %.2f relizado com sucesso\n", valor);
		} else if(valor <= this.getSaldo() + this.limite) {
			this.setSaldo(this.getSaldo() - valor);
			this.addMovimentos(-valor);		
			System.out.printf("Saque no valor %.2f relizado com sucesso utilizando o valor do cheque especial\n",
					valor);
		}else {
			System.out.println("Saque não permitido, não há valor disponível na conta");
		}
		}
	}	
	
	public double getLimite() {
		return limite;
	}
}
