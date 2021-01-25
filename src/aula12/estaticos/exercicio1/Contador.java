package aula12.estaticos.exercicio1;

//zerar, incrementar e retornar o valor

public class Contador {

	public static int contador;
	
	Contador() {
		Contador.contador++;
	}
	
	public int zerar() {
		return Contador.contador = 0;
	}
	
	public int incrementar() {
		return Contador.contador++;
	}
	
	public static int getContador() {
		return contador;
	}
	
}
