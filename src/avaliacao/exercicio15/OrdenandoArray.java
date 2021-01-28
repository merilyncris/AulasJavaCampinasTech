package avaliacao.exercicio15;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Escreva um programa que dada uma entrada de números separados por ";", por exemplo: (72;56;4;108;12;57), 
 * escreva para o usuário os número de forma ordenada.
String entrada = "72;56;4;108;12;57"; 
// Lembre-se que essa string será dada pelo o usuário. Utilize o Scanner;
// Converter essa string para um array de inteiros;
// Criar um método que ordena um array de inteiros;
// Devolver esse array de inteiros para o usuário dessa forma:
// 4;12;56;57;72;108
 */

public class OrdenandoArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma sequencia de numeros separados por vírgulas (ex: 3;5;6;7):");
		
		String numeros = scan.nextLine();
		ArrayList<Integer> numerosSeparados = new ArrayList<>();
		
		String[] numerosSeparados1 = numeros.split(";");
		
		for(String cada : numerosSeparados1) {
			int numero = Integer.valueOf(cada);
			numerosSeparados.add(numero);
		}
		
		for(int i = 0; i < numerosSeparados.size(); i++) {
			for (int j = numerosSeparados.size() - 1; j > i; j--) {
				if(numerosSeparados.get(i) > numerosSeparados.get(j)) {
					int tmp = numerosSeparados.get(i);
					numerosSeparados.set(i, numerosSeparados.get(j));
					numerosSeparados.set(j, tmp);
				}					
			}
		}
		
		ArrayList<String> numb = new ArrayList<>();
		
		for(int num : numerosSeparados) {
			String numeroString = String.valueOf(num);
			numb.add(numeroString);
		}
		
		String result = String.join(";", numb);

        System.out.println(result);	
    
        scan.close();
	} 
	
}

