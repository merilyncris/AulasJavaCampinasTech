package aula3;

/* Elabore um algoritmo que dada a idade de um nadador classifique-o em uma das seguintes categorias:

Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos */

import java.util.Scanner;

class Exercicio2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Qual a idade do nadador?");
    int idade = scan.nextInt();

    String classificacao = "";

    if (idade >= 5 && idade <= 7) {
      classificacao = "Infantil A";
    } else if (idade >= 8 && idade <= 7) {
      classificacao = "Infantil B";
    } else if (idade >= 12 && idade <= 13) {
      classificacao = "Juvenil A";
    } else if (idade >= 14 && idade <= 17) {
      classificacao = "Juvenil B";
    } else if (idade >= 18) {
      classificacao = "Adulto";


  }

  System.out.println(classificacao);

  scan.close();
  }
}
