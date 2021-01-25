package avaliacao.exercicio12;

import java.util.Scanner;

/*
 * Escreva um programa que permita que o usuário digite um número entre 1 e 7 ;
 * e ao final, diga para o usuário qual o dia da semana que aquele número representa: 1 (Domingo), 2 (Segunda), ... 7 (Sábado).
 */

public class DiaDaSemana {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Olá, digite um número de 1 a 7:");
		int dia = scan.nextInt();
		
		switch(dia) {
		case 1:
			System.out.println("Domingo");
			break;
			
		case 2:
			System.out.println("Segunda");
			break;
			
		case 3:
			System.out.println("Terça");
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
			System.out.println("Sábado");
			break;
		}
		
		scan.close();
	}
}
