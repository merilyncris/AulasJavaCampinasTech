package aula3;

import java.util.Scanner;

public class Exercicio6 {

	/*
	 * Faça a implementação do Jogo Pedra, Papel e Tesoura (Jokempô). O algoritmo
	 * deverá perguntar qual é a escolha do jogador 1 (Pedra [pe], Papel [pa],
	 * Tesoura [t]) e deverá fazer o mesmo para o jogador 2. No final da execução o
	 * algoritmo deverá dizer qual é o jogador vencedor ou se houve empate.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Jogador 1, é a sua vez. Selecione um numero de acordo com sua jogada:");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		int jogadorUm = scan.nextInt();

		System.out.println("Jogador 2, é a sua vez. Selecione um numero de acordo com sua jogada:");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		int jogadorDois = scan.nextInt();

		if (jogadorUm == jogadorDois) {
			System.out.println("EMPATE");
		} else if (jogadorUm == 1 && jogadorDois == 2) {
			System.out.println("JOGADOR 2 VENCEU");
		} else if (jogadorUm == 2 && jogadorDois == 3) {
			System.out.println("JOGADOR 2 VENCEU");
		} else if (jogadorUm == 3 && jogadorDois == 1) {
			System.out.println("JOGADOR 2 VENCEU");
		} else if (jogadorUm == 2 && jogadorDois == 1) {
			System.out.println("JOGADOR 1 VENCEU");
		} else if (jogadorUm == 3 && jogadorDois == 2) {
			System.out.println("JOGADOR 1 VENCEU");
		} else if (jogadorUm == 1 && jogadorDois == 3) {
			System.out.println("JOGADOR 1 VENCEU");
		}
		scan.close();
	}
}
