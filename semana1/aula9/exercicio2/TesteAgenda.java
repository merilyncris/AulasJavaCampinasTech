package aula9.exercicio2;

public class TesteAgenda {
	public static void main(String[] args) {
		
		
		Agenda agenda = new Agenda();
		Pessoa ana = new Pessoa("Ana", 18, 1.67);
		Pessoa maria = new Pessoa("Maria", 25, 1.65);
		Pessoa rafael = new Pessoa("Rafael", 23, 1.76);
		
		
		agenda.armazenaPessoa(ana);
		agenda.armazenaPessoa(rafael);
		agenda.armazenaPessoa(maria);
		
		//agenda.removePessoa(rafael);
		agenda.imprimeAgenda();
		
		agenda.imprimePessoa(1);
		agenda.buscaPessoa(rafael);
	}
	
}
