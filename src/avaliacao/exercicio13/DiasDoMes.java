package avaliacao.exercicio13;

/*Escreva um programa que receba como entrada o n�mero do m�s (1, 2, ..., 12) e o ano (0, ..., 2xxx), 
 * e devolva para o usu�rio a quantidade de dias que tem aquele m�s. Dica: preste aten��o com anos bissextos.
 */

import java.util.Scanner;


public class DiasDoMes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean bissexto = false;
		
		System.out.println("Digite o numero referente ao m�s: ");
		int dia = scan.nextInt();
		
		System.out.println("Digite o ano: ");
		int ano = scan.nextInt();
		
		if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
			bissexto = true;
		}
		
		switch(dia) {
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Esse m�s tem 31 dias");
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Esse m�s tem 30 dias");
			break;
			
		case 2:
			if(bissexto) {
				System.out.println("Esse m�s tem 29 dias");
				break;
			} else {
				System.out.println("Esse m�s tem 28 dias");
				break;
			}
			
		default:
			System.out.println("Esse mes n�o existe no nosso calend�rio");
		}
		
		scan.close();
	}
}
