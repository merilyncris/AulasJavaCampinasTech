package aula12.excecoes;

public class ExcecaoTratada {

	public static void main(String[] args) {
		int[] array = new int[4];
		
		System.out.println("antes da exception");
		
		try {
		array[4] = 1;
		} catch (IndexOutOfBoundsException e) {
			System.out.println("capturei");
			System.out.println("meu erro: "+ e.getMessage());
			System.out.println("mais isso: ");
			e.printStackTrace();
		}
		System.out.println("impresso? pós tratado");
	}
}
