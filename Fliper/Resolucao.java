package Fliper;

import java.util.Scanner;

public class Resolucao {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String fliperPosition;
    int positionP, positionR;

    fliperPosition = scan.nextLine();

    String[] positionFliper = fliperPosition.split(" ");

    positionP = Integer.parseInt(positionFliper[0]);
    positionR = Integer.parseInt(positionFliper[1]);

    if (positionP == 0) {
      System.out.println("C");
    } else if (positionR == 1) {
      System.out.println("A");
    } else {
      System.out.println("B");
    }
    scan.close();
  }
}
