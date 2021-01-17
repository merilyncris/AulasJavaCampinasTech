package aula3;

import java.util.Scanner;

public class Exercicio1 {
	
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Digite um numero:");
	    int numero = scan.nextInt();

	    boolean par = numero % 2 == 0;

	    if(par) {
	      System.out.println("Seu numero é par");
	    } else if (!par) {
	       System.out.println("Seu numero é impar");
	    }

	    scan.close();
	}
}
