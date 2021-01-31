package aula9.exercicio4;

public class TestaControle {

	public static void main(String[] args) {

		Televisao tv = new Televisao();
		Televisao lg = new Televisao();

		Controle control = new Controle();

		control.setTelevisao(tv);

		control.getTelevisao().aumentarVolume();

		System.out.println("Volume atual: " + tv.aumentarVolume());
		System.out.println("Volume atual: " + tv.aumentarVolume());
		System.out.println("Volume atual: " + tv.aumentarVolume());
		System.out.println("Volume atual: " + tv.aumentarVolume());

		System.out.println("Volume atual: " + tv.diminuirVolume());

		System.out.println("Canal atual: " + tv.aumentarCanal());
		System.out.println("Canal atual: " + tv.aumentarCanal());
		System.out.println("Canal atual: " + tv.aumentarCanal());
		
		System.out.println("Canal atual: " + tv.mudarCanal(23));
		System.out.println("Canal atual: " + tv.diminuirCanal());
		System.out.println("Canal atual: " + tv.diminuirCanal());
		
		System.out.println("Volume atual: " + lg.aumentarVolume());
	}
}
