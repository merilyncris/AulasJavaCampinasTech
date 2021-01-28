package avaliacao.exercicio8;

import java.util.Scanner;

public class Excecao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Eu sei dividir");
		System.out.println("Informe o primeiro valor: ");
		int x = teclado.nextInt();
		int y = 0;
		double r = 0;
		
		while(y == 0) {
		System.out.println("Informe o segundo valor: ");
		y = teclado.nextInt();
		
		try {
			r = (x / y);
		} catch (ArithmeticException ex) {
			System.out.println("N�o podemos dividir por zero.");
			}		
		}
		
		System.out.println("O resultado da divis�o de " + x + " por " + y + " �: " + r);
				
		teclado.close();
	}
}
