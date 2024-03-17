package SomaFacil;

import java.util.Scanner;

public class Resolucao {
    public static void main(String[] args) {
        int entradaUm, entradaDois;
        Scanner scan = new Scanner(System.in);

        entradaUm = scan.nextInt();
        entradaDois = scan.nextInt();

        System.out.println(entradaUm + entradaDois);

        scan.close();
    }
}
