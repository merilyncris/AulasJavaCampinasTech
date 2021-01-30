package avaliacao.exercicio1;

import java.util.ArrayList;

/*creva uma classe que represente um país.

Um país é representado através dos atributos: código ISO 3166-1 (ex.: BRA), nome (ex.: Brasil), população (ex.: 193.946.886) e a sua dimensão
 em Km2 (ex.: 8.515.767,049). Além disso, cada país mantém uma lista de outros países com os quais ele faz fronteira.

Escreva a classe e forneça os seus membros a seguir: Construtor que inicialize o código ISO, o nome e a dimensão do país; 
Métodos de acesso (getter/setter) para as propriedades código ISSO, nome, população e dimensão do país;

Um método que permita verificar se dois objetos representam o mesmo país (igualdade semântica). Dois países são iguais se tiverem o mesmo código ISO;

Um método que informe se outro país é limítrofe do país que recebeu a mensagem;

Um método que retorne a densidade populacional do país;

Um método que receba um país como parâmetro e retorne a lista de vizinhos comuns aos dois países. Considere que um país tem no máximo 
40 outros países com os quais ele faz fronteira.
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
	
	public String verificaIgualdade(Pais pais) {
		return this.codigoISO == pais.getCodigoISO() ? "São o mesmo pais" : "São países diferentes";
	}
	
	public String calculaDensidadePopulacional() {
		return "A densidade populacional do país " + this.getNome() + " é " + (this.populacao / this.dimensao);
	}
	
	
	
	public String verificaLimitrofe(Pais pais) {
		int limitrofe = 0;
		
		for(int i = 0; i < fronteiras.size(); i++) {
			if(pais == fronteiras.get(i)) {
				
				System.out.println(" ");
				limitrofe++;
			}
		}		
		
		return limitrofe == 0 ? this.getNome() + " não faz fronteira com " + pais.getNome() : this.getNome() + " faz fronteira com " + pais.getNome();
	}
	
	public void verificaFronteirasComuns(Pais pais) {
		
		ArrayList<Pais> paisesComuns = new ArrayList<>();
		
		for(int i = 0; i < this.fronteiras.size(); i++) {
			for(Pais cadaPais : pais.fronteiras) {
				if(cadaPais == this.fronteiras.get(i)) {
					paisesComuns.add(cadaPais);				}
			}
		}
		
		System.out.println("\nAs fronteira comuns entre " + pais.getNome() + " e " + this.getNome() + " são:");
		for(Pais cadaPaisComum : paisesComuns) {
			System.out.println("- " + cadaPaisComum.getNome());
		}
		
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
		for(int i = 0; i < fronteiras.size(); i++) {
			System.out.println(fronteiras.get(i).getNome());
		}
	}

	public void setFronteiras(Pais fronteira) {
		this.fronteiras.add(fronteira);
		}
		
	
	
}
