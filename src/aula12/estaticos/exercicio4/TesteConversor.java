package aula12.estaticos.exercicio4;

public class TesteConversor {
	
	public static void main(String[] args) {
		ConversaoUnidadesArea conversor = new ConversaoUnidadesArea();

	System.out.println(conversor.metroQuadradosParaPes(32));
	System.out.println(conversor.milhaQuadradaParaAcres(45));
	System.out.println(conversor.peQuadradoParaCentimetrosQuadrados(67));
	}
	
}
