package avaliacao.exercicio2;

import java.util.ArrayList;

/* Escreva uma classe Continente.

Um continente possui um nome e é composto por um conjunto de países. ok
Forneça os membros de classe a seguir:
Construtor que inicialize o nome do continente; ok
Um método que permita adicionar países aos continentes; ok
Um método que retorne a dimensão total do continente; ok
Um método que retorne a população total do continente; ok
Um método que retorne a densidade populacional do continente; ok
Um método que retorne o país com maior população no continente; ok
Um método que retorne o país com menor população no continente; ok
Um método que retorne o país de maior dimensão territorial no * continente; ok
Um método que retorne o país de menor dimensã o territorial no * continente; ok
Um método que retorne a razão territorial do maior pais em relação ao menor país.
*/

public class Continente {

	private String nome;
	ArrayList<Pais> paises;

	Continente(String nome) {
		this.nome = nome;
		this.paises = new ArrayList<>();
	}

	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public void getPaises() {
		System.out.println("Os países do continente " + this.getNome() + " são: \n");
		for(Pais cadaPais : paises) {
			System.out.println( "- " + cadaPais.getNome());
		}
	}

	public void setPaises(Pais pais) {
		this.paises.add(pais);
	}

	public long dimensaoContinente() {
		long dimensaoTotal = 0;

		for (Pais cadaPais : paises) {
			dimensaoTotal = (long) (dimensaoTotal + cadaPais.getDimensao());
		}
		return dimensaoTotal;
	}

	public long populacaoTotal() {
		long populacaoTotal = 0;

		for (Pais cadaPais : paises) {
			populacaoTotal = (long) (populacaoTotal + cadaPais.getPopulacao());
		}

		return populacaoTotal;
	}

	public double densidadeDemografica() {
		return this.populacaoTotal() / this.dimensaoContinente();
	}

	public long maiorPopulacao() {
		long maiorPopulacao = 0;

		for (Pais cadaPais : paises) {
			if (cadaPais.getPopulacao() > maiorPopulacao) {
				maiorPopulacao = cadaPais.getPopulacao();
			}
		}

		for (int i = 0; i < paises.size(); i++) {
			if (paises.get(i).getPopulacao() == maiorPopulacao) {
				System.out.println(paises.get(i).getNome() + " tem a maior popolução, " + maiorPopulacao);
			}
		}
		return maiorPopulacao;
	}

	public long menorPopulacao() {
		long menorPopulacao = Integer.MAX_VALUE;

		for (Pais cadaPais : paises) {
			if (cadaPais.getPopulacao() < menorPopulacao) {
				menorPopulacao = cadaPais.getPopulacao();
			}
		}

		for (int i = 0; i < paises.size(); i++) {
			if (paises.get(i).getPopulacao() == menorPopulacao) {
				System.out.println(paises.get(i).getNome() + " tem a menor popolução, " + menorPopulacao);
			}
		}
		return menorPopulacao;
	}

	public double maiorDimensao() {
		double maiorDimensao = Integer.MIN_VALUE;

		for (Pais cadaPais : paises) {
			if (cadaPais.getDimensao() > maiorDimensao) {
				maiorDimensao = cadaPais.getDimensao();
			}
		}

		for (int i = 0; i < paises.size(); i++) {
			if (paises.get(i).getDimensao() == maiorDimensao) {
				System.out.println(paises.get(i).getNome() + " tem a maior dimensao, " + maiorDimensao);
			}
		}
		return maiorDimensao;
	}

	public double menorDimensao() {
		double menorDimensao = Integer.MAX_VALUE;

		for (Pais cadaPais : paises) {
			if (cadaPais.getDimensao() < menorDimensao) {
				menorDimensao = cadaPais.getDimensao();
			}
		}

		for (int i = 0; i < paises.size(); i++) {
			if (paises.get(i).getDimensao() == menorDimensao) {
				System.out.println(paises.get(i).getNome() + " tem a menor dimensao, " + menorDimensao);
			}
		}
		return menorDimensao;
	}
	
	public double razaoTerritorialMaiorPeloMenor() {
		double razao = this.maiorDimensao() / this.menorDimensao();
		System.out.println("A razão territorial é " + razao);
		return razao;
	}
}
