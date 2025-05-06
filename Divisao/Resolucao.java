package Divisao;

import java.util.Scanner;

public class Resolucao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int entradaUm, entradaDois;

        entradaUm = scan.nextInt();
        entradaDois = scan.nextInt();

        System.out.println(String.format("%.2f", (double) entradaUm / entradaDois));

        scan.close();
    }
}
