package avaliacao.exercicio10;

public class TestaCalculadora {

	
	public static void main(String[] args) {
		
		  	Calculadora.dividir(900, 2);
		  	Calculadora.dividir(900, 0);
			System.out.println("O resultado da multiplica��o �: " + Calculadora.multiplicar(6, 5));
			System.out.println("O resultado da adi��o �: " + Calculadora.adicionar(6, 5));
			System.out.println("O resultado da subtra��o �: " + Calculadora.subtrair(6, 5));
			System.out.println("O resultado da potencia��o �: " + Calculadora.elevarPotencia(6, 5));
	}
}
