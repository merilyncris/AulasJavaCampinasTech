package aula12.exercicio1;

import java.util.ArrayList;

/* Escreva uma classe que represente um pa�s. 
Um pa�s � representado atrav�s dos atributos: c�digo ISO 3166-1 (ex.: BRA), nome (ex.: Brasil), popula��o (ex.: 193.946.886) e a sua dimens�o em Km2 (ex.: 8.515.767,049). Al�m disso, cada pa�s mant�m uma lista de outros pa�ses com os quais ele faz fronteira. 
Escreva a classe e forne�a os seus membros a seguir: ok
Construtor que inicialize o c�digo ISO, o nome e a dimens�o do pa�s; ok
M�todos de acesso (getter/setter) para as propriedades c�digo ISSO, nome, popula��o e dimens�o do pa�s; ok
Um m�todo que permita verificar se dois objetos representam o mesmo pa�s (igualdade sem�ntica). Dois pa�ses s�o iguais se tiverem o mesmo c�digo ISO;
 Um m�todo que informe se outro pa�s � lim�trofe do pa�s que recebeu a mensagem;
Um m�todo que retorne a densidade populacional do pa�s; 
Um m�todo que receba um pa�s como par�metro e retorne a lista de vizinhos comuns aos dois pa�ses. Considere que um pa�s tem no m�ximo 40 outros pa�ses com os quais ele faz fronteira.
totalHabitantes/area
*/

public class Pais {

		ArrayList<Pais> fronteiras;
		private String codigoISO;
		private String nome;
		private double populacao;
		private double dimensao;
	
	public Pais(String codigoISO, String nome, double area, double populacao) {
		this.codigoISO = codigoISO;
		this.nome = nome;
		this.dimensao = area;
		this.populacao = populacao;
		this.fronteiras = new ArrayList<>();
	}
	
	public boolean verificaIgualdade(Pais pais) {
		return this.codigoISO == pais.getCodigoISO();
	}
	
	public double calculaDensidadePopulacional() {
		return this.populacao / this.dimensao;
	}
	
	
	
	public boolean verificaLimitrofe(Pais pais, Pais pais2) {
		return true;
	}

	public String getCodigoISO() {
		return codigoISO;
	}

	public void setCodigoISO(String codigoISO) {
		this.codigoISO = codigoISO;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double area) {
		this.dimensao = area;
	}

	public void getFronteiras() {
		System.out.println(fronteiras);
	}

	public void setFronteiras(Pais fronteira) {
		this.fronteiras.add(fronteira);
		}
		
	
	
}
