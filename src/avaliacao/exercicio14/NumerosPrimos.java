package avaliacao.exercicio14;

import java.util.Scanner;

/*Escreva um programa que receba um número como entrada e diga se ele é primo ou não.*/

public class NumerosPrimos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero e descubra se ele é primo ou não: ");
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
			System.out.println(numero + " é primo");
		} else {
			System.out.println(numero + " não é primo.");
		}
		
		scan.close();
	}
}
