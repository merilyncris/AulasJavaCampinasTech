package aula12.composicao.exercicio3;

import java.util.ArrayList;

/*Escreva uma classe Agenda, que contém varios contatos do tipo Contato. ok
 *  Cada contato possui nome, telefone e email. ok
 * A agenda também possui um nome. ok Crie um programa teste que peça para o usuario
 * entrar com o nome da Agenda e em seguida 3 contatos. Crie métodos que retornem
 * uma String com a informação de cada contato e também de todos os contatos da agenda;
 */
public class Agenda {
		
	String nome;
	private ArrayList<Contatos> agenda = new ArrayList<>();

	public Agenda() {
		
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void getContatos() {		
		System.out.println("Seus contatos são: ");
		for (int i = 0; i < agenda.size(); i++) {
			System.out.println("\nNome: " + agenda.get(i).getNome());
			System.out.println("E-mail: " + agenda.get(i).getEmail());
			System.out.println("Telefone: " + agenda.get(i).getTelefone());
		}
	}
	
	public void getContatosPorNome(String nome) {
		for(int i = 0; i < agenda.size(); i++) {
			if(agenda.get(i).getNome() == nome) {
				System.out.println("\nNome: " + agenda.get(i).getNome());
				System.out.println("E-mail: " + agenda.get(i).getEmail());
				System.out.println("Telefone: " + agenda.get(i).getTelefone());
			}
		}
	}

	public void adicionarContatos(Contatos contato) {		
		this.agenda.add(contato);	
	}
	
	
}
