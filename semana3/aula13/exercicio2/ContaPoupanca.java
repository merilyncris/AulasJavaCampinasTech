package aula13.exercicio2;

public class ContaPoupanca extends ContaBancaria{

	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public void calcularNovoSaldo() {
		
		float saldo = (float) (this.getSaldo() + (this.getSaldo() * 0.2));
		this.setSaldo(saldo);
		System.out.println("O novo saldo é : " + getSaldo());
	}
}
