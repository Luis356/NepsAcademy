package ParEImpar;

import java.util.Scanner;

public class Resolucao {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numeroBino, numeroCino;

    numeroBino = scan.nextInt();
    numeroCino = scan.nextInt();

    if ((numeroBino + numeroCino) % 2 == 0 && numeroBino != 0) {
      System.out.println("Bino");
    } else {
      System.out.println("Cino");
    }
    scan.close();
  }
}
