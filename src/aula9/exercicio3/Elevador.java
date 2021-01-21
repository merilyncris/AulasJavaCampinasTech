package aula9.exercicio3;

/* Crie uma classe denominada Elevador para armazenar as informa��es de um elevador dentro de um pr�dio. A classe deve armazenar o andar atual 
 * (t�rreo = 0), total de andares no pr�dio (desconsiderando o t�rreo), capacidade do elevador e quantas pessoas est�o presentes nele.
 *  A classe deve tamb�m disponibilizar os seguintes m�todos:

Inicializa : que deve receber como par�metros a capacidade do elevador e o total de andares no pr�dio (os elevadores sempre come�am no t�rreo e vazio); ok
Entra : para acrescentar uma pessoa no elevador (s� deve acrescentar se ainda houver espa�o); ok
Sai : para remover uma pessoa do elevador (s� deve remover se houver algu�m dentro dele); ok
Sobe : para subir um andar (n�o deve subir se j� estiver no �ltimo andar); ok
Desce : para descer um andar (n�o deve descer se j� estiver no t�rreo); ok
Encapsular todos os atributos da classe (criar os m�todos set e get). ok
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

	// met�dos

	void entrar() {
		if (quantidadePessoas < capacidade) {
			quantidadePessoas++;
		} else {
			System.out.println("Vish meu, espera o pr�ximo \n");
		}

		System.out.println("Pessoas no elevador: " + quantidadePessoas);
	}

	void remove() {
		if (quantidadePessoas > 0) {
			quantidadePessoas--;

			System.out.println("Pessoas no elevador: " + quantidadePessoas);
		} else {
			System.out.println("n�o tem mais ninguem");
		}
	}

	void subir() {
		if (andarAtual < totalAndares) {
			andarAtual++;
			System.out.println("Subindo para o andar " + andarAtual);
		} else {
			System.out.println("J� estamos no ultimo andar");
		}
	}

	void descer() {
		if (andarAtual > 0) {
			andarAtual--;
			System.out.println("Descendo para o andar " + andarAtual);
		} else {
			System.out.println("J� estamos no t�rreo");
		}
	}
}
