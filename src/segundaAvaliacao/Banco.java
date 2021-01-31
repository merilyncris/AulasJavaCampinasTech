package segundaAvaliacao;

import java.util.ArrayList;

public class Banco {

	private String nome;
	ArrayList<Conta> contas;

	public Banco(String nome) {
		super();
		this.nome = nome;
		this.contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void imprimirContas() {
		for (Conta cadaConta : contas) {
			System.out.println("\nNome: " + cadaConta.getCliente().getNome() + "\nNúmero da Conta: "
					+ cadaConta.getNumero() + "\nTipo: " + cadaConta.getTipo() + "\nSaldo: " + cadaConta.getSaldo());
		}
	}

	public void setContas(Conta contas) {
		this.contas.add(contas);
	}

	public void procurarClientePorNumero(int numero) {
		int contasEncontradas = 0;
		for (Conta cadaConta : contas) {
			if (cadaConta.getNumero() == numero) {
				contasEncontradas++;
				System.out.println(
						"\nNome: " + cadaConta.getCliente().getNome() + "\nNúmero da Conta: " + cadaConta.getNumero()
								+ "\nTipo: " + cadaConta.getTipo() + "\nSaldo: " + cadaConta.getSaldo());
			}

		}

		if (contasEncontradas == 0) {
			System.out.println("Essa conta não está no sistema");
		}
	}

}
