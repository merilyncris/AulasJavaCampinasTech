package aula12.estaticos.exercicio1;

public class TestaContador {

	public static void main(String[] args) {
		Contador conta = new Contador();
		
		System.out.println(conta.getContador());
		
		conta.incrementar();
		conta.incrementar();
		conta.incrementar();
		conta.incrementar();
		conta.incrementar();
		conta.zerar();
		Contador conta1 = new Contador();
		Contador conta2= new Contador();
		
		System.out.println(Contador.getContador());
		}
}
