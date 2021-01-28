package aula15.exercicio1;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario marlene = new Assistente("Marlene", "12345", 1800);
	
		System.out.println(marlene.calculaSalario());
		
		Funcionario gerente = new Gerente("Juca", "3456", 3000);
		System.out.println(gerente.calculaSalario());
		
		Funcionario vendedor = new Vendedor("Mario", "9823", 1500, 1500);
		System.out.println(vendedor.calculaSalario());
	}
	
	
}
