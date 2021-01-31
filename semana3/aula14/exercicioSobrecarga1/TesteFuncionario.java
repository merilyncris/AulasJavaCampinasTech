package aula14.exercicioSobrecarga1;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario func = new Funcionario("222.222.222.22", "ABC");
		func.setSalario(2000);

		Funcionario func2 = new Funcionario("333.333.333.33");

		func2.setSalario(2000);
		System.out.println("A Pl desse funcionario fica: " + func2.calcularParticipacaoLucros(1991, 2));

		System.out.println("A Pl desse funcionario fica: " + func.calcularParticipacaoLucros());

	}
}