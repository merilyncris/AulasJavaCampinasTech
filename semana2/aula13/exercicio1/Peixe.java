package aula13.exercicio1;

public class Peixe extends Animal{
	

	private String caracteristica;
	
	public Peixe(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia) {
		super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
		
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	public void dadosPeixe() {
		this.informaDados();
		System.out.println("Caracteristicas: " + this.getCaracteristica());
	}

}
