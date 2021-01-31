package aula2;

import java.util.Scanner;

public class Exercicio3 {

	//Escreva um algoritmo para ler as dimensões de um retângulo e calcular sua area
	
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Vamos calcular a área de um retângulo.\n");
		
		System.out.println("Por favor digite a base do retângulo:");
		float base = scanner.nextFloat();
		
		System.out.println("Por favor digite a altura do retângulo:");
		float altura = scanner.nextFloat();
		
		float area = base * altura;
		
		System.out.println("A área do retângulo é: " + area);
		
		scanner.close();
		}
}
