package aula12.composicao.exercicio2;

public class TestaControle {

	public static void main(String[] args) {
		Televisao samsung = new Televisao();
		Televisao lg = new Televisao();
		Controle controle = new Controle();
		
		controle.setTelevisao(samsung);
		
		controle.getTelevisao().aumentarVolume();
		controle.getTelevisao().aumentarVolume();
		controle.getTelevisao().aumentarCanal();
		controle.getTelevisao().aumentarCanal();
		
		System.out.println("Volume da tv samsung: "+ controle.getTelevisao().getVolume());
		System.out.println("Canal da tv samsung: "+ controle.getTelevisao().getCanal());
		
		samsung.aumentarVolume();
		
		System.out.println("Volume da tv samsung: "+ controle.getTelevisao().getVolume());
		System.out.println("Canal da tv samsung: "+ controle.getTelevisao().getCanal());
		
		controle.setTelevisao(lg);
		
		controle.getTelevisao().aumentarVolume();
		controle.getTelevisao().aumentarVolume();
		controle.getTelevisao().aumentarVolume();
		controle.getTelevisao().aumentarCanal();
		controle.getTelevisao().aumentarCanal();
		controle.getTelevisao().aumentarCanal();
		
		System.out.println("Volume da tv samsung: "+ samsung.getVolume());
		System.out.println("Canal da tv samsung: "+ samsung.getCanal());
		System.out.println("Volume da tv lg: "+ controle.getTelevisao().getVolume());
		System.out.println("Canal da tv lg: "+ controle.getTelevisao().getCanal());
	}
}
