package aula18.exercicio;

import java.util.Scanner;

//public class Main {
//
//	public static void main(String[] args) {
//		
//	Banco banco = new Banco("PoupaMais");
//	Gerente gerente = new Gerente();
//		
//		
//	
//	Scanner in = new Scanner(System.in);
//	
//	Boolean acessandoSistema = true;
//	
//	while(acessandoSistema) {
//	
//	System.out.println("Acessar como cliente [c] ou gerente [g]: ");
//	String acesso = in.next();
//	
//	switch (acesso) {
//	case "g":
//		System.out.println("Para gerar um relatório dos clientes do banco [r]\n Para procurar um cliente pelo nome [n]");
//		String atoGerente = in.next();
//		
//		switch(atoGerente) {
//		case "r":
//			banco.imprimirContas();
//			break;
//		
//		case "n":
//			System.out.println("Estamos implementando essa funcionalidade");
//			break;
//			
//		break;
//	}
//		
//	case "c":
//	
//	System.out.println("Qual será o tipo de conta Corrente(c) ou Poupança(p)");
//	String tipoConta = in.next();
//
//	System.out.println("Digite o nome do novo cliente");
//	String nomeDoCliente = in.next();
//	Cliente cliente = new Cliente(nomeDoCliente);
//	
//	
//	System.out.println("Digite o valor inicial da conta corrente");
//	Double saldo = in.nextDouble();
//	Conta conta;
//	
//	if (tipoConta.equals("c")) {
//		conta = new ContaCorrente(saldo, cliente);
//	} else {
//		conta = new ContaPoupanca(saldo, cliente);
//	}
//
//	conta.setGerente(gerente);
//	banco.setContas(conta);
//	
//	Boolean realizarOperacoes = true;
//	while (realizarOperacoes) {
//		System.out.println("Qual operação você deseja realizar?");
//		System.out.println("[s] Saque");
//		System.out.println("[d] Depósito");
//		System.out.println("[e] Extrato");
//		System.out.println("[f] Encerrar");
//		System.out.println("[c] Cheque especial (gerente)");
//
//		String opcao = in.next();
//
//		switch (opcao) {
//		case "s":
//			System.out.println("Valor do saque");
//			Double valorSaque = in.nextDouble();
//			conta.sacar(valorSaque);
//			break;
//		case "d":
//			System.out.println("Valor do depósito");
//			Double valorDeposito = in.nextDouble();
//			conta.depositar(valorDeposito);
//			break;
//		case "e":
//			conta.listarExtratoComSaldo();
//			break;
//		case "f":
//			conta.encerrarConta();
//			break;
//		case "c":
//			if (conta instanceof ContaCorrente) {
//				System.out.println("Senha do gerente");
//				int senhaDoGerente = in.nextInt();
//				System.out.println("Novo valor do limite da conta corrente");
//				Double novoValorLimite = in.nextDouble();
//				((ContaCorrente) conta).adicionarLimiteChequeEspecial(novoValorLimite, senhaDoGerente);
//			} else {
//				System.out.println("Não é possível fazer operações de cheque especial em conta poupança");
//			}
//			
//			break;
//			
//		default:
//			break;
//		}
//		
//		System.out.println("Deseja continuar fazendo operações (s)/(n)");
//		realizarOperacoes = in.next().equals("s");
//		
//		break;
//
//	}
//	
//	}
//	
//	System.out.println("Deseja continuar no sistema (s)/(n)");
//	acessandoSistema = in.next().equals("s");
//			}
//	
//		}
//	}
//	
//	
