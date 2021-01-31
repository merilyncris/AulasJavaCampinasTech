package aula3;

import java.util.Scanner;

/*Escreva um algoritmo em Java que leia dois números inteiros e determine qual é o menor. Escreva um algoritmo que determina o maior também.*/

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite dois números inteiros:");
		int numero = scan.nextInt();
		int numeroSegundo = scan.nextInt();

		int maior = 0;
		int menor = 0;
		boolean igual = numero == numeroSegundo;

		if (igual) {
			System.out.println("Os números são iguais");
		}
		if (!igual) {
			if (numero < numeroSegundo) {
				maior = numeroSegundo;
				menor = numero;
			} else {
				maior = numero;
				menor = numeroSegundo;
			}
			System.out.println("O maior número é " + maior + " e o menor número é " + menor);

		}

		scan.close();
	}
}
