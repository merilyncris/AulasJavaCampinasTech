package aula18.solucao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Qual ser� o tipo de conta Corrente(c) ou Poupan�a(p)");
	String tipoConta = in.next();

	System.out.println("Digite o nome do novo correntista");
	String nomeDoCliente = in.next();
	Cliente cliente = new Cliente(nomeDoCliente);

	System.out.println("Digite o valor inicial da conta corrente");
	Double saldo = in.nextDouble();
	Conta conta;
	
	if (tipoConta.equals("c")) {
		conta = new ContaCorrente(saldo, cliente);
	} else {
		conta = new ContaPoupanca(saldo, cliente);
	}

	Boolean realizarOperacoes = true;
	while (realizarOperacoes) {
		System.out.println("Qual opera��o voc� deseja realizar?");
		System.out.println("[s] Saque");
		System.out.println("[d] Dep�sito");
		System.out.println("[e] Extrato");
		System.out.println("[f] Encerrar");
		System.out.println("[c] Cheque especial (gerente)");

		String opcao = in.next();

		switch (opcao) {
		case "s":
			System.out.println("Valor do saque");
			Double valorSaque = in.nextDouble();
			conta.realizarSaque(valorSaque);
			break;
		case "d":
			System.out.println("Valor do dep�sito");
			Double valorDeposito = in.nextDouble();
			conta.depositar(valorDeposito);
			break;
		case "e":
			conta.listarExtratoComSaldo();
			break;
		case "f":
			conta.encerrarConta();
			break;
		case "c":
			if (conta instanceof ContaCorrente) {
				System.out.println("Senha do gerente");
				String senhaDoGerente = in.next();
				System.out.println("Novo valor do limite da conta corrente");
				Double novoValorLimite = in.nextDouble();
				((ContaCorrente) conta).adicionarLimiteChequeEspecial(novoValorLimite, senhaDoGerente);
			} else {
				System.out.println("N�o � poss�vel fazer opera��es de cheque especial em conta poupan�a");
			}
			
			break;
		default:
			break;
		}
		
		System.out.println("Deseja continuar fazendo opera��es (s)/(n)");
		realizarOperacoes = in.next().equals("s");

	}
	in.close();

}
}
