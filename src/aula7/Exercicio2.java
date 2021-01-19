
package aula7;

import java.util.Scanner;

//Escreva um algoritmo que leia numeros, insira em um array e após mostre a quantidade de numeros negativos.Escreva um algoritmo que leia numeros, insira em um array e após mostre a quantidade de numeros negativos.

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Quantos números gostaria de inserir no seu array?");

		int quantidadeNumeros = scan.nextInt();
		int quantidadeNumerosNegativos = 0;

		System.out.println("Digite os números para o seu array");

		int[] arr = new int[quantidadeNumeros];

		for (int indice = 0; indice < quantidadeNumeros; indice++) {
			System.out.print("> ");
			arr[indice] = scan.nextInt();
		}

		for (int numero : arr) {
			if (numero < 0) {
				quantidadeNumerosNegativos += 1;
			}
		}

		System.out.println("Você inseriu " + quantidadeNumerosNegativos + " números negativos");
		scan.close();
	}

}
