package aula13.exercicio2;

public class TestaConta {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		ContaPoupanca contap = new ContaPoupanca();
		ContaEspecial contaE = new ContaEspecial();
		
		conta.depositar(500);
		System.out.println("Saldo conta bancaria: " + conta.getSaldo());
	
		conta.sacar(550);
		System.out.println(conta.getSaldo());
		
		contap.depositar(200);
		contap.setCliente("Ronaldo");
		contap.setDiaRendimento(4);
		contap.setNum_conta(45677-9);
	
		System.out.println("Saldo conta poupança: " + contap.getSaldo());
		
		contap.calcularNovoSaldo();
		
		contaE.setLimite(400);
		contaE.depositar(200);
		
		System.out.println("O saldo da conta especial " + contaE.getSaldo() + "\nO limite da conta especial é: " + contaE.getLimite());
		contaE.sacar(800);
		System.out.println(contaE.getSaldo());
		
		System.out.println("\nO cliente " + contap.getCliente() + ", com a conta numero " + contap.getNum_conta() + ", possui um saldo de R$" +
		contap.getSaldo() + ", cujo rendimento é no dia " + contap.getDiaRendimento());
	}
}
