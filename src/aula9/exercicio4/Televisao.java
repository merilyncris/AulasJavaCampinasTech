package aula9.exercicio4;

/* Crie uma classe Televisão e uma classe ControleRemoto que pode controlar o volume e trocar os canais da televisão. O controle de volume permite:

aumentar ou diminuir a potência do volume de som em uma unidade de cada vez; ok
aumentar e diminuir o número do canal em uma unidade ok
trocar para um canal indicado;
consultar o valor do volume de som e o canal selecionado.
*/

public class Televisao{
	
	private int volume;
	private int canal;
		
	public Televisao() {
	
	}


	public int getVolume() {
		return volume;
	}



	public int getCanal() {
		return canal;
	}


	public int aumentarVolume() {
		this.volume = this.volume + 1;
		return this.volume;
	}
	
	public int diminuirVolume() {
		this.volume = this.volume - 1;
		return this.volume;
	}
	
	public int aumentarCanal() {
		return this.canal = this.canal + 1;
	}
	
	public int diminuirCanal() {
		return this.canal = this.canal+ 1;
	}
	
	public int mudarCanal(int canal) {
		return this.canal = canal;
	}
	
	
}


