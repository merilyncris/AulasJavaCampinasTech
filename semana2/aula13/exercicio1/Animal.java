package aula13.exercicio1;

/*Crie uma clase Animal que obedeça à seguinte descrição
 * crie getters e setters ok
 * construtor ok
 * 
 * */

public class Animal {
	private String nome;
	private float comprimento;
	private int numeroPatas;
	private String cor;
	private String ambiente;
	private float velocidadeMedia;
	
	
	
	public Animal(String nome, float comprimento, int numeroPasta, String cor, String ambiente, float velocidadeMedia) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.numeroPatas = numeroPasta;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidadeMedia = velocidadeMedia;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getComprimento() {
		return comprimento;
	}
	
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	
	public int getNumeroPatas() {
		return numeroPatas;
	}
	
	public void setNumeroPatas(int numeroPasta) {
		this.numeroPatas = numeroPasta;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getAmbiente() {
		return ambiente;
	}
	
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	
	public float getVelocidadeMedia() {
		return velocidadeMedia;
	}
	
	public void setVelocidadeMedia(float velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}
	
	public void informaDados() {
		System.out.println("\nNome: " + this.getNome());
		System.out.println("Comprimento: " + this.getComprimento());
		System.out.println("Numero Patas: " + this.getNumeroPatas());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Ambiente: " + this.getAmbiente());
		System.out.println("Velocidade média: " + this.getVelocidadeMedia());


	}
}
