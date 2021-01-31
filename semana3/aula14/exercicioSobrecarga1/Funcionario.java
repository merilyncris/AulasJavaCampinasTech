package aula14.exercicioSobrecarga1;

import java.time.LocalDate;

public class Funcionario {

	private String cpf;
	private String nivelEmpresarial;
	int salario;

	public Funcionario(String cpf) {
		this.cpf = cpf;
	}

	public Funcionario(String cpf, String nivelEmpresarial) {
		this.cpf = cpf;
		this.nivelEmpresarial = nivelEmpresarial;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNivelEmpresarial() {
		return nivelEmpresarial;
	}

	public void setNivelEmpresarial(String nivelEmpresarial) {
		this.nivelEmpresarial = nivelEmpresarial;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int obterTempodeTrabalho(int ano, int mes) {
		int mesAtual = LocalDate.now().getMonthValue();
		int anoAtual = LocalDate.now().getYear();

		int mesInicio = mes;
		int anoInicio = ano;

		int anos = (anoAtual - anoInicio) - 1;

		if (mesAtual >= mesInicio) {
			anos = anos + 1;
		}
		return anos;
	}

	public void obterNivelEmpresarial(int ano, int mes) {
		int anos = this.obterTempodeTrabalho(ano, mes);

		if (anos >= 5 && anos < 15) {
			this.setNivelEmpresarial("GHI");
			System.out.println("O nível empresarial do cpf " + this.getCpf() + " é: " + this.getNivelEmpresarial());
		} else if (anos >= 15 && anos < 30) {
			this.setNivelEmpresarial("DEF");
			System.out.println("O nível empresarial do cpf " + this.getCpf() + " é: " + this.getNivelEmpresarial());
		} else if (anos >= 30) {
			this.setNivelEmpresarial("ABC");
			System.out.println("O nível empresarial do cpf " + this.getCpf() + " é: " + this.getNivelEmpresarial());
		}
	}

	public int calcularParticipacaoLucros(int ano, int mes) {
		this.obterNivelEmpresarial(ano, mes);
		if (this.getNivelEmpresarial() == "ABC") {
			this.salario = salario * 5;
		} else if (this.getNivelEmpresarial() == "DEF") {
			this.salario = salario * 3;
		} else if (this.getNivelEmpresarial() == "GHI") {
			this.salario = salario * 2;
		}

		return this.salario;
	}

	public int calcularParticipacaoLucros() {
		if (this.getNivelEmpresarial() == "ABC") {
			this.salario = salario * 5;
		} else if (this.getNivelEmpresarial() == "DEF") {
			this.salario = salario * 3;
		} else if (this.getNivelEmpresarial() == "GHI") {
			return this.salario = salario * 2;
		}

		return this.salario;
	}

}
