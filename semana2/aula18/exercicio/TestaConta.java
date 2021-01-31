package aula18.exercicio;

public class TestaConta {

	public static void main(String[] args) {
		Conta contap = new ContaPoupanca("Ana", 220);
		Conta contac = new ContaCorrente("Marcelo", 300);
		
		
		
		contap.geraNumeroConta();
		contac.geraNumeroConta();
		
		System.out.println("Nome: " + contac.getNome() + "\nSaldo: " + contac.getSaldo() +
				"\nConta: " + contac.getTipo() + "\nO numero da conta é: " + contac.getNumero());
		
		
		contac.sacar(400);
		System.out.println(" ");
		
		System.out.println("Nome: " + contap.getNome() + "\nSaldo: " + contap.getSaldo() +
				"\nConta: " + contap.getTipo() + "\nO numero da conta é: " + contap.getNumero());
		
		
		contac.depositar(200);
		
		System.out.println("Novo saldo: "+ contac.getSaldo());
		
	}
}
