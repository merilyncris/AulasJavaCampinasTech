package aula12.encapsulamento;

public class TestaContaSaldoNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		Conta conta2 = new Conta();
		
		conta.setAgencia(1500);
		conta.setCliente("Manoel");
		conta.setNumero(6751);
		
		conta2.setAgencia(1500);
		conta2.setCliente("Cyntia");
		conta2.setNumero(6752);
		
		System.out.println(conta.getSaldo());
		
		conta.deposita(200);
		conta.transfere(100.0, conta2);
		System.out.println(conta.getSaldo());
		System.out.println(conta2.getSaldo());
	}
}
