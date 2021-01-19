package aula7;

public class PercorreArrayExemplo {
	// Sistema de estacionamento com 15 vagas
	public static void main(String[] args) {

		String[] vagas = new String[15];
		String[] clientes = new String[15];

		for (int indiceVagas = 0; indiceVagas < vagas.length; indiceVagas++) {
			vagas[indiceVagas] = "Vaga Setor Laranja - " + (indiceVagas + 1);
		}

		for (int indiceClientes = 0; indiceClientes < clientes.length; indiceClientes++) {
			clientes[indiceClientes] = "Cliente " + (indiceClientes + 1);
		}

		for (int indice = 0; indice < clientes.length; indice++) {
			System.out.println("O cliente " + clientes[indice] + " esta na " + vagas[indice]);
		}
	}
}
