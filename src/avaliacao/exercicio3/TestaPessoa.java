package avaliacao.exercicio3;

public class TestaPessoa {

	public static void main(String[] args) {
		
	Universidade universidade = new Universidade();
	Universidade universidade2 = new Universidade();
	
	Pessoa pessoa = new Pessoa("Marcio", "15/03/1996");
	Pessoa pessoa2 = new Pessoa("Antonia", "07/11/2000");
	
	universidade.setNome("Universidade do Brasil");
	universidade2.setNome("Universidade do Paraguay");
	
	pessoa.setUniversidade(universidade);
	pessoa2.setUniversidade(universidade2);
	
	pessoa.dadosDaPessoa();
	pessoa2.dadosDaPessoa();
	System.out.println(pessoa.getUniversidade().getNome());
	
	}
	
}
