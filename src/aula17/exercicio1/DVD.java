package aula17.exercicio1;

public class DVD extends Produto implements CalculaPreco {

	public DVD(String nome, String codigoBarras, double valorUnitario, int quantidadeVendas) {
		super(nome, codigoBarras, valorUnitario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculaTotalVendas() {
		System.out.println("Total de vendas: " + (this.getValorUnitario() * this.getQuantidadeVendas() + 100));

		
	}

}
