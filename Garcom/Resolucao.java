package Garcom;

import java.util.Scanner;

public class Resolucao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bandejasEntregadas, quantidadeLatas, quantidadeCopos, coposQuebrados = 0;

        bandejasEntregadas = scan.nextInt();

        for (int i = 0; i < bandejasEntregadas; i++) {

            quantidadeLatas = scan.nextInt();
            quantidadeCopos = scan.nextInt();

            if (quantidadeLatas > quantidadeCopos) {
                coposQuebrados += quantidadeCopos;
            }

        }

        System.out.println(coposQuebrados);

        scan.close();
    }
}