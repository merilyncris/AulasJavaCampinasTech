package aula17.exercicio1;

public class CD extends Produto implements CalculaPreco{

	
	public CD(String nome, String codigoBarras, double valorUnitario) {
		super(nome, codigoBarras, valorUnitario);
	
	}

	@Override
	public void calculaTotalVendas() {
		System.out.println("Total de vendas: " + this.getValorUnitario() * this.getQuantidadeVendas());
		
	}

	
	

}
