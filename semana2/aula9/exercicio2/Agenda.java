package aula9.exercicio2;

import java.util.ArrayList;

/* Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes opera��es:

void armazenaPessoa(String nome, int idade, float altura); ok
void removePessoa(String nome); ok
int buscaPessoa(String nome); // informa em que posi��o da agenda est� a pessoa ok
void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda ok
void imprimePessoa(int index); // imprime os dados da pessoa que est� na posi��o �i� da agenda. ok
*/

public class Agenda {
	
	Pessoa pessoa;
	ArrayList<Pessoa> agenda = new ArrayList<Pessoa>();
	
	

	public Agenda() {
		System.out.println("uma agenda foi criada\n");
	}



	void armazenaPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
		agenda.add(pessoa);
		System.out.println(pessoa.nome + " agora est� na sua agenda\n");
	}
	
	void removePessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
		agenda.remove(pessoa);
		System.out.println(pessoa.nome + "n�o est� mais na sua agenda\n");
	}
	
	void buscaPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
		System.out.println(pessoa.nome + " est� na posi��o " + agenda.indexOf(pessoa) + "\n");
	
		
	}
	
	void imprimeAgenda() {
		System.out.println("Seus contatos s�o: \n");
		for (Pessoa individuo : agenda) {
			System.out.println("-" + individuo.nome + ", "+ individuo.idade + " anos, " + individuo.altura + " de altura. \n");
		}
	}
	
	void imprimePessoa(int index) {
		Pessoa dados = agenda.get(index);	
		System.out.println("Na posi��o " + index + " voc� tem " + dados.nome + ", " + dados.idade + " anos, " + dados.altura + " de altura\n");
	}
	
}