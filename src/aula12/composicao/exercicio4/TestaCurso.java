package aula12.composicao.exercicio4;

import java.util.Arrays;
import java.util.Scanner;

public class TestaCurso {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Curso curso = new Curso();
		Professor professor = new Professor();

		curso.setNome("Biologia");
		professor.setNome("Ronaldo");
		curso.setProfessor(professor);

		for (int j = 0; j < 5; j++) {
			Alunos aluno = new Alunos();

			System.out.println("Digite o nome do aluno:");
			aluno.setNome(scan.nextLine());
			
			curso.adicionarAluno(aluno);

		}
		
		for(Alunos cadaUm : curso.alunos) {
			System.out.println("Digite as quatro notas de " + cadaUm.getNome());
			for (int i = 0; i < 4; i++) {
				cadaUm.setNotas(i, scan.nextInt());
			}
			
			cadaUm.getNotas();
			
			cadaUm.setMedia(cadaUm.calculcarMediaIndivudual());
			
			if(cadaUm.getMedia() >= 7) {
			System.out.println("Aluno APROVADO. A média de notas foi " + cadaUm.getMedia());
			}else if(cadaUm.getMedia() < 7) {
				System.out.println("Aluno REPROVADO. A média de notas foi " + cadaUm.getMedia());

			}
		}
		
		
		System.out.println(curso.getProfessor().getNome());
		curso.getAlunos();
		System.out.println("media dos alunos " + curso.calculaMediaAlunos());

		
	}
}
