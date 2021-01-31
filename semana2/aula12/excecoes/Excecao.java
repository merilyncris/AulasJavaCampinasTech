package aula12.excecoes;

public class Excecao {

	public static void main(String[] args) {
		int[] array = new int[4];
		
		System.out.println("antes da exception");
		
		array[4] = 1;
		
		System.out.println("impresso?");
	}
}
