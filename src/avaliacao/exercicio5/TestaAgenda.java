package avaliacao.exercicio5;

import java.util.Scanner;

public class TestaAgenda {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Agenda agenda1 = new Agenda();
		System.out.println("Por favor insira o nome da sua agenda: ");
		String nomeAgenda = scan.nextLine();
		agenda1.setNome(nomeAgenda);
		
		System.out.println("Insira os dados do primeiro contato:");
		
		for (int i = 0; i < 3; i++) {
			System.out.println("\nContato " + (i+ 1));
			Contatos pessoa = new Contatos();
			
			System.out.println("Nome:");
			String nomeContato = scan.nextLine();
			pessoa.setNome(nomeContato);
			
			System.out.println("Email:");
			String emailContato = scan.nextLine();
			pessoa.setEmail(emailContato);
			
			System.out.println("Telefone:");
			String telefoneContato = scan.nextLine();
			pessoa.setTelefone(telefoneContato);
			
			agenda1.adicionarContatos(pessoa);
		}
		
		agenda1.getContatos();
		
		agenda1.getContatosPorNome("Marcia");
		
		scan.close();
	}
	
	
}
