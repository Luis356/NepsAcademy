package AreaDaCircunferencia;

import java.util.Scanner;

public class Resolucao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int raioCircunferencia = scan.nextInt();

        System.out.printf("%.2f", 3.1416 * Math.pow((double) raioCircunferencia, 2));

        scan.close();
    }
}
