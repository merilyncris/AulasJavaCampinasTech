package avaliacao.exercicio6;


public class TestaCurso {

	public static void main(String[] args) {

		Curso curso = new Curso();
		Professor professor = new Professor();

		curso.setNome("Biologia");
		professor.setNome("Ronaldo");
		curso.setProfessor(professor);

		Alunos ana = new Alunos();
		ana.setNome("Ana");
		ana.setMatricula("2489-7");
		ana.setNotas(6, 7, 8, 5);
		
		ana.calculcarMediaIndivudual();
		curso.adicionarAluno(ana);
		
		System.out.println(ana.verificarAprovado());
		

		
		Alunos felipe = new Alunos();
		felipe.setNome("Felipe");
		felipe.setMatricula("5678-3");
		felipe.setNotas(7,8,9,6);
		felipe.calculcarMediaIndivudual();
		System.out.println(felipe.verificarAprovado());

		
		curso.adicionarAluno(felipe);
		
		curso.getAlunos();

		curso.calculaMediaAlunos();
		
	}
}
