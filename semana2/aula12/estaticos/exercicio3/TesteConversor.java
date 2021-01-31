package aula12.estaticos.exercicio3;

public class TesteConversor {

	public static void main(String[] args) {
		ConversaoUnidadeTempo conversor = new ConversaoUnidadeTempo();
		
		System.out.println(conversor.anosParaDias(23));
		System.out.println(conversor.diaParaHoras(5));

		System.out.println(conversor.horasParaMinutos(5));

		System.out.println(conversor.minutosParaSegundos(300));

	}
}
