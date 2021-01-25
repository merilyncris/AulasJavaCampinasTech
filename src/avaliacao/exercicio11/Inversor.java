package avaliacao.exercicio11;

import java.util.Scanner;

/*
 * Escreva um algoritmo que inverta o conteúdo de uma String utilizando uma estrutura de repetição. 
 * O usuário irá entrar com o valor de uma string, por exemplo "ASDFG", e o programa deverá devolver o seguinte resultado "GFDSA".
 *  Dicas: Você irá usar os seguinte métodos ou atributos:
 *  String.length;
 *  String.charAt(index); 
 *  
 *  char c='S';  
    String s=String.valueOf(c);
 */
public class Inversor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o deverá ser invertido:");
		String aInverter = scan.nextLine();

		for (int i = aInverter.length() - 1; i >= 0; i--) {
			System.out.print(aInverter.charAt(i));
		}
		scan.close();
	}

}
