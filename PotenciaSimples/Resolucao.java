package PotenciaSimples;

import java.util.Scanner;

public class Resolucao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double entradaUm, entradaDois;

        entradaUm = scan.nextDouble();
        entradaDois = scan.nextDouble();

        System.out.printf("%.4f", Math.pow(entradaUm, entradaDois));

        scan.close();
    }
}
