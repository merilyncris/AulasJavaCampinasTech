package aula11.exemplo1;

public class Financeiro {

	private RH setorRH;
	
	public Financeiro(RH setorRH) {
		this.setorRH = setorRH;
	}
	
	public void pagarSalario(String matricula) {
		Funcionario funcionario = this.setorRH.getFuncionario(matricula);
		System.out.println(funcionario.getSalario() + funcionario.getNome());
	}
	
	public String calcularSalario(String matricula) {
		Funcionario funcionario = this.setorRH.getFuncionario(matricula);
		switch(funcionario.getCargo()) {
		case "Gerente":
			return "R$ 5000.00";
			
			
		case "Padrao":
			return "R$ 2000.00";
		}
		return "";
	}
}
