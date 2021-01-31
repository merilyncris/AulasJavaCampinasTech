package segundaAvaliacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Banco banco = new Banco("PoupaMais");
		Gerente gerente = new Gerente();

		Scanner in = new Scanner(System.in);

		SistemaInterno sistema = new SistemaInterno();
		Boolean acessandoSistema = true;

		while (acessandoSistema) {

			System.out.println("\nAcessar como cliente [c] ou gerente [g]: ");
			String acesso = in.next();

			switch (acesso) {

			case "c":

				sistema.acessoCliente();

				break;

			case "g":

				sistema.acessoGerente();

				break;

			default:
				break;
			}
			System.out.println("\nDeseja continuar no sistema (s)/(n)");
			acessandoSistema = in.next().equals("s");
		}
		in.close();
	}
}
