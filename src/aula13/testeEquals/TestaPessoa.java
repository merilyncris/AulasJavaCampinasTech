package aula13.testeEquals;

public class TestaPessoa {

	public static void main(String[] args) {
		 Pessoa pessoa = new Pessoa();
		 Pessoa pessoa1 = new Pessoa();
		 
		 pessoa.nome = "ana";
		 pessoa.idade = 19;
		 
		 pessoa1 = pessoa;
		 
		 System.out.println(pessoa1.equals(pessoa));
	}
}
