package aula14.exemploSobrecarga;

public class Garrafa {

	private double capacidadeLitros;
	public void encher(int milimetros) {
		this.capacidadeLitros = milimetros / 1000;
	}
	public void encher(double litros) {
		this.capacidadeLitros = litros;
	}
	public void encher(float milimetros) {
		this.capacidadeLitros = milimetros / 1000;
	}
	public double getCapacidadeLitros() {
		return capacidadeLitros;
	}
}
