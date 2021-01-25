package aula9.exemplos;

public class TestaAgenda {
	
	public static void main(String[] args) {
		
	
	Agenda agenda = new Agenda();
	Pessoa manoel = new Pessoa("manoel");
	
	agenda.imprimeAgenda();
	agenda.armazenaPessoa(manoel);
	agenda.imprimeAgenda();
}}
	
