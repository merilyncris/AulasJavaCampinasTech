package aula15.exercicio1;

public class Vendedor extends Funcionario{
	
	private double comissao;

	public Vendedor(String nome, String matricula, double salarioBase, double comissao) {
		super(nome, matricula, salarioBase);
		this.comissao = comissao;
	}

	
	@Override
	public double calculaSalario() {
		// TODO Auto-generated method stub
		return super.getSalarioBase() + this.comissao;
	}
	
	

}
