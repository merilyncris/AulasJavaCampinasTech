package aula13.exercicio2;

public class ContaEspecial extends ContaBancaria{

	private float limite;

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public void sacar(int valor) {
		if(valor <= (this.getSaldo() + limite)) {
			float saldo = this.getSaldo() - valor;
			this.setSaldo(saldo);
		}else {
			System.out.println("Este saque está além do seu limite");
		}
	}
}
