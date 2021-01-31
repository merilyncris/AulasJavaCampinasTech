package aula17.exemploPolimorfismo1;

import java.util.Scanner;

public class SistemaInterno {

	public void login(Autenticavel autenticavel) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite seu usuario: " );
		String usuario = scanner.nextLine();
		System.out.print("Digite sua senha: " );
		int senha = scanner.nextInt();
		
		boolean ok =autenticavel.autentica(usuario, senha);
		
		if (ok) {
			System.out.println("Voce pode entrar no sistema");
		} else {
			System.out.println("Voce não pode entrar no sistema");
		}
		
		scanner.close();
	}
}
