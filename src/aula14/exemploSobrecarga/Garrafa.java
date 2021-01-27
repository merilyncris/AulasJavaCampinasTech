package aula14.exemploSobrecarga;

public class Garrafa {

	private double capacidadeLitros;
	
	public void encher(int milimetros) {
		System.out.println("milimetro");
		this.capacidadeLitros = milimetros / 1000;
	}
	
	public void encher(double litros) {
		System.out.println("litro");
		this.capacidadeLitros = litros;
	}
	
	public void encher(float milimetros) {
		System.out.println("m float");
		this.capacidadeLitros = milimetros / 1000;
	}
	
	public double getCapacidadeLitros() {
		return capacidadeLitros;
	}
}
