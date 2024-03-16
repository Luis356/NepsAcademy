package Gangorra;

import java.util.Scanner;

public class Resolucao {

    public static void main(String[] args) {
        String entradaValores;
        int pesoEsquedo, pesoDireito, comprimentoEsquedo, comprimentoDireito;

        Scanner scan = new Scanner(System.in);

        entradaValores = scan.nextLine();
        String valoresSeparados[] = entradaValores.split(" ");

        pesoEsquedo = Integer.parseInt(valoresSeparados[0]);
        comprimentoEsquedo = Integer.parseInt(valoresSeparados[1]);
        pesoDireito = Integer.parseInt(valoresSeparados[2]);
        comprimentoDireito = Integer.parseInt(valoresSeparados[3]);

        if ((pesoEsquedo * comprimentoEsquedo) == (pesoDireito * comprimentoDireito)) {

            System.out.println("0");

        } else if ((pesoEsquedo * comprimentoEsquedo) > (pesoDireito * comprimentoDireito)) {

            System.out.println("-1");

        } else {

            System.out.println("1");

        }

        scan.close();
    }
}
