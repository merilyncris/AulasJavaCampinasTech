package aula3;

import java.util.Scanner;

public class Exercicio5 {
	/*
	 * Escreva um algoritmo em Java que seja capaz de fazer as seguintes opera��es
	 * matem�tica (adi��o, subtra��o, multiplica��o e divis�o). Todas as opera��es
	 * ser�o entre dois valores. No come�o do algoritmo pergunte ao usu�rio qual
	 * opera��o ele deseja fazer e quais s�o os valores.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero de acordo com a opera��o que deseja realizar:");
		System.out.println("1 - Adi��o");
		System.out.println("2 - Subtra��o");
		System.out.println("3 - Multiplica��o");
		System.out.println("4 - Divis�o");

		int operacao = scan.nextInt();

		System.out.println("Digite os dois termos da opera��o:");
		int valorUm = scan.nextInt();
		int valorDois = scan.nextInt();

		switch (operacao) {
		case 1:
			System.out.println("O resultado da adi��o �: " + (valorUm + valorDois));
			break;

		case 2:
			System.out.println("O resultado da subtra��o �: " + (valorUm - valorDois));
			break;

		case 3:
			System.out.println("O resultado da multiplica��o �: " + (valorUm * valorDois));
			break;

		case 4:
			if (valorDois == 0) {
				System.out.println("N�o se pode dividir por 0");
			} else {
				System.out.println("O resultado da divis�o �: " + (valorUm / (double) valorDois));
			}
			break;
		}
		scan.close();
	}

}
