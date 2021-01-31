package aula12.composicao.exercicio1;


//Uma classe Pessoa,* que terá como atributo seu nome*, em que universidade trabalha*
//e em quando entrou na universidade* um método que dirá seu nome* e em que universidade trabalha.* 

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

	
}
