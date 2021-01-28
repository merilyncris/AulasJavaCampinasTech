package avaliacao.exercicio10;

public class TestaCalculadora {

	
	public static void main(String[] args) {
		
		  	Calculadora.dividir(900, 2);
		  	Calculadora.dividir(900, 0);
			System.out.println("O resultado da multiplicação é: " + Calculadora.multiplicar(6, 5));
			System.out.println("O resultado da adição é: " + Calculadora.adicionar(6, 5));
			System.out.println("O resultado da subtração é: " + Calculadora.subtrair(6, 5));
			System.out.println("O resultado da potenciação é: " + Calculadora.elevarPotencia(6, 5));
	}
}
