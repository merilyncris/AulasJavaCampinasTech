package avaliacao.exercicio11;

import java.util.Scanner;

/*
 * Escreva um algoritmo que inverta o conte�do de uma String utilizando uma estrutura de repeti��o. 
 * O usu�rio ir� entrar com o valor de uma string, por exemplo "ASDFG", e o programa dever� devolver o seguinte resultado "GFDSA".
 *  Dicas: Voc� ir� usar os seguinte m�todos ou atributos:
 *  String.length;
 *  String.charAt(index); 
 *  
 *  char c='S';  
    String s=String.valueOf(c);
 */
public class Inversor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o dever� ser invertido:");
		String aInverter = scan.nextLine();

		for (int i = aInverter.length() - 1; i >= 0; i--) {
			System.out.print(aInverter.charAt(i));
		}
		scan.close();
	}

}
