package avaliacao.exercicio5;

import java.util.ArrayList;

/*Escreva uma classe Agenda

cont�m v�rios contatos do tipo Contato.
Cada contato possui nome, telefone e email.
Agenda tamb�m possui um nome.
Crie m�todos que retornam uma String com a informa��o de cada contato
 */
public class Agenda {
		
	private String nome;
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
		System.out.println("Seus contatos s�o: ");
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
