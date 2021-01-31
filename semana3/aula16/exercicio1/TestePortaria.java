package aula16.exercicio1;

public class TestePortaria {

	public static void main(String[] args) {
		Morador morador = new Morador(true, 6785);
		Visitante ana = new Visitante(morador);
		Portaria port = new Portaria();
		
		morador.autoriza(6785);
		ana.autoriza(6785);
		
		port.liberaEntrada(ana);
		port.liberaEntrada(morador);
		
	}
}
