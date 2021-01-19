package aula7;

//Aula de array e arrayList

public class EstacionamentoExemplo {

	public static void main(String[] args) {
		// Sistema de estacionamento com 15 vagas
		
		String[] vagas = new String[5];
		String[] clientes = new String[5];
		
		vagas[0] = "Vaga Setor Laranja - 01";
		vagas[1] = "Vaga Setor Laranja - 02";
		vagas[2] = "Vaga Setor Laranja - 03";
		vagas[3] = "Vaga Setor Laranja - 04";
		vagas[4] = "Vaga Setor Laranja - 05";
		
		clientes[0] = "Jose";
		clientes[1] = "Maria";
		clientes[2] = "Ronaldo";
		clientes[3] = "Tereza";
		clientes[4] = "Valeria";
		
		System.out.println("O cliente " + clientes[0] + " esta em " + vagas[4]);
		System.out.println("O cliente " + clientes[1] + " esta em " + vagas[2]);
		System.out.println("O cliente " + clientes[2] + " esta em " + vagas[0]);
		System.out.println("O cliente " + clientes[3] + " esta em " + vagas[1]);
		System.out.println("O cliente " + clientes[4] + " esta em " + vagas[3]);

	}
}
