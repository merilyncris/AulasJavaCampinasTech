package avaliacao.exercicio3;


/* Fazer um programa com as seguintes caracter�sticas:
Uma classe chamada Universidade que ter� como atributo um nome e ter� um m�todo para informar o seu nome. ok
Uma classe Pessoa, que ter� como atributo seu nome, em que universidade trabalha e em quando entrou na universidade um m�todo que dir� seu nome e em que universidade trabalha. 
Relacionar a classe Pessoa para com a classe Universidade. Cada pessoa poder� ser associada a uma Universidade. 
*/

public class Universidade {

	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
