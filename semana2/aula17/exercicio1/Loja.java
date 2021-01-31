package aula17.exercicio1;

import java.util.Scanner;

public class Loja {
	private Produto produto;

	public void calculaVendasTotaisProduto(Produto produto) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos produtos " + produto.getNome() + " foram vendidos?");
		int quantidade = scan.nextInt();
		
		produto.setQuantidadeVendas(quantidade);
		
		System.out.println("A quantidade de vendas foi: " + produto.getQuantidadeVendas() + "\ndo produto " + produto.getNome()
		+ " com codigo " + produto.getCodigoBarras());
		
	}
}
