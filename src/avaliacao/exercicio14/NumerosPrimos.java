package avaliacao.exercicio14;

import java.util.Scanner;

/*Escreva um programa que receba um n�mero como entrada e diga se ele � primo ou n�o.*/

public class NumerosPrimos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero e descubra se ele � primo ou n�o: ");
		int numero = scan.nextInt();
		
		boolean primo = false;
		int contador = 0;
		
		for(int i = 1; i < numero; i ++) {
			if(numero % i == 0) {
				contador++;
				
			}
		}
		
		if(contador == 1) {
		primo = true;
		}
		
		if(primo) {
			System.out.println(numero + " � primo");
		} else {
			System.out.println(numero + " n�o � primo.");
		}
		
		scan.close();
	}
}
