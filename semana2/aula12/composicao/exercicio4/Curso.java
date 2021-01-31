package aula12.composicao.exercicio4;

import java.util.ArrayList;

/* Escreva uma classe para representar um curso, que tem nome e horario. ok
 * Cada curso tem um professor, que possui nome, departamento e email. ok
 * Cada Curso também pode ter vários alunos(tipo Aluno). ok
 * Cada Aluno tem nome, matricula, e 4 notas. ok
 * Escreva um programa teste que crie um curso com 5 alunos, e que
 * peça para o usuario entrar com as quatro notas de cada aluno.
 * Ao final, imprima a média de cada aluno, se o mesmo está aprovado(media maior ou igual 7)
 * e qual é a media da turma.
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
		for (int i = 0; i < alunos.size(); i++) {
			System.out.println(alunos.get(i).getNome());
		}
	}
	
	
	public void adicionarAluno(Alunos aluno) {
		alunos.add(aluno);
	}
	
	public int calculaMediaAlunos() {
		int mediaTotal= 0;
		for(int i = 0; i < alunos.size(); i++) {
			mediaTotal = mediaTotal + alunos.get(i).calculcarMediaIndivudual();
		}
		
		int mediaFinal = mediaTotal / 5;
		return mediaFinal;
	}
	
}
