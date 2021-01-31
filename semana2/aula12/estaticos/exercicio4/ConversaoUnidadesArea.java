package aula12.estaticos.exercicio4;

/* 1 metro quadrado = 10.76 pés quadrados
 * 1 pé quadrado = 929 centimetros quadrados
 * 1 milha quadrada = 640 acres
 * 1 acre = 43.560 pés quadrados
 */

public class ConversaoUnidadesArea {

	public static double metroQuadradosParaPes(double metros) {
		return metros * 10.76;
	}
	
	public static double peQuadradoParaCentimetrosQuadrados(double pe) {
		return pe * 929;
	}
	
	public static double milhaQuadradaParaAcres(double milha) {
		return milha * 640;
	}
	
	public static double acreParaPesQuadrados(double acre) {
		return acre * 43.560;
	}
	
	
}
