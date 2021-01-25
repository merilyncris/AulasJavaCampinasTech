package aula12.composicao.exercicio4;

import java.util.ArrayList;

public class Alunos {

	String nome;
	String matricula;
	int[] notas;
	int media;

	public Alunos() {
		notas = new int[4];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void getNotas() {
		for (int nota : notas) {
			System.out.println(nota);
		}
	}

	public void setNotas(int index, int notas) {
		this.notas[index] = notas;
	}

	
	public int getMedia() {
		return media;
	}
	
	public void setMedia(int media) {
		this.media = media;
	}
	
	public int calculcarMediaIndivudual() {
		int total = 0;

		for (int i = 0; i < 4; i++) {
			total = total + notas[i];
		}
		int media = (total / 4);
		return media;
	}
}
