package segundaAvaliacao;

import java.util.Scanner;

public class SistemaInterno {

	Scanner in = new Scanner(System.in);
	Banco banco = new Banco("PoupaMais");
	Gerente gerente = new Gerente();

	final void acessoCliente() {

		System.out.println("Qual será o tipo de conta Corrente(c) ou Poupança(p)");
		String tipoConta = in.next();

		System.out.println("Digite o nome do novo cliente");
		String nomeDoCliente = in.next();
		Cliente cliente = new Cliente(nomeDoCliente);

		System.out.println("Digite o valor inicial da conta");
		Double saldo = in.nextDouble();
		Conta conta;

		if (tipoConta.equals("c")) {
			conta = new ContaCorrente(saldo, cliente);
		} else {
			conta = new ContaPoupanca(saldo, cliente);
		}

		conta.setGerente(gerente);
		banco.setContas(conta);
		Boolean realizarOperacoes = true;
		while (realizarOperacoes) {
			System.out.println("Qual operação você deseja realizar?");
			System.out.println("[s] Saque");
			System.out.println("[d] Depósito");
			System.out.println("[e] Extrato");
			System.out.println("[f] Encerrar");
			System.out.println("[c] Cheque especial (gerente)");

			String opcao = in.next();

			switch (opcao) {
			case "s":
				System.out.println("Valor do saque");
				Double valorSaque = in.nextDouble();
				conta.sacar(valorSaque);
				break;
			case "d":
				System.out.println("Valor do depósito");
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
					int senhaDoGerente = in.nextInt();
					System.out.println("Novo valor do limite da conta corrente");
					Double novoValorLimite = in.nextDouble();
					((ContaCorrente) conta).adicionarLimiteChequeEspecial(novoValorLimite, senhaDoGerente);
				} else {
					System.out.println("Não é possível fazer operações de cheque especial em conta poupança");
				}

				break;
			default:
				break;
			}

			System.out.println("Deseja continuar fazendo operações (s)/(n)");
			realizarOperacoes = in.next().equals("s");

		}

	}

	public void acessoGerente() {

		System.out.println("\nOlá, para continuar digite sua senha: ");
		int senha = in.nextInt();

		if (senha == gerente.getSenha()) {
			Boolean realizarOperacoes = true;
			while (realizarOperacoes) {

				System.out.println(
						"\nBem vindo ao sistema.\n[r] Para gerar um relatorio dos cliente \n[c] Para acessar um cliente pelo numero da conta");
				String acao = in.next();

				switch (acao) {
				case "r":
					this.banco.imprimirContas();
					break;

				case "c":

					System.out.println("\nDigite o numero da conta do cliente:");
					int numero = in.nextInt();
					banco.procurarClientePorNumero(numero);

					break;
				}
				System.out.println("\nDeseja continuar fazendo operações (s)/(n)");
				realizarOperacoes = in.next().equals("s");
			}

		} else {
			System.out.println("Senha inválida.");
		}
	}

}
