package aula13.exemploHeranca;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario p = new Funcionario();
		Gerente carlos = new Gerente();
		
		carlos.setNome("Carlos Oliveira");
		carlos.setSalario(5000.0);
		carlos.setUsuario("coliveira");
		carlos.setSenha("carlinho");
		
		System.out.println("\nInforma��es od gerente: " + carlos.getNome());
		System.out.println("Salario: " + carlos.getSalario());
		System.out.println("Usuario: " + carlos.getUsuario());
		System.out.println("Senha: " + carlos.getSenha());
		System.out.println("Bonifica��o: " + carlos.calculaBonificacao());
		
		
		Secretaria regina = new Secretaria();
		regina.setNome("Regina Silva");
		regina.setSalario(4500);
		regina.setRamal(2);
		
		System.out.println("\nInforma��es da Secretaria: " + regina.getNome());
		System.out.println("Salario: " + regina.getSalario());
		System.out.println("Usuario: " + regina.getRamal());
		
		Telefonista mercedez = new Telefonista();
		mercedez.setNome("Mercedez Gonzales");
		mercedez.setSalario(4000.0);
		mercedez.setEstacaoDeTrabalho(25);
		System.out.println("\nInforma��es da Telefonista: " + mercedez.getNome());
		System.out.println("Salario: " + mercedez.getSalario());
		System.out.println("Usuario: " + mercedez.getEstacaoDeTrabalho());
		
		

		
		
	}
	
	
}
