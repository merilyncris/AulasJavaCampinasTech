package avaliacao.exercicio12;

import java.util.Scanner;

/*
 * Escreva um programa que permita que o usu�rio digite um n�mero entre 1 e 7 ;
 * e ao final, diga para o usu�rio qual o dia da semana que aquele n�mero representa: 1 (Domingo), 2 (Segunda), ... 7 (S�bado).
 */

public class DiaDaSemana {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ol�, digite um n�mero de 1 a 7:");
		int dia = scan.nextInt();
		
		switch(dia) {
		case 1:
			System.out.println("Domingo");
			break;
			
		case 2:
			System.out.println("Segunda");
			break;
			
		case 3:
			System.out.println("Ter�a");
			break;
			
		case 4:
			System.out.println("Quarta");
			break;
			
		case 5:
			System.out.println("Quinta");
			break;
			
		case 6:
			System.out.println("Sexta");
			break;
		
		case 7:
			System.out.println("S�bado");
			break;
		}
		
		scan.close();
	}
}
