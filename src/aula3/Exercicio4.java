package aula3;

/*Construa um algoritmo que leia 10 valores inteiros e positivos e:

Encontre o maior valor
Encontre o menor valor
Calcule a média dos números lidos */

import java.util.Scanner;

class Exercicio4 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite dez numeros:");
		System.out.print("-> ");

		// Lê o primeiro numero e inicializa as variaveis com ele
		int primeiro = scan.nextInt();

		int numero = 1;
		int maiorValor = primeiro;
		int menorValor = primeiro;
		int total = primeiro;

		System.out.println("Você inseriu o " + numero + "° número.");
		System.out.println("O maior número é: " + maiorValor + "\n" + "O menor número é: " + menorValor);

		for (int i = 0; i < 9; i++) {
			System.out.print("-> ");
			int restante = scan.nextInt();

			total += restante;

			if (restante < menorValor) {
				menorValor = restante;
			}

			if (restante > maiorValor) {
				maiorValor = restante;
			}

			numero++;

			System.out.println("Você inseriu o " + numero + "° numero.");
			System.out.println("O maior numero é: " + maiorValor + "\n" + "O menor numero é: " + menorValor);

		}

		int media = total / 10;

		System.out.println("A média dos números inseridos foi: " + media);
		
		scan.close();
	}
}
