package aula7;

import java.util.Scanner;

//Escreva um algoritmo que leia numeros, insira em um array e ap�s mostre a quantidade de numeros pares.

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Quantos n�meros gostaria de inserir no seu array?");

		int quantidadeNumeros = scan.nextInt();
		int quantidadeNumerosPares = 0;

		System.out.println("Digite os n�meros para o seu array");

		int[] arr = new int[quantidadeNumeros];

		for (int indice = 0; indice < quantidadeNumeros; indice++) {
			System.out.print("> ");
			arr[indice] = scan.nextInt();
		}

		for (int numero : arr) {
			if (numero % 2 == 0) {
				quantidadeNumerosPares += 1;
			}
		}

		System.out.println("Voc� inseriu " + quantidadeNumerosPares + " n�meros pares");
		scan.close();
	}
}
