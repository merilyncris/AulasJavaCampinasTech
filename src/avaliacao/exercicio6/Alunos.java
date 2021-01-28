package avaliacao.exercicio6;


public class Alunos {

	private String nome;
	private String matricula;
	private int[] notas;
	private int media;
	boolean aprovado = true;

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

	public void setNotas(int nota1, int nota2, int nota3, int nota4) {
		this.notas[0] = nota1;
		this.notas[1] = nota2;
		this.notas[2] = nota3;
		this.notas[3] = nota4;
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
		this.media = (total / 4);
			
		System.out.println("A média de " + this.getNome() + " é: " + media);
		return media;
	}
	
	public String verificarAprovado() {
		if (this.media < 7) {
			aprovado = false;
		}
		
		return this.aprovado ? this.getNome() + " está APROVAD@" : this.getNome() + " está REPROVAD@";
	}

}
