package aula9;

public class Estacionamento {

	public static void main(String[] args) {
		Vaga vaga = new Vaga("Amarelo", 1);
		Vaga vaga1 = new Vaga("Amarelo", 2);
		Vaga vaga2 = new Vaga("Amarelo", 3);
		Vaga vaga3 = new Vaga("Amarelo", 4);
		
		Placa placa1 = new Placa("ABC-6D66");
		
		vaga.area = 15.5;
		vaga1.tipo = "PDC";
		vaga2.tipo = "Gestante";
		vaga3.tipo = "Idoso";
		
		vaga.ocupar(placa1);
		
		System.out.println(vaga.placa.numero);
		
		if(vaga.estaOcupada()) {
			System.out.println("está ocupada");
		}else {
			System.out.println("Está vaga");
		}
	}
}
