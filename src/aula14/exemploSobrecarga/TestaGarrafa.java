package aula14.exemploSobrecarga;

public class TestaGarrafa {

	public static void main(String[] args) {
		Garrafa sprite = new Garrafa();
		System.out.println("A capacidade de litros da garrafa é: " +sprite.getCapacidadeLitros());
		
		sprite.encher(5);
		sprite.encher(2.0);
		sprite.encher(1.0f);
	}
}
