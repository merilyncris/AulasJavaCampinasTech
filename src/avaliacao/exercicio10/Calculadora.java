package avaliacao.exercicio10;

public class Calculadora {

	public static int adicionar(int a, int b) {
		return a + b;
	}

	public static int subtrair(int a, int b) {
		return a - b;
	}

	public static int multiplicar(int a, int b) {
		return a * b;
	}

	public static void dividir(int a, int b) {
		if (b == 0) {
			System.out.println("N�o � poss�vel dividir por zero");
		} else {
			System.out.println("O resultado da divis�o � " + a / b);
		}
	}

	public static int fatorar(int a) {

		int fatorial = 1;
		for (int i = a; i > 1; i--) {
			fatorial = fatorial * i;
		}
		return fatorial;
	}

	public static int elevarPotencia(int base, int expoente) {
		return (int) Math.pow(base, expoente);
	}

}
