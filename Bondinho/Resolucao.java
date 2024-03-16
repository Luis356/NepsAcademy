package Bondinho;

import java.util.Scanner;

public class Resolucao {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int alunos, mentores, pessoasBondinho;
    alunos = scan.nextInt();
    mentores = scan.nextInt();

    pessoasBondinho = alunos + mentores;

    if (pessoasBondinho > 50) {
      System.out.println("N");
    } else {
      System.out.println("S");
    }
    scan.close();
  }
}
