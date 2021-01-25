package aula9.exercicio4;

public class TestaControle {

	public static void main(String[] args) {
		
		Televisao tv = new Televisao();
		Televisao lg = new Televisao();
		
		Controle control = new Controle();
		
		control.setTelevisao(tv);
		
		control.getTelevisao().aumentarVolume();
		
		System.out.println(tv.aumentarVolume());
		System.out.println(tv.aumentarVolume());
		System.out.println(tv.aumentarVolume());
		System.out.println(tv.aumentarVolume());


		//tv.controle.aumentaVolume();
		//controle.aumentaVolume();
	//	controle.aumentaVolume();
		
		System.out.println(tv.diminuirVolume());
		
		//controle.proximoCanal();
	System.out.println(tv.mudarCanal(23));
		//controle.canalAnterior();
	System.out.println(lg.aumentarVolume());
	}
}
