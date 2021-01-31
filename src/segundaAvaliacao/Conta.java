package segundaAvaliacao;

import java.util.ArrayList;
import java.util.Random;

public class Conta{

	private double saldo;
	private String tipoConta;
	private int numero;
	private Gerente gerente;
	private ArrayList<Double> movimentos;
	private boolean contaAtiva;
	
	private Cliente cliente;
	
	
	public Conta(double saldoInicial, Cliente cliente) {
		super();
		this.cliente = cliente;
		this.saldo = saldoInicial;
		this.movimentos = new ArrayList<>();
		this.contaAtiva = true;
		this.geraNumeroConta();
		
		this.addMovimentos(saldo);
	}
	
	

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTipo() {
		return tipoConta;
	}

	public void setTipo(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	 public void geraNumeroConta() { 
		Random numero = new Random(); 
		this.numero = numero.nextInt(9999); 
	 }
	 
	 public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	 
	 public Gerente getGerente() {
		return gerente;
	}
	 
	 public void addMovimentos(Double valor) {
			this.movimentos.add(valor);
		}
	
	public void sacar(double valor) {
		
		this.verificaContaAtiva();
		
		if(contaAtiva) {
			if(this.getSaldo() < valor) {
				System.out.println("Esse valor é maior que seu saldo, saque invalido");
			} else {
				this.saldo = this.saldo - valor;
				System.out.println("Novo saldo: " + this.saldo);	
				System.out.printf("Saque no valor %.2f relizado com sucesso\n", valor);
				
				this.movimentos.add(-valor);			
			}	
		}
	}
	
	public void depositar(double valor) {
		
		this.verificaContaAtiva();
		
		if(contaAtiva) {
			this.saldo = this.saldo + valor;
			this.movimentos.add(valor);
			System.out.printf("Deposito no valor %.2f relizado com sucesso\n", valor);
		}
	}
	
	
	public void encerrarConta() {
		
		this.verificaContaAtiva();
		if(contaAtiva) {
		if(this.saldo > 0) {
			System.out.println("Você deve sacar o dinheiro antes de encerrar sua conta");
		}else if(this.saldo < 0) {
			System.out.println("Você não pode encerrar a conta con saldo negativo");
		}else {
			System.out.println("Você encerrou sua conta");
			contaAtiva = false;
			
			} 
		}
	}
	
	protected void verificaContaAtiva() {
		if (!this.contaAtiva) {
			System.out.println("Não é possível fazer movimentações em um conta inativa");
		}
	}
	
	public void listarExtrato() {
		
		System.out.printf("Extrato bancário da conta %s\n", this.numero);
		System.out.printf("Nome do cliente: %s\n", this.cliente.getNome());
		System.out.println("--------------------------");
		for (int i = 0; i < this.movimentos.size(); i++) {
			System.out.printf("%s ", this.movimentos.get(i) < 0 ? "-" : "+");
			System.out.printf("%f \n", this.movimentos.get(i));
		}
		System.out.println("--------------------------");
	}
	
	public void listarExtratoComSaldo() {
		this.listarExtrato();
		System.out.println("Saldo atual: " + String.format("%.2f", this.saldo));
	}
	
//		for(double ato: movimentos) {
//			System.out.println(String.format("%.2f", ato));
//		}
//		
//		System.out.println("Saldo atual: " + this.getSaldo());
	

	
	public boolean isContaAtiva() {
		return contaAtiva;
	}
	
	
	
}
