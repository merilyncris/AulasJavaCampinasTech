package aula2;

//Escreva um algoritmo para ler o n�mero total de eleitores de um munic�pio, o n�mero de votos brancos, nulos e v�lidos. Calcular e escrever o percentual que cada um representa em rela��o ao total de eleitores..
import java.util.Scanner;

public class Exercicio4 {

	public static double calculaPercentualX(double tDeElei, double totalX) {

		double percentual = totalX * 100 / tDeElei;
		return percentual;

	}

	public static void main(String args[]) {
		// Escreva um algoritmo para ler o n�mero total de eleitores de um munic�pio, o
		// n�mero de votos brancos, nulos e v�lidos. Calcular e escrever o percentual
		// que cada um representa em rela��o ao total de eleitores..

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o total de votos");
		int totalVotos = scanner.nextInt();
		System.out.println("Digite o total de votos em branco");
		int totalVotosBrancos = scanner.nextInt();
		System.out.println("Digite o total de votos nulos");
		int totalVotosNulos = scanner.nextInt();
		System.out.println("Digite o total de votos validos");
		int totalVotosValidos = scanner.nextInt();

		System.out.println("A quantidade total de votos �: " + totalVotos);

		System.out.println("A quantidade total de votos em branco �: " + totalVotosBrancos);

		System.out.println("A quantidade total de votos nulos �: " + totalVotosNulos);

		System.out.println("A quantidade total de votos validos �: " + totalVotosValidos);

		double percentualVotosBrancos = Exercicio4.calculaPercentualX(totalVotos, totalVotosBrancos);

		double percentualVotosNulos = Exercicio4.calculaPercentualX(totalVotos, totalVotosNulos);

		double percentualVotosValidos = Exercicio4.calculaPercentualX(totalVotos, totalVotosValidos);

		System.out.println("-----------");

		System.out.println("O percentual total de votos em branco �: " + String.format("%.2f", percentualVotosBrancos));

		System.out.println("O percentual total de votos nulos �: " + String.format("%.2f", percentualVotosNulos));

		System.out.println("O percentual total de votos validos �: " + String.format("%.2f", percentualVotosValidos));

		scanner.close();

	}

}
