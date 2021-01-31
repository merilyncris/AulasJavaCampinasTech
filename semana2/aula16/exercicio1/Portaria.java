package aula16.exercicio1;

import java.util.Scanner;

public class Portaria {

		public void liberaEntrada(Autorizavel autorizavel) {
			Scanner scanner = new Scanner(System.in);
		
			System.out.print("Digite sua senha: " );
			int senha = scanner.nextInt();
			
			boolean ok = autorizavel.autoriza(senha);
			
			if (ok) {
				System.out.println("Voce pode entrar");
			} else {
				System.out.println("Voce não pode entrar");
			}
			
		}
	}
	

