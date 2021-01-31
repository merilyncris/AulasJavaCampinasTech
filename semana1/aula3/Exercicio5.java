package aula3;

import java.util.Scanner;

public class Exercicio5 {
	/*
	 * Escreva um algoritmo em Java que seja capaz de fazer as seguintes operações
	 * matemática (adição, subtração, multiplicação e divisão). Todas as operações
	 * serão entre dois valores. No começo do algoritmo pergunte ao usuário qual
	 * operação ele deseja fazer e quais são os valores.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero de acordo com a operaçâo que deseja realizar:");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");

		int operacao = scan.nextInt();

		System.out.println("Digite os dois termos da operação:");
		int valorUm = scan.nextInt();
		int valorDois = scan.nextInt();

		switch (operacao) {
		case 1:
			System.out.println("O resultado da adição é: " + (valorUm + valorDois));
			break;

		case 2:
			System.out.println("O resultado da subtração é: " + (valorUm - valorDois));
			break;

		case 3:
			System.out.println("O resultado da multiplicação é: " + (valorUm * valorDois));
			break;

		case 4:
			if (valorDois == 0) {
				System.out.println("Não se pode dividir por 0");
			} else {
				System.out.println("O resultado da divisão é: " + (valorUm / (double) valorDois));
			}
			break;
		}
		scan.close();
	}

}
