package aula13.exercicio2;

public class ContaBancaria {

	private String cliente;
	private int num_conta;
	private float saldo;
	
	public String getCliente() {
		return cliente;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public int getNum_conta() {
		return num_conta;
	}
	
	public void setNum_conta(int num_conta) {
		this.num_conta = num_conta;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(int valor) {
		if(valor <= saldo) {
			saldo -= valor;
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void depositar(int valor) {
		saldo += valor;
	}
}
