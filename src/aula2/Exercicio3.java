package aula2;

import java.util.Scanner;

public class Exercicio3 {

	//Escreva um algoritmo para ler as dimens�es de um ret�ngulo e calcular sua area
	
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Vamos calcular a �rea de um ret�ngulo.\n");
		
		System.out.println("Por favor digite a base do ret�ngulo:");
		float base = scanner.nextFloat();
		
		System.out.println("Por favor digite a altura do ret�ngulo:");
		float altura = scanner.nextFloat();
		
		float area = base * altura;
		
		System.out.println("A �rea do ret�ngulo �: " + area);
		
		scanner.close();
		}
}
