package aula3;

/*Construa um algoritmo que leia 10 valores inteiros e positivos e:

Encontre o maior valor
Encontre o menor valor
Calcule a m�dia dos n�meros lidos */

import java.util.Scanner;

class Exercicio4 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite dez numeros:");
		System.out.print("-> ");

		// L� o primeiro numero e inicializa as variaveis com ele
		int primeiro = scan.nextInt();

		int numero = 1;
		int maiorValor = primeiro;
		int menorValor = primeiro;
		int total = primeiro;

		System.out.println("Voc� inseriu o " + numero + "� n�mero.");
		System.out.println("O maior n�mero �: " + maiorValor + "\n" + "O menor n�mero �: " + menorValor);

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

			System.out.println("Voc� inseriu o " + numero + "� numero.");
			System.out.println("O maior numero �: " + maiorValor + "\n" + "O menor numero �: " + menorValor);

		}

		int media = total / 10;

		System.out.println("A m�dia dos n�meros inseridos foi: " + media);
		
		scan.close();
	}
}
