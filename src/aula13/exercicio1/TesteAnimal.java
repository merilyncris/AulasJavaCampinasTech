package aula13.exercicio1;

//String nome, float comprimento, int numeroPasta, String cor, String ambiente, float velocidadeMedia
public class TesteAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal("Jacare", 2.0f, 4, "verde", "lago", 48.0f);
		
		animal.informaDados();
		
		Peixe peixe = new Peixe("Peixe", 0.5f, 0, "dourado", "rio, lago, mar", 60.0f);
		
		peixe.setCaracteristica("Pequeno e gelado, um animal nada divertido");
		
		peixe.dadosPeixe();
	}
	
	
}
