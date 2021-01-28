package avaliacao.exercicio7;

public class TesteException {

	public static void main(String[] args) {
        System.out.println("Inicio do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Inicio do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Inicio do metodo2");
        int[] array = new int[10];
        try {
        for(int i = 1; i <= 15; i++) {
        	array[i] = i;
            System.out.println(i);
        }} catch (ArrayIndexOutOfBoundsException ex) {
        System.out.println(ex.getMessage());
        System.out.println("Exceção ArrayIndexOutOfBoundsException encontrada");
        }
        System.out.println("Fim do metodo2");
    }
}
