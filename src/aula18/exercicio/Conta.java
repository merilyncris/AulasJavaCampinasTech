package aula18.exercicio;

import java.util.ArrayList;
import java.util.Random;

public class Conta{

	private String nome;
	private int saldo;
	private String tipoConta;
	private int numero;
	ArrayList<Double> movimentos;
	
	public Conta(String nome, int saldo) {
		super();
		this.nome = nome;
		this.saldo = saldo;
		
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
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

	
	 public void geraNumeroConta() { 
		Random numero = new Random(); 
		this.numero = numero.nextInt(9999); 
	 }
	 
	
	public void sacar(int valor) {
		if(this.getSaldo() < valor) {
			System.out.println("Esse valor é maior que seu saldo, saque invalido");
		} else {
			this.saldo = this.saldo - valor;
			System.out.println("Novo saldo: " + this.saldo);	
			
			
		}
		
	}
	
	public void depositar(int valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void limiteSaqueEspecial() {
		
	}
	
	public void encerrarConta() {
		
	}
	
	public void listarExtrato() {
	
		for(double ato: movimentos) {
			System.out.println(ato);
		}
	}
	
	
	
	
	
}
