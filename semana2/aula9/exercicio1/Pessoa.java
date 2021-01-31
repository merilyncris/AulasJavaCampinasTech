package aula9.exercicio1;

import java.time.LocalDate;

//Crie uma classe para representar uma pessoa, com os atributos de nome, data de nascimento e altura. Crie e também um método para imprimir todos dados de uma pessoa. 
//Crie um método para calcular a idade da pessoa.

public class Pessoa {

	String nome;
	String dataNascimento;
	double altura;
	
	
	
	public Pessoa(String nome, String dataNascimento, double altura) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.altura = altura;
	}



	void imprimir() {
		System.out.println(this.nome);
		System.out.println(this.dataNascimento);
		System.out.println(this.altura);
		System.out.println(this.calculaIdade());
		
	}
	
	int calculaIdade() {
		String[] dataNascimentoCortada = dataNascimento.split("/");
		int anoNascimento = Integer.parseInt(dataNascimentoCortada[2]);
		int ano = LocalDate.now().getYear();
		return ano - anoNascimento;
	}
}
