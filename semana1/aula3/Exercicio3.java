package aula3;

import java.util.Scanner;

/*Escreva um algoritmo em Java que leia dois n�meros inteiros e determine qual � o menor. Escreva um algoritmo que determina o maior tamb�m.*/

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite dois n�meros inteiros:");
		int numero = scan.nextInt();
		int numeroSegundo = scan.nextInt();

		int maior = 0;
		int menor = 0;
		boolean igual = numero == numeroSegundo;

		if (igual) {
			System.out.println("Os n�meros s�o iguais");
		}
		if (!igual) {
			if (numero < numeroSegundo) {
				maior = numeroSegundo;
				menor = numero;
			} else {
				maior = numero;
				menor = numeroSegundo;
			}
			System.out.println("O maior n�mero � " + maior + " e o menor n�mero � " + menor);

		}

		scan.close();
	}
}
