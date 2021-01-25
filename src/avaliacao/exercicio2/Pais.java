package avaliacao.exercicio2;

import java.util.ArrayList;

public class Pais {

		ArrayList<Pais> fronteiras;
		private String codigoISO;
		private String nome;
		private long populacao;
		private double dimensao;
	
	public Pais(String codigoISO, String nome, double area, long populacao) {
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
		
		Pais paisMaisFronteiras = pais;
		Pais paisMenosFronteiras = pais;
		
		if(pais.fronteiras.size() < this.fronteiras.size()) {
			paisMaisFronteiras = this;
		} else if (pais.fronteiras.size() > this.fronteiras.size()) {
			paisMenosFronteiras = this;
		}
		
		for(int i = 0; i < paisMaisFronteiras.fronteiras.size(); i++) {
			for(Pais cadaPais : paisMenosFronteiras.fronteiras) {
				if(cadaPais == paisMaisFronteiras.fronteiras.get(i)) {
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

	public long getPopulacao() {
		return populacao;
	}

	public void setPopulacao(long populacao) {
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
