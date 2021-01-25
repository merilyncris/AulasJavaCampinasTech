package aula12.composicao.exercicio3;

import java.util.ArrayList;

/*Escreva uma classe Agenda, que cont�m varios contatos do tipo Contato. ok
 *  Cada contato possui nome, telefone e email. ok
 * A agenda tamb�m possui um nome. ok Crie um programa teste que pe�a para o usuario
 * entrar com o nome da Agenda e em seguida 3 contatos. Crie m�todos que retornem
 * uma String com a informa��o de cada contato e tamb�m de todos os contatos da agenda;
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
