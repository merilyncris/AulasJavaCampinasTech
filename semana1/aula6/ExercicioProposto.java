package aula6;

import java.util.Scanner;

public class ExercicioProposto {

	// Fa�a um algoritmo que leia uma string e imprima ela de tr�s para frente
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma palavra para ser invertida:");
		String str = scan.nextLine();

		for (int i = (str.length() - 1); i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		scan.close();
	}
}
