package aula12.composicao.exercicio1;

public class TestaPessoa {

	public static void main(String[] args) {
		
	
	Universidade universidade = new Universidade();
	Pessoa pessoa = new Pessoa("Marcio", "15/03/1996");
	
	universidade.setNome("Universidade do Brasil");
	
	pessoa.setUniversidade(universidade);
	
	
	System.out.println(pessoa.getUniversidade().getNome());
	
	}
	
}
