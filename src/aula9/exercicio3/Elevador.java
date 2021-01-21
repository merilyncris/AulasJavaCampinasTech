package aula9.exercicio3;

/* Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio. A classe deve armazenar o andar atual 
 * (térreo = 0), total de andares no prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão presentes nele.
 *  A classe deve também disponibilizar os seguintes métodos:

Inicializa : que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio); ok
Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço); ok
Sai : para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele); ok
Sobe : para subir um andar (não deve subir se já estiver no último andar); ok
Desce : para descer um andar (não deve descer se já estiver no térreo); ok
Encapsular todos os atributos da classe (criar os métodos set e get). ok
*/

public class Elevador {

	private int andarAtual;
	private int totalAndares;
	private int capacidade;
	private int quantidadePessoas;

	// construtor

	public Elevador(int totalAndares, int capacidade) {
		this.totalAndares = totalAndares;
		this.capacidade = capacidade;
	}

	// getters e setters

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public int getQuantidadePessoas() {
		return quantidadePessoas;
	}

	public void setQuantidadePessoas(int quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}

	// metódos

	void entrar() {
		if (quantidadePessoas < capacidade) {
			quantidadePessoas++;
		} else {
			System.out.println("Vish meu, espera o próximo \n");
		}

		System.out.println("Pessoas no elevador: " + quantidadePessoas);
	}

	void remove() {
		if (quantidadePessoas > 0) {
			quantidadePessoas--;

			System.out.println("Pessoas no elevador: " + quantidadePessoas);
		} else {
			System.out.println("não tem mais ninguem");
		}
	}

	void subir() {
		if (andarAtual < totalAndares) {
			andarAtual++;
			System.out.println("Subindo para o andar " + andarAtual);
		} else {
			System.out.println("Já estamos no ultimo andar");
		}
	}

	void descer() {
		if (andarAtual > 0) {
			andarAtual--;
			System.out.println("Descendo para o andar " + andarAtual);
		} else {
			System.out.println("Já estamos no térreo");
		}
	}
}
