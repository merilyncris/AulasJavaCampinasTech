package avaliacao.exercicio6;

import java.util.ArrayList;

/*
Escreva uma classe Curso

Que possui nome e hor�rio. ok
Cada curso tem Professor ok
Professor possui nome, departamento e email. ok
Cada Curso tamb�m pode ter v�rios alunos(tipo Aluno). ok
Cada aluno tem nome, matricula e 4 notas.
Crie m�todos para calcular a media final do aluno. ok
Crie m�todo para verificar se o aluno est� aprovador(media maior ou igual a 7). OK
Crie um metodo para calcular a media da turma ok
*/

public class Curso {

	String nome;
	String horario;
	Professor professor;
	ArrayList<Alunos> alunos = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public void getAlunos() {
		System.out.println("Os alunos do curso de " + this.getNome() + " s�o: ");
		for (int i = 0; i < alunos.size(); i++) {
			System.out.println(alunos.get(i).getNome());
		}
	}

	public void adicionarAluno(Alunos aluno) {
		alunos.add(aluno);
	}

	public int calculaMediaAlunos() {
		int mediaTotal = 0;
		for (int i = 0; i < alunos.size(); i++) {
			mediaTotal = mediaTotal + alunos.get(i).calculcarMediaIndivudual();
		}

		int mediaFinal = mediaTotal / alunos.size();

		System.out.println("A m�dia dos alunos da turma de " + this.getNome() + " �: " + mediaFinal);

		return mediaFinal;

	}

}
