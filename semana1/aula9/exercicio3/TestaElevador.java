package aula9.exercicio3;

public class TestaElevador {

	public static void main(String[] args) {
		Elevador elevador = new Elevador(7, 6);

		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();

		elevador.remove();
		elevador.remove();
		elevador.remove();
		elevador.remove();

		elevador.subir();
		elevador.subir();
		elevador.descer();
		elevador.descer();
		elevador.descer();

	}
}
