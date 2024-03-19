package AprovadoOuReprovado;

import java.util.Scanner;

public class Resolucao {

  public static void main(String[] args) {
    String entradaNotas;
    Double notaA, notaB, mediaNotas;
    Scanner scan = new Scanner(System.in);

    entradaNotas = scan.nextLine();
    String[] notasQuebradas = entradaNotas.split(" ");

    notaA = Double.parseDouble(notasQuebradas[0]);
    notaB = Double.parseDouble(notasQuebradas[1]);

    mediaNotas = (notaA + notaB) / 2;

    if (mediaNotas < 4.0) {
      System.out.println("Reprovado");
    } else if (mediaNotas < 7.0) {
      System.out.println("Recuperacao");
    } else {
      System.out.println("Aprovado");
    }

    scan.close();
  }
}
