package aula17.exercicio1;

public class Livro extends Produto implements CalculaPreco{

	public Livro(String nome, String codigoBarras, double valorUnitario, int quantidadeVendas) {
		super(nome, codigoBarras, valorUnitario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculaTotalVendas() {
		System.out.println("Total de vendas: " + ((this.getValorUnitario() - 50) * this.getQuantidadeVendas()));

		
	}

}
