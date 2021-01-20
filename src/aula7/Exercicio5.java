package aula7;

import java.util.Scanner;
import java.util.Arrays;

//Escreva um algoritmo que simula um jogo da forca simples. o usuario precisara adivinhar uma palavra chutando cada letra em no máximo 10 chutes, caso o usuario acerte a 
//letra o jogo dira que ele acertou, caso tenha errado, o numero de tentativas vai dimimuindo. Caso o numero de tentativas chegue a 0 o usuário perde.

public class Exercicio5 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] palavra = { "p", "r", "e", "g", "o" };
		String[] palavraUsuario = new String[5];

		System.out.println(
				"O objetivo do jogo é adivinhar a palavra mistériosa de cinco letras, você deve chutar um letra por vez, e tem dez tentativas. Boa sorte!");

		for (int tentativas = 0; tentativas < 10; tentativas++) {
			String letra = scan.next();
			for (int i = 0; i < palavra.length; i++) {
				boolean contem = letra.equals(palavra[i]);

				if (contem) {
					palavraUsuario[i] = palavra[i];
					System.out.println("Essa letra tem, na posição " + (i + 1));
					System.out.println(palavraUsuario[i]);
				}

				if (Arrays.equals(palavraUsuario, palavra)) {
					System.out.print("Massa ein, acertou a palavra: ");

					for (String letras : palavra) {
						System.out.print(letras);
					}
					System.exit(0);
				}

			}

		}
		System.out.println("Vish, acabaram suas tentativas");
		scan.close();
	}
}
