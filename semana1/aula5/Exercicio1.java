package aula5;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número a ser fatorado: ");
		int numero = scan.nextInt();

		int fatorial = numero;

		if (numero == 0 || numero == 1) {
			System.out.println(1);
		} else {

			while (numero > 1) {
				numero--;
				fatorial = fatorial * numero;
			}
			System.out.println("O resultado da fatoração é: " + fatorial);
		}
		scan.close();
	}
}


