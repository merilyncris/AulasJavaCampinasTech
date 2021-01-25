package aula9.exemplos;

public class Agenda {

	Pessoa[] pessoas;
	
	Agenda() {
		this.pessoas = new Pessoa[10];
	}
	
	void armazenaPessoa(Pessoa pessoa) {
		for (int i = 0; i < pessoas.length; i++) {
			if(this.pessoas[i] == null){
				this.pessoas[i] = pessoa;
				break;
			}
		}
	}
	
	void imprimeAgenda() {
		for(int indiceAgenda = 0; indiceAgenda < 10; indiceAgenda++) {
			System.out.println(this.pessoas[indiceAgenda]);
			}
		
	}
	
	
}
