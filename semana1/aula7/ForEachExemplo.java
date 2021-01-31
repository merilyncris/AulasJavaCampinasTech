package aula7;

public class ForEachExemplo {
	public static void main(String[] args) {
		String[] vagas = new String[15];
		String[] clientes = new String[15];

		for (int indiceVagas = 0; indiceVagas < vagas.length; indiceVagas++) {
			vagas[indiceVagas] = "Vaga Setor Laranja - " + (indiceVagas + 1);
		}

		for (int indiceClientes = 0; indiceClientes < clientes.length; indiceClientes++) {
			clientes[indiceClientes] = "Cliente " + (indiceClientes + 1);
		}
		
		for(String cliente : clientes) {
			System.out.println(cliente);
		}
		
	}
}
