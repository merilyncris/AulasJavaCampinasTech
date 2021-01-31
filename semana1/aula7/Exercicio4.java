package aula7;

import java.util.Scanner;

//Escreva um algoritmo que leia numeros, insira em um array e após mostre o maior valor.

public class Exercicio4 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Quantos números gostaria de inserir no seu array?");

		int quantidadeNumeros = scan.nextInt();
		int maiorNumero = Integer.MIN_VALUE;

		System.out.println("Digite os números para o seu array");

		int[] arr = new int[quantidadeNumeros];

		for (int indice = 0; indice < quantidadeNumeros; indice++) {
			System.out.print("> ");
			arr[indice] = scan.nextInt();
		}

		for (int numero : arr) {
			if (numero > maiorNumero) {
				maiorNumero = numero;
			}
		}

		System.out.println("O maior número escolhido por você foi: " + maiorNumero);
		scan.close();
	}
}
