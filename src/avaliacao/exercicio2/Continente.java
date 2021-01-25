package avaliacao.exercicio2;

import java.util.ArrayList;

/* Escreva uma classe Continente.

Um continente possui um nome e � composto por um conjunto de pa�ses. ok
Forne�a os membros de classe a seguir:
Construtor que inicialize o nome do continente; ok
Um m�todo que permita adicionar pa�ses aos continentes; ok
Um m�todo que retorne a dimens�o total do continente; ok
Um m�todo que retorne a popula��o total do continente; ok
Um m�todo que retorne a densidade populacional do continente; ok
Um m�todo que retorne o pa�s com maior popula��o no continente; ok
Um m�todo que retorne o pa�s com menor popula��o no continente; ok
Um m�todo que retorne o pa�s de maior dimens�o territorial no * continente; ok
Um m�todo que retorne o pa�s de menor dimens� o territorial no * continente; ok
Um m�todo que retorne a raz�o territorial do maior pais em rela��o ao menor pa�s.
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
		System.out.println("Os pa�ses do continente " + this.getNome() + " s�o: \n");
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
				System.out.println(paises.get(i).getNome() + " tem a maior popolu��o, " + maiorPopulacao);
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
				System.out.println(paises.get(i).getNome() + " tem a menor popolu��o, " + menorPopulacao);
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
		System.out.println("A raz�o territorial � " + razao);
		return razao;
	}
}
