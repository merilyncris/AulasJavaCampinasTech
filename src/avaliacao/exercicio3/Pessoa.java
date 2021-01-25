package avaliacao.exercicio3;


/*Fazer um programa com as seguintes caracter�sticas:

Uma classe chamada Universidade que ter� como atributo um nome e ter� um m�todo para informar o seu nome.
Uma classe Pessoa, que ter� como atributo seu nome, em que universidade * trabalha e em quando entrou na universidade 
um m�todo que dir� seu nome e * em que universidade trabalha.
Relacionar a classe Pessoa para com a classe Universidade. Cada pessoa poder� ser associada a uma Universidade.
*/

public class Pessoa {

	private String nome;
	Universidade universidade;
	private String comecouTrabalho;
	
	
	
	public Pessoa(String nome, String comecouTrabalho) {
		this.nome = nome;
		this.comecouTrabalho = comecouTrabalho;
	}

	public String getNome() {
		return nome;
	}
	
	public Universidade getUniversidade() {
		return universidade;
	}
	
	public void setUniversidade(Universidade universidade) {
		this.universidade = universidade;
	}
	
	public String getComecouTrabalho() {
		return comecouTrabalho;
	}

	public void dadosDaPessoa() {
		System.out.println(this.getNome() + " trabalha na " + universidade.getNome());
	}
	
}
