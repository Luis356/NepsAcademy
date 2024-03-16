package Positivo;

import java.util.Scanner;

public class Resolucao {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int value;
    value = scan.nextInt();

    if (value > 0) {
      System.out.println("Positivo");
    } else if (value < 0) {
      System.out.println("Negativo");
    } else {
      System.out.println("Nulo");
    }
    scan.close();
  }
}
