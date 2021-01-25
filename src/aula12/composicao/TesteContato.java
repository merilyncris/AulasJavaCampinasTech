package aula12.composicao;

public class TesteContato {

	public static void main(String[] args) {
		Contato contato1 = new Contato();
		Endereco enderecoContato1 = new Endereco();
		enderecoContato1.setCep("0050-600");
		enderecoContato1.setCidade("Biscoito");
		enderecoContato1.setEstado("Padaria");
		enderecoContato1.setRua("Rua Imaginaria");
		enderecoContato1.setNumero("271");
		
	// ----------------->
		//----------------->
		contato1.setEndereco(enderecoContato1);
		
		Telefone tefoneContato1 = new Telefone();
		tefoneContato1.setDdd("11");
		tefoneContato1.setNumero("9878-6534");
		tefoneContato1.setTipo("celular");
		
		contato1.setTelefone(tefoneContato1);
		
		//contato1.setEndereco("Rua imaginaria, 27, 0030-700");
		contato1.setNome("Chico");
	//	contato1.setTelefone("555-8989");
		
		Contato contato2 = new Contato();
		Endereco enderecoContato2 = new Endereco();
		enderecoContato2.setCep("0050-600");
		enderecoContato2.setCidade("Sonho");
		enderecoContato2.setEstado("Pudim");
		enderecoContato2.setRua("Rua Imaginaria Combinada");
		enderecoContato2.setNumero("56");
		
		contato2.setEndereco(enderecoContato2);
		
		Telefone tefoneContato2 = new Telefone();
		tefoneContato2.setDdd("43");
		tefoneContato2.setNumero("9857-9999");
		tefoneContato2.setTipo("comercial");
		
		contato2.setTelefone(tefoneContato2);
		
	//	contato2.setEndereco("Rua imaginaria, 345, 0050-600");
		contato2.setNome("Camila");
		//contato2.setTelefone("555-2367");
		
		System.out.println("Informações do contato " + contato1.getNome());
		System.out.println("Endereço " + contato1.getEndereco().getCep());
		System.out.println("Telefone " + contato1.getTelefone().getNumero());

		System.out.println("Informações do contato " + contato2.getNome());
		System.out.println("Endereço " + contato2.getEndereco().getCep());
		System.out.println("Telefone " + contato2.getTelefone().getNumero());

		
		
		
	
	}
}
