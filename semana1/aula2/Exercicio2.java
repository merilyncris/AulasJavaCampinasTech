package aula2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String args[]) {
		System.out.println("Por favor digite um valor inteiro para que digamos qual é o seu antecessor:");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int antecessor = a - 1;
		System.out.println("O antecessor de " + a + " é: " + antecessor);
		in.close();
	}
}
