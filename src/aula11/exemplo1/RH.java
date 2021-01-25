package aula11.exemplo1;

import java.util.ArrayList;

public class RH {

	private ArrayList<Funcionario> funcionarios;
	
	public RH() {
		this.funcionarios = new ArrayList<>();
	}
	
	public Funcionario getFuncionario(String matricula) {
		Funcionario funcionarioAchado = null;
		for (int indiceFuncionario = 0; indiceFuncionario < this.funcionarios.size(); indiceFuncionario++) {
			if(this.funcionarios.get(indiceFuncionario).getMatricula() == matricula)
			funcionarioAchado = this.funcionarios.get(indiceFuncionario);
			break;
		}
		return funcionarioAchado;
	}
	
	public void adicionaFuncionario(Funcionario func) {
		this.funcionarios.add(func);
	}
	
	private String adicionaSalarioFuncionario(Financeiro finan) {
		return "";
	}
}
