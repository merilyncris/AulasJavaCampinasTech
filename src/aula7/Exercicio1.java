package aula7;

import java.util.Scanner;

//Escreva um algoritmo que leia numeros insira em um array e ap�s mostre os numeros informados na tela.

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantos n�meros gostaria de inserir no seu array?");
		int quantidadeNumeros = scan.nextInt();

		System.out.println("Digite os n�meros para o seu array");

		int[] arr = new int[quantidadeNumeros];

		for (int indice = 0; indice < quantidadeNumeros; indice++) {
			System.out.print("> ");
			arr[indice] = scan.nextInt();
		}

		System.out.println("Voc� inseriu os seguintes n�meros: ");
		for (int numero : arr) {
			System.out.print(numero + " ");
		}

		scan.close();
	}
}
