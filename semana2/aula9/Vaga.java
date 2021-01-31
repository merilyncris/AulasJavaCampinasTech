package aula9;

class Vaga {

	String setor;
	int identificador;
	double area;
	String tipo;
	boolean ocupada;
	Placa placa;
	
	Vaga(String setor, int identificador) {
		this.setor = setor;
		this.identificador = identificador;
		System.out.println("Vaga criada no setor "+ setor + ", com id: " + identificador);
	}
	
	boolean estaOcupada() {
		return ocupada;
	}
	
	void ocupar(Placa placa) {
		this.placa = placa;
		this.ocupada = true;
	}
	
	
}
