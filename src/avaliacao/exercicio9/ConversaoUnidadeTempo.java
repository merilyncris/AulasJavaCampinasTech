package avaliacao.exercicio9;


/*Escreva uma classe ConversaoDeUnidadesDeTempo com metodos estáticos para conversão aproximada de velocidade segundo a lista abaixo.
1 minuto = 60 segundos
1 hora = 60 minutos
1 dia = 24 horas
1 semana = 7 dias
1 mês = 30 dias
1 ano = 365 dias
*/

public class ConversaoUnidadeTempo {

	
	public static int minutosParaSegundos(int minutos) {
		return minutos * 60;
	}
	
	public static int horasParaMinutos(int horas) {
		return horas * 60;
	}
	
	public static int diaParaHoras(int dia) {
		return dia * 24;
	}
	
	public static int semanaParaDias(int semanas) {
		return semanas * 7;
	}
	
	public static int mesesParaDias(int meses) {
		return meses * 30;
	}
	
	public static int anosParaDias(int anos) {
		return anos * 365;
	}
}
